package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
     void insertUser(User user) throws SQLException;

     User selectUser(int id) throws SQLException;

     List<User> selectAllUsers() throws SQLException;

     void deleteUser(int id) throws SQLException;

     void updateUser(User user) throws SQLException;
     void addUserTransaction(User user, int[] permision);
}
