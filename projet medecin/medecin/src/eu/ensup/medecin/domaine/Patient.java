package eu.ensup.medecin.domaine;

public class Patient {

	private String nom;
	private String prenom;
	private int age;
	private String medecin;
	
	public Patient() {
		super();
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

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", medecin=" + medecin + "]";
	}
	
	
}
