package aplicacion;
import recipientes.*;
import seresvivos.*;

public class Aplicacion {
	
	public Aplicacion() {
		/*Perro p1=new Perro(100,"Marrón",4);
		Perro p2=new Perro(100,"Marrón",3);
		System.out.println(p1.getNumeroPatas());
		System.out.println(p2.getNumeroPatas());
		Perro p3=new Perro(10,"Rosa");
		System.out.println(Perro.numeroMaximoPatas);*/
		
		Perro unPerro=new Perro(10,"Rosa");
		Pez unPez=new Pez(20,"Pezus pezus");
		
		Pecera pecera=new Pecera(20);
		Recinto recinto=new Recinto(200);
		
		recinto.meterMamifero(unPerro);
		//recinto.meterMamifero(unPez);
		
		Gato unGato=new Gato(200);
		recinto.meterMamifero(unGato);
		
		Jaula j=new Jaula(2);
		
		Pajaro unPajaro=new Pega(50);
		j.enjaular(unPajaro); //Enjaula una pega
		
		unPajaro=new Petirrojo(3);	
		
		Pajaro laPega=j.desenjaular();
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();
	}

} 
