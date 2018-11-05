package fi.hh.swd4t.zone.domain;

import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	
	List<Answer> findByAnswer(Answer);
	List<Answer> findByQuestion(question);
	

}
