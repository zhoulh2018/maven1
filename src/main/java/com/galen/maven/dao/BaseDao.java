package com.galen.maven.dao;

import java.io.Serializable;  
import java.util.List;  
  
public interface BaseDao <T, PK extends Serializable> {  
    T load(PK id);  
    T get(PK id);  
    List<T> findAll();  
    void persist(T entity);  
    PK save(T entity);  
    void saveOrUpdate(T entity);  
    void delete(PK id);  
    void flush();  
}