/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Impl;




import com.group.survey.entity.UsersInFor;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author thienha
 */
public class test {
    public static void main(String[] args) {
        UserInForImpl u=new UserInForImpl();
    UsersInFor use=new UsersInFor();
   use.setFullName("a");
   u.insert(use);
    }
  
}
