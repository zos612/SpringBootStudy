package com.example.demo.controller;

import com.example.demo.model.BoardInfo;
import com.example.demo.repository.VueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

@Controller
public class VueController {

    private final VueRepository vueRepository;

    public VueController(VueRepository vueRepository) {
        this.vueRepository = vueRepository;
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
//        List<BoardInfo> result = vueRepository.findBoardInfo();
//        return result;
//    }
    @PostMapping("data_test")
    @ResponseBody
    public List<BoardInfo> data_test(){
        List<BoardInfo> result = vueRepository.findBoardInfo();

        //TODO: 화면에 뿌릴때 Json으로 변환이 안되는건지 데이터가 안나타남
        return result;
    }
}
