package fi.hh.swd4t.zone.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String question;
   
	@ManyToOne
    private Type type;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Answer> answers;
	
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
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", type=" + type + "]";
	}
	

}
