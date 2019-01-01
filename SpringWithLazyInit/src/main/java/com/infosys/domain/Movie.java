package com.infosys.domain;

public class Movie {

	private String moveName;

	private double rating;

	public Movie() {
		System.out.println("Movie Object is Created ");
	}

	public String getMoveName() {
		return moveName;
	}

	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
