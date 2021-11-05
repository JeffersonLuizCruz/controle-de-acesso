package com.overlay.model;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Nullable
	private Long id;

	@NotNull
	@NonNull
	private String name;
	private String email;

	@NotNull
	@NonNull
	private String password;

	private Role role;

	@NotNull
	@NonNull
	@JsonIgnore
	private List<RequestStage> requestStages;

	public Long getId() {
		return id;
	}

	public void setId(@Nullable Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(@NonNull String name) {
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

	public void setPassword(@NotNull @NonNull String password) {
		this.password = password;
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

	public void setRequestStages(@NotNull @NonNull List<RequestStage> requestStages) {
		this.requestStages = requestStages;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", requestStages=" + requestStages + "]";
	}

}
