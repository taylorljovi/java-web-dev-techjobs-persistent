package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    //    private String skills;
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job(Employer employer) {
        super();
        this.employer = employer;
    }

    public Job() {
    }
    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {return skills; }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
