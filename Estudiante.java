package tarea1;

public class Estudiante extends Persona {
	private Notas notas;

	public Estudiante(String nom, int n1, int n2, int n3) {
		setNotas(new Notas());
		getNotas().setNota1(n1);
		getNotas().setNota2(n2);
		getNotas().setNota3(n3);
		setNombre(nom);
	}

	public boolean aprobacion() {
		double nota = getNotas().getTotal() / 3;
		if (nota >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}
}
