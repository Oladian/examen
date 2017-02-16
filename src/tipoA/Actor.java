package tipoA;

import tipoB.Alumno;

public class Actor {
	private String nombreActor;
	private String apellidosActor;
	private int edadActor;
	public Actor(String nombreActor, String apellidosActor, int edadActor) {
		this.nombreActor = nombreActor;
		this.apellidosActor = apellidosActor;
		this.edadActor = edadActor;
	}
	public String getNombreActor() {
		return nombreActor;
	}
	public String getApellidosActor() {
		return apellidosActor;
	}
	public int getEdadActor() {
		return edadActor;
	}
	@Override
	public String toString() {
		return "APELLIDOS: " + apellidosActor + " -- NOMBRE: " +
				 nombreActor + " -- EDAD: " + edadActor;
	}
	
}
