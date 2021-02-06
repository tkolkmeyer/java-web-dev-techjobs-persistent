package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(min=3, max=500, message="Description must be between 3 and 500 characters")
    private String description;

    public Skill(@NotBlank(message = "Name is required.") @Size(min = 3, max = 200, message = "Name must be between 3 and 200 characters.") String name, @NotBlank @Size(min = 3, max = 500, message = "Description must be between 3 and 500 characters") String description) {
        super();
        this.description = description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}