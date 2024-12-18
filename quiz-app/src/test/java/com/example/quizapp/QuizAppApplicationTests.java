package com.example.quizapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class QuizAppApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
        // Check if the application context loads successfully.
    }

    @Test
    public void testStartQuiz() throws Exception {
        mockMvc.perform(get("/api/quiz/start"))
                .andExpect(status().isOk())
                .andExpect(content().string("New quiz session started. Use /random to get questions."));
    }

    @Test
    public void testFetchRandomQuestions() throws Exception {
        mockMvc.perform(get("/api/quiz/random?count=3"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());
    }

    @Test
    public void testSubmitAnswer() throws Exception {
        mockMvc.perform(get("/api/quiz/submit")
                        .param("questionId", "1")
                        .param("answer", "Paris"))
                .andExpect(status().isOk())
                .andExpect(content().string("Answer submitted successfully."));
    }

    @Test
    public void testFetchAllAnswers() throws Exception {
        mockMvc.perform(get("/api/quiz/all"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());
    }
}
