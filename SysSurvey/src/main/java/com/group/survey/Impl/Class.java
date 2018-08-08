
package com.group.survey.Impl;

import com.group.survey.util.HibernateUtil;
import org.hibernate.Session;






import org.hibernate.Transaction;


/**
 *
 * @author thienha
 * @param <T>
 */
public class Class<T> {

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

}    


  
   

