package com.kevin.springmvc01.service;

import com.kevin.springmvc01.dao.IUserDAO;
import com.kevin.springmvc01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户业务类UserService
 * Created by jinyugai on 2018/5/30.
 */
@Repository
public class UserService implements IUserService {

      @Autowired
     IUserDAO iUserDAO;


    public List<User> queryAllUsers(){
        return iUserDAO.getAll();
    }

    public User getUserById(int id){
        return iUserDAO.getUserById(id);
    }

    public boolean deleteUser(int id){
        return  iUserDAO.delete(id);
    }
    public boolean editUser(User user){
        return iUserDAO.update(user);
    }
    public boolean addUser(User user){
        return iUserDAO.add(user);
    }
}
