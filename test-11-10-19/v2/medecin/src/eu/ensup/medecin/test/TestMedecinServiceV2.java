package eu.ensup.medecin.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.medecin.dao.IMedecinDao;
import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;
import eu.ensup.medecin.service.MedecinService;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinServiceV2 {

	@Mock
	IMedecinDao dao;
	
	@Test
	public void test() {
		/* Sc�nario de test :
		 * La demande de lecture d'information d'un medecin � partir de son identifiant
		 * nous ramene la totalit� de ses caract�ristiques */
		Patient patient = new Patient("pierre", " paul", 20, "mal a la tete");
		Medecin medecin = new Medecin("docteur", "house", 47, patient, "tete");
		
		//1: Mocker l'interface du dao
		
		MedecinService meds = new MedecinService(dao);
		
		//2: Cr�er le service
		//3: imposer un comportement au mock
		when(dao.creationMedecin(medecin)).thenReturn(true);
		
		//4: appeler une m�thode du service
		
		boolean medreturn = meds.creationMedecin(medecin);
		System.out.println(medreturn);
		
		//5: Comparer le resultat r�el avec le resultat attendu
		// mock creation
		assertEquals(medreturn , true);
		
		
	}

}
