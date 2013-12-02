package com.daricili.service.mongodb.impl;

import com.daricili.dao.mongodb.UserDAO;
import com.daricili.model.mongodb.User;
import com.daricili.service.mongodb.UserService;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * @author idaricili
 */
public class UserServiceImpl implements UserService
{
    @Getter
    @Setter
    UserDAO userDAO;

    @Override
    public void addUser(User user)
    {
        userDAO.save(user);
    }

    @Override
    public void updateUser(User user)
    {
        userDAO.save(user);
    }

    @Override
    public void deleteUser(User user)
    {
        userDAO.delete(user);
    }

    @Override
    public User getUserById(ObjectId id)
    {
        return userDAO.get(id);
    }

    @Override
    public List<User> getUserList()
    {
        return userDAO.find().asList();
    }
}
