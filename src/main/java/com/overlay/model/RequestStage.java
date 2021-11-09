package com.overlay.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.tomcat.jni.User;

@Entity
public class RequestStage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private LocalDate realizationDate;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private RequestState state;
	
	@ManyToOne
	private Request request;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	
	public RequestStage() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getRealizationDate() {
		return realizationDate;
	}

	public void setRealizationDate(LocalDate realizationDate) {
		this.realizationDate = realizationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RequestState getState() {
		return state;
	}

	public void setState(RequestState state) {
		this.state = state;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
