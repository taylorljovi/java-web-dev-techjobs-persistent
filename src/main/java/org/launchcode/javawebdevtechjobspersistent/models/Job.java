package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Job extends AbstractEntity{


    private String name;

    @ManyToOne
    private Employer employer;

    private String skills;


    public Job(Employer employer, String someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    public Job() {
    }
    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
