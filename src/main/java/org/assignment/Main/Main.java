package org.assignment.Main;

import org.assignment.entities.Applicant;
import org.assignment.repositories.GenericRepository;

public class Main {
    public static void main(String[] args) {
        GenericRepository<Applicant, String> applicantRepo = new GenericRepository<>();

        applicantRepo.add(new Applicant("test", "test", "test", "test"));
        Applicant applicant = applicantRepo.findById("test");
        System.out.println(applicant);
    }
}
