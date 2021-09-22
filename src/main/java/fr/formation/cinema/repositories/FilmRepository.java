package fr.formation.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.cinema.models.Film;

public interface FilmRepository extends MongoRepository<Film, String>{

}
