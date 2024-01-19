package org.assignment.entities;

import java.util.Objects;

/**
 * An abstract class for a user entity such as Recruiter, Applicant containing common functionality
 * Making this class sealed so only Applicant and Recruiter can extend from it
 */
public abstract class Person extends Entity<String> {

    // common user attributes first, last name and username
    protected String firstName;
    protected String lastName;

    // default ctor
    public Person() {

    }

    public Person(String id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * toString to display a user object
     * all classes should implement
     */

    @Override
    public abstract String toString();

    /**
     * Getters and setters
     */

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
