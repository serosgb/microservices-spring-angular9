package org.mylab.microservices.app.usuarios.controllers;

import java.util.Optional;

import org.mylab.microservices.app.usuarios.models.entity.Student;
import org.mylab.microservices.app.usuarios.service.StudentService;
import org.mylab.microservices.commons.controllers.GenericController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController extends GenericController<Student, StudentService> {

	@PutMapping(value = "/{id", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Student student) {
		Optional<Student> optional = service.findById(id);

		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		Student studentPersisted = optional.get();

		studentPersisted.setName(student.getName());
		studentPersisted.setLastname(student.getLastname());
		studentPersisted.setEmail(student.getEmail());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(studentPersisted));
	}
}
