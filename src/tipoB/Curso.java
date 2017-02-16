package tipoB;

import java.util.Arrays;
import java.util.Scanner;

//importa las bibliotecas que creas necesaria.
public class Curso
{
	public static void main (String[]arg)
	{
	  Alumno alumno1 = new Alumno("joaquinto", "pocas luces", 13);
	  Alumno alumno2 = new Alumno("alvaro", "elistillo de clase", 15);
	  Alumno alumno3 = new Alumno("antonio", "pedante sabelotodo", 43);
	  Alumno alumno4 = new Alumno("beatriz", "aprueba todo", 23);
	  Alumno alumno5= new Alumno("carmen", "brillante brillante", 17);
	  Profesor profesor1 = new Profesor("augusto" , "mecargotodo", true);
	  Profesor profesor2 = new Profesor("pedrito" , "machacón", false);
	
	  Scanner in = new Scanner(System.in);
	  System.out.println("Introduce el nombre del módulo:");
	  String nombreModulo = in.nextLine();
	  if ( !nombreModulo.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+") )
		  nombreModulo = "DEFAULT";
	  System.out.println("Introduce el número de horas del módulo:");
	  String numeroHoras = in.next();
	  if ( !numeroHoras.matches("[3-8]") )
		  numeroHoras = "6";
	  int numeroHorasModulo = Integer.parseInt(numeroHoras);
	  in.close();
	  Modulo m = new Modulo(nombreModulo, numeroHorasModulo);
	  
	  m.setListaProfesores(profesor1, profesor2);
	  m.addListaAlumnos(alumno1);
	  m.addListaAlumnos(alumno2);
	  m.addListaAlumnos(alumno3);
	  m.addListaAlumnos(alumno4);
	  m.addListaAlumnos(alumno5);
	  
	  System.out.println(m);
	
	  System.out.printf("Lista de alumnos: %s%n", 
			  m.getListaAlumnos());
	  System.out.printf("Lista de alumnos menores: %s%n",
			  m.getListaAlumnosMenores());
	  Profesor[] listaProfesores = m.getListaProfesores();
	  System.out.printf("Lista de profesores: %s%n",
			  Arrays.toString(listaProfesores));
	 
	}
}
