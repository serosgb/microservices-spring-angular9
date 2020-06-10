package org.mylab.microservices.courses.model.repository;

import org.mylab.microservices.courses.model.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
