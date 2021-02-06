package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min=3, max=200, message="Must be between 3 and 200 characters.")
    private String location;

    public Employer(@NotBlank(message = "Name is required.") @Size(min = 3, max = 200, message = "Name must be between 3 and 200 characters.") String name, @NotBlank @Size(min = 3, max = 200, message = "Must be between 3 and 200 characters.") String location) {
        super();
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
