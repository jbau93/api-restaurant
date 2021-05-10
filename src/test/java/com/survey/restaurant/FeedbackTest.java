package com.survey.restaurant;

import com.survey.restaurant.business.service.FeedbackService;
import com.survey.restaurant.business.service.AnswerService;
import com.survey.restaurant.business.service.QuestionService;
import com.survey.restaurant.model.Answer;
import com.survey.restaurant.model.Feedback;
import com.survey.restaurant.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FeedbackTest {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @Test
    public void testCreate() {
        Feedback feedback = new Feedback();
        Question question = questionService.findById(1).get();
        Answer answer = answerService.findById(15).get();

        feedback.setQuestion(question);
        feedback.setAnswer(answer);
        feedbackService.save(feedback);
        //Assertions.assertNotNull(feedbackService.findById(1).get());
    }
}
