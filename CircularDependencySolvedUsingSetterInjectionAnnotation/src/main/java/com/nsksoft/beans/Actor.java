package com.nsksoft.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {

	@Autowired
	Movie movieDetails;

	public Actor() {
		System.out.println("Actor Object is Created");
	}

	public Movie getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(Movie movieDetails) {
		this.movieDetails = movieDetails;
	}

	public void actorDetailss() {
		System.out.println("My Favorite actor is Mahesh babu");
	}

}
