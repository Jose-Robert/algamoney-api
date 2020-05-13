package br.com.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.algamoneyapi.model.Lancamento;
import br.com.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
