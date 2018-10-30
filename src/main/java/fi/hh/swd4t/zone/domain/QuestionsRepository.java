package fi.hh.swd4t.zone.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface QuestionsRepository extends CrudRepository<Questions, Long>{

	List<Questions>findByQuestion(String question);
}
