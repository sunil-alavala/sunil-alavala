package com.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.entity.Course;
import com.code.service.CourseService;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	private boolean create(@RequestBody Course course) {
		return courseService.create(course);
	}
	
	@GetMapping
	private List<Course> getAll() {
		return courseService.getAll();
	}
	
	@GetMapping("/id")
	private Course getById(@RequestParam(value = "id", defaultValue = "1") int courseId) {
		return courseService.getById(courseId);
	}
	
	@PutMapping
	public boolean update(@RequestBody Course course) {
		return courseService.update(course);
	}
	
	@DeleteMapping
	public boolean delete(@RequestParam int id) {
		return courseService.delete(id);
	}
}
