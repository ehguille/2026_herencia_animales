package recipientes;
import seresvivos.*;

public class Recinto extends Recipiente {
	
	public Recinto(int metrosCuadrados) {
		super(metrosCuadrados);
	}
	
	public void meterMamifero(Mamifero unMamifero) {
		unAnimal=unMamifero;
	}

}
