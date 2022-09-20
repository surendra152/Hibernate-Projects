package com.map.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {


		Configuration cf=new Configuration();
		cf.configure("hibernat.cfg.xml");
		SessionFactory factory=cf.buildSessionFactory();
		
		//creating question
		
		Question q=new Question();
		q.setQid(1212);
		q.setQuestion("What is java");
		
		//creating answer object
		Answer aw=new Answer();
		aw.setAid(343);
		aw.setAnswer("Java is a programming language");
		aw.setQuestion(q);
		q.setAns(aw);
		
		//question 2
		Question q1=new Question();
		q1.setQid(242);
		q1.setQuestion("What is jira");
		
		//creating answer object
		Answer aw1=new Answer();
		aw1.setAid(341);
		aw1.setAnswer("Jira ia an agile managment tool");
		aw1.setQuestion(q1); 
		q1.setAns(aw1);
		
		//session
		Session ss=factory.openSession();
		
		Transaction tr=ss.beginTransaction();
		
		//save
		ss.save(q);
		ss.save(q1);
		ss.save(aw1);
		ss.save(aw);
		
		tr.commit();
		
		//printing
		Question newQ=(Question)ss.get(Question.class, 242);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAns().getAnswer());
		
		ss.close();
		factory.close();
	}
}
