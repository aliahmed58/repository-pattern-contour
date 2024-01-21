package org.assignment.dao;

import java.util.List;

/**
 * Interface that contains functions for implementing Data Access Objects
 * Directly interacts with the database
 * @param <T> the type of object such as Applicant
 */
public interface Dao<T, K> {
    T read(K id);
    List<T> readAll();
    void delete(K id);
    void update(K id);
    void insert(K id);
}
