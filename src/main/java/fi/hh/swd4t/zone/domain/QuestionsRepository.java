package fi.hh.swd4t.zone.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface QuestionsRepository extends CrudRepository<Question, Long>{

	List<Question>findByQuestion(String question);
}
