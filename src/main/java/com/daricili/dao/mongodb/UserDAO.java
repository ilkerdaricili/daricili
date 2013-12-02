package com.daricili.dao.mongodb;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.dao.BasicDAO;
import com.daricili.model.mongodb.User;
import org.bson.types.ObjectId;


public class UserDAO extends BasicDAO<User, ObjectId>
{
    protected UserDAO(Datastore ds) {
        super(ds);
    }

}
