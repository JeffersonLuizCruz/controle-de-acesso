package com.overlay.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subject;
	private String description;
	private LocalDate criationDate;
	
	@Enumerated(EnumType.STRING)
	private RequestState state;
	
	@OneToMany(mappedBy = "request")
	private List<RequestStage> stages;
	
	
	private User user;
	
	
	public Request() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getCriationDate() {
		return criationDate;
	}


	public void setCriationDate(LocalDate criationDate) {
		this.criationDate = criationDate;
	}


	public RequestState getState() {
		return state;
	}


	public void setState(RequestState state) {
		this.state = state;
	}


	public List<RequestStage> getStages() {
		return stages;
	}


	public void setStages(List<RequestStage> stages) {
		this.stages = stages;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
