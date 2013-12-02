package com.daricili.managed.bean;

import com.daricili.model.mongodb.User;
import com.daricili.service.mongodb.UserService;
import junit.framework.TestCase;
import org.apache.commons.lang.StringUtils;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * User: idaricili
 */
public class UserManagedBeanTest extends TestCase
{
    private UserService userService;

    private UserManagedBean userManagedBean;

    @Before
    public void setUp()
    {
        this.userManagedBean = new UserManagedBean();
        userService = EasyMock.createMock(UserService.class);
        this.userManagedBean.setUserService(userService);
    }

    @Test
    public void testAddUser()
    {
        //preparation
        userManagedBean.setName("Test");
        userManagedBean.setSurname("SurnameTest");
        userManagedBean.setPhone("0123456789");

        userService.addUser(EasyMock.isA(User.class));
        EasyMock.expectLastCall();
        EasyMock.replay(userService);

        // code to test
        userManagedBean.addUser();
        assertTrue(StringUtils.isBlank(userManagedBean.getName()));
        assertTrue(StringUtils.isBlank(userManagedBean.getSurname()));
        assertTrue(StringUtils.isBlank(userManagedBean.getPhone()));

        EasyMock.verify(userService);
    }

    @Test
    public void testUpdateUser()
    {
        //preparation
        User selectedUser = new User();
        userManagedBean.setSelectedUser(selectedUser);

        userService.updateUser(selectedUser);
        EasyMock.expectLastCall();
        EasyMock.replay(userService);

        // code to test
        userManagedBean.updateUser();

        EasyMock.verify(userService);
    }

    @Test
    public void testDeleteUser()
    {
        //preparation
        User selectedUser = new User();
        userManagedBean.setSelectedUser(selectedUser);

        userService.deleteUser(selectedUser);
        EasyMock.expectLastCall();
        EasyMock.replay(userService);

        // code to test
        userManagedBean.deleteUser();

        EasyMock.verify(userService);
    }

    @Test
    public void testGetUserList()
    {

        List<User> users = new LinkedList<User>();
        User user = new User();
        user.setFirstName("İlker");
        user.setLastName("Darıcılı");
        user.setPhone("1234567890");
        users.add(user);
        EasyMock.expect(userService.getUserList()).andReturn(users).once();
        EasyMock.replay(userService);

        // code to test
        List<User> userList = userManagedBean.getUserList();
        assertTrue(userList != null);
        assertEquals(1, userList.size());
        User userToTest = userList.get(0);
        assertEquals("İlker", userToTest.getFirstName());
        assertEquals("Darıcılı", userList.get(0).getLastName());
        assertEquals("1234567890", userList.get(0).getPhone());

        EasyMock.verify(userService);
    }

    @Test
    public void testReset()
    {
        //preparation
        userManagedBean.setName("Not Empty name");
        userManagedBean.setSurname("Not Empty surname");
        userManagedBean.setPhone("Not Empty phone");

        // code to test
        userManagedBean.reset();
        assertEquals(StringUtils.EMPTY, userManagedBean.getName());
        assertEquals(StringUtils.EMPTY, userManagedBean.getSurname());
        assertEquals(StringUtils.EMPTY, userManagedBean.getPhone());
    }






}
