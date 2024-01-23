package org.assignment.controllers;

import org.assignment.dbcontext.DbContext;
import org.assignment.entities.*;
import org.assignment.repositories.UnitOfWork;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Locale;

public class TestController {
    public static void main(String[] args) {
        /**
         * Sample code for using unit of work with repository pattern
         */
        UnitOfWork unitOfWork = new UnitOfWork(DbContext.getInstance());

        // add job types
        unitOfWork.getJobTypeRepository().add(new JobType(0, "Backend developer", Level.SENIOR));

        // add a job
        unitOfWork.getJobRepository().add(new Job(0, "Java backend developer", "senior java dev short desc",
                unitOfWork.getJobTypeRepository().findById(0)));

        // add a recruiter
        unitOfWork.getRecruiterRepository().add(new Recruiter("sam", "Sam", "Jackson"));

        // add an applicant
        unitOfWork.getApplicantRepository().add(new Applicant("user1", "Ali", "Ahmed",
                unitOfWork.getRecruiterRepository().findById("sam")));

        // add a new application
        unitOfWork.getApplicationRepository().add(new Application(
                0, unitOfWork.getApplicantRepository().findById("user1"),
                "trainee developer job", LocalDate.now(), Status.PENDING
        ));

        System.out.println("View application");
        System.out.println(unitOfWork.getApplicationRepository().findAll());

    }
}
