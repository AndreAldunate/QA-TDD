package tarea1;

import org.junit.Assert;
import org.junit.Test;



public class PersonaTest {
	
	@Test
	public void verifyTheAgeMethod(){
		Persona persona = new Persona();
		persona.setFecha(1998);
		int expRes=20;
		int actualRes=persona.getEdad();
		Assert.assertEquals("ERROR! Edad mal calculada", expRes,actualRes);
	}

}
