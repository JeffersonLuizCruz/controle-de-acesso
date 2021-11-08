package com.overlay.model;

import java.io.Serializable;
import java.time.LocalDate;

public class RequestStage implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDate realizationDate;
	private String description;
	
	private User user;
	private RequestState state;
	private Request request;	

}
