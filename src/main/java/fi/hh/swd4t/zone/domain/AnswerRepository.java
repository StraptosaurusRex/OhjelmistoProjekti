package fi.hh.swd4t.zone.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	
	List<Answer> findByAnswer(Answer answer);
	List<Answer> findByQuestion(Question question);

}
