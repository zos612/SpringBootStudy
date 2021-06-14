package com.example.demo.controller;

import com.example.demo.model.BoardInfo;
import com.example.demo.model.User;
import com.example.demo.repository.BoardInfoRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VueController {

    private final BoardInfoRepository boardInfoRepository;

    private final UserRepository userRepository;

    public VueController(BoardInfoRepository boardInfoRepository, UserRepository userRepository) {
        this.boardInfoRepository = boardInfoRepository;
        this.userRepository = userRepository;
    }

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

//    @PostMapping("data_test")
//    @ResponseBody
//    public List<BoardInfo> data(){
//        List<BoardInfo> result = boardInfoRepository.findBoardInfo();
//        return result;
//    }
    @PostMapping("data_test")
    @ResponseBody
    public List<BoardInfo> data_test(){
        List<BoardInfo> result = boardInfoRepository.findBoardInfo();
        return result;
    }

    @PostMapping("join_user")
    @ResponseBody
    public boolean join_user(@RequestBody User user){
        user.setUserIndex(1);
        userRepository.save(user);
        return true;
    }
}
