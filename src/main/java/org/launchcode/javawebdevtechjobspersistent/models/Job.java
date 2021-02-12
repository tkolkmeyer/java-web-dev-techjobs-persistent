package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @NotNull
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    @ManyToOne
    private Employer employer;

    public Job() {
    }

    public Job(Employer employer, ArrayList someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List getSkills() {
        return skills;
    }

//    public void setSkills(List skills) {
//        this.skills = skills;
//    }

    public void setSkills(Skill skill){
        this.skills.add(skill);
    }
}
