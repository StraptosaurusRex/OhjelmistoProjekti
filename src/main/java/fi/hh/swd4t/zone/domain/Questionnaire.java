package fi.hh.swd4t.zone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
@EnableAutoConfiguration
@Entity

public class Questionnaire {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String question;
private String answer;

public Questionnaire() {
	this.answer = null;
}
public Questionnaire(String question, String answer) {
	this.question = question;
	this.answer = answer;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
@Override
public String toString() {
	return "Questionnaire [id=" + id + ", question=" + question + ", answer=" + answer + "]";
}

}
