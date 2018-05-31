package com.kevin.springmvc01.service;

import com.kevin.springmvc01.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyugai on 2018/5/31.
 */
@Service
public interface IUserService {
    List<User> queryAllUsers();

    User getUserById(int id);

    boolean deleteUser(int id);

    boolean editUser(User user);

    boolean addUser(User user);
}
