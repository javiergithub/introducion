package org.javier.introduccion;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;


public class IntroduccionTest {
	
	@Test
	public void imprimir() {
		Introduccion introduccion = new Introduccion();
		introduccion.imprimir();
		assertNotNull(introduccion);
	}


}
