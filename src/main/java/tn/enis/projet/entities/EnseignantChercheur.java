package tn.enis.projet.entities;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("etd") 
@Getter @Setter


public class Etudiant extends Membre{
	
	@NonNull
	private Date dateInscription;
	@NonNull
	private String sujet;
	@NonNull
	private String diplome;
	@ManyToOne
	private EnseignantChercheur encadrant;

	@Builder
	public Etudiant( String cin, String nom, String prenom, Date dateNaissance, String cv,
			String email, String password,byte[] photo, Date dateInscription, String sujet, String diplome,
			EnseignantChercheur encadrant) {
			super( cin, nom, prenom, dateNaissance, cv, email, password,photo);
			this.dateInscription = dateInscription;
			this.sujet = sujet;
			this.diplome = diplome;
			this.encadrant = encadrant;
			}
	

}