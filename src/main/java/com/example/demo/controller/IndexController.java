package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author acone
 * created: 2019/3/20 13:25
 */
@Controller
public class IndexController {
    @RequestMapping("/{userId}")
    @ResponseBody
    public String index(@PathVariable("userId") int userId) {
        return String.format("Hello World, {%d}", userId);
    }
}
