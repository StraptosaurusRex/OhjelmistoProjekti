package fi.hh.swd4t.zone.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	//Hello world
	@RequestMapping (value="/api/hello", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello world";
	}
	
}
