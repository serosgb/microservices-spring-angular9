package org.mylab.microservices.commons.controllers;

import java.util.Optional;

import org.mylab.microservices.commons.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class GenericController<E, S extends GenericService<E>> {

	@Autowired
	protected S service;

	@GetMapping
	public ResponseEntity<?> getStudents() {
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getStudent(@PathVariable Long id) {
		Optional<E> optional = service.findById(id);

		if (optional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok().body(optional.get());
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody E entity) {
		E entityPersisted = service.save(entity);

		return ResponseEntity.status(HttpStatus.CREATED).body(entityPersisted);
	}

	@DeleteMapping("/{id")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
