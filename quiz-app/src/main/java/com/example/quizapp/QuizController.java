package com.example.quizapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuestionRepository questionRepository;

    private List<Answer> answers = new ArrayList<>();

    @GetMapping("/start")
    public String startQuiz() {
        answers.clear(); // Clear any previous quiz session data
        return "New quiz session started. Use /random to get questions.";
    }

    @GetMapping("/random")
    public List<Question> getRandomQuestions(@RequestParam(defaultValue = "2") int count) {
        return questionRepository.findRandomQuestions(count);
    }

    @GetMapping("/submit")
    public String submitAnswer(@RequestParam Long questionId, @RequestParam String answer) {
        Question question = questionRepository.findById(questionId).orElse(null);

        if (question == null) {
            return "Question not found.";
        }

        boolean isCorrect = question.getCorrectAnswer().equalsIgnoreCase(answer);
        Answer userAnswer = new Answer();
        userAnswer.setQuestionId(questionId);
        userAnswer.setUserAnswer(answer);
        userAnswer.setCorrect(isCorrect);
        answers.add(userAnswer);

        return isCorrect ? "Correct answer!" : "Incorrect answer.";
    }


    @GetMapping("/all")
    public List<Answer> getAllAnswers() {
        return answers;
    }
}

