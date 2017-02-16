package tipoB;

public class Profesor {
	private String nombreProfesor;
	private String primerApellidoProfesor;
	private boolean profesorDefinitivo;
	public Profesor(String nombreProfesor, String primerApellidoProfesor, boolean profesorDefinitivo) {
		this.nombreProfesor = nombreProfesor;
		this.primerApellidoProfesor = primerApellidoProfesor;
		this.profesorDefinitivo = profesorDefinitivo;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public String getPrimerApellidoProfesor() {
		return primerApellidoProfesor;
	}
	public boolean isProfesorDefinitivo() {
		return profesorDefinitivo;
	}
	@Override
	public String toString() {
		return "APELLIDO: " + primerApellidoProfesor + 
				" ::: NOMBRE: " + nombreProfesor + 
				" ::: DEFINITIVO " + profesorDefinitivo;
	}
	
	public static void main(String[] args) {
		Profesor p = new Profesor("nombreProfesor", "primerApellidoProfesor", false);
		System.out.println(p);
	}
}
