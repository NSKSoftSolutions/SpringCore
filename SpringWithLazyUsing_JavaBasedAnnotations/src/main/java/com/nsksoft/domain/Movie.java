package com.nsksoft.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = true)
public class Movie {

	@Value(value = "Maharshi")
	private String moveName;

	@Value(value = "5.0")
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
