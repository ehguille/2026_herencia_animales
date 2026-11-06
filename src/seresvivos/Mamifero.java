package seresvivos;

public abstract class Mamifero extends Vertebrado {
	
	protected String colorPelaje;
	
	public Mamifero(int peso, String nombreCientifico, int numeroOjos, String colorPelaje) {
		super(peso, nombreCientifico, numeroOjos);
		this.colorPelaje=colorPelaje;
		System.out.println("Mamifero.java: peso="+peso+";nombreCientifico="+nombreCientifico+";numeroOjos="+numeroOjos+";colorPelaje="+colorPelaje);
	}

}
