package org.traccar.storage;

import org.traccar.storage.query.Request;

import java.util.List;

public class MemoryStorage extends Storage {

    @Override
    public <T> List<T> getObjects(Class<T> clazz, Request request) throws StorageException {
        return null;
    }

    @Override
    public <T> long addObject(T entity, Request request) throws StorageException {
        return 0;
    }

    @Override
    public <T> void updateObject(T entity, Request request) throws StorageException {
    }

    @Override
    public void removeObject(Class<?> clazz, Request request) throws StorageException {
    }

}
