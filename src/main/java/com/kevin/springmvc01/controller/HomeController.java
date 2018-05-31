package com.kevin.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinyugai on 2018/5/30.
 */
@Controller//声明为控制器
/**
    注解为@Controller是为了让Spring IOC容器初始化时自动扫描到
*/
@RequestMapping(path = "/home")//请求映射
public class HomeController {
    /**
     * @ RequestMapping是为了映射请求路径，
     * 这里因为类与方法上都有映射所以访问时应该是/home/index
     * */
    @RequestMapping(path = "/index")//请求映射
    public String index(Model model){
        /**
         * 方法中声明Model类型的参数是为了把Action中的数据带到视图中
         * */
        model.addAttribute("message","Hello Spring MVC!");
        /**
         * 方法返回的结果是视图的名称index
         * */
        return "home/index";
    }
}
