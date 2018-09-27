package tarea1;

public class Notas {
	private int nota1;
	private int nota2;
	private int nota3;

	public Notas() {
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		if (nota1 > 100) {
			this.nota1 = 0;
		} else {

			this.nota1 = nota1;
		}
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		if (nota2 > 100) {
			this.nota2 = 0;
		} else {

			this.nota2 = nota2;
		}
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		if (nota3 > 100) {
			this.nota3 = 0;
		} else {

			this.nota3 = nota3;
		}
	}

	public int getTotal() {
		// TODO Auto-generated method stub
		return nota1 + nota2 + nota3;
	}

}
