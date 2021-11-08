package com.overlay.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Request implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String subject;
	private String description;
	private LocalDate criationDate;
	
	private RequestState state;
	private UserOwner user;
	private List<RequestStage> stages = new ArrayList<>();
	
	
	
	public Request() {}
	public Request(Long id, String subject, String description, LocalDate criationDate, RequestState state, UserOwner user,
			List<RequestStage> stages) {
		this.id = id;
		this.subject = subject;
		this.description = description;
		this.criationDate = criationDate;
		this.state = state;
		this.user = user;
		this.stages = stages;
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
	public UserOwner getUser() {
		return user;
	}
	public void setUser(UserOwner user) {
		this.user = user;
	}
	public List<RequestStage> getStages() {
		return stages;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", subject=" + subject + ", description=" + description + ", criationDate="
				+ criationDate + ", state=" + state + ", user=" + user + ", stages=" + stages + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(id, other.id);
	}	
	
	
}
