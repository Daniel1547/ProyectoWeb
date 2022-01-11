package mx.edu.uacm.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actividad {
	
	@Id
	private int clave;
	private String nombre;
	private int participantes;
	
	
	public Actividad() {
		super();
	}
	
	public Actividad(int clave, String nombre, int participantes) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.participantes = participantes;
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
	 * @return the participantes
	 */
	public int getParticipantes() {
		return participantes;
	}
	/**
	 * @param participantes the participantes to set
	 */
	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}
	
	

}
