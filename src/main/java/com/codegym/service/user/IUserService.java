package com.codegym.service.user;

import com.codegym.model.User;
import com.codegym.service.IGeneralService;

import java.util.List;

public interface IUserService extends IGeneralService<User> {

    List<User> findUserByName(String user_name);

    boolean login(String user_name, String password);
}
