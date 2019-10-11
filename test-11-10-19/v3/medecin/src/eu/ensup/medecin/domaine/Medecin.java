package eu.ensup.medecin.domaine;

public class Medecin extends Personne{
	
	private Patient patient;
	private String specialite;
	public Medecin(String nom, String prenom, int age, Patient patient, String specialite) {
		super(nom, prenom, age);
		this.patient = patient;
		this.specialite = specialite;
	}
	
	
	public Medecin(String nom, String prenom, int age, String specialite) {
		super(nom, prenom, age);
		this.specialite = specialite;
	}


	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return "Medecin [patient=" + patient + ", specialite=" + specialite + "]";
	}
	
	
}
