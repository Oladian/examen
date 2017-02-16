package tipoA;

import java.util.Scanner;

public class TestPelicula {
	 public static void main (String[]arg)
	  {
	    Actor actor1 = new Actor("cristiano", "malo malote", 23);
	    Actor actor2 = new Actor("luis enrique", "mequetrefe redomado", 45);
	    Actor actor3 = new Actor("ada", "augusta byron ", 43);
	    Director director = new Director("pedro", "pedrito pedrete");

	    //crea un objeto de tipo película
	    Pelicula p = new Pelicula();
	    
	    //añade los actores y los directores
	    p.addActor(actor1);  p.addActor(actor2);  p.addActor(actor3);
	    p.addDirector(director);
	    
	    //lee desde la clase scanner el presupuesto de la película
	    //el presupuesto debe estar comprendido entre
	    //6.000.000 euros a 7.999.999 euros
	    //usa una expresión regular para controlar el dato introducido
	    //tanto para que sea un entero y esté en ese rango de valor
	    //NO puede lanzarse una excepción por introducir un valor no entero
	    //en el caso que la cantidad introducida no corresponda al rango anterior
	    //se establecerá un presupuesto de 6.000.000 euros en caso correcto se
	    //establece el presupuesto leíedo
	    Scanner in = new Scanner(System.in);
	    System.out.println("Introduce presupueto de la película:");
	    String presupuesto = in.next();
	    if ( !presupuesto.matches("(6|7)[\\d]{6}") )
	    	presupuesto = "6000000";
	    int presupuestoPelicula = Integer.parseInt(presupuesto);
	    
	    p.setPresupuesto(presupuestoPelicula);

	    //imprime la referencia de la película
	    System.out.println(p);
	    //imprime la lista de actores
	    System.out.println(p.getListaActores());
	    //imprime la edad media de los actores
	    System.out.printf("Edad media actores %.2f%n", p.getEdadMediaActores());
	    //imprime la lista de directores
	    System.out.println(p.getListaDirectores());


	  }
}
