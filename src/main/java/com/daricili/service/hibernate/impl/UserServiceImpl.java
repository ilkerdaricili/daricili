package com.daricili.service.hibernate.impl;



import com.daricili.dao.hibernate.UserDAO;
import com.daricili.model.hibernate.User;
import com.daricili.service.hibernate.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * User Service
 *
 * @author idaricili
 *
 */
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    /**
     * Add User
     *
     * @param  User user
     */
    @Transactional(readOnly = false)
    @Override
    public void addUser(User user) {
        getUserDAO().addUser(user);
    }

    /**
     * Delete User
     *
     * @param  User user
     */
    @Transactional(readOnly = false)
    @Override
    public void deleteUser(User user) {
        getUserDAO().deleteUser(user);
    }

    /**
     * Update User
     *
     * @param  User user
     */
    @Transactional(readOnly = false)
    @Override
    public void updateUser(User user) {
        getUserDAO().updateUser(user);
    }

    /**
     * Get User
     *
     * @param  int User Id
     */
    @Override
    public User getUserById(int id) {
        return getUserDAO().getUserById(id);
    }

    /**
     * Get User List
     *
     */
    @Override
    public List<User> getUsers() {
        return getUserDAO().getUsers();
    }

    /**
     * Get User DAO
     *
     * @return UserDAO - User DAO
     */
    public UserDAO getUserDAO() {
        return userDAO;
    }

    /**
     * Set User DAO
     *
     * @param UserDAO - User DAO
     */
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}