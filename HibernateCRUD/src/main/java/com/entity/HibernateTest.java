package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()) {

            Student student = new Student();

            student.setId(1);
            student.setName("Aditya");
            student.setEmail("aditya@example.com");
            student.setMarks("85");
            student.setFees("15000");
            student.setAddress("Nashik");

            try (Session session = factory.openSession()) {

                Transaction transaction = session.beginTransaction();

                try {
                    session.save(student);
                    transaction.commit();

                    System.out.println("Student saved successfully!");

                } catch (Exception e) {
                    transaction.rollback();
                    throw e;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
