package org.mylab.microservices.courses.model.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.mylab.microservices.commons.model.entity.Audit;

import lombok.Data;

@Entity
@Table(name = "courses")
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Embedded
	private Audit audit = new Audit();
}
