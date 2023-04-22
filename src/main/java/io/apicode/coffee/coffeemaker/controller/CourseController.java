package io.apicode.coffee.coffeemaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.apicode.coffee.coffeemaker.model.Course;
import io.apicode.coffee.coffeemaker.service.CourseService;

@RestController
public class CourseController extends ExceptionHandlerController {

	@Autowired
	CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.retrieveAllCourses();
	}

	@PostMapping("/course")
	@ResponseStatus(HttpStatus.CREATED)
	public String createCourse(@RequestBody Course course) {
		courseService.createCourse(course);

		return "Course created";
	}

	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable String id) {

		Course course = courseService.getCourse(id);

		return course;
	}
	
	@DeleteMapping("/course/{id}")
	public Course deleteCourse(@PathVariable String id) {

		Course course = courseService.deleteCourse(id);

		return course;
	}

}
