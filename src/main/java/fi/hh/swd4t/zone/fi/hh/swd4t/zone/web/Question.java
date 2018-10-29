package fi.hh.swd4t.zone.fi.hh.swd4t.zone.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	private int questionId;
	private String question;
	private String answer;
	
	public Question() {
		
	}
	
	public Question(int questionId, String question, String answer) {
		this.questionId= questionId;
		this.question= question;
		this.answer= answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
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
}
