package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
     void insertUser(User user) throws SQLException;

     User selectUser(int id) throws SQLException;

     List<User> getAll() throws SQLException;
     void deleteUserById(int id) throws SQLException;
     void editUser(User user) throws SQLException;
}
