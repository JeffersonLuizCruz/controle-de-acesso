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
}
