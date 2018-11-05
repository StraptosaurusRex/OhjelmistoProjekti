package fi.hh.swd4t.zone;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.swd4t.zone.domain.Answer;
import fi.hh.swd4t.zone.domain.AnswerRepository;
import fi.hh.swd4t.zone.domain.Question;
import fi.hh.swd4t.zone.domain.QuestionRepository;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner zoneDemo(QuestionRepository questionrepository, AnswerRepository answerRepository){
		return (args) -> {
			log.info("tallenna kysymys");
			Question question = new Question("Miten kehittäisit Zonen palveluita?");
			questionrepository.save(question);
			log.info("tannelletaan esimerkkivastauksia");
			answerRepository.save(new Answer("EVVK", question));
		};
	}
}
