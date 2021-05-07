package com.survey.restaurant.business.service;

import com.survey.restaurant.model.Survey;
import com.survey.restaurant.business.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> findAll() {
        return surveyRepository.findAll();
    }

    public Optional<Survey> findById(Integer idSurvey) {
        return surveyRepository.findById(idSurvey);
    }

    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }
}
