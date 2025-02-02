/**
 * 
 */
package br.com.artur.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import br.com.artur.domain.jpa.Persistente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import br.com.artur.exceptions.DAOException;
import br.com.artur.exceptions.MaisDeUmRegistroException;
import br.com.artur.exceptions.TableException;
import br.com.artur.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author artur.matos
 *
 */
public class GenericJpaDAO <T extends Persistente, E extends Serializable> implements IGenericJpaDAO<T,E> {

	protected EntityManagerFactory entityManagerFactory;
	
	protected EntityManager entityManager;
	
	private Class<T> persistenteClass;
	
	public GenericJpaDAO(Class<T> persistenteClass, String postgre1) {
		this.persistenteClass = persistenteClass;
	}
	
	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		openConnection();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		closeConnection();
		return entity;
	}

	@Override
	public void excluir(T entity) throws DAOException {
		openConnection();
		entity = entityManager.merge(entity);
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
		closeConnection();
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		openConnection();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		closeConnection();
		return entity;
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		openConnection();
		T entity = entityManager.find(this.persistenteClass, valor);
		entityManager.getTransaction().commit();
		closeConnection();
		return entity;
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		openConnection();
		List<T> list = 
				entityManager.createQuery(getSelectSql(), this.persistenteClass).getResultList();
		closeConnection();
		return list;
	}
	
	protected void openConnection() {
		entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	protected void closeConnection() {
		entityManager.close();
		entityManagerFactory.close();
	}
	
	private String getSelectSql() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT obj FROM ");
		sb.append(this.persistenteClass.getSimpleName());
		sb.append(" obj");
		return sb.toString();
	}


}
