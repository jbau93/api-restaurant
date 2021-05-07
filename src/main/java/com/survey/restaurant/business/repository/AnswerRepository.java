package com.survey.restaurant.business.repository;

import com.survey.restaurant.model.Answer;
import com.survey.restaurant.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository <Answer, Integer>{

    public List<Answer> findByQuestion(Question question);
}
