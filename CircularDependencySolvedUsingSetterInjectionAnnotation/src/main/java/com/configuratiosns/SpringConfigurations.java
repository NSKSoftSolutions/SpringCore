package com.configuratiosns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nsksoft.beans.Actor;
import com.nsksoft.beans.Movie;

@Configuration
public class SpringConfigurations {

	@Bean
	public Actor addActor() {
		Actor actor = new Actor();
		return actor;

	}

	@Bean
	public Movie addMoovie() {
		Movie movie = new Movie();
		return movie;

	}

}
