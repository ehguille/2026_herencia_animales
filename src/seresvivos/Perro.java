package seresvivos;

public final class Perro extends Mamifero {

	public Perro(int peso, String colorPelaje) {
		super(peso, "Canis Lupus", 2, colorPelaje);
		System.out.println("Perro.java: peso="+peso+";nombreCientifico=Canis Lupus (FIJO);numeroOjos=2 (FIJO);colorPelaje="+colorPelaje);
	}
}
