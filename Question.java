package com.hibernate1.Hibernate1t1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "fpd_question")
public class Question  implements  Serializable {
	
	@Id
	@Column(name="question_Id")
	private int questionId;
	
	@Column(name="question_txt")
	private String questionTxt;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTxt() {
		return questionTxt;
	}

	public void setQuestionTxt(String questionTxt) {
		this.questionTxt = questionTxt;
	}


	}
