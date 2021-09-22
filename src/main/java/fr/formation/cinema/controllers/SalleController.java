package fr.formation.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.cinema.models.Salle;
import fr.formation.cinema.services.SalleService;

@RestController
@RequestMapping("salles")
public class SalleController {

	private SalleService salleService;

	public SalleController(SalleService salleService) {
		this.salleService = salleService;
	}
	
	@GetMapping
	public List<Salle> findAll(){
		return salleService.findAll();
	}
	
	@PostMapping
	public Salle save(@RequestBody Salle salle) {
		return salleService.save(salle);
	}
	
	@PatchMapping
	public Salle patch(@RequestBody Salle salle) {
		return salleService.patch(salle);
	}
	
}
