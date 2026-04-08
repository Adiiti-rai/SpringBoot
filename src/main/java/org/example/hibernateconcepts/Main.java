package org.example.hibernateconcepts;

// here I am creating the object of Alien class.
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Main {
    public static void main(String[] args){
        Alien a1= new Alien();
        a1.setAid(101);
        a1.setAname("Aditi");
        a1.setTech("Java");
        // hey hibernate save with a1 object

        Configuration config= new Configuration();
        SessionFactory factory= config.buildSessionFactory(); // only once
        Session session= factory.openSession();
        //session.save(a1);  or
        session.persist(a1);

    }
}

