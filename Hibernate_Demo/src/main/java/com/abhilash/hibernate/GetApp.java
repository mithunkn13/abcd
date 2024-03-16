package com.abhilash.hibernate;

import com.abhilash.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetApp
{
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        Student student = session.get(Student.class, 1);
        System.out.println(session.contains(student));
        System.out.println(student);
    }
}
