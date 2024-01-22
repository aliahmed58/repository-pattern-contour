package org.assignment.dao;

import org.assignment.entities.Applicant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicantDao extends BaseDao<Applicant, String> {
    public ApplicantDao(Connection connection) {
        super(connection);
    }

    @Override
    public Applicant read(String id) {
        try {
            CallableStatement stmt = connection.prepareCall("SELECT * FROM read_applicant(?)");
            stmt.registerOutParameter(1, Types.REF_CURSOR);
            stmt.execute();

            ResultSet set = stmt.getResultSet();
            while (set.next()) {
                System.out.println("something occured ig");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Applicant> readAll() {
        List<Applicant> applicants = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Applicants INNER JOIN Recruiters ON applicants.recruiter_id = recruiters.username");
            while (rs.next()) {
                applicants.add(new Applicant(
                    rs.getString("username"), rs.getString("first_name"),
                    rs.getString("last_name"), null
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return applicants;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id) {

    }

    @Override
    public void insert(String id) {

    }
}
