package org.example.relationshipmapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main{
    public static void main(String[] args) {
try {
    Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    config.addAnnotatedClass(Person.class);
    config.addAnnotatedClass(Aadhaar.class);

    SessionFactory factory = config.buildSessionFactory();
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();

    // Create objects
    Person p = new Person();
    p.setName("Aditi");

    Aadhaar a = new Aadhaar();
    a.setNumber("1234-5678-9999");

    // Set relationship
    p.setAadhaar(a);
    // Save
    session.save(a);   // save child first
    session.save(p);

    tx.commit();

    session.close();
    factory.close();

    System.out.println("One-to-One mapping done successfully!");
}
catch(Exception e){
    throw new RuntimeException("Error is creating session factory"+e.getMessage());
}
    }
}
