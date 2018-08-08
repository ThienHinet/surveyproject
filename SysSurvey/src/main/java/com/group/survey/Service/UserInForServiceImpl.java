/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Service;
import com.group.survey.Impl.UserInForImpl;
import com.group.survey.entity.UsersInFor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
    
}
