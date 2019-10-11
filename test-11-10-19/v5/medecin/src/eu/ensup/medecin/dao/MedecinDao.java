package eu.ensup.medecin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;


public class MedecinDao extends AccesBd implements IMedecinDao{
	ResultSet rs = null;

	public boolean creationMedecin(Medecin medecin) {
		// TODO Auto-generated method stub
		seConnecter();
		System.out.println(medecin.getPrenom());
		try {
			String sql = "INSERT INTO medecin(`Nom`,`Prenom`,`Age`,`specialite`) values" + "('" + medecin.getNom()
					+ "','" + medecin.getPrenom() + "','" + medecin.getAge() + "','" + medecin.getSpecialite() + "');";

			st.executeUpdate(sql);

		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		seDeconnecter();
		return true;

	}

	public Medecin afficherInfoMedecin(int id) {
		ResultSet rs = null;
		int age;
		String nom;
		String prenom;
		String specialite;
		Medecin medecin = null;

		seConnecter();
		try {

			String sql = "SELECT * FROM medecin where Id=" + id +";";

			// Etape 4 : exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

			while (rs.next()) {

				nom = rs.getString("Nom");
				prenom = rs.getString("Prenom");
				age = rs.getInt("age");
				specialite = rs.getString("specialite");

				medecin = new Medecin(nom, prenom, age, specialite);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		seDeconnecter();
		return medecin;

	}
}
