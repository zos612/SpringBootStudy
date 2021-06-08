package com.example.demo.controller;

import com.example.demo.model.BoardInfo;
import com.example.demo.repository.VueRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VueController.class)
class VueControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    VueRepository vueRepository;

    private BoardInfo boardInfo;

    @BeforeEach
    void setup() {
        boardInfo = new BoardInfo();
        boardInfo.setBoardInfoIdx(0);
        boardInfo.setBoardInfoName("test");
    }

    @Test
    void data_test() throws Exception {

        given(this.vueRepository.findBoardInfo()).willReturn(Lists.newArrayList(boardInfo, new BoardInfo()));

        mockMvc.perform(post("/data_test"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("test"))
                ;
    }
}
