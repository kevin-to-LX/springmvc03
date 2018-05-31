package com.kevin.springmvc01.controller;


import com.kevin.springmvc01.entity.User;
import com.kevin.springmvc01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户控制器
 * Created by jinyugai on 2018/5/30.
 */
@Controller
@RequestMapping(path="/user")
public class UserController {


    @Autowired
    private UserService iUserService;


    @RequestMapping(path="/index")  //请求映射
    public String index(Model model){
        //UserService userService= new UserService();


        model.addAttribute("list",iUserService.queryAllUsers());
        return "user/index";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iUserService.deleteUser(id);
        return "redirect:/user/index";
    }
    @RequestMapping("/add")
    public String add(){
        return "user/add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        iUserService.addUser(user);
        return "redirect:/user/index";
        //返回到/user/index.jsp
    }
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("user",iUserService.getUserById(id));
        return "user/edit";
    }
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(User user){
        iUserService.editUser(user);
         return "redirect:/user/index";
    }




}
