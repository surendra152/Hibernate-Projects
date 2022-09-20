package com.states.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sts.hibernet.Student;

public class StateDemo {
	
		public static void main(String[] args) {
			
			//practical of Hibernate cycle
			//1.transient state
			//2.persistent state
			//3.detached state
			//4.Remove state
			
			System.out.println("Example: ");
			
			Configuration cf=new Configuration();
			cf.configure("hibernat.cfg.xml");
			SessionFactory factory=cf.buildSessionFactory();
			
			//creating student object
			//1.transient state
			Student student=new Student();
			student.setId(100);
			student.setName("Ram");
			student.setCity("Mum");
			
			//2.persistent state
			//student object associate with session and database
			Session ss=factory.openSession();
			Transaction tr=ss.beginTransaction();
			ss.save(student);
			
			
			student.setName("Shyam");
			
			tr.commit();
			ss.close();
			//3.detached state
			student.setName("Sachin");
			factory.close();
		}
	
}
