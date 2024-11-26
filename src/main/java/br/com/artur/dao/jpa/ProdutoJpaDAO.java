/**
 * 
 */
package br.com.artur.dao.jpa;

import br.com.artur.dao.generic.jpa.GenericJpaDAO;
import br.com.artur.domain.jpa.ProdutoJpa;

/**
 * @author artur.matos
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class, "Postgre1");
	}

}
