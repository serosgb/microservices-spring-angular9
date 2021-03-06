package org.mylab.microservices.app.usuarios.models.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.mylab.microservices.commons.model.entity.Audit;

import lombok.Data;

@Entity
@Table(name="students")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "student_name")
	private String name;
	
	private String lastname;
	
	@Column(unique=true)
	private String email;
	
    @Embedded
    private Audit audit = new Audit();	
	
}
