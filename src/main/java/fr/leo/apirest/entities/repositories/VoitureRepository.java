package fr.leo.apirest.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.leo.apirest.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

	
}
