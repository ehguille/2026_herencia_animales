package seresvivos;

public abstract class Vertebrado extends Animal {

	public Vertebrado(int peso, String nombreCientifico, int numeroOjos) {
		super(peso, nombreCientifico, numeroOjos);
		System.out.println("Vertebrado.java: peso="+peso+";nombreCientifico="+nombreCientifico+";numeroOjos="+numeroOjos);
	}
	
	public Vertebrado(int peso, String nombreCientifico) {
		super(peso, nombreCientifico);
		System.out.println("Vertebrado.java: peso="+peso+";nombreCientifico="+nombreCientifico);
	}
}
