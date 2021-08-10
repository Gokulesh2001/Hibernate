package com.gokulesh.DemoHb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_table")
public class Person 
{
	   @Id
	   private int id;
	   @Column(name="person_name")
	   private String name;
	   private String gender;
	   
	   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
		}
		
	   
}
