package eu.ensup.medecin.domaine;

public class Patient extends Personne{

	private Medecin medecin;
	private String symptome;
	

	public Patient(String nom, String prenom, int age, Medecin medecin, String symptome) {
		super(nom, prenom, age);
		this.medecin = medecin;
		this.symptome = symptome;
	}
	
	

	public Patient(String nom, String prenom, int age, String symptome) {
		super(nom, prenom, age);
		this.symptome = symptome;
	}



	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public String getSymptome() {
		return symptome;
	}

	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}
	
	@Override
	public String toString() {
		return "Patient [medecin=" + medecin + ", symptome=" + symptome + "]";
	}
	
	
}
