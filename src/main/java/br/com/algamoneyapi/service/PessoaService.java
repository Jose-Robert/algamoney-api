package br.com.algamoneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.algamoneyapi.model.Pessoa;
import br.com.algamoneyapi.repository.PessoaRespository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRespository pessoaRespository;

	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaRespository.findOne(codigo);
		if (pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRespository.save(pessoaSalva);
	}
}
