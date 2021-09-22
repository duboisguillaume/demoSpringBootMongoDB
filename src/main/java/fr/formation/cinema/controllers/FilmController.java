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

import fr.formation.cinema.models.Film;
import fr.formation.cinema.services.FilmService;

@RestController
@RequestMapping("films")
public class FilmController {

	private FilmService filmService;

	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}
	
	@GetMapping
	public List<Film> findAll(){
		return filmService.findAll();
	}
	
	@PostMapping
	public Film save(@RequestBody Film film) {
		return filmService.save(film);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable String id) {
		filmService.deleteById(id);
	}
	
	@PutMapping
	public Film putFilm(@RequestBody Film film) {
		return filmService.save(film);
	}
	
	@PatchMapping
	public Film patchFilm(@RequestBody Film film) {
		return filmService.patch(film);
	}
	
	
	
}
