package fr.cmfp.tp3.quelMedecin.test;

import java.time.LocalDate;

import fr.cmfp.tp3.quelMedecin.bo.Adresse;
import fr.cmfp.tp3.quelMedecin.bo.MedecinGeneraliste;
import fr.cmfp.tp3.quelMedecin.bo.Patient;

public class TestAssoAdresse {

	public static void main(String[] args) {
		Adresse nio = new Adresse(null, 19, null, "avenue de monq", 79000, "Niort");
		Adresse sh = new Adresse("ZAC du CMFP", 221, "B", "Baker Street", 44200, "Nantes");
		Adresse comp = new Adresse(null, 4, null, "Rue des Glatiniers", 2100, "Saint-Quentin");
		System.out.println("__________________________ M�decins ______________________________");
		MedecinGeneraliste edmond = new MedecinGeneraliste("Bosapin", "Edmond", "+33 2 17 18 19 20", nio);
		MedecinGeneraliste djemila = new MedecinGeneraliste("Table", "Dj�mila", "03-04-05-06-07", sh);

		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "M�lanie", "02.28.03.17.28", sh);
		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();

		System.out.println("__________________________________________________________________");
		System.out.println("__________________________ Patient _______________________________");
		Patient hillary = new Patient("Vambuce", "Hillary", "0123456789", 'F', 287060244010154l,
				LocalDate.of(1987, 6, 2), "Allergie aux arachides", comp);
		Patient ines = new Patient("Perret", "In�s", "0698745123", 'F', 245021067034521l, LocalDate.of(1945, 2, 10),
				null, nio);
		Patient adhemar = new Patient("Pamamobe", "Adh�mar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, comp);

		hillary.Afficher();
		System.out.println("------------------------------------------------------------------");
		ines.Afficher();
		System.out.println("------------------------------------------------------------------");
		adhemar.Afficher();
	}
}