package org.assignment.controllers;

import org.assignment.dbcontext.DbContext;
import org.assignment.entities.Applicant;
import org.assignment.entities.Application;
import org.assignment.entities.Recruiter;
import org.assignment.repositories.UnitOfWork;

import java.sql.Connection;

public class TestController {
    public static void main(String[] args) {
        DbContext context = DbContext.getInstance();
        Connection con = context.getConnection();

    }
}
