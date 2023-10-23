package com.projectq.quiz.Service;

import com.projectq.quiz.Dao.QuestionsDao;
import com.projectq.quiz.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
     QuestionsDao questionsDao;

    public List<Question> getAllQuestions() {
        return questionsDao.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionsDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionsDao.save(question);
        return "successfully added";
    }

    public String updateQuestion(Question question) {
        questionsDao.save(question);
        return "successfully put";
    }

    public String deleteQuestionById(Question question) {
        questionsDao.delete(question);
        return "deleted successfully";
    }

    public String deleteQuestions() {
        questionsDao.deleteAll();
        return "All questions Deleted Successfully";
    }
}
