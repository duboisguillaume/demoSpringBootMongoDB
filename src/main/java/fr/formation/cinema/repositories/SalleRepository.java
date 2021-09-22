package fr.formation.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.cinema.models.Salle;

public interface SalleRepository extends MongoRepository<Salle, String> {

}
