package recipientes;
import seresvivos.*;

public class Pecera extends Recipiente{
	
	//Animal unAnimal (del padre)
	
	public Pecera(int litros) {
		super(litros);
	}
	
	public void meterPez(Pez unPez) {
		unAnimal=unPez;
	}

}
