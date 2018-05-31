package com.kevin.springmvc01.dao;

import com.kevin.springmvc01.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户数据访问对象
 * Created by jinyugai on 2018/5/30.
 */
@Repository
public class UserDAO implements IUserDAO{
    private static List<User> users = new ArrayList<User>();

    static{
        users.add(new User(1, "刘德华", "中国香港", "13767890098"));
        users.add(new User(2, "张学友", "中国广东", "18989890767"));
        users.add(new User(3, "张国立", "中国北京", "13345672345"));
        users.add(new User(4, "卢欣桐", "中国上海", "15890908679"));
        users.add(new User(5, "金余概", "中国杭州", "13246712235"));
        for(User user :users){
            System.out.println(user);
        }
    }

    public List<User> getAll() {
        return users;
    }

    public User getUserById(int id) {
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public boolean add(User user) {
        if(user.getId() <= 0){
            user.setId(users.get(users.size()-1).getId()+1);
        }
        users.add(user);
        return true;
    }

    public boolean delete(int id) {
        users.remove(getUserById(id));
        return true;
    }

    public boolean update(User user) {
        User oldUser = getUserById(user.getId());
        oldUser.setAddress(user.getAddress());
        oldUser.setName(user.getName());
        oldUser.setPhone(user.getPhone());
        return true;
    }
}
