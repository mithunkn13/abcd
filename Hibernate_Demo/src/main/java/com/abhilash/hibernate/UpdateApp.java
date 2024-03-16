package com.abhilash.hibernate;

import com.abhilash.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp
{
    public static void main(String[] args)
    {


        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Student student = session.get(Student.class, "MDM128");
        student.setName("Mithun K N");
        session.save(student);
        session.getTransaction().commit();
    }
}
