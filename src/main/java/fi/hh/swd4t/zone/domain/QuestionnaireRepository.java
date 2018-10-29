package fi.hh.swd4t.zone.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface QuestionnaireRepository extends CrudRepository<Questionnaire, Long>{

	List<Questionnaire>findByQuestion(String question);
}
