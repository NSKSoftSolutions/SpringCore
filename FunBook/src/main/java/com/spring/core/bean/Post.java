package com.spring.core.bean;

import org.springframework.beans.factory.annotation.Value;

public class Post {

	@Value("video")
	private String post_type;
	@Value("sadakhat")
	private String posted_by;
	@Value("dubai")
	private String posted_from;

	
	public String getPost_type() {
		return post_type;
	}


	public void setPost_type(String post_type) {
		this.post_type = post_type;
	}


	public String getPosted_by() {
		return posted_by;
	}


	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}


	public String getPosted_from() {
		return posted_from;
	}


	public void setPosted_from(String posted_from) {
		this.posted_from = posted_from;
	}


	public void postDetails() {

		System.out.println(post_type);
		System.out.println(posted_by);
		System.out.println(posted_from);

	}

}
