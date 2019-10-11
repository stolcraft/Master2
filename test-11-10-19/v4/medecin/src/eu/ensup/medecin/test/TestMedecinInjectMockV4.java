package eu.ensup.medecin.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import eu.ensup.medecin.dao.IMedecinDao;
import eu.ensup.medecin.dao.MedecinDao;
import eu.ensup.medecin.domaine.Medecin;
import eu.ensup.medecin.domaine.Patient;
import eu.ensup.medecin.service.MedecinService;



public class TestMedecinInjectMockV4 {
	
	@Mock
	private IMedecinDao daoMock ;
	
	@InjectMocks
	private MedecinService service;
	
	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	}

	//V4
	@Test
	public void test() {
		
		
		Medecin medecin = null;
		
		Mockito.when(daoMock.creationMedecin(medecin)).thenReturn(true);
		assertEquals(true, service.creationMedecin(medecin));
		
	}

}
