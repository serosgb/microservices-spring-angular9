package org.mylab.microservices.courses.services;

import org.mylab.microservices.commons.service.GenericServiceImpl;
import org.mylab.microservices.courses.model.entity.Course;
import org.mylab.microservices.courses.model.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends GenericServiceImpl<Course, CourseRepository> implements CourseService {


}
