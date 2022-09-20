package com.map.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private int Aid;
	
	private String answer;
	
	@OneToOne(mappedBy = "ans")
	private Question question;
	
	public Answer(int aid, String answer) {
		super();
		Aid = aid;
		this.answer = answer;
	}


	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAid() {
		return Aid;
	}


	public void setAid(int aid) {
		Aid = aid;
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
	
	
	
}
