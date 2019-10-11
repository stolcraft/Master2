package eu.ensup.medecin.service;

import java.util.ArrayList;
import java.util.Collection;

import eu.ensup.medecin.dao.IMedecinDao;
import eu.ensup.medecin.dao.MedecinDao;
import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;

public class MedecinService implements IMedecinService{

	IMedecinDao medecindao ;//= new MedecinDao();

	public MedecinService(IMedecinDao dao) {
		// TODO Auto-generated constructor stub
		medecindao = dao;
	}

	public MedecinService() {
		// TODO Auto-generated constructor stub
	}

	public void payerMedecin(Patient patient, Medecin medecin) {
		System.out.println(patient.getNom() + " paye le medecin : " + medecin.getNom());
	}

	public void consulterPatient(Patient patient, Medecin medecin) {
		System.out.println("le patient : " + patient.getNom() + "va consulter :  " + medecin.getNom());
	}

	public boolean creationMedecin(Medecin medecin) {
		boolean retour;
		retour = medecindao.creationMedecin(medecin);
		if (retour == true)
		{
			System.out.println("le medecin est bien enregistré :");
			return true;
		}
		else{
			System.out.println("il y a eu une erreur veuillez recommencer :");
			return false;
		}
		
	}
	
	public void rechercheMedecin(int id) {
		Medecin medecin;
		
		medecin = medecindao.afficherInfoMedecin(id);
		System.out.println("le medecin se nomme :" + medecin.getNom() + " " + medecin.getPrenom());
	}

}
