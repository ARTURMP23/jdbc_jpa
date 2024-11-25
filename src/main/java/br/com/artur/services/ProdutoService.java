/**
 * 
 */
package br.com.artur.services;

import br.com.artur.dao.IProdutoDAO;
import br.com.artur.domain.Produto;
import br.com.artur.services.generic.GenericService;

/**
 * @author artur.matos
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
