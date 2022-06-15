package fr.cmfp.tp3.quelMedecin.test;

import java.time.LocalTime;

import fr.cmfp.tp3.quelMedecin.bo.Adresse;
import fr.cmfp.tp3.quelMedecin.bo.Creneau;
import fr.cmfp.tp3.quelMedecin.bo.MedecinGeneraliste;

public class TestCreneau {
	public static void main(String[] args) {
		Adresse sh = new Adresse("ZAC du CMFP", 221, "B", "Baker Street", 29200,
				"Brest");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "M�lanie", "02.28.03.17.28", sh);
		Creneau c1 = new Creneau(LocalTime.of(9, 0), 15, melanie);
		new Creneau(LocalTime.of(9, 15), 15, melanie);
		new Creneau(LocalTime.of(9, 30), 15, melanie);
		new Creneau(LocalTime.of(9, 45), 15, melanie);
		new Creneau(LocalTime.of(10, 30), 15, melanie);
		new Creneau(LocalTime.of(10, 45), 15, melanie);
		new Creneau(LocalTime.of(11, 15), 15, melanie);
		new Creneau(LocalTime.of(11, 30), 15, melanie);
		new Creneau(LocalTime.of(11, 45), 15, melanie);
		new Creneau(LocalTime.of(14, 0), 30, melanie);
		new Creneau(LocalTime.of(14, 30), 30, melanie);
		new Creneau(LocalTime.of(15, 0), 30, melanie);
		new Creneau(LocalTime.of(15, 30), 30, melanie);
		new Creneau(LocalTime.of(16, 0), 30, melanie);
		new Creneau(LocalTime.of(16, 30), 30, melanie);
		System.out.println("__________________________ Cr�neaux ______________________________");
		c1.toString();
		System.out.println("M�decin associ� � ce cr�neau : Dr " + c1.getCreneauMedecin().getNom());
		System.out.println("------------------------------------------------------------------");
		melanie.afficher();
	}
}