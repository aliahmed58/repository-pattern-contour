package org.assignment.entities;

import java.util.Objects;

/**
 * An abstract class for a user entity such as Recruiter, Applicant containing common functionality
 * Making this class sealed so only Applicant and Recruiter can extend from it
 */
public abstract class Person {

    // common user attributes first, last name and username
    protected String firstName;
    protected String lastName;
    // a unique identifier for every user
    protected String username;

    // default ctor
    public Person() {

    }

    public Person( String username, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // equate person based on username and use it for the hashcode as well

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(username, person.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
