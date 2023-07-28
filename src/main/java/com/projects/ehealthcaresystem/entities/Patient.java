package com.projects.ehealthcaresystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	private int id;
	
	private String name;
	private int age;
	private String ailment;
	private String recoveryStatus;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAilment() {
		return ailment;
	}
	public void setAilment(String ailment) {
		this.ailment = ailment;
	}
	public String getRecoveryStatus() {
		return recoveryStatus;
	}
	public void setRecoveryStatus(String recoveryStatus) {
		this.recoveryStatus = recoveryStatus;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", ailment=" + ailment + ", recoveryStatus="
				+ recoveryStatus + "]";
	}
	
}
