package tarea1;

import org.junit.Assert;
import org.junit.Test;

public class DocenteTest {
	@Test
	public void verifyTheGetEdadMethod() {
		Docente doc = new Docente();
		doc.setFecha(1964);
		int exp = 54;
		int act = doc.getEdad();
		Assert.assertEquals("Error! La edad esta mal", exp, act);
	}
	
	@Test
	public void verifySortNotaMethod(){
		Docente doc = new Docente();
		Estudiante a = new Estudiante("a", 40, 50, 100);
		Estudiante b = new Estudiante("b", 100, 50, 100);
		Estudiante c = new Estudiante("c", 100, 100, 100);
		Estudiante [] param = {b,c,a};
		doc.setEstudiantes(param);
		Estudiante[] act = doc.sortNota();
		Estudiante [] exp = {a,b,c};
		
			for (int i = 0; i < exp.length; i++) {
				Assert.assertEquals("Error! Mal ordenado",exp[i].getNotas().getTotal(), act[i].getNotas().getTotal());
			}
	}
	
	@Test
	public void verifySortNameMethod(){
		Docente doc = new Docente();
		Estudiante a = new Estudiante("a", 40, 50, 100);
		Estudiante b = new Estudiante("b", 100, 50, 100);
		Estudiante c = new Estudiante("c", 100, 100, 100);
		Estudiante [] est = {b,c,a};
		doc.setEstudiantes(est);
		Estudiante[] act = doc.sortNota();
		Estudiante [] exp = {a,b,c};
		
			for (int i = 0; i < exp.length; i++) {
				Assert.assertEquals("Error! Mal ordenado",exp[i].getNombre(), act[i].getNombre());
			}
	}

}
