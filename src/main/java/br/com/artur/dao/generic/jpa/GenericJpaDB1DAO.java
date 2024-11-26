/**
 *
 */
package br.com.artur.dao.generic.jpa;

import java.io.Serializable;

import br.com.artur.domain.jpa.Persistente;

/**
 * @author artur.matos
 *
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}
