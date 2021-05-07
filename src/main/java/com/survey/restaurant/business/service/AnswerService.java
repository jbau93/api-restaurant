package com.survey.restaurant.business.service;

import com.survey.restaurant.model.Answer;
import com.survey.restaurant.business.repository.AnswerRepository;
import com.survey.restaurant.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    public List<Answer> findByQuestion(Question question) {
        return answerRepository.findByQuestion(question);
    }

    public Optional<Answer> getAnswer(Integer idAnswer) {
        return answerRepository.findById(idAnswer);
    }

    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }
}
