package com.mp.dao;

import java.io.Serializable;

import com.mp.entity.BaseEntity;

public interface BaseDAO<E extends BaseEntity> {

    public Serializable save(E obj);
    
    public void delete(E obj);

    public void update(E obj);
    
    public void saveOrUpdate(E obj);

}
