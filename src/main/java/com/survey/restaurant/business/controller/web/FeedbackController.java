package com.survey.restaurant.business.controller.web;

import com.survey.restaurant.business.service.FeedbackService;
import com.survey.restaurant.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    /**
     * Get: List all feedbacks
     *
     * @return objects feedback
     */
    @GetMapping("/todas")
    @ResponseStatus(HttpStatus.OK)
    public List<Feedback> getAll() {
        return feedbackService.findAll();
    }

    /**
     * @param id feedback
     * @return an object feedback
     */
    @GetMapping("/{idFeedback}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Feedback> getById(@PathVariable("idFeedback") Integer idFeedback) {
        return feedbackService.findById(idFeedback);
    }

    /**
     * Post: stores a feedback object
     *
     * @return the feedback object stored
     */
    @PutMapping("/{idFeedback}")
    @ResponseStatus(HttpStatus.OK)
    public Feedback edit(@PathVariable("idFeedback") Feedback feedback) {
        return feedbackService.save(feedback);
    }


    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Feedback save(@RequestBody Feedback feedback) {
        return feedbackService.save(feedback);
    }
}
