package fi.hh.swd4t.zone.web;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import fi.hh.swd4t.zone.domain.Answer;
import fi.hh.swd4t.zone.domain.AnswerRepository;

import fi.hh.swd4t.zone.Application;

import fi.hh.swd4t.zone.domain.Question;
import fi.hh.swd4t.zone.domain.QuestionRepository;


@RestController
public class ApiController {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	private QuestionRepository questionrepository;
	
	@Autowired
	private AnswerRepository answerrepository;

	//Hello world
    @CrossOrigin(origins = "http://myy.haaga-helia.fi")
	@RequestMapping (value="/api/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello world";
	}
	
	//get all questions
    @CrossOrigin(origins = "http://myy.haaga-helia.fi")
	@RequestMapping (value="/api/questions", method=RequestMethod.GET)
	public Iterable<Question> findAllRest() {
		return questionrepository.findAll();
	}
	
	//get question by id
    @CrossOrigin(origins = "http://myy.haaga-helia.fi")
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.GET)
	public Optional<Question> findQuestionRest(@PathVariable("id") Long questionId) {	
    	Optional<Question> result = questionrepository.findById(questionId);
    	log.info("get question by id "+result.toString());
		return result;
	}
	
	//Delete question by id
    @CrossOrigin(origins = "http://myy.haaga-helia.fi")
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.DELETE)
	public void deleteQuestionRest(@PathVariable("id") Long questionId) {
		questionrepository.deleteById(questionId);
	}
	
	//Save new answer
	@RequestMapping(value = "/api/save", method = RequestMethod.POST)
	public void save(String answer){
		String[] temp = answer.split("\\|");
		Optional<Question> question = questionrepository.findById(Long.parseLong(temp[0]));
		Answer tempAnswer = new Answer(temp[1], question.get());
		answerrepository.save(tempAnswer);
	}    
}
