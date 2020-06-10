package org.mylab.microservices.commons.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Embeddable
@Data
public class Audit {
	@Column(name = "created_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedOn;

	@Column(name = "updated_by")
	private String updatedBy;

	@PrePersist
	public void prePersist() {
		createdOn = new Date();
		createdBy = "system";
	}

	@PreUpdate
	public void preUpdate() {
		updatedOn = new Date();
		updatedBy = "admin";
	}
}
