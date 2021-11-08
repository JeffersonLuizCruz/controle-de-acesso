package com.overlay.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



@Entity
public class User{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String userName;
	
	@Email
	private String email;
	
	@NotNull
	private String passWord;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy = "user")
	private List<RequestStage> requestStages;
	
	@OneToMany(mappedBy = "user")
	private List<Request> resquests;
	
	
	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id) {
		this.id = id;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword( String password) {
		this.passWord = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<RequestStage> getRequestStages() {
		return requestStages;
	}

	public void setRequestStages( List<RequestStage> requestStages) {
		this.requestStages = requestStages;
	}


}
