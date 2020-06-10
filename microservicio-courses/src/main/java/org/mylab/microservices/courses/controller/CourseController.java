package org.mylab.microservices.courses.controller;

import java.util.Optional;

import org.mylab.microservices.commons.controllers.GenericController;
import org.mylab.microservices.courses.model.entity.Course;
import org.mylab.microservices.courses.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController extends GenericController<Course, CourseService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Course course) {
		Optional<Course> optional = service.findById(id);

		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Course coursePersisted = optional.get();

		coursePersisted.setName(course.getName());


		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(coursePersisted));
	}
}
