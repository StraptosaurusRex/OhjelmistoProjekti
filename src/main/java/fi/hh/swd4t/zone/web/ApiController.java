package fi.hh.swd4t.zone.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import fi.hh.swd4t.zone.domain.Questions;
import fi.hh.swd4t.zone.domain.QuestionnaireRepository;


@RestController
public class ApiController {
	@Autowired
	private QuestionnaireRepository questionrepository;

	//Hello world
	@RequestMapping (value="/api/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello world";
	}
	//get question by id
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.GET)
	public Optional<Questions> findQuestionRest(@PathVariable("id") Long questionId) {	
    	return questionrepository.findById(questionId);
	}
	
	//Delete question by id
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.DELETE)
	public void deleteQuestionRest(@PathVariable("id") Long questionId) {
		questionrepository.deleteById(questionId);
	}
}
