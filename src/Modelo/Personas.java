package Modelo;

public class Personas {
	
	private String nombre;
	private String rut;
	private String clave;
	
	public Personas (String nombre, String rut, String clave) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", rut=" + rut + ", clave=" + clave + "]";
	}	
}
