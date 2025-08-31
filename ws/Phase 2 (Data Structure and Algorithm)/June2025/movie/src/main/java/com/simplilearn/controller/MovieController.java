package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Movie;
import com.simplilearn.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@GetMapping("/{id}")
	public Movie getMovie(@PathVariable Long id) {
		return movieService.getMovie(id);
	}

	@PostMapping
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}

	@DeleteMapping("/{id}")
	public String deleteMovie(@PathVariable Long id) {
		movieService.deleteById(id);
		return "Movie deleted successfully!";
	}
}
