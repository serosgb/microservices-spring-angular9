package org.mylab.microservices.app.usuarios.service;

import org.mylab.microservices.app.usuarios.models.entity.Student;
import org.mylab.microservices.app.usuarios.models.repository.StudentRepository;
import org.mylab.microservices.commons.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class StudentServiceImpl extends GenericServiceImpl<Student, StudentRepository>
		implements StudentService {


}
