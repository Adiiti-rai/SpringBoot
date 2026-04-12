package org.example.relationshipmapping.onetoone;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne
    private Aadhaar aadhaar;

    // Getter & Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Aadhaar getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }
}
