/**
 * 
 */
package br.com.artur.dao;

import br.com.artur.dao.generic.jpa.GenericJpaDAO;
import br.com.artur.dao.jpa.IVendaJpaDAO;
import br.com.artur.domain.jpa.VendaJpa;
import br.com.artur.exceptions.DAOException;
import br.com.artur.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author artur.matos
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class, "Postgre1");
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
