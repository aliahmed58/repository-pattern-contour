package org.assignment.repositories;

import org.assignment.entities.Applicant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Since every repository contains a hash map to store its data, we can create a generic repository abstract
 * class and implement the methods using hash map as the in memory store.
 * @param <T> The type of Object such as Applicant
 * @param <K> The type of ID such as String username
 */
public class GenericRepository<T, K> implements Repository<T, K> {

    private Map<K, T> map = new HashMap<>();
    @Override
    public T findById(K id) {
        if (!this.map.containsKey(id)) {
            throw new IllegalArgumentException("Entity not found");
        }
        else return this.map.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<T>(this.map.values());
    }

    @Override
    public void add(T entity) {
        if (this.map.containsValue(entity)) {
            throw new IllegalArgumentException("Applicants entity with username " + entity.getUsername() + " already exists");
        } else {
            this.applicants.put(entity.getUsername(), entity);
        }
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(K id) {

    }
}
