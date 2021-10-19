package com.gitsbp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "GitSpringdata")
@SequenceGenerator(name = "spgit_sequ_id", initialValue = 100)
public class GitSpringdata {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spgit_sequ_id")
	@Column(name = "gitspngid")
	long gitspngid;

	@Column(name = "prgname")
	String prgname;

	@Column(name = "prgmail")
	String prgmail;

	@Column(name = "prgsalary")
	double prgsalary;

	public GitSpringdata() {
		super();
	}

	public long getGitspngid() {
		return gitspngid;
	}

	public void setGitspngid(long gitspngid) {
		this.gitspngid = gitspngid;
	}

	public String getPrgname() {
		return prgname;
	}

	public void setPrgname(String prgname) {
		this.prgname = prgname;
	}

	public String getPrgmail() {
		return prgmail;
	}

	public void setPrgmail(String prgmail) {
		this.prgmail = prgmail;
	}

	public double getPrgsalary() {
		return prgsalary;
	}

	public void setPrgsalary(double prgsalary) {
		this.prgsalary = prgsalary;
	}
}
