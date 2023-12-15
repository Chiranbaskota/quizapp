package com.chiran.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiran.quizapp.Question;
import com.chiran.quizapp.dao.QuestionDao;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions(){
		
		return questionDao.findAll();
		
	}
	
	public List<Question> getByCategory(String category){
		
		
		return questionDao.findByCategory(category);
	}

	

	
}
