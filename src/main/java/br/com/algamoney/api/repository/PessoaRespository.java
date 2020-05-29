package br.com.algamoney.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.algamoney.api.model.Pessoa;

@Repository
public interface PessoaRespository extends JpaRepository<Pessoa, Long>{

	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);
}
