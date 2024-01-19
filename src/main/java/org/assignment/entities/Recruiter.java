package org.assignment.entities;

import java.util.ArrayList;
import java.util.List;

public class Recruiter extends Person {

    private List<Applicant> applicants = new ArrayList<>();

    @Override
    public String toString() {
        return "Recruiter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + id + '\'' +
                '}';
    }
}
