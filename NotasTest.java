package tarea1;

import org.junit.Assert;

import org.junit.Test;

public class NotasTest {
	@Test
	public void verifyTheCalFinalNote(){
		Notas nota = new Notas();
		nota.setNota1(10);
		nota.setNota2(10);
		nota.setNota3(10);
		
		int expRes = 30;
		int actRes = nota.getTotal();
		Assert.assertEquals("Error! Notas mal calculadas",expRes ,actRes);
	}
	

	
	@Test
	public void verifyTheCalFinalNoteWithZero(){
		Notas nota = new Notas();
		
		int expRes = 0;
		int actRes = nota.getTotal();
		Assert.assertEquals("Error! Notas mal calculadas",expRes ,actRes);
	}
	
	@Test
	public void verifyTheCalFinalNoteWrongInputs(){
		Notas nota = new Notas();
		nota.setNota1(200);
		nota.setNota2(106);
		nota.setNota3(108);
		
		int expRes = 0;
		int actRes = nota.getTotal();
		Assert.assertEquals("Error! Notas mal calculadas",expRes ,actRes);
	}
}
