package org.assignment.dao;

import org.assignment.entities.Job;

import java.sql.Connection;
import java.util.List;

public class JobDao extends BaseDao<Job, Integer> {
  public JobDao(Connection connection) {
    super(connection);
  }

  @Override
  public Job read(Integer id) {
    return null;
  }

  @Override
  public List<Job> readAll() {
    return null;
  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public void update(Integer id) {

  }

  @Override
  public void insert(Integer id) {

  }
}
