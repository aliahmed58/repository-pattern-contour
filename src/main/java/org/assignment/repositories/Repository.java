package org.assignment.repositories;

import java.util.List;

/**
 * Generic repository interface that declares CRUD methods for entities
 * @param <T> Type of object eg. User
 * @param <K> Type of ID such as Long, String (username) etc.
 */
public interface Repository<T, K> {

    /**
     * Find an entity by its ID
     * @param id the id value
     * @return T object or null if not found
     */
    T findById(K id);

    /**
     * Find all entities in the repository
     * @return Returns null or a List<T> of entities
     */
    List<T> findAll();

    /**
     * Add an entity to the repository
     * @param entity the entity to be added
     */
    void add(T entity);

    /**
     * Update the entity in the repository
     * @param entity the entity T object that should be updated
     */
    void update(T entity);

    /**
     * Delete the entity from repository
     * @param entity the entity T object that should be deleted
     */
    void delete(T entity);
}
