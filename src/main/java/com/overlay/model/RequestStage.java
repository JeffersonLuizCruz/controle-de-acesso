package com.overlay.model;

import java.time.LocalDate;

public class RequestStage {

	private Long id;
	private LocalDate realizationDate;
	private String description;
	
	private RequestState state;
	
	private Request request;
	
	private User user;
}
