package com.nsksoft.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

	@Autowired
	Actor actorDetails;

	public Movie() {
		System.out.println("movie Objet is Crreated");
	}

	public Actor getActorDetails() {
		return actorDetails;
	}

	public void setActorDetails(Actor actorDetails) {
		this.actorDetails = actorDetails;
	}

}
