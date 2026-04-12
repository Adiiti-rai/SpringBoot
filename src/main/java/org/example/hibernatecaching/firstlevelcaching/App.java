package org.example.hibernatecaching.firstlevelcaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        try {
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");
            config.addAnnotatedClass(Student.class);
            SessionFactory factory = config.buildSessionFactory();
            //  First Session
            Session session1 = factory.openSession();
            Transaction tx1 = session1.beginTransaction();

            System.out.println("First time fetching...");
            Student s1 = session1.get(Student.class, 5);  // DB hit

            System.out.println("Second time fetching...");
            Student s2 = session1.get(Student.class, 5);  // From cache (NO DB hit)

            tx1.commit();
            session1.close();
            System.out.println("----- New Session -----");

            //  Second Session
            Session session2 = factory.openSession();
            Transaction tx2 = session2.beginTransaction();

            Student s3 = session2.get(Student.class, 5);  // DB hit again

            tx2.commit();
            session2.close();

            factory.close();
        } catch (Exception e) {
            throw new RuntimeException("Error is creating session factory" + e.getMessage());
        }
    }
}