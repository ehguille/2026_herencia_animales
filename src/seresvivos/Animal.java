package seresvivos;

public abstract class Animal extends SerVivo {
	
	protected int numeroOjos;
	
	public Animal(int peso, String nombreCientifico,int numeroOjos) {
		super(peso,nombreCientifico); //Constructor del padre
		this.numeroOjos=numeroOjos;
		System.out.println("Animal.java: peso="+peso+";nombreCientifico="+nombreCientifico+";numeroOjos="+numeroOjos);
	}
	
	public Animal(int peso, String nombreCientifico) {
		super(peso, nombreCientifico);
		this.numeroOjos=2;
		System.out.println("Animal.java: peso="+peso+";nombreCientifico="+nombreCientifico+";numeroOjos=2 (fijo)");
	}
	
}
