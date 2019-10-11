package eu.ensup.medecin.dao;

import eu.ensup.medecin.domaine.Medecin;

public interface IMedecinDao {
	public boolean creationMedecin(Medecin medecin);
	public Medecin afficherInfoMedecin(int id);
}
