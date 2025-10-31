package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController.class)
class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/greet?name=World returns Hello, World")
    void greet_withName_returnsHelloName() throws Exception {
        mockMvc.perform(get("/greet").param("name", "World"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World"));
    }

    @Test
    @DisplayName("/greet without name returns Hello, Friend")
    void greet_withoutName_returnsHelloFriend() throws Exception {
        mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Friend"));
    }
}


