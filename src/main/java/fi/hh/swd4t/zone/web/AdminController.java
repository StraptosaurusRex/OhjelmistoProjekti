package fi.hh.swd4t.zone.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import fi.hh.swd4t.zone.domain.Question;
import fi.hh.swd4t.zone.domain.QuestionRepository;

@Controller
public class AdminController {
	
	@Autowired
	private QuestionRepository questionrepository;
	
	// Add new question
    @RequestMapping(value = "/add")
    public String addQuestion(Model model){
    	model.addAttribute("question", new Question());
        return "addstudent";
    }     
    
    //Save new question
  	@RequestMapping(value = "/save", method = RequestMethod.POST)
  	public String save(Question question){
  		questionrepository.save(question);
  	    return "redirect:Hello world";
  	    }    
	

}
