package com.survey.restaurant;

import com.survey.restaurant.business.service.QuestionService;
import com.survey.restaurant.model.Survey;
import com.survey.restaurant.business.service.SurveyService;
import com.survey.restaurant.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionTest {

    @Autowired
    QuestionService questionService;

    @Autowired
    SurveyService surveyService;

    @Test
    public void testCreate() {
        Question question = new Question();
        Survey survey = surveyService.findById(1).get();

        question.setDescription("How do you rate the speed of our service?");
        question.setSurvey(survey);
        questionService.save(question);
        Assertions.assertNotNull(questionService.findById(1).get());
    }

    @Test
    public void testSingleSurvey() {
        Survey survey = surveyService.findById(1).get();
    }

    @Test
    public void testUpdate(){
        Question question = questionService.findById(1).get();
        question.setDescription("How would you rate the ambiance of the restaurant? ");
        questionService.save(question);
    }
}


