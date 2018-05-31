package com.kevin.springmvc01.dao;

import com.kevin.springmvc01.entity.User;

import java.util.List;

/**
 * 用户数据访问接口 IUserDAO
 * Created by jinyugai on 2018/5/30.
 */

public interface IUserDAO {
    List<User> getAll();

    User getUserById(int id);

    boolean add(User user);

    boolean delete(int id);

    boolean update(User user);
}
