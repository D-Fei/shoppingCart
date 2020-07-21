package com.boss.demo.controller;

import com.boss.demo.db.mapper.UserMapper;
import com.boss.demo.db.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/demo/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(HttpServletRequest request, HttpServletResponse response ,@PathVariable("id") Integer userId) {
        User user = (User) userMapper.selectByPrimaryKey(userId);
        System.out.println(user);
        return user;
    }
    @RequestMapping(value = "/123")
    public Integer addUser(HttpServletRequest request, HttpServletResponse response , @RequestParam(name = "id") Integer userId, @RequestParam(name ="name") String username, @RequestParam(name = "age") Integer userage){
        User user = new User();
        user.setId(userId);
        user.setName(username);
        user.setAge(userage);
        System.out.println(user);
        int result = userMapper.insert(user);
        System.out.println(result);
        return result;
    }

}
