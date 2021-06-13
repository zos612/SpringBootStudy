package com.example.demo.controller;

import com.example.demo.model.BoardInfo;
import com.example.demo.repository.BoardInfoRepository;
import com.example.demo.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@ContextConfiguration(classes = BoardInfoRepository.class)
@WebMvcTest(VueController.class)
class VueControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    BoardInfoRepository boardInfoRepository;

    @MockBean
    UserRepository userRepository;

    private BoardInfo boardInfo;

    @BeforeEach
    void setup() {
        boardInfo = new BoardInfo();
        boardInfo.setBoardInfoIdx(0);
        boardInfo.setBoardInfoName("test");
    }

    @Test
    void data_test() throws Exception {

        given(this.boardInfoRepository.findBoardInfo()).willReturn(Lists.newArrayList(boardInfo, new BoardInfo()));

        mockMvc.perform(post("/data_test"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("test"))
                ;
    }

    @Test
    void join_user() throws Exception {
        mockMvc.perform(post("/join_user")
                .param("userName", "1234")
                .param("userId", "1234")
                .param("userPw", "1234")
                .param("userPw2", "1234")
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("userName").value("1234"))
                ;

    }
}
