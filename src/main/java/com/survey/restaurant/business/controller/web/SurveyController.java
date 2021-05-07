package com.survey.restaurant.business.controller.web;

import com.survey.restaurant.model.Survey;
import com.survey.restaurant.business.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encuestas")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    /**
     * Get: List all surveys
     *
     * @return objects question
     */
    @GetMapping("/todas")
    @ResponseStatus(HttpStatus.OK)
    public List<Survey> getAll() {
        return surveyService.findAll();
    }

    /**
     * @param id survey
     * @return an object survey
     */
    @GetMapping("/{idSurvey}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Survey> getSurvey(@PathVariable("idSurvey") Integer idSurvey) {
        return surveyService.findById(idSurvey);
    }

    /**
     * Post: stores a survey object
     *
     * @return the survey object stored
     */
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Survey save(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }
}
