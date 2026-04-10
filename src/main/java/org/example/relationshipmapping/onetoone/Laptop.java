package org.example.relationshipmapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
    private int Lid;
    private String Lname;

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getLid() {
        return Lid;
    }

    public void setLid(int Lid) {
        this.Lid = Lid;
    }
}
