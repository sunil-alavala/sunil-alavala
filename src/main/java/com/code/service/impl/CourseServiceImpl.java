package com.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.entity.Course;
import com.code.repository.CourseRepository;
import com.code.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public boolean create(Course course) {
		courseRepository.save(course);
		return true;
	}

	@Override
	public Course getById(int courseId) {
		return courseRepository.findById(courseId).orElse(null);
	}

	@Override
	public List<Course> getAll() {
		return courseRepository.findAll();
	}

	@Override
	public boolean update(Course course) {
		courseRepository.save(course);
		return true;
	}

	@Override
	public boolean delete(int courseId) {
		courseRepository.deleteById(courseId);
		return true;
	}

}
