package fi.hh.swd4t.zone.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	@Transactional
	Question findById(int questionId);
}
