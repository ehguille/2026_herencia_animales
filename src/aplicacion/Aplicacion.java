package aplicacion;
import seresvivos.*;

public class Aplicacion {
	
	public Aplicacion() {
		/*Perro p1=new Perro(100,"Marrón",4);
		Perro p2=new Perro(100,"Marrón",3);
		System.out.println(p1.getNumeroPatas());
		System.out.println(p2.getNumeroPatas());*/
		Perro p3=new Perro(10,"Rosa");
		p3.aumentarNumeroMaximoPatas();
		System.out.println(Perro.numeroMaximoPatas);
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();
	}

} 
