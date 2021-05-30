package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VueController {

    @GetMapping("index.html")
    public String index(){
        return "index";
    }

    @GetMapping("board_main.html")
    public String board_main(){
        return "board_main";
    }

    @GetMapping("board_modify.html")
    public String board_modify(){
        return "board_modify";
    }

    @GetMapping("board_read.html")
    public String board_read(){
        return "board_read";
    }

    @GetMapping("board_write.html")
    public String board_write(){
        return "board_write";
    }

    @GetMapping("join.html")
    public String join(){
        return "join";
    }

    @GetMapping("login.html")
    public String login(){
        return "login";
    }

    @GetMapping("modify_user.html")
    public String modify_user(){
        return "modify_user";
    }

}
