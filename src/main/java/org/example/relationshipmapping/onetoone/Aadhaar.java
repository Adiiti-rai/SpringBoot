package org.example.relationshipmapping.onetoone;

import javax.persistence.*;

@Entity
public class Aadhaar {
    @Id
    @GeneratedValue
    private int id;
    private String number;

    // Getter & Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
