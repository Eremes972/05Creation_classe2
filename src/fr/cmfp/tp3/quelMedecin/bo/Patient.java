package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalDate;

public class Patient {

		private String nom;
		private String prenom;
		private String numeroDeTelephone;
		private char sexe;
		private Long numeroDeSecuriteSociale;
		private LocalDate dateDeNaissance;
		private String commentaires;
		private Adresse adresseDuPatient;
		
		public Patient(String nom, String prenom, String string, char c, Long numeroDeSecuriteSociale, LocalDate localDate, String commentaires, Adresse adresseDuPatient) {
			this.nom = nom;
			this.prenom = prenom;
			this.numeroDeTelephone = string;
			this.sexe = c;
			this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
			this.dateDeNaissance = localDate;
			this.commentaires = commentaires;
			this.setAdresseDuPatient(adresseDuPatient);
		}

		
		
		 //////////////////////////////////
		
		public void Afficher() {
			System.out.println(nom+" "+prenom+" "+numeroDeTelephone+" "+sexe+" "+numeroDeSecuriteSociale+" "+dateDeNaissance+" "+commentaires);
		}



		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public String getPrenom() {
			return prenom;
		}



		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}



		public String getNumeroDeTelephone() {
			return numeroDeTelephone;
		}



		public void setNumeroDeTelephone(String numeroDeTelephone) {
			this.numeroDeTelephone = numeroDeTelephone;
		}



		public char getSexe() {
			return sexe;
		}



		public void setSexe(char sexe) {
			this.sexe = sexe;
		}



		public Long getNumeroDeSecuriteSociale() {
			return numeroDeSecuriteSociale;
		}



		public void setNumeroDeSecuriteSociale(Long numeroDeSecuriteSociale) {
			this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		}



		public LocalDate getDateDeNaissance() {
			return dateDeNaissance;
		}



		public void setDateDeNaissance(LocalDate dateDeNaissance) {
			this.dateDeNaissance = dateDeNaissance;
		}



		public String getCommentaires() {
			return commentaires;
		}



		public void setCommentaires(String commentaires) {
			this.commentaires = commentaires;
		}



		public Adresse getAdresseDuPatient() {
			return adresseDuPatient;
		}



		public void setAdresseDuPatient(Adresse adresseDuPatient) {
			this.adresseDuPatient = adresseDuPatient;
		}



}
