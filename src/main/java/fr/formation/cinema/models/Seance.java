package fr.formation.cinema.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Seance {
	
	@Id
	private String id;
	
	private String date;
	
	@DBRef
    @Field("film")
	private Film film;
	
	@DBRef
    @Field("salle")
	private Salle salle;
}
