package org.assignment.dao;

import org.assignment.entities.Applicant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

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
                return new Applicant(set.getString("username"),
                        set.getString("first_name"), set.getString("last_name"),
                        null);
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
        try {
            connection.setAutoCommit(true);
            CallableStatement proc = connection.prepareCall("{call delete_applicant( ? )}");
            proc.setString(1, id);
            proc.execute();
            proc.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Applicant object) {
        try {
            connection.setAutoCommit(true);
            CallableStatement proc = connection.prepareCall("{ call update_applicant(? ,?, ?, ?}");
            proc.setString(1, object.getId());
            proc.setString(2, object.getFirstName());
            proc.setString(3, object.getLastName());
            proc.setString(4, object.getRecruiter().getId());
            proc.execute();
            proc.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Applicant object) {
        try {
            connection.setAutoCommit(true);
            CallableStatement proc = connection.prepareCall("{call create_applicant( ?, ?, ?, ?)}");
            proc.setString(1, object.getId());
            proc.setString(2, object.getFirstName());
            proc.setString(3, object.getLastName());
            proc.setString(4, object.getRecruiter().getId());
            proc.execute();
            proc.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
