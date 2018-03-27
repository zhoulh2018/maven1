package com.galen.maven.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galen.maven.beans.SysOrgPerson;
import com.galen.maven.dao.UserDao;
import com.galen.maven.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Autowired  
    UserDao userDao;  
  
    public SysOrgPerson load(String id) {  
        return null;  
    }  
  
    public SysOrgPerson get(String id) {  
        return userDao.get(id);  
    }  
  
    public List<SysOrgPerson> findAll() {  
        return userDao.findAll();  
    }  
  
    public void persist(SysOrgPerson entity) {  
        userDao.persist(entity);  
    }  
  
    public String save(SysOrgPerson entity) {  
        return userDao.save(entity);  
    }  
  
    public void saveOrUpdate(SysOrgPerson entity) {  
        userDao.saveOrUpdate(entity);  
    }  
  
    public void delete(String id) {  
        userDao.delete(id);  
    }  
  
    public void flush() {  
        userDao.flush();  
    }
}
