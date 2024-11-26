/**
 *
 */
package br.com.artur.dao.jpa;

import br.com.artur.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.artur.domain.jpa.ClienteJpa2;

/**
 * @author artur.matos
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

}