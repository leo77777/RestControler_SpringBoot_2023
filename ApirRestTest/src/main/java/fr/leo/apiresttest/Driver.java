package fr.leo.apiresttest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

public class Driver {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Voiture[] v1 = restTemplate.getForObject("http://localhost:8085/voitures", Voiture[].class);
		List<Voiture> voitures = Arrays.asList(v1);
		voitures.forEach(v->System.out.println(v));		
		
		try {
			restTemplate.delete("http://localhost:8085/voitures/4");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
		Voiture v3 = restTemplate.getForObject("http://localhost:8085/voiture?id=3", Voiture.class);
		System.out.println(v3);
		
		Voiture v4 = new Voiture();
		v4.setNom("R11");
		v4.setPuissance(7);
		v4 = restTemplate.postForObject("http://localhost:8085/voiture/add", v4, Voiture.class);
		
		v4.setNom("R12");
		restTemplate.put("http://localhost:8085/voiture/5/save", v4);
		System.out.println("Voiture modifiée : " + v4);
	}
}
