package fi.hh.swd4t.zone.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;

@EnableAutoConfiguration
@Entity
public class Type {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long typeid;
	private String type;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
	private List<Question> questions;
	
	
	public Type() {
		
	}
	
	public Type(String type) {
		this.type = type;
	}

	public Long getTypeid() {
		return typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Type [typeid=" + typeid + ", type=" + type + "]";
	}
	
}
