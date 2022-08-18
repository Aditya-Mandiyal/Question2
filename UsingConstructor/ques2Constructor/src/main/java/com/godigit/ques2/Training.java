package com.godigit.ques2;

public class Training {

	private Trainer t1;
	private String subject;
	private String duration;
	
	public void showTrainingDetails() {
		System.out.println("Training Details = \n"+"1. Subject ="+subject+"\n2. Duration = "+duration+"\n3. "+t1);
	}
	public Training(Trainer t1, String subject, String duration) {
		super();
		this.t1 = t1;
		this.subject = subject;
		this.duration = duration;
	}
	
	
	
	
	
	
	
	
}
