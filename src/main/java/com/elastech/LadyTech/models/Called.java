package com.elastech.LadyTech.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "chamado")
public class Called {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCalled;

	@Column
	private String title;

	@Column(name = "register_called", nullable = false, updatable = false)
	private LocalDateTime registerDate;

	@Column
	private String priority;

	@Column
	private String description;

	@Column
	private String status;

	@Column
	private String departament;

	@Column(name = "name_technical")
	private String technicalName;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne
	@JoinColumn(name = "id_technical")
	private Technical technical;

	public Called() {
		this.registerDate = LocalDateTime.now();
	}

	public long getIdCalled() {
		return idCalled;
	}

	public void setIdCalled(long idCalled) {
		this.idCalled = idCalled;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = LocalDateTime.now();
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getTechnicalName() {
		return technicalName;
	}

	public void setTechnicalName(String technicalName) {
		this.technicalName = technicalName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Technical getTechnical() {
		return technical;
	}

	public void setTechnical(Technical technical) {
		this.technical = technical;
	}

}
