package fr.cmfp.tp3.quelMedecin.test;

import fr.cmfp.tp3.quelMedecin.bo.Adresse;
import fr.cmfp.tp3.quelMedecin.bo.MedecinGeneraliste;


public class TestMedecin {

	public static void main(String[] args) {
		System.out.println("__________________________ Médecins ______________________________");
		Adresse uneAdresse = new Adresse(12, "des pattates", 63500, "Riom");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", uneAdresse);
		MedecinGeneraliste edmond = new MedecinGeneraliste("Bosapin", "Edmond", "+33 2 17 18 19 20", uneAdresse);
		MedecinGeneraliste djemila = new MedecinGeneraliste("Table", "Djémila", "03-04-05-06-07", uneAdresse);

		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();
		System.out.println();
		System.out.println("--------------- Changement du numéro de ce médecin ---------------");
		System.out.println();
		djemila.setNumeroDeTelephone("07-06-05-04-03");
		System.out.printf("Nouveau numéro du Dr %s : %s%n", djemila.getNom(), djemila.getNumeroDeTelephone());
		System.out.println();
		System.out.println("-------------- Changement du prix de la consultation -------------");
		MedecinGeneraliste.setTarifConsultation(23);
		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();
	}
}