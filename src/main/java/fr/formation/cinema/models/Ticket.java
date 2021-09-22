package fr.formation.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Ticket {

	@Id
	private String id;
	
	@DBRef
	@Field("seance")
	private Seance seance;
	
	@DBRef
	@Field("cinema")
	private Cinema cinema;
}
