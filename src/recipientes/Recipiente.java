package recipientes;

import seresvivos.Animal;

public abstract class Recipiente {

	protected int tamanyo;
	protected Animal unAnimal;
	
	public Recipiente(int tamanyo) {
		this.tamanyo=tamanyo;
	}
	
}
