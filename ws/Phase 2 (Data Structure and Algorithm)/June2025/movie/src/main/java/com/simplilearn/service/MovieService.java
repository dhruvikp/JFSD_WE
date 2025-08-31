package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Director;
import com.simplilearn.entity.Movie;
import com.simplilearn.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public Movie saveMovie(Movie movie) {

		for (Director director : movie.getDirectors()) {
			director.setMovie(movie);
		}

		return movieRepository.save(movie);
	}

	public Movie getMovie(Long id) {
		return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("movie not found"));
	}

	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}
	
	public void deleteById(Long id) {
		movieRepository.deleteById(id);
	}
	
	
}
