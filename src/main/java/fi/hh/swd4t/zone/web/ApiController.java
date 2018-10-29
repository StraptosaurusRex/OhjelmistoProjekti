package fi.hh.swd4t.zone.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import fi.hh.swd4t.zone.domain.Question;
import fi.hh.swd4t.zone.domain.QuestionRepository;

@RestController
public class ApiController {
	@Autowired
	private QuestionRepository questionrepository;

	//Hello world
	@RequestMapping (value="/api/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello world";
	}
	
	//get question by id
	@RequestMapping (value="/api/question/{id}", method=RequestMethod.GET)
	public @ResponseBody Optional<Question> findQuestiobnRest(@PathVariable("id") Long questionId) {	
    	return questionrepository.findById(questionId);
	}
	
	
}
