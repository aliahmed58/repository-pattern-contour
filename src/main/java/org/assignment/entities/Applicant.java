package org.assignment.entities;


/**
 * Applicant entity for storing applicant data extends from Person
 */
public class Applicant extends Person {

    // The recruiter ID
    private Recruiter recruiter;

    public Applicant(String username, String firstName, String lastName, Recruiter recruiter) {
        super(username, firstName, lastName);
        this.recruiter = recruiter;
    }


    @Override
    public String toString() {
        return "Applicant{" +
                "recruiterId='" + recruiter + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + id + '\'' +
                '}';
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }
}
