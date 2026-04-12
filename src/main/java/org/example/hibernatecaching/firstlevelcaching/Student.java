package org.example.hibernatecaching.firstlevelcaching;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollno;
    private String name;

    public int getId() {
        return rollno;
    }
    public void setId(int id) {
        this.rollno = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}