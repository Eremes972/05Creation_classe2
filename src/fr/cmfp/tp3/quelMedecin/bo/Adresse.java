package fr.cmfp.tp3.quelMedecin.bo;

public class Adresse {
	
	private int numeroVoie;
	private String rue;
	private int codePostal;
	private String ville;
	private String complement;
	
	
	
	public Adresse(int numeroVoie, String rue, int codePostal, String ville) {
		this.numeroVoie = numeroVoie;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse(String string, int numeroVoie, String complement, String rue, int codePostal, String ville) {
		this.numeroVoie = numeroVoie;
		this.complement = complement;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	

	
	
	////////////////////////////////
	
	@Override
	public String toString() {
		return "Adresse: "+ numeroVoie +" rue " + rue + ", codePostal: "+ codePostal + ", ville: " + ville;
	}


	public int getNumeroVoie() {
		return numeroVoie;
	}
	public void setNumeroVoie(int numeroVoie) {
		this.numeroVoie = numeroVoie;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}


	
	
}
