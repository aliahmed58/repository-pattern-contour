package org.assignment.repositories;

import org.assignment.entities.Applicant;
import org.assignment.entities.BaseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Since every repository contains a hash map to store its data, we can create a generic repository abstract
 * class and implement the methods using hash map as the in memory store.
 * @param <K> The type of ID such as String username
 */

public class GenericRepository<T extends BaseEntity<K>, K> implements Repository<T, K> {

    protected  Map<K, T> map = new HashMap<>();

    @Override
    public T findById(K id) {
        if (!this.map.containsKey(id)) {
            throw new IllegalArgumentException("Find: Entity " + id + "does not exist");
        }
        return this.map.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(this.map.values());
    }

    @Override
    public void add(T entity) {
        if (this.map.containsKey(entity.getId())) {
            throw new IllegalArgumentException("Insert: Entity " + entity.getId() + " already exists");
        } else {
            this.map.put(entity.getId(), entity);
        }
    }

    @Override
    public void update(T entity) {
        if (this.map.containsKey(entity.getId())) {
            map.replace(entity.getId(), entity);
        }
        else {
            throw new IllegalArgumentException("Update: Entity " + entity.getId() + " does not exist");
        }
    }

    @Override
    public void delete(K id) {
        if (this.map.containsKey(id)) {
            map.remove(id);
        }
        else {
            throw new IllegalArgumentException("Delete: Entity " + id + " not found");
        }
    }
}