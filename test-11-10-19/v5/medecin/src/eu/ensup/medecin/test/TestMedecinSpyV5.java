package eu.ensup.medecin.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinSpyV5 {

	@Spy
	List<String> spiedList = new ArrayList<String>();
	 
	@Test
	public void test() {
	    spiedList.add("one");
	    spiedList.add("two");
	 
	    verify(spiedList).add("one");
	    verify(spiedList).add("two");
	 
	    assertEquals(2, spiedList.size());
	 
	    //si jamais j'appele la méthode size alors je retourne 100
	    Mockito.doReturn(100).when(spiedList).size();
	    //On compare si on utilise la méthode size
	    assertEquals(100, spiedList.size());
	}

}
