package fi.hh.swd4t.zone.web;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fi.hh.swd4t.zone.Application;
import fi.hh.swd4t.zone.domain.Question;
import fi.hh.swd4t.zone.domain.QuestionRepository;


@RestController
public class ApiController {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	private QuestionRepository questionrepository;

	//Hello world
	@RequestMapping (value="/api/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello world";
	}
	
	//get all questions
	@RequestMapping (value="/api/questions", method=RequestMethod.GET)
	public Iterable<Question> findAllRest() {
		return questionrepository.findAll();
	}
	
	//get question by id
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.GET)
	public Optional<Question> findQuestionRest(@PathVariable("id") Long questionId) {	
    	Optional<Question> result = questionrepository.findById(questionId);
    	log.info("get question by id "+result.toString());
		return result;
	}
	
	//Delete question by id
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.DELETE)
	public void deleteQuestionRest(@PathVariable("id") Long questionId) {
		questionrepository.deleteById(questionId);
	}
}
