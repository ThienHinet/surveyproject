/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Service;
import com.group.survey.Impl.UserInForImpl;
import com.group.survey.entity.UsersInFor;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author thienha
 */
@Service
public class UserInForServiceImpl{
    @Autowired
    UserInForImpl userInForImpl;
    public boolean insert(UsersInFor usersInFor){
    return userInForImpl.insert(usersInFor);
    }
    public List<UsersInFor> checkEmail(String userName,String emailOrPass,int status){
    return userInForImpl.checkEmail(userName,emailOrPass,status);
    }
    public void LogOut(HttpServletRequest request,HttpServletResponse response){
    this.userInForImpl.Logout(request, response);
    }
    public UsersInFor getFindUserById(long id){
        return (UsersInFor) userInForImpl.getByObjectId(id);
    }
    public List<UsersInFor> getAllListUsers(){
        return userInForImpl.getAllListUsers();
        
    }
    
}
