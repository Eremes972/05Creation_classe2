package fr.cmfp.tp3.quelMedecin.test;

import java.time.LocalDate;

import fr.cmfp.tp3.quelMedecin.bo.Patient;

public class TestPatient {

	public static void main(String[] args) {
		System.out.println("__________________________ Patient _______________________________");
		Patient hillary = new Patient("Vambuce", "Hillary", "0123456789", 'F', 287060244010154l,
				LocalDate.of(1987, 6, 2), "Allergie aux arachides", null);
		Patient ines = new Patient("Perret", "In�s", "0698745123", 'F', 245021067034521l, LocalDate.of(1945, 2, 10), null, null);
		Patient adhemar = new Patient("Pamamobe", "Adh�mar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, null);
		
		hillary.Afficher();
		System.out.println("------------------------------------------------------------------");
		ines.Afficher();
		System.out.println("------------------------------------------------------------------");
		adhemar.Afficher();
	}
}