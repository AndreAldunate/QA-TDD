package tarea1;

import org.junit.Assert;
import org.junit.Test;

public class EstudianteTest {
	@Test
	public void verifyTheAgeMethod(){
		Estudiante estudiante= new Estudiante("a",10,10,10);
		estudiante.setFecha(1998);
		int expRes=20;
		int actualRes=estudiante.getEdad();
		Assert.assertEquals("ERROR! Edad mal calculada", expRes,actualRes);
	}
	
	@Test
	public void verifyAprobacionMethod(){
		Estudiante estudiante= new Estudiante("a",10,10,10);
		boolean exp = false;
		boolean act = estudiante.aprobacion();
		Assert.assertEquals("ERROR! Nota mal calculada", exp,act);
	}
	
}
