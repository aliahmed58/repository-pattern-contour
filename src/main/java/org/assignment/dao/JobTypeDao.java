package org.assignment.dao;

import org.assignment.entities.JobType;

import java.sql.Connection;
import java.util.List;

public class JobTypeDao extends BaseDao<JobType, Integer> {
  public JobTypeDao(Connection connection) {
    super(connection);
  }

  @Override
  public JobType read(Integer id) {
    return null;
  }

  @Override
  public List<JobType> readAll() {
    return null;
  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public void update(JobType object) {

  }

  @Override
  public void insert(JobType object) {

  }
}
