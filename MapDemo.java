package com.hibernate1.Hibernate1t1;


import com.hibernate1.Hibernate1t1.Question;
import com.hibernate1.Hibernate1t1.Answer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo 
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration();
       
        /*cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        */
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
       
       
        //Session s = factory.openSession();
            Question q1= new Question();
        q1.setQuestionId(1234);
        q1.setQuestionTxt("what is FrameWork");
        
      
       
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
            s.save(q1);
        
       //tx.commit();
        s.getTransaction().commit();
        s.close();
        
        
        
        Answer ans1= new Answer();
        ans1.setAnswerId(8);
        ans1.setAnswertxt("Framework is a programming lanuage");
        
        
        Session s1 = factory.openSession();
        Transaction tx1 = s1.beginTransaction();
      
        s1.save(ans1);
        s1.getTransaction().commit();
        s1.close();
        
        factory.close();
               
  }
}
