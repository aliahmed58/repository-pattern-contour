package org.assignment.dao;

import org.assignment.entities.Application;

import java.sql.Connection;
import java.util.List;

public class ApplicationDao extends BaseDao<Application, Integer> {

  public ApplicationDao(Connection connection) {
    super(connection);
  }

  @Override
  public Application read(Integer id) {
    return null;
  }

  @Override
  public List<Application> readAll() {
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
