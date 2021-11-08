package com.overlay.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class UserOwner implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	private String password;

	private Role role;
	private List<Request> requests = new ArrayList<>();
	private List<RequestStage> requestStages = new ArrayList<>();
	
	
	
	public UserOwner() {}

	public UserOwner(Long id, String name, String email, String password, Role role, List<Request> requests,
			List<RequestStage> requestStages) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.requests = requests;
		this.requestStages = requestStages;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Request> getRequests() {
		return requests;
	}
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	public List<RequestStage> getRequestStages() {
		return requestStages;
	}
	public void setRequestStages(List<RequestStage> requestStages) {
		this.requestStages = requestStages;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", requests=" + requests + ", requestStages=" + requestStages + "]";
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
		UserOwner other = (UserOwner) obj;
		return Objects.equals(id, other.id);
	}
	
}