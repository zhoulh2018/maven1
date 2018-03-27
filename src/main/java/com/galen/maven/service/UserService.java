package com.galen.maven.service;

import java.util.List;

import com.galen.maven.beans.SysOrgPerson;

public interface  UserService {

	SysOrgPerson load(String id);  
	SysOrgPerson get(String id);  
    List<SysOrgPerson> findAll();  
    void persist(SysOrgPerson entity);  
    String save(SysOrgPerson entity);  
    void saveOrUpdate(SysOrgPerson entity);  
    void delete(String id);  
    void flush();
}
