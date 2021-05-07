package com.survey.restaurant.business.service;

import com.survey.restaurant.model.Question;
import com.survey.restaurant.business.repository.QuestionRepository;
import com.survey.restaurant.model.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public List<Question> getBySurvey(Survey survey) {
        return questionRepository.findBySurvey(survey);
    }

    public Optional<Question> findById(Integer idQuestion) {
        return questionRepository.findById(idQuestion);
    }

    public Question save(Question question) {
        return questionRepository.save(question);
    }
}
