package com.daricili.managed.bean;

import com.daricili.model.mongodb.User;
import com.daricili.service.mongodb.UserService;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * User Managed Bean
 *
 * @author idaricili
 *
 */
@ManagedBean(name="userMB")
@ViewScoped
@Data

public class UserManagedBean implements Serializable {


    private static final long serialVersionUID = 1L;

    UserService userService;
    private String name = StringUtils.EMPTY;
    private String surname = StringUtils.EMPTY;
    private String phone = StringUtils.EMPTY;
    private User selectedUser;

    public void addUser()
    {
        User user = new User();
        user.setFirstName(getName());
        user.setLastName(getSurname());
        user.setPhone(getPhone());
        userService.addUser(user);
        reset();
    }

    public void updateUser()
    {
        getUserService().updateUser(getSelectedUser());
    }

    public void deleteUser()
    {
        getUserService().deleteUser(getSelectedUser());
    }

    public void reset() {
        this.setName(StringUtils.EMPTY);
        this.setSurname(StringUtils.EMPTY);
        this.setPhone(StringUtils.EMPTY);
    }

    public List<User> getUserList()
    {
        return getUserService().getUserList();
    }
}