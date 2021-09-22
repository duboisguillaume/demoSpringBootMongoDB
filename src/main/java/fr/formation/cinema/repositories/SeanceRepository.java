package fr.formation.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.cinema.models.Seance;

public interface SeanceRepository extends MongoRepository<Seance, String>{

}
