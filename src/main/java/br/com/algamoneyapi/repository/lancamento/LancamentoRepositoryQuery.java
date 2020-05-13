package br.com.algamoneyapi.repository.lancamento;

import java.util.List;

import br.com.algamoneyapi.model.Lancamento;
import br.com.algamoneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
