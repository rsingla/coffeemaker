package io.apicode.coffee.coffeemaker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.apicode.coffee.coffeemaker.model.Course;
import io.apicode.coffee.coffeemaker.repository.CourseRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> retrieveAllCourses() {

		return createCourseList();

	}

	private List<Course> createCourseList() {

		List<Course> courseList = courseRepository.findAll();

		return courseList;

	}

	public void createCourse(Course course) {

		courseRepository.save(course);
	}

	public Course getCourse(String id) throws EntityNotFoundException {
		Course course = courseRepository.getReferenceById(id);
		
		System.out.println(course);

		return course;
	}
	
	public Course deleteCourse(String id) throws EntityNotFoundException {
		Course course = courseRepository.getReferenceById(id);
		
		courseRepository.delete(course);
		
		System.out.println(course);

		return course;
	}

}
