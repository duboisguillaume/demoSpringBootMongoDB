package fr.formation.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.cinema.models.Cinema;
import fr.formation.cinema.services.CinemaService;

@RestController
@RequestMapping("cinemas")
public class CinemaController {

	private CinemaService cinemaService;

	public CinemaController(CinemaService cinemaService) {
		this.cinemaService = cinemaService;
	}
	
	@GetMapping
	public List<Cinema> findAll(){
		return cinemaService.findAll();
	}

	@PostMapping
	public Cinema save(@RequestBody Cinema cinema) {
		return cinemaService.save(cinema);
	}
	
}
