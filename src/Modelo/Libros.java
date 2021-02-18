package Modelo;

public class Libros extends Atributo{

	private String cantidadPaginas;
	private String imprenta;
	
	public Libros (String nombre, String codigo ,String reserva ,String plazoMaximo, String cantidadPaginas, String imprenta){
		super(nombre, codigo, reserva, plazoMaximo);
		this.cantidadPaginas = cantidadPaginas;
		this.imprenta = imprenta;
	}

	public String getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(String cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	public String getImprenta() {
		return imprenta;
	}
	public void setImprenta(String imprenta) {
		this.imprenta = imprenta;
	}

	@Override
	public String toString() {
		return "[Codigo: "+ codigo +", Nombre: "+ nombre +", Reserva: "+ reserva +
				", Plazo Maximo: "+ plazoMaximo +", cantidadPaginas: "+ cantidadPaginas +", Imprenta: "+ imprenta +"]";
	} 
}
