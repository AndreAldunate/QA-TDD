package tarea1;

public class Persona {
	private String nombre;
	private int fechaNac;

	public Persona() {

	}

	public int getEdad() {
		return 2018 - fechaNac;
	}

	public int getFecha() {
		return fechaNac;
	}

	public void setFecha(int fecha) {
		this.fechaNac = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
