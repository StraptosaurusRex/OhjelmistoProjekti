package fi.hh.swd4t.zone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
@EnableAutoConfiguration
@Entity
public class Questions {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String question;

public Questions() {
	
}
public Questions(String question) {
	this.question = question;

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
@Override
public String toString() {
	return "Questionnaire [id=" + id + ", question=" + question + "]";
}

}
