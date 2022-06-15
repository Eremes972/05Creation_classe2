package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {

	private MedecinGeneraliste creneauMedecin; // attribut d'instance
	private LocalTime heureDebut;
	private int minutes;
	
	//contructeur "visibilité""nom du constructeur egale a celui de la classe
	public Creneau( LocalTime heureDebut, int minutes, MedecinGeneraliste creneauMedecin)  /* paramètre du constructeur( "     ") */ {
		this.creneauMedecin = creneauMedecin;
		this.heureDebut = heureDebut;
		this.minutes = minutes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////

	public String toString() {
		return "Creneau [creneauMedecin=" + creneauMedecin + ", heureDebut=" + heureDebut + ", Minutes=" + minutes
				+ "]";
	}

	public MedecinGeneraliste getCreneauMedecin() {
		return creneauMedecin;
	}

	public void setCreneauMedecin(MedecinGeneraliste creneauMedecin) {
		this.creneauMedecin = creneauMedecin;
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	
	
}
