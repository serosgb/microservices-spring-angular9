package org.mylab.microservices.commons.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class GenericServiceImpl<E, R extends CrudRepository<E, Long>> implements GenericService<E> {

	@Autowired
	protected R repository;

	@Override
	public Iterable<E> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<E> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		return repository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
