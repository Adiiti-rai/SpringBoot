package org.example.hibernateconcepts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        //  Step 1: Create Object
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Aditi");
        a1.setTech("Java");

        try {
            //  Step 2: Load Configuration
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");   // load hibernate.cfg.xml
            config.addAnnotatedClass(Alien.class); // add annotated class

            //  Step 3: Create SessionFactory
            SessionFactory factory = config.buildSessionFactory();

            // Step 4: Open Session
            Session session = factory.openSession();

            // Step 5: Transaction Start
             Transaction transaction=session.beginTransaction();

            // Step 6: Save Object
            session.save(a1);

            // Step 7: Commit
            transaction.commit();

            // Step 8: Close
            session.close();
            factory.close();

            System.out.println(" Data inserted successfully...");

        } catch (Exception e) {
            throw new RuntimeException("Error is creating session factory"+e.getMessage());
        }
    }
}