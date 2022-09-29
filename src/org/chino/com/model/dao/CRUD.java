package org.chino.com.model.dao;

import java.util.ArrayList;

public interface CRUD<Class, T> {
    public void save(Class object) throws Exception;

    public Class search(T id) throws Exception;

    public ArrayList<Class> readAll() throws Exception;

    public void update(Class object) throws Exception;

    public void delete(T id) throws Exception;
}
