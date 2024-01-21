package org.assignment.dao;


import org.assignment.entities.BaseEntity;

import java.sql.Connection;

/**
 * Since every Data Access Object needs a connection we can create a base abstract class
 * that every concrete implementation will inherit from
 */
public abstract class BaseDao<T extends BaseEntity<K>, K> implements Dao<T, K> {
    // database context
    protected Connection connection;


    // We pass the connection in the constructor using dependency injection instead of creating
    // the connection here.
    public BaseDao(Connection connection) {
        this.connection = connection;
    }

}
