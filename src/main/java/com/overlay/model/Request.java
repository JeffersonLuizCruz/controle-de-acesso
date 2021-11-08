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
	

}
