package Modelo;

import java.util.ArrayList;

public class Reserva {
	
	private ArrayList<Libros> libro;
	private ArrayList<Peliculas> pelicula;
	
	private static Reserva reserva;
	
	private Reserva() {}
	
	private static Reserva getInstance() {
		if (reserva == null) {
			synchronized (Reserva.class) {
				if(reserva == null) {
					reserva = new Reserva();
				}
			}
		}
		return reserva;
	}
	
	public static synchronized ArrayList<Libros> getLibro(){
		return getInstance().libro;
	}
	
	public static synchronized ArrayList <Peliculas> getPlicula(){
		return getInstance().pelicula;
	}
}
