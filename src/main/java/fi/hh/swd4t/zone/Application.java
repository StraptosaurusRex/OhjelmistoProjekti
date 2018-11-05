package fi.hh.swd4t.zone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.swd4t.zone.domain.Question;
import fi.hh.swd4t.zone.domain.QuestionRepository;
import fi.hh.swd4t.zone.domain.TypeRepository;
import fi.hh.swd4t.zone.domain.Type;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner zoneDemo(QuestionRepository questionrepository, TypeRepository typerepository){
		return (args) -> {
			log.info("tallenna kysymys");
			questionrepository.save(new Question("Miten kehittäisit Zonen palveluita?", typerepository.findByType("teksti").get(0)));
			
			log.info("tallenna kategoriat");
			typerepository.save(new Type("teksti"));
			typerepository.save(new Type("monivalinta"));
		};
	}
}
