package br.com.artur.dao.generic;

import br.com.artur.dao.Persistente;
import br.com.artur.exceptions.DAOException;
import br.com.artur.exceptions.MaisDeUmRegistroException;
import br.com.artur.exceptions.TableException;
import br.com.artur.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author artur.matos
 *
 *
 */
public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    /**
     *
     *
     * @param entity
     * @return
     */
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     *
     *
     * @param
     */
    public void excluir(E valor) throws DAOException;

    /**
     *
     *
     * @param entity
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param valor chave única do dado a ser consultado
     * @return
     * @throws MaisDeUmRegistroException 
     * @throws TableException 
     */
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     * @throws DAOException 
     */
    public Collection<T> buscarTodos() throws DAOException;
}
