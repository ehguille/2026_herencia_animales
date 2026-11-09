package recipientes;
import seresvivos.*;

public class Jaula extends Recipiente {
	
	public Jaula(int metrosCuadrados) {
		super(metrosCuadrados);
	}
	
	public void enjaular(Pajaro unPajaro) {
		unAnimal=unPajaro;
	}
	
	public String getNombreCientifico() {
		return unAnimal.getNombreCientifico();
	}
	
	public Pajaro desenjaular() {
		return (Pajaro)unAnimal;
	}
	
	
}
