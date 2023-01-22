package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoHibernateImpl;
import org.example.dao.UserDaoJDBCImpl;
import org.example.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
