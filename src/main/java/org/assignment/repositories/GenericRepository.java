package org.assignment.repositories;

import org.assignment.dao.BaseDao;
import org.assignment.dbcontext.DbContext;
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

    /**
     * A map of K key type and T object type where T extends the BaseEntity (the superclass of all entities)
     */
    protected  Map<K, T> map = new HashMap<>();

    protected BaseDao<T, K> dao;

    public GenericRepository(BaseDao<T, K> dao) {
        this.dao = dao;
    }

    /**
     * Find an object by id by looking in the map, if found return else throw an IllegalArgumentExceptions
     */
    @Override
    public T findById(K id) throws IllegalArgumentException {
        if (!this.map.containsKey(id)) {
            throw new IllegalArgumentException("Find: Entity " + id + "does not exist");
        }
        return this.map.get(id);
    }

    /**
     * Return all entities as list by getting values from the map
     */
    @Override
    public List<T> findAll() {
        return dao.readAll();
    }

    /**
     * Add an entity if it does not exists
     */
    @Override
    public void add(T entity) throws IllegalArgumentException {
        if (this.map.containsKey(entity.getId())) {
            throw new IllegalArgumentException("Insert: Entity " + entity.getId() + " already exists");
        } else {
            this.map.put(entity.getId(), entity);
        }
    }

    /**
     * Update an entity if it already exists
     */
    @Override
    public void update(T entity) throws IllegalArgumentException {
        if (this.map.containsKey(entity.getId())) {
            map.replace(entity.getId(), entity);
        }
        else {
            throw new IllegalArgumentException("Update: Entity " + entity.getId() + " does not exist");
        }
    }

    /**
     * Delete an entity if it does exist in the map
     */
    @Override
    public void delete(K id) throws IllegalArgumentException {
        if (this.map.containsKey(id)) {
            map.remove(id);
        }
        else {
            throw new IllegalArgumentException("Delete: Entity " + id + " not found");
        }
    }
}