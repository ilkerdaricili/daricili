package com.daricili.service.mongodb;

import com.daricili.model.mongodb.User;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * @author idaricili
 */
public interface UserService
{
    /**
     * Add User
     *
     * @param  User user
     */
    public void addUser(User user);

    /**
     * Update User
     *
     * @param  User user
     */
    public void updateUser(User user);

    /**
     * Delete User
     *
     * @param  User user
     */
    public void deleteUser(User user);

    /**
     * Get User
     *
     * @param  ObjectId User Id
     */
    public User getUserById(ObjectId id);

    /**
     * Get User List
     *
     * @return List - User list
     */
    public List<User> getUserList();
}