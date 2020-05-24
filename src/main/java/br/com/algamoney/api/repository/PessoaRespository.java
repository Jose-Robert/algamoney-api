package br.com.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.algamoney.api.model.Pessoa;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Long>{

}
