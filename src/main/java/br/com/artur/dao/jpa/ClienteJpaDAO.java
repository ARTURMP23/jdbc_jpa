/**
 * 
 */
package br.com.artur.dao.jpa;

import br.com.artur.dao.generic.jpa.GenericJpaDAO;
import br.com.artur.domain.jpa.ClienteJpa;

/**
 * @author artur.matos
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO<C> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class, "Postgre1");
	}

}
