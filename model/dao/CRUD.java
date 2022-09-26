package org.angello.com.model.dao;

import java.util.ArrayList;

public interface CRUD<Class> {
    public void save(Class object) throws Exception;

    public Class search(int id) throws Exception;

    public ArrayList<Class> readAll() throws Exception;

    public void update(Class object) throws Exception;

    public void delete(int id) throws Exception;
}
