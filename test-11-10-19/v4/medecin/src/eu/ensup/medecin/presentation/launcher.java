package eu.ensup.medecin.presentation;

import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;
import eu.ensup.medecin.service.MedecinService;

public class launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedecinService medecinservice = new MedecinService();
		int id = 1;
		Patient patient = new Patient("pierre", " paul", 20, "mal a la tete");
		Medecin medecin = new Medecin("docteur", "house", 47, patient, "tete");

		/*medecinservice.consulterPatient(patient, medecin);
		medecinservice.payerMedecin(patient, medecin);*/
		boolean retour = medecinservice.creationMedecin(medecin);
		medecinservice.rechercheMedecin(id);

	}

}
