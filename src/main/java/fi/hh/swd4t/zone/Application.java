package fi.hh.swd4t.zone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.swd4t.zone.domain.Questions;
import fi.hh.swd4t.zone.domain.QuestionsRepository;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner zoneDemo(QuestionsRepository questionrepository){
		return (args) -> {
			log.info("tallenna kysymys");
			questionrepository.save(new Questions("Miten kehittäisit Zonen palveluita?"));
		};
	}
}
