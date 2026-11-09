package seresvivos;

public abstract class Pajaro extends Vertebrado {

	public Pajaro(int peso, String nombreCientifico) {
		super(peso, nombreCientifico);
	}
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	

}
