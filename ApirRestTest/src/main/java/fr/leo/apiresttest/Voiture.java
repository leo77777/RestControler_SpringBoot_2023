package fr.leo.apiresttest;


public class Voiture {	
	private Long id;
	private String nom;
	private int puissance;	
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", nom=" + nom + ", puissance=" + puissance + "]";
	}		
}
