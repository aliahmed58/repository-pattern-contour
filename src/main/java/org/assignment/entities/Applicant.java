package org.assignment.entities;


/**
 * Applicant entity for storing applicant data extends from Person
 */
public class Applicant extends Person {

    // The recruiter ID
    private String recruiterId;

    public Applicant(String username, String firstName, String lastName, String recruiterId) {
        super(username, firstName, lastName);
        this.recruiterId = recruiterId;
    }


    @Override
    public String toString() {
        return "Applicant{" +
                "recruiterId='" + recruiterId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(String recruiterId) {
        this.recruiterId = recruiterId;
    }
}
