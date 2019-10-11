package eu.ensup.medecin.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.medecin.dao.IMedecinDao;
import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;
import eu.ensup.medecin.service.MedecinService;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinTimesV3 {

	@Mock
	IMedecinDao dao;

	@Test
	public void test() {
		/* Scénario de test :
		 * La demande de lecture d'information d'un medecin à partir de son identifiant
		 * nous ramene la totalité de ses caractéristiques */
		Patient patient = new Patient("pierre", " paul", 20, "mal a la tete");
		Medecin medecin = new Medecin("docteur", "house", 47, patient, "tete");
		
		//1: Mocker l'interface du dao
		
		MedecinService meds = new MedecinService(dao);
		
		//2: Créer le service
		//3: imposer un comportement au mock
		when(dao.creationMedecin(medecin)).thenReturn(true);
		
		//4: appeler une méthode du service
		
		boolean medreturn = meds.creationMedecin(medecin);
		System.out.println(medreturn);
		
		//5: Comparer le resultat réel avec le resultat attendu
		// mock creation
		assertEquals(medreturn , true);
		
		//V3
		verify(dao, times(1)).creationMedecin(medecin);
		verify(dao, atLeast(0)).creationMedecin(medecin);
		
	}

}
