package com.overlay.model;

import java.util.Date;

public class RequestStage {

	private Long id;
	private Date realizationDate;
	private String description;
	
	private RequestState state;
	
	private Request request;
	
	private User user;
}
