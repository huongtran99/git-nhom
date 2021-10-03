package com.codegym.dao.user_role;

import com.codegym.dao.DBConnection;
import com.codegym.model.UserRole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRoleDao implements IUserRoleDao {
    private Connection connection = DBConnection.getConnection();

    @Override
    public List<UserRole> getAll() {
        List<UserRole> userRoles = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user_role");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int user_role_id = resultSet.getInt("user_role_id");
                String name_role = resultSet.getString("name_role");
                String user_id = resultSet.getString("user_id");
                UserRole userRole = new UserRole(user_role_id, name_role, user_id);
                userRoles.add(userRole);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userRoles;
    }

    @Override
    public boolean save(UserRole userRole) {
        return false;
    }

    @Override
    public boolean update(int id, UserRole userRole) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public UserRole findById(int id) {
        return null;
    }
}
