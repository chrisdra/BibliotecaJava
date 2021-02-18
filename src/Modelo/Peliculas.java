package Modelo;

public class Peliculas extends Atributo{
	
	private String duracion;
	private String calidad;
	
	public Peliculas (String nombre, String codigo ,String reserva ,String plazoMaximo, String duracion, String calidad){
		super(nombre, codigo, reserva, plazoMaximo);
		this.duracion = duracion;
		this.calidad = calidad;
	}

	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "[Codigo: "+ codigo +", Nombre: "+ nombre +", Reserva: "+ reserva +
				", Plazo Maximo: "+ plazoMaximo +", Duracion: "+ duracion +", Calidad: "+ calidad +"]";
	}
}
