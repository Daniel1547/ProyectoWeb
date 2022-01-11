package mx.edu.uacm.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CentroComunitario {
	
	@Id
	private int clave;
	private String nombre;
	private String direccion;
	
	
	
	
	
	public CentroComunitario() {
		super();
	}
	public CentroComunitario(int clave, String nombre, String direccion) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	/**
	 * @return the clave
	 */
	public int getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(int clave) {
		this.clave = clave;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
