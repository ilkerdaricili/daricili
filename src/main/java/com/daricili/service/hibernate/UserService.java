package com.daricili.service.hibernate;

import java.util.List;

import com.daricili.model.hibernate.User;

/**
 *
 * User Service Interface
 *
 * @author idaricili
 *
 */
public interface UserService {

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
     * @param  int User Id
     */
    public User getUserById(int id);

    /**
     * Get User List
     *
     * @return List - User list
     */
    public List<User> getUsers();
}