/**
 * 
 */
package br.com.artur.dao;

import br.com.artur.dao.generic.IGenericDAO;
import br.com.artur.domain.Venda;
import br.com.artur.exceptions.DAOException;
import br.com.artur.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author artur.matos
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
