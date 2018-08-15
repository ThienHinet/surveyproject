
package com.group.survey.Impl;


import com.group.survey.util.HibernateUtil;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;






import org.hibernate.Transaction;


/**
 *
 * @author thienha
 * @param <T>
 */
public class Class<T> {
private T t;

 public boolean insert(T obj){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(obj);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
          
        } finally {
            session.flush();
            session.close();
        }
        return false;
    }
public boolean update(T obj){
Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(obj);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
          
        } finally {
            session.flush();
            session.close();
        }
        return false;
} 
public boolean delete(T obj){
Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(obj);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
          
        } finally {
            session.flush();
            session.close();
        }
        return false;
} 
 public  T getByObjectId(long id) {
     
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        T obj = (T) session.get((java.lang.Class) t, id);
        transaction.commit();
        return obj;
    }

}    


  
   

