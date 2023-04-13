package fr.leo.apirest.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.leo.apirest.entities.Voiture;
import fr.leo.apirest.entities.repositories.VoitureRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@RestController
@AllArgsConstructor
@Log4j2
public class VoitureRestControler {	
	
	VoitureRepository voitureRepository;

	@GetMapping("/voitures")
	public List<Voiture> list(){
		log.info("***********************");
		return voitureRepository.findAll();
	}	
	
	@GetMapping("/voiture")
	public Voiture getById( @RequestParam(name="id", defaultValue = "1") Long id){
		log.info("TROUVER TROUVER TROUVER TROUVER TROUVER ");
		return voitureRepository.findById(id).get();
	}	
	
	@DeleteMapping("/voitures/{id}") 
	public void delete( @PathVariable Long id){
		System.out.println("identifiant :" + id);
		log.info("voici identifiant:" + id);	
		voitureRepository.deleteById(id); 
	}	
	
	@PostMapping("/voiture/add")
	public Voiture add(@RequestBody Voiture voiture) {
		log.info("NOUVEAU NOUVEAU NOUVEAU NOUVEAU NOUVEAU");
		return voitureRepository.save(voiture);
	}	
	
	@PutMapping("/voiture/{id}/save") 
	public Voiture updateCustomer(@PathVariable Long id,
								@RequestBody Voiture voiture){
		log.info("UPDATE UPDATE UPDATE UPDATE UPDATE");
		return voitureRepository.save(voiture);			
	}
}
