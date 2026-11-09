package seresvivos;

public final class Perro extends Mamifero {
	
	private int numeroPatas;
	public static final int numeroMaximoPatas=4;

	public Perro(int peso, String colorPelaje) {
		super(peso, "Canis Lupus", 2, colorPelaje);
		numeroPatas=4;
		System.out.println("Perro.java: peso="+peso+";nombreCientifico=Canis Lupus (FIJO);numeroOjos=2 (FIJO);colorPelaje="+colorPelaje+";numeroPatas=4 (FIJO)");
	}
	
	public Perro(int peso, String colorPelaje, int numeroPatas) {
		super(peso, "Canis Lupus", 2, colorPelaje);
		this.numeroPatas=numeroPatas;
		System.out.println("Perro.java: peso="+peso+";nombreCientifico=Canis Lupus (FIJO);numeroOjos=2 (FIJO);colorPelaje="+colorPelaje+";numeroPatas="+numeroPatas);
	}
	
	public void perderPata() {
		numeroPatas--;
	}
	
	public int getNumeroPatas() {
		return numeroPatas;
	}
}
