package com.map.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question{
	
	@Id
	@Column(name="question_id")
	private int qid;
	
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer ans;

	public Question(int qid, String question, Answer ans) {
		super();
		this.qid = qid;
		this.question = question;
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	
	
}
