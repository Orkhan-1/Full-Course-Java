package org.learning.with.orkhan.annotation;

/**
 * Created by Orkhan Gasanov on December 11, 2018
 */

@Athlete (ranking = 1)
public class User {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
