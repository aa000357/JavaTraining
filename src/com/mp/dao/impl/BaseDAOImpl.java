package com.mp.dao.impl;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mp.dao.BaseDAO;
import com.mp.entity.BaseEntity;

@Transactional
@Repository("baseDAO")
public class BaseDAOImpl<E extends BaseEntity> implements BaseDAO<E> {

	@Autowired
    private SessionFactory sessionFactory;

   
    public SessionFactory getSessionFactory() {
	return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
	return getSessionFactory().getCurrentSession();
    }
    
    protected Query getQuery(String hql) {
    	return getSession().createQuery(hql);
    }

    @Override
    public Serializable save(E obj) {
    	return getSession().save(obj);
    }

    @Override
    public void delete(E obj) {
    	getSession().delete(obj);
    }

    @Override
    public void update(E obj) {
    	getSession().update(obj);
    }

    @Override
    public void saveOrUpdate(E obj) {
    	getSession().saveOrUpdate(obj);
    }
}
