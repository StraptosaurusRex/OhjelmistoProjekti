package fi.hh.swd4t.zone.fi.hh.swd4t.zone.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


import fi.hh.swd4t.zone.fi.hh.swd4t.zone.web.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	@Transactional
	Question findById(int questionId);
}
