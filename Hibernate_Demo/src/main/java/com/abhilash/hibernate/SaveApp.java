package com.abhilash.hibernate;

import com.abhilash.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class SaveApp
{
    public static void main( String[] args )
    {


        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();


        System.out.println(sessionFactory);
        SessionFactory sessionFactory2 = SessionFactoryUtil.getSessionFactory();
        System.out.println(sessionFactory2);

        Session session = sessionFactory.openSession();


        Student s1 = new Student();
        s1.setId(100);
        s1.setName("Avinash B B");
        s1.setPercentage(91.2);
        session.beginTransaction();

        session.save(s1);
        session.getTransaction().commit();
        System.out.println( "Hello World!" );
    }
}
