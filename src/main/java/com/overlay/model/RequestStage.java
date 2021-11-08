package com.overlay.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class RequestStage implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDate realizationDate;
	private String description;
	
	private UserOwner user;
	private RequestState state;
	private Request request;
	
	
	
	public RequestStage() {}

	public RequestStage(Long id, LocalDate realizationDate, String description, UserOwner user, RequestState state,
			Request request) {
		this.id = id;
		this.realizationDate = realizationDate;
		this.description = description;
		this.user = user;
		this.state = state;
		this.request = request;
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

	public UserOwner getUser() {
		return user;
	}

	public void setUser(UserOwner user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "RequestStage [id=" + id + ", realizationDate=" + realizationDate + ", description=" + description
				+ ", user=" + user + ", state=" + state + ", request=" + request + "]";
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
		RequestStage other = (RequestStage) obj;
		return Objects.equals(id, other.id);
	}

}
