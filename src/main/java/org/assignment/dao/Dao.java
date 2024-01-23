package org.assignment.dao;

import java.util.Map;

/**
 * Interface that contains functions for implementing Data Access Objects
 * Directly interacts with the database
 * @param <T> the type of object such as Applicant
 */
public interface Dao<T, K> {
    T read(K id);
    Map<K, T> readAll();
    void delete(K id);
    void update(T object);
    void insert(T object);
}
