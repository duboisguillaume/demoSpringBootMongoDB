package fr.formation.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.cinema.models.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String> {

}
