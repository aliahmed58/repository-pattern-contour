package org.assignment.dao;

import org.assignment.entities.Recruiter;

import java.sql.Connection;
import java.util.List;

/**
 * RecruiterDao class that extends from Base Dao where Recruiter is the type
 * and String is the key type for username
 */
public class RecruiterDao extends BaseDao<Recruiter, String> {
  public RecruiterDao(Connection connection) {
    super(connection);
  }

  @Override
  public Recruiter read(String id) {
    return null;
  }

  @Override
  public List<Recruiter> readAll() {
    return null;
  }

  @Override
  public void delete(String id) {

  }

  @Override
  public void update(Recruiter object) {

  }

  @Override
  public void insert(Recruiter object) {

  }
}
