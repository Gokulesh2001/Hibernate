package com.gokulesh.DemoHb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> students = new ArrayList<Student>();
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int i) {
		this.lid = i;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
