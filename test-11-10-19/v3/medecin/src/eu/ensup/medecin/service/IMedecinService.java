package eu.ensup.medecin.service;

import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;

public interface IMedecinService {

	public void payerMedecin(Patient patient, Medecin medecin);
	public void consulterPatient(Patient patient, Medecin medecin);
	public boolean creationMedecin(Medecin medecin);
}
