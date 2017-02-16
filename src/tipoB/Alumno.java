package tipoB;

public class Alumno {
	private String nombreAlumno;
	private String apellidosAlumno;
	private int edadAlumno;
	public Alumno(String nombreAlumno, String apellidosAlumno, int edadAlumno) {
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.edadAlumno = edadAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public String getApellidosAlumno() {
		return apellidosAlumno;
	}
	public int getEdadAlumno() {
		return edadAlumno;
	}
	@Override
	public String toString() {
		//APELLIDOS: apellidos alumno ::: NOMBRE: nombre alumno ::: EDAD: edad alumno
		return "APELLIDOS: " + apellidosAlumno + " ::: NOMBRE: " +
				 nombreAlumno + " ::: EDAD: " + edadAlumno;
	}
	public static void main(String[] args) {
		Alumno a = new Alumno("nombreAlumno", "apellidosAlumno", 17);
		System.out.println(a);
	}
}
