package com.abhilash.hibernate;

import com.abhilash.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteApp
{
    public static void main(String[] args) {
//        SessionFactory sessionFactory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Student.class)
//                .buildSessionFactory();

        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, "MDM129");
        session.delete(student);

        session.getTransaction().commit();

        System.out.println("Mithun");
        System.out.println("kn");
        System.out.println("Has Been Updated");



    }
}
