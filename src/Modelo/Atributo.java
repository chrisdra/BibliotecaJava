package Modelo;

public abstract class Atributo {

	protected String nombre;
	protected String codigo;
	protected String reserva;
	protected String plazoMaximo;
	
	public Atributo(String nombre, String codigo ,String reserva ,String plazoMaximo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.reserva = reserva;
		this.plazoMaximo = plazoMaximo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getReserva() {
		return reserva;
	}
	public void setReserva(String reserva) {
		this.reserva = reserva;
	}
	public String getPlazoMaximo() {
		return plazoMaximo;
	}
	public void setPlazoMaximo(String plazoMaximo) {
		this.plazoMaximo = plazoMaximo;
	}
}
