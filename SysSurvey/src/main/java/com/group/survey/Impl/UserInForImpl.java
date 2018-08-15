/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.Impl;
import com.group.survey.entity.UsersInFor;
import com.group.survey.util.HibernateUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author thienha
 */
@Transactional
public class UserInForImpl extends Class<UsersInFor>{
   public List<UsersInFor> checkEmail(String userName,String emailOrPass,int status){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql="";
        //n?u b?ng 1 ki?m tra dang kí tài kho?n dã t?n t?i hay chua
        if(status==1){
         hql="from UsersInFor WHERE userName = :userName or email = :emailOrPass";
        }
        //n?u b?ng không ki?m tra dang nh?p thành công chua
        else if(status==0){
         hql="from UsersInFor WHERE userName = :userName AND passWord = :emailOrPass";
        }
        Query query = session.createQuery(hql);
        query.setParameter("userName",userName);
        query.setParameter("emailOrPass",emailOrPass);
        List<UsersInFor> lts=query.list();
       if(lts.size()>0){
       return lts;
       }
       else{
       return null;
       }
   } 
    public void Logout(HttpServletRequest request,HttpServletResponse response){
        HttpSession session=request.getSession();
        if(session.getAttribute("usersInFor")!=null){
        session.removeAttribute("usersInFor");
        session.removeAttribute("usersInFor");
        }
    }
    public List<UsersInFor> getAllListUsers(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql ="from UsersInFor" ;
        Query query = session.createQuery(hql);
        List<UsersInFor> listUsers = query.list();
        transaction.commit();
        return listUsers;
    }
}
