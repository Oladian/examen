package tipoA;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private List<Actor> listaActores = new ArrayList<Actor>();
	private List<Director> listaDirectores = new ArrayList<Director>();
	private int presupuesto;
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	public List<Actor> getListaActores() {
		return listaActores;
	}
	public List<Director> getListaDirectores() {
		return listaDirectores;
	}
	public void addDirector(Director d){
		listaDirectores.add(d);
	}
	public void addActor(Actor a){
		listaActores.add(a);
	}
	public double getEdadMediaActores(){
		int sumaEdades = 0;
		for(Actor a : listaActores)
			sumaEdades += a.getEdadActor();
		return 1.0 * sumaEdades / listaActores.size();
	}
	@Override
	public String toString() {
		return "Lista de Actores " + listaActores + "\n" +
				"Lista de directores " + listaDirectores + "\n" + 
				"presupuesto "
				+ presupuesto;
	}
	
	
	
	
	
	
}
