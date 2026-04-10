package org.example.relationshipmapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
       Laptop laptop= new Laptop();
       laptop.setLid(101);
         laptop.setLname("Dell");

         Student student= new Student();
            student.setRollNo(1);
            student.setName("John");
            student.setMarks(80);

            try {
                Configuration config = new Configuration();
                config.configure("hibernate.cfg.xml");
                config.addAnnotatedClass(Laptop.class);
                config.addAnnotatedClass(Student.class);

                SessionFactory factory = config.buildSessionFactory();
                Session session = factory.openSession();
                Transaction transaction = session.beginTransaction();

                session.save(laptop);
                session.save(student);

                transaction.commit();
                session.close();
                factory.close();
                System.out.println("Data inserted successfully...");
            }
            catch(Exception e){
                throw new RuntimeException("Error is creating session factory"+e.getMessage());
            }

    }

}
