package com.overlay.model;

import java.time.LocalDate;
import java.util.List;

public class Request {
	
	private Long id;
	private String subject;
	private String description;
	private LocalDate criationDate;
	
	private RequestState state;
	
	private List<RequestStage> stages;
	
	private User user;
	

}
