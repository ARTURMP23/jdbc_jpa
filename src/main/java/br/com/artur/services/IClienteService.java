/**
 * 
 */
package br.com.artur.services;

import br.com.artur.domain.Cliente;
import br.com.artur.exceptions.DAOException;
import br.com.artur.services.generic.IGenericService;

/**
 * @author artur.matos
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
