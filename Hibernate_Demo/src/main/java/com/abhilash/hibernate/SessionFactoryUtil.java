package com.abhilash.hibernate;

import com.abhilash.hibernate.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil
{
    //SingleTon Design Pattern for SessionFactory since it is heavyweight object
    private static SessionFactory sessionFactory= null;

    public static SessionFactory getSessionFactory()
    {
        if(sessionFactory==null)
        {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Student.class);
            configuration.configure("hibernate.cfg.xml");

            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
