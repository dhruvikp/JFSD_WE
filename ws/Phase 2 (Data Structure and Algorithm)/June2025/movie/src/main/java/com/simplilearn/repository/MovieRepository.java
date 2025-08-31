package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	public Movie findByTitle(String title);
	
//	@Query(" select * from Movie m left join Director don ")
//	public Movie findTestQuery(String title);
	
}
