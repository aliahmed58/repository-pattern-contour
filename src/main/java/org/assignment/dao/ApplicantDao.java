package org.assignment.dao;

import org.assignment.entities.Applicant;

import java.sql.*;
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
    }

    @Override
    public List<Applicant> readAll() {
        return null;
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
