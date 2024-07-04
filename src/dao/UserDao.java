package dao;

import db.DataBase;
import models.User;
import myException.NotFoundException;
import myException.UserAlreadyExistsException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Crud<User, Long> {

    @Override
    public String save(User user) {
        for (User user1 : DataBase.users) {
            if (user1.getEmail().equals(user.getEmail())) {
                try {
                    throw new UserAlreadyExistsException("User with email " + user.getEmail() + " already exists.");
                } catch (UserAlreadyExistsException e) {
                    return e.getMessage();
                }
            }

        }
        DataBase.users.add(user);
        return "SuccessFully saved";
    }

    @Override
    public List<User> findAll() {
        if (DataBase.users == null) {
            return new ArrayList<>();
        }
        return DataBase.users;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        for (User user : DataBase.users) {
            if (user.getId().equals(aLong)) {
                return Optional.ofNullable(Optional.of(user).orElseThrow(() ->
                        new NullPointerException("not found")));
            }
        }
        return Optional.empty();
    }
    @Override
    public User update(Long id, User user) {
        try {
            for (int i = 0; i < DataBase.users.size(); i++) {
                if (DataBase.users.get(i).getId().equals(id)) {
                    User existingUser = DataBase.users.get(i);
                    existingUser.setFirstName(user.getFirstName());
                    existingUser.setEmail(user.getEmail());
                    existingUser.setPassword(user.getPassword());
                    existingUser.setRole(user.getRole());
                    return existingUser;
                }
            }
            throw new NotFoundException("User with id " + id + " not found.");
        } catch (Exception e) {

            System.err.println("An error occurred while updating the user: " + e.getMessage());
            return null;
        }
    }


    @Override
    public String delete(Long aLong) {
        for (User user:DataBase.users){
            if(equals(user.getId().equals(aLong))){
                DataBase.users.remove(user);
                return "SuccessFully saved";
            }
        }
        return "not found";
    }
}
