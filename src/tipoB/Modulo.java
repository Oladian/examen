package tipoB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Modulo {
	private String nombreModulo;
	private int horasDuracionModulo;
	private Profesor[] listaProfesores = new Profesor[2] ;
	private List<Alumno> listaAlumnos = 
			new ArrayList<Alumno>(); //se inicializa la lista a vacía
	public Modulo(String nombreModulo, int horasDuracionModulo) {
		this.nombreModulo = nombreModulo;
		this.horasDuracionModulo = horasDuracionModulo;
	}
	public String getNombreModulo() {
		return nombreModulo;
	}
	public int getHorasDuracionModulo() {
		return horasDuracionModulo;
	}
	public Profesor[] getListaProfesores() {
		return listaProfesores;
	}
	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	public List<Alumno> getListaAlumnosMenores(){
		List<Alumno> listaAlumnosMenores =
				new ArrayList<Alumno>();
		for (Alumno alumno : listaAlumnos)
			if (alumno.getEdadAlumno() < 18)
				listaAlumnosMenores.add(alumno);
		return listaAlumnosMenores;
	}
	public void setListaProfesores(Profesor profesor1, Profesor profesor2){
		listaProfesores[0] = profesor1;
		listaProfesores[1] = profesor2;
	}
	public void addListaAlumnos(Alumno a){
		listaAlumnos.add(a);
	}
	public void setListaAlumnos(List<Alumno> lista){
		listaAlumnos = lista;
	}
	@Override
	public String toString() {
		return "nombre módulo=" + nombreModulo + "\n" +
				"horas duracion módulo=" + horasDuracionModulo + "\n"
				+ "profesores=" + Arrays.toString(listaProfesores) + "\n" +
				"alumnos=" + listaAlumnos;
	}
	
	
}
