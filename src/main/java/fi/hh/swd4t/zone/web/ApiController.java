package fi.hh.swd4t.zone.web;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	/*@Autowired
	private QuestionRepository qRepo;
	*/
	//Hello world
	@RequestMapping (value="/api/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello world";
	}
	
	/*Add a question POST
		@RequestMapping(value = "/addquestion", method = RequestMethod.POST)
		public String save(Question question, Model model) {
			qRepo.save(question);
			model.addAttribute("question", new Question());
			return "addquestion";
		}
	//add a question GET
		@RequestMapping(value = "/addquestion", method = RequestMethod.GET)
		public String addquestion(Model model) {
			model.addAttribute("question", new Question());
			return "addquestion";
		}
		*/
}
