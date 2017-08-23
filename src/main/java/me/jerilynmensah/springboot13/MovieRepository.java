package me.jerilynmensah.springboot13;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie , Long> {
}
