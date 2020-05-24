package br.com.algamoneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.algamoneyapi.model.Lancamento;
import br.com.algamoneyapi.model.Pessoa;
import br.com.algamoneyapi.repository.LancamentoRepository;
import br.com.algamoneyapi.repository.PessoaRespository;
import br.com.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;

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
