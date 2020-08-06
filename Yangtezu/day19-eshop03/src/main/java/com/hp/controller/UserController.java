package com.hp.controller;

import com.hp.domain.User;
import com.hp.service.IUserService;
import com.hp.utils.EncryptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@RequestMapping("/front")
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login/loginPage")
    public String loginPage(){
        return "user/login";
    }

    @RequestMapping("/register/registerPage")
    public String registerPage(){
        return "user/register";
    }



    @RequestMapping("/login/login")
    @ResponseBody
    public String login(String username, String password, String code, HttpSession session){
        System.out.println(username+"---"+password+"---"+code);
        //验证用户名、密码和验证码
        //1、验证码校验
        if (StringUtils.isEmpty(code) || !code.equalsIgnoreCase((String) session.getAttribute("code1"))){
            return "验证码为空或错误";
        }
        //2、用户名或密码是否存在
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            return "用户名或密码为空";
        }
        //3、判断用户名和密码是否正确
        User user = userService.selectUserByName(username);


        if (username.equals(user.getUsername()) && EncryptionUtils.encryptMD5(password).equals(user.getPassword())){
            session.setAttribute("user",user);

            return "登录成功";
        }else{
            return "用户名或密码错误";
        }


    }

    @RequestMapping("/register/register")
    @ResponseBody
    public String register(String username,String password,String confirmPassword,String code,HttpSession session){
        //1、验证码校验
        if (StringUtils.isEmpty(code) || !code.equalsIgnoreCase((String)session.getAttribute("code1"))){
            return "验证码为空或错误";
        }
        //2、用户名或密码是否为空
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password) || StringUtils.isEmpty(confirmPassword)){
            return "用户名或密码为空";
        }
        //3、判断两次密码是否一致
        if (!password.equals(confirmPassword)){
            return "两次密码不一致";
        }
        //3、判断用户名是否重复
        User user = userService.selectUserByName(username);
        if (user!=null){
            return "用户名已存在";
        }else {
            User registerUser = new User();
            registerUser.setId(StringUtils.replace(UUID.randomUUID().toString(),"-",""));
            registerUser.setUsername(username);
            registerUser.setPassword(EncryptionUtils.encryptMD5(password));
            registerUser.setType(1);
            int i = userService.addUser(registerUser);
            return "注册成功";
        }

    }


    @RequestMapping("/login/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/front/index";
    }



}
