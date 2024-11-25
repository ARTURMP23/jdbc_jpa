/**
 * 
 */
package br.com.artur.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.artur.dao.Persistente;
import br.com.artur.exceptions.DAOException;
import br.com.artur.exceptions.MaisDeUmRegistroException;
import br.com.artur.exceptions.TableException;
import br.com.artur.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author artur.matos
 *
 * Interface genérica para métodos de CRUD(Create, Read, Update and Delete)
 */
public interface IGenericJpaDAO<T extends Persistente, E extends Serializable> {

	/**
     *
     *
     * @param entity
     * @return
     * @throws TipoChaveNaoEncontradaException
	 * @throws DAOException
     */
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param entity a ser cadastrado
	 * @throws DAOException
     */
    public void excluir(T entity) throws DAOException;

    /**
     *Método para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     * @return retorna o objeto salvo
     * @throws TipoChaveNaoEncontradaException
	 * @throws DAOException
     */
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param id
     * @return
     * @throws MaisDeUmRegistroException 
     * @throws TableException 
     */
    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return
     * @throws DAOException 
     */
    public Collection<T> buscarTodos() throws DAOException;
}
