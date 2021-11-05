package com.overlay.model;

import java.util.Date;
import java.util.List;

public class Request {
	
	private Long id;
	private String subject;
	private String description;
	private Date criationDate;
	
	private RequestState state;
	
	private List<RequestStage> stages;
	
	private User user;
	

}
