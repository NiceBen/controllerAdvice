package com.ofben.controllerAdvice.controller;

import com.ofben.controllerAdvice.constant.Result;
import com.ofben.controllerAdvice.model.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author NiceBen
 * @date 2021-12-31
 * @since TODO
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("getUser_Str")
    public String getUser_Str() {
        return "hello";
    }

    @GetMapping("getUser_Entity")
    public User getUser_Entity() {
        User user = initUser();
        return user;
    }

    @GetMapping("getUser_E")
    public User getUser_E() {
        List<User> users = new ArrayList<>();
        return users.get(0);
    }

    @GetMapping("getUser_Result")
    public Result getUser_Result() {
        return Result.success("hello");
    }

    private User initUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setAge(11);
        user.setGander("man");
        return user;
    }
}
