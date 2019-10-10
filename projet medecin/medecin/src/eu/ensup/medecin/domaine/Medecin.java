package eu.ensup.medecin.domaine;

public class Medecin {
	private String nom;
	private String prenom;
	private int age;
	private String patient;
	
	public Medecin() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Medecin [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", patient=" + patient + "]";
	}
	
}
