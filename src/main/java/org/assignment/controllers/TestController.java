package org.assignment.controllers;

import org.assignment.entities.Applicant;
import org.assignment.entities.Application;
import org.assignment.entities.Recruiter;
import org.assignment.repositories.UnitOfWork;

public class TestController {
    public static void main(String[] args) {
        UnitOfWork unitOfWork = new UnitOfWork();

        unitOfWork.getApplicationRepository().add(
                new Application()
        );

        unitOfWork.getRecruiterRepository().add(new Recruiter("test", "test", "test"));
        unitOfWork.getApplicantRepository().add(new Applicant("ali", "ali", "ahmed",
                unitOfWork.getRecruiterRepository().findById("test")));

        System.out.println(unitOfWork.getApplicantRepository().findById("ali"));
        System.out.println(unitOfWork.getApplicantRepository().findAll());
    }
}
