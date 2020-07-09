package org.launchcode.javawebdevtechjobspersistent.models;

import com.sun.xml.bind.annotation.XmlLocation;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "One location is required")
    @Size(min = 3, max = 20, message = "Please input only one location")
    private String location;

    public Employer(String location) {
        this.location = location;
        }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
