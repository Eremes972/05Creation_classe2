package fr.cmfp.tp3.quelMedecin.bo;

public class MedecinGeneraliste { //declaration de la classe MedecinGeneraliste
	
	

	private String nom; //c'est un attribut d'instance("visibilité" "Type" "Nom de l’attribut") 
	private String prenom;
	private String numeroDeTelephone;
	private Adresse adresseDuMedecin; // association unidirectionnelle entre MedecinGeneraliste et Adresse
	private Creneau[] tbCreneau; // association avec creation tableau
	// private static int nbHotelsDispo = 12; c'est un attribut de classe defini par le mot clef "static"
	
	private static int tarifConsultation;
	
	// c'est un constructeur ("visibilité" "nom de la classe"( "type" "nom de l'a'attribut d'instance")) porte le meme nom que la classe
	public MedecinGeneraliste(String numeroDeTelephone, String prenom, String nom, Adresse adresseDuMedecin){ 
		this.nom = nom; // le mot clef "this." permet d’accéder aux éléments d’instance
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.adresseDuMedecin = adresseDuMedecin;
		this.tbCreneau = new Creneau[15]; //creation tabeau de 15
		
	}
	
	

	
	/*								Méthode d’instance 															Méthode de classe

	 * 	Mot clef							Ø    																static
		Appel depuis la classe 		this.nomMethodeInstance()
									Exemple : this.lancer() nomClasse.nomMethodeClasse
	
		Appel hors de la classe		nomInstance.nomMethodeInstance()											nomClasse.nomMethodeClasse() 
									Exemple : de1.lancer()														Exemple: De.verifNbFaces(6)
	
	*/
			///////////////////////////////////////////////
	
	public void afficher() {
		System.out.println( nom +" "+ prenom +" "+ numeroDeTelephone +" "+ tarifConsultation +" "+ adresseDuMedecin +" ");
	}

	

	public String getNom() { //"getter" permet la lecture
		return nom;
	}

	public void setNom(String nom) {  //"setter permet l'acces à l'ecriture
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


	public static int getTarifConsultation() {
		return tarifConsultation;
	}


	public static void setTarifConsultation(int tarifConsultation) {
		MedecinGeneraliste.tarifConsultation = tarifConsultation;
	}


	public Adresse getAdresseDuMedecin() {
		return adresseDuMedecin;
	}


	public void setAdresseDuMedecin(Adresse adresseDuMedecin) {
		this.adresseDuMedecin = adresseDuMedecin;
	}



	public Creneau[] getTbCreneau() {
		return tbCreneau;
	}



	public void setTbCreneau(Creneau[] tbCreneau) {
		this.tbCreneau = tbCreneau;
	}
}
