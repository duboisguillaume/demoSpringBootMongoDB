package fr.formation.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.cinema.models.Seance;
import fr.formation.cinema.services.SeanceService;

@RestController
@RequestMapping("seances")
public class SeanceController {

	private SeanceService seanceService;

	public SeanceController(SeanceService seanceService) {
		this.seanceService = seanceService;
	}
	
	@GetMapping
	public List<Seance> findAll(){
		return seanceService.findAll();
	}
	
	@PostMapping
	public Seance save(@RequestBody Seance seance) {
		return seanceService.save(seance);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable String id) {
		seanceService.deleteById(id);
	}
	
	@PutMapping
	public Seance putFilm(@RequestBody Seance seance) {
		return seanceService.save(seance);
	}
	
	@PatchMapping
	public Seance patchFilm(@RequestBody Seance seance) {
		return seanceService.patch(seance);
	}
}
