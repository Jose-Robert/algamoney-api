package br.com.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.model.Pessoa;
import br.com.algamoney.api.repository.LancamentoRepository;
import br.com.algamoney.api.repository.PessoaRespository;
import br.com.algamoney.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRespository pessoaRespository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRespository.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}

}
