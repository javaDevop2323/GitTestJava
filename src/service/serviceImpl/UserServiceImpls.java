package service.serviceImpl;

import dao.daoImpl.UserDaoImpl;
import db.DataBase;
import models.User;
import service.UserService;

import java.util.List;

public class UserServiceImpls implements UserService {
    private UserDaoImpl userDao;
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        return userDao.updateUser(id, user);
    }

    @Override
    public String deleteUser(Long id) {
        return userDao.deleteUser(id);
    }
}
