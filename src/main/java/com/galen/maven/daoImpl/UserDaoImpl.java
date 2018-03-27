package com.galen.maven.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.galen.maven.beans.SysOrgPerson;
import com.galen.maven.dao.UserDao;
  
@Repository("userDao")  
public class UserDaoImpl implements UserDao{  
      
    @Autowired
    SessionFactory sessionFactory;  
      
    private Session getCurrentSession() {  
        return sessionFactory.getCurrentSession();  
    }
//    public void setCurrentSession(SessionFactory sessionFactory) {  
//    	this.sessionFactory = sessionFactory;  
//    } 
  
    public SysOrgPerson load(String id) {  
        return (SysOrgPerson) getCurrentSession().load(SysOrgPerson.class, id);  
    }  
  
    public SysOrgPerson get(String id) {  
        return (SysOrgPerson) getCurrentSession().get(SysOrgPerson.class, id);  
    }  
  
    @SuppressWarnings("unchecked")  
    public List<SysOrgPerson> findAll() {  
        return getCurrentSession().createQuery("from SYS_ORG_PERSON").list();  
    }  
  
    public void persist(SysOrgPerson entity) {  
        getCurrentSession().persist(entity);  
    }  
  
    public String save(SysOrgPerson entity) {  
        return (String)getCurrentSession().save(entity);  
    }  
  
    public void saveOrUpdate(SysOrgPerson entity) {  
        getCurrentSession().saveOrUpdate(entity);  
    }  
  
    public void delete(String id) {  
        getCurrentSession().delete(this.get(id));  
    }

	public void flush() {
		// TODO Auto-generated method stub
	}  
} 