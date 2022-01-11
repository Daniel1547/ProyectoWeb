package mx.edu.uacm.dominio;

public class Asistencia {
	
	private String fecha_inicio;
	private String fecha_fin;
	private boolean asistenacia;
	
	
	public Asistencia() {
		super();
	}
	
	public Asistencia(String fecha_inicio, String fecha_fin, boolean asistenacia) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.asistenacia = asistenacia;
	}
	
	/**
	 * @return the fecha_inicio
	 */
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	/**
	 * @param fecha_inicio the fecha_inicio to set
	 */
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	/**
	 * @return the fecha_fin
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}
	/**
	 * @param fecha_fin the fecha_fin to set
	 */
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	/**
	 * @return the asistenacia
	 */
	public boolean isAsistenacia() {
		return asistenacia;
	}
	/**
	 * @param asistenacia the asistenacia to set
	 */
	public void setAsistenacia(boolean asistenacia) {
		this.asistenacia = asistenacia;
	}
	
	

}
