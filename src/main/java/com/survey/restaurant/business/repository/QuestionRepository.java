package com.survey.restaurant.business.repository;

import com.survey.restaurant.model.Question;
import com.survey.restaurant.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    public List<Question> findBySurvey(Survey survey);

}
