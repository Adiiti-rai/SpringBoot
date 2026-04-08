package org.example.hibernateconcepts;

//Hibernate->
//1.ORM fundamentals--> what is ORM, why we need it, difference between JDBC amd ORM
//2.What is Hibernate

//3.Architecture --> component->(SessionFactory, Session, Transaction)
//  -->Hibernate components like SessionFactory, Session, and Transaction are used to efficiently manage database operations.
//  SessionFactory creates sessions, Session handles communication with the database,
//  and Transaction ensures data consistency by committing or rolling back operations.

// why we created Sessionfactory only once and Session for each operation?
// because SessionFactory is created only once because it is a heavy,
// thread-safe object that initializes database configuration,  mappings, and connection pools.
// Creating it multiple times can degrade performance and consume unnecessary resources.
//Think like:
//SessionFactory = Factory
//Factory banana costly hai
//Product banana easy hai
//Factory ek baar banao, products (sessions) baar-baar banao

//4.Configuration (hibernate.cfg.xml)
//5. Entity mapping
// @Entity, @Table, @Id, @Column, @GeneratedValue
//6. CRUD operations (save, update, delete, get, load)
//7.Hibernate query language(HQL)
//8. Relational mapping--> one-to-one, one-to-many, many-to-one, many-to-many
//9. Fetching Strategies -->Lazy loading and eager loading
//10. Caching --> first level cache(Session level), second level cache, query cache
//N+1 select problem
//Hibernate Criteria API
//Hibernate and Spring integration

public class HibernateDemo {
}

