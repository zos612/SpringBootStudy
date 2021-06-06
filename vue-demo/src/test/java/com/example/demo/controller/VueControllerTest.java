package com.example.demo.controller;

import com.example.demo.repository.VueRepository;
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

//@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(VueController.class)
public class VueControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    VueRepository vueRepository;

    //TODO: 테스트 코드로 실행하면 vueRepository.findBoardInfo() 결과가 0건이 나타남
    @Test
    public void data_test() throws Exception {

        given(vueRepository.findBoardInfo().size()).willReturn(4);

        mockMvc.perform(post("/data_test"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("test"))
                ;
    }
}
