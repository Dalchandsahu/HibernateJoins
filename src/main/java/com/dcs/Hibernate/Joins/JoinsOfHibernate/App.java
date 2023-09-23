package com.dcs.Hibernate.Joins.JoinsOfHibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Configuration con = new Configuration();
		SessionFactory factory = con.configure("hibernate.cfg.xml").buildSessionFactory();
//
//		Question q = new Question();
//		System.out.println("Enter Question Id");
//		int id = sc.nextInt();
//		q.setQid(id);
//		System.out.println("Enter Your Question");
//		String ques = sc.next();
//		q.setquestion(ques);
//
//		Answer an1 = new Answer();
//		System.out.println("1st Answer id is ");
//		int sid = sc.nextInt();
//		an1.setAnswer_id(sid);
//		System.out.println("Enter 1st Answer");
//		String as1 =sc.next();
//		an1.setAnswer(as1);
//		an1.setQuestion(q);
//
//		Answer an2 = new Answer();
//		System.out.println("2nd Answer id is ");
//		int sid1= sc.nextInt();
//		an2.setAnswer_id(sid1);
//		System.out.println("Enter 2nd Answer");
//		String as2 =sc.next();
//		an2.setAnswer(as2);
//		an2.setQuestion(q);
//		
//		Answer an3 = new Answer();
//		System.out.println("3rd Answer id is ");
//		int sid2 = sc.nextInt();
//		an3.setAnswer_id(sid2);
//		System.out.println("Enter 3rd Answer");
//		String as3 =sc.next();
//		an3.setAnswer(as3);
//		an3.setQuestion(q);
//
//		List<Answer> list = new ArrayList<Answer>();
//
//		list.add(an1);
//		list.add(an2);
//		list.add(an3);
//
//		q.setAnswers(list);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		session.save(q);
//		session.save(an1);
//		session.save(an2);
//		session.save(an3);
		
		Question qs = session.get(Question.class, 11);
		System.out.println(qs.getquestion());
		
		for(Answer a : qs.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		transaction.commit();
		session.close();
		factory.close();

		System.out.println("insert data successfully");
	}
}
