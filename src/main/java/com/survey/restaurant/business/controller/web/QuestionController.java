package com.survey.restaurant.business.controller.web;

import com.survey.restaurant.model.Question;
import com.survey.restaurant.business.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    /**
     * Get: List all questions
     *
     * @return objects question
     */
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Question> findAll() {
        return questionService.findAll();
    }

    /**
     * @param id question
     * @return an object question
     */
    @GetMapping("/{idQuestion}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Question> getSurvey(@PathVariable("idQuestion") Integer idQuestion) {
        return questionService.findById(idQuestion);
    }

    /**
     * Post: stores a question object
     *
     * @return the question object stored
     */
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Question save(@RequestBody Question question) {
        return questionService.save(question);
    }
}
