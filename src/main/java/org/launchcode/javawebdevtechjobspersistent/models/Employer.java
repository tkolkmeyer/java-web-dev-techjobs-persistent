package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();


    @NotBlank
    @Size(min=3, max=200, message="Must be between 3 and 200 characters.")
    private String location;

    public Employer(@NotBlank(message = "Name is required.") @Size(min = 3, max = 200, message = "Name must be between 3 and 200 characters.") String name, @NotBlank @Size(min = 3, max = 200, message = "Must be between 3 and 200 characters.") String location) {
        super();
        this.location = location;
    }

    public Employer(){ }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
