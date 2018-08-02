/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Impl;

import com.group.survey.dao.UsersInForDAO;
import com.group.survey.entity.UsersInFor;
import com.group.survey.util.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author thienha
 */
public class UsersInforImpl implements UsersInForDAO{

    @Override
    public void themUsers(UsersInFor usersInFor) {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(usersInFor);
        transaction.commit();//To change body of generated methods, choose Tools | Templates.
    }

  
   
}
