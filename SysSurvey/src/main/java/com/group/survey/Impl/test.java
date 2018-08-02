/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Impl;

import com.group.survey.dao.UsersInForDAO;
import com.group.survey.entity.UsersInFor;

/**
 *
 * @author thienha
 */
public class test {
    public static void main(String[] args) {
        UsersInForDAO users=new UsersInforImpl();
        UsersInFor u=new UsersInFor();
        u.setFullName("a");
        u.setPassWord("a");
        u.setStatus(1);
        u.setUserName("a");
        u.setUsersType("a");
        users.themUsers(u);
        
        
        
    }
}
