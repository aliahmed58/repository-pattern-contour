package org.assignment.entities;

import java.util.Objects;

/**
 * A base entity class that will be the superclass of all entities
 * having common functionality and abstract method needed to be implemented
 *
 * @param <K> the type of id the entity will have such as string, int etc.
 */
public abstract class BaseEntity<K> {

    protected K id;

    public BaseEntity(K id) {
        this.id = id;
    }

    public BaseEntity() {

    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    @Override
    public abstract String toString();

    /**
     * Overriding equals and hashcode to equate all entities with their ids
     * instead of the default java method
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> entity = (BaseEntity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
