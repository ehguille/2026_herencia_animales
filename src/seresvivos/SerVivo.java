package seresvivos;

public abstract class SerVivo {

	protected int peso;
	protected String nombreCientifico;
	
	public SerVivo(int peso, String nombreCientifico) {
		this.peso=peso;
		this.nombreCientifico=nombreCientifico;
		System.out.println("SerVivo.java: peso="+peso+";nombreCientifico="+nombreCientifico);
	}
	
	
}
