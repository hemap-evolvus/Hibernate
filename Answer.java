package com.hibernate1.Hibernate1t1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fpd_answer")
public class Answer implements Serializable {

	@Id
	@Column(name = "answer_Id")
	private int answerId;

	@Column(name = "answer_txt")
	private String answertxt;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswertxt() {
		return answertxt;
	}

	public void setAnswertxt(String answertxt) {
		this.answertxt = answertxt;
	}
}
