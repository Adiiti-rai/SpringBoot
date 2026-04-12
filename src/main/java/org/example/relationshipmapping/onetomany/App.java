package org.example.relationshipmapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Student.class);
        config.addAnnotatedClass(Laptop.class);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        // Create Student
        Student s = new Student();
        s.setName("Aditi");
        // Create Laptops
        Laptop l1 = new Laptop();
        l1.setBrand("HP");

        Laptop l2 = new Laptop();
        l2.setBrand("Dell");

        // Set relationship
        l1.setStudent(s);
        l2.setStudent(s);

        s.setLaptops(Arrays.asList(l1, l2));

        // Save (cascade handles child)
        session.save(s);
        tx.commit();

        session.close();
        factory.close();
        System.out.println("One-to-Many mapping done successfully!");
    }
}