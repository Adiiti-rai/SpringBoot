package org.example.hql;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;
import java.util.List;
import java.util.Random;


public class App {
    public static void main(String[] args) {
try{
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Student.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

// Query q= session.createQuery("from Student");
    Query q= session.createQuery("from Student where marks>50");
        List<Student> students =q.list();
        for(Student s:students){
            System.out.println(s);
        }

            Random r = new Random();
            for (int i = 1; i<=50; i++) {
                Student student = new Student();
                student.setRollNo(i);
                student.setName("Name" + i);
                student.setMarks(r.nextInt(100));
                session.save(student);
            }
                transaction.commit();
                session.close();
                factory.close();
                System.out.println("Data is inserted successfully");

        }
        catch(Exception e){
                throw new RuntimeException("Error is creating session factory" + e.getMessage());
            }
    }
}
