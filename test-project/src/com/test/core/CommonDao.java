package com.test.core;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/*
 @author:kartheek Trilochan
 */
abstract public class CommonDao<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Class<T> entityClass;

	@Autowired
	private SessionFactory sessionFactory;

	public CommonDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public CommonDao() {
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void beginTransaction() {
		getCurrentSession().beginTransaction();
	}

	public void close() {
		getCurrentSession().close();
	}

	public void commit() {
		getCurrentSession().getTransaction().commit();
	}
	
	
	public void save(T entity) {  

		getCurrentSession().persist(entity);
	}  

	public void delete(T entity) {  

		T entityToBeRemoved = (T) getCurrentSession().merge(entity);
		getCurrentSession().delete(entityToBeRemoved);  

	}  

	public T update(T entity) {

		return (T) getCurrentSession().merge(entity);  
	}  

	public T find(String entityID) {
		return (T) getCurrentSession().load(entityClass, entityID);  

	}  

}
