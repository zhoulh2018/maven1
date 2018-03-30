package com.galen.maven.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.AllowedMethods;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.galen.maven.beans.SysOrgPerson;
import com.galen.maven.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;  
  
@ParentPackage("struts-default")  
@Namespace("/user")  
@AllowedMethods("detail")  
@Results({  
    @Result(name = "success", location = "/user/user.jsp")  
})  
public class UserAction extends ActionSupport implements ModelDriven<SysOrgPerson>, Preparable {  
    private static final long serialVersionUID = -4611010990125262639L;  
    private static final Logger LOGGER = Logger.getLogger(UserAction.class);  
    private String id;  
    SysOrgPerson user;  
    List<SysOrgPerson>  userList;  
      
    @Autowired  
    private UserService userService;  
      
    public String getId() {  
        return id;  
    }  
      
    public void setId(String id) {  
        this.id = id;  
    }  
      
    public SysOrgPerson getUser() {  
        return user;  
    }  
      
    public void setUser(SysOrgPerson user) {  
        this.user = user;  
    }  
      
    public List<SysOrgPerson> getUserList() {  
        return userList;  
    }  
      
    public void setUserList(List<SysOrgPerson> userList) {  
        this.userList = userList;  
    }  
      
    public void prepare() throws Exception {  
          
    }  
  
    public SysOrgPerson getModel() {  
        if (null != id) {  
            user = userService.get(id);  
        } else {  
            user = new SysOrgPerson();  
        }  
        return user;  
    }  
      
    @Override  
    @Action(value = "execute")
    public String execute() throws Exception {  
        LOGGER.info("查询所有用户");  
        userList = userService.findAll();  
        return SUCCESS;  
    }  
  
    @Action(value = "detail")
    public void detail() throws IOException {  
        String id = ServletActionContext.getRequest().getParameter("id");  
        LOGGER.info("查询用户详情：" + id);  
        user = userService.get(id);  
        //AjaxUtil.ajaxJSONResponse(user);  
        HttpServletResponse response = ServletActionContext.getResponse();  
        PrintWriter out = response.getWriter();  
        response.setCharacterEncoding("UTF-8");
        out.println("Hello " + user.getFdAcname());  
    }  
  
} 
