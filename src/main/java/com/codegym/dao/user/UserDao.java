package com.codegym.dao.user;

import com.codegym.dao.DBConnection;
import com.codegym.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {
    private Connection connection = DBConnection.getConnection();

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from users");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int user_id = resultSet.getInt("user_id");
                String user_name = resultSet.getString("user_name");
                String password = resultSet.getString("password");
                String password_retype = resultSet.getString("password_retype");
                String email = resultSet.getString("email");
                String create_date = resultSet.getString("create_date");
                String role = resultSet.getString("role");
                String avatar = resultSet.getString("avatar");
                String gender = resultSet.getString("gender");
                String phone = resultSet.getString("phone");
                String about = resultSet.getString("about");
                User user = new User(user_id, user_name, password, password_retype, email, create_date, role, avatar, gender, phone, about);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean update(int id, User user) {
        return false;
    }


    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    public User findByUserNameAndPassword(String user_name, String password) {
        User user = null;
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("select * from users where user_name = ? and password = ?;");
            statement.setString(1, user_name);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                String password_retype = rs.getString("password_retype");
                String email = rs.getString("email");
                String create_date = rs.getString("create_date");
                String role = rs.getString("role");
                String avatar = rs.getString("avatar");
                String gender = rs.getString("gender");
                String phone = rs.getString("phone");
                String about = rs.getString("about");
                user = new User(user_id, user_name, password, password_retype, email, create_date, role, avatar, gender, phone, about);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }


}
