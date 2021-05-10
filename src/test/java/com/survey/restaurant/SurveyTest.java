package com.survey.restaurant;

import com.survey.restaurant.business.service.SurveyService;
import com.survey.restaurant.model.Survey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SurveyTest {

    @Autowired
    SurveyService surveyService;

    @Test
    public void testCreate() {
        Survey survey = new Survey();
        survey.setDescription("Dish feedback");
        surveyService.save(survey);
        Assertions.assertNotNull(surveyService.findById(1).get());

    }

    @Test
    public void testSingleSurvey(){
        Survey survey = surveyService.findById(1).get();
    }

    @Test
    public void testUpdate(){
        Survey survey = surveyService.findById(1).get();
        survey.setDescription("Modified feedback of the dishes ");
        surveyService.save(survey);
    }
}
