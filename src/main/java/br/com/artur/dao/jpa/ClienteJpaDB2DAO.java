/**
 *
 */
package br.com.artur.dao.jpa;

import br.com.artur.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.artur.domain.jpa.ClienteJpa;

/**
 * @author artur.matos
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}
