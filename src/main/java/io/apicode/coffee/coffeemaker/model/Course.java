package io.apicode.coffee.coffeemaker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Course {

	@Id
	private String id;
	private String name;
	
	private Integer courseLengthInMonth;

	public Course() {
		super();
	}

	public Course(String id, String name, Integer courseLengthInMonth) {
		super();
		this.id = id;
		this.name = name;
		this.courseLengthInMonth = courseLengthInMonth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourseLengthInMonth() {
		return courseLengthInMonth;
	}

	public void setCourseLengthInMonth(Integer courseLengthInMonth) {
		this.courseLengthInMonth = courseLengthInMonth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", courseLengthInMonth=");
		builder.append(courseLengthInMonth);
		builder.append("]");
		return builder.toString();
	}

}
