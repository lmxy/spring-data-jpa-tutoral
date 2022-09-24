package com.yoilife.springdatajpatutoral.entity;

import com.yoilife.springdatajpatutoral.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseTest {

	@Autowired
	private CourseRepository courseRepository;

	@Test
	public void printCourse() {
		List<Course> courses =
				courseRepository.findAll();

		System.out.println("courses = " + courses);
	}
}