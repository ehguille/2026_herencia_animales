package seresvivos;

public final class Gato extends Mamifero {

	public Gato(int peso, String nombreCientifico, int numeroOjos, String colorPelaje) {
		super(peso, nombreCientifico, numeroOjos, colorPelaje);
	}
	
	public Gato(int peso) {
		super(peso, "Felis Catus", 2, "Pardo");
	}

}
