
package com.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTables {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate2.cfg.xml")
                .buildSessionFactory()) {

            System.out.println("Hibernate tables initialized successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
