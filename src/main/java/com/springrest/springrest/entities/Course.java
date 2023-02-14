package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
   private long id;
   private String title;
   private String descr;
   
public Course() {
	
}
public Course(long id, String title, String descr) {
	super();
	this.id = id;
	this.title = title;
	this.descr = descr;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescr() {
	return descr;
}
public void setDescr(String descr) {
	this.descr = descr;
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", descr=" + descr + "]";
}
}
