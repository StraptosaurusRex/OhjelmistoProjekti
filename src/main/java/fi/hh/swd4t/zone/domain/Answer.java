package fi.hh.swd4t.zone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import fi.hh.swd4t.zone.domain.Question;

@EnableAutoConfiguration
@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String answer;
	
	@ManyToOne
	@JsonIgnore
    private Question question;
	
	public Answer() {
		
	}
	public Answer(String answer, Question question) {
		this.answer = answer;
		this.question = question;
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	@Override
	public String toString() {
		if (this.question != null)
		return "Answer [id=" + id + ", answer=" + answer + " question =" + this.getQuestion()+ "]";
		else return "Answer [id=" + id + ", answer=" + answer + "]";
	}

}



