package tarea1;

import java.util.LinkedList;
import java.util.List;

public class Docente extends Persona {
	private Estudiante[] estudiantes;
	public Docente(){
		
	}
	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}
	public Estudiante[] sortNota() {
		List<Estudiante> list = new LinkedList<>();
		list.add(estudiantes[0]);
		for (int i = 1 ; i < estudiantes.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				if(estudiantes[i].getNotas().getTotal()<=list.get(j).getNotas().getTotal()){
					list.add(j, estudiantes[i]);
					break;
				}else if(j==list.size()-1){
					list.add(estudiantes[i]);
					break;
				}else{
					continue;
				}
			}
		}
		Estudiante[]resp = new Estudiante[estudiantes.length];
		for (int i = 0; i < estudiantes.length; i++) {
			resp[i]=list.get(i);
		}
		return resp;
	}
	public Estudiante[] sortName() {
		List<Estudiante> list = new LinkedList<>();
		list.add(estudiantes[0]);
		for (int i = 1 ; i < estudiantes.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				char c1[] = estudiantes[i].getNombre().toCharArray();
				char c2[] = list.get(j).getNombre().toCharArray();
				if(c1[0]<=c2[0]){
					list.add(j, estudiantes[i]);
					break;
				}else if(j==list.size()-1){
					list.add(estudiantes[i]);
					break;
				}else{
					continue;
				}
			}
		}
		Estudiante[]resp = new Estudiante[estudiantes.length];
		for (int i = 0; i < estudiantes.length; i++) {
			resp[i]=list.get(i);
		}
		return resp;
	
	}
}
