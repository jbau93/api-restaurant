package com.survey.restaurant;

import com.survey.restaurant.business.service.AnswerService;
import com.survey.restaurant.business.service.QuestionService;
import com.survey.restaurant.model.Answer;
import com.survey.restaurant.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnswerTest {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private QuestionService questionService;

    @Test
    public void testCreate() {
        Answer answer = new Answer();
        Question question = questionService.findById(1).get();

        answer.setDescription("I love it");
        answer.setQuestion(question);
        answerService.save(answer);
        Assertions.assertNotNull(answerService.findById(1).get());
    }

    @Test
    public void testUpdate(){
        Answer answer = answerService.findById(1).get();
        answer.setDescription("I did not like it");
        answerService.save(answer);
    }
}
