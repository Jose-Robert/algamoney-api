package br.com.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.algamoneyapi.model.Pessoa;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Long>{

}
