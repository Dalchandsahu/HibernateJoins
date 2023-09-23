package com.dcs.Hibernate.Joins.JoinsOfHibernate;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Question {

	@Id
	private int Qid;
	private String question;
	@OneToMany(mappedBy = "question")
	private List<Answer> answers;

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getquestion() {
		return question;
	}

	public void setquestion(String ques) {
		question = ques;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Question(int qid, String ques, List<Answer> answers) {
		super();
		Qid = qid;
		question = ques;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [Qid=" + Qid + ", Question=" + question + ", answers=" + answers + "]";
	}
	
	
	
	
	
}
