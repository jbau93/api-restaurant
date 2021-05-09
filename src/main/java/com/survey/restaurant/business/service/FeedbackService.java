package com.survey.restaurant.business.service;

import com.survey.restaurant.business.repository.FeedbackRepository;
import com.survey.restaurant.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    public Optional<Feedback> findById(Integer idFeedback) {
        return feedbackRepository.findById(idFeedback);
    }

    public Feedback save(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}
