package com.daricili.dao.hibernate;

/**
 * Created with IntelliJ IDEA.
 * User: daricili
 * Date: 7/25/12
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 */

import com.daricili.model.hibernate.User;

import java.util.List;

/**
 *
 * User DAO Interface
 *
 * @author idaricili
 *
 */
public interface UserDAO {

    /**
     * Add User
     *
     * @param user
     */
    public void addUser(User user);

    /**
     * Update User
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * Delete User
     *
     * @param  user
     */
    public void deleteUser(User user);

    /**
     * Get User
     *
     * @param  id
     */
    public User getUserById(int id);

    /**
     * Get User List
     *
     */
    public List<User> getUsers();
}