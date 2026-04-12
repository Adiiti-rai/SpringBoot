package org.example.relationshipmapping.onetomany;


import javax.persistence.*;

@Entity
public class Laptop {

    @Id
    @GeneratedValue
    private int id;

    private String brand;

    @ManyToOne
    @JoinColumn(name = "student_id") // foreign key
    private Student student;

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}