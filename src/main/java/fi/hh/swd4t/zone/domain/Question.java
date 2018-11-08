package fi.hh.swd4t.zone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;

@EnableAutoConfiguration
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String question;
    @ManyToOne
    @JsonIgnore
    private Type type;
	
	public Question() {
	
	}
	
	public Question(String question, Type type) {
		this.question = question;
		this.type = type;
	
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
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", type=" + type + "]";
	}

}
