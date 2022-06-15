package fr.cmfp.tp3.quelMedecin.test;

import fr.cmfp.tp3.quelMedecin.bo.Adresse;

public class TestAdresse {
	public static void main(String[] args) {
		System.out.println("__________________________ Adresses ______________________________");
		Adresse sh  = new Adresse(null, 221, "B", "baker street", 00000, "Londres");

		sh.toString();
		System.out.println("------------------------------------------------------------------");
	}

}