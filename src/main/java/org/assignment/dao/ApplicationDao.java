package org.assignment.dao;

import org.assignment.entities.Application;

import java.sql.Connection;
import java.util.Map;

public class ApplicationDao extends BaseDao<Application, Integer> {

  public ApplicationDao(Connection connection) {
    super(connection);
  }

  @Override
  public Application read(Integer id) {
    return null;
  }

  @Override
  public Map<Integer, Application> readAll() {
    return null;
  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public void update(Application object) {

  }

  @Override
  public void insert(Application object) {

  }
}
