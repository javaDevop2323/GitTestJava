package dao.daoImpl;

import dao.UserDao;
import db.DataBase;
import models.User;
import myException.UserAlreadyExistsException;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private DataBase dataBase;

    @Override
    public List<User> getUsers() {
        return dataBase.getUsers();
    }

    @Override
    public User getUserById(Long id) {
        try {
            for (User user : dataBase.getUsers()) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
            throw new RuntimeException("User not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public User addUser(User user) {
        dataBase.getUsers().add(user);
        return user;
    }

    @Override
    public User updateUser(Long id, User user1) {
        try {
            for (User user : dataBase.getUsers()) {
                if (user.getId().equals(id)) {
                    dataBase.getUsers().add(user1);
                    return user1;
                }
            }
            throw new RuntimeException("User not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user1;
    }

    @Override
    public String deleteUser(Long id) {
        try {
            for (User user : dataBase.getUsers()) {
                if (user.getId().equals(id)) {
                    dataBase.getUsers().remove(user);
                    return "User deleted";
                }
            }
            throw new RuntimeException("User not found");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "User deleted болгон жок";
    }
}