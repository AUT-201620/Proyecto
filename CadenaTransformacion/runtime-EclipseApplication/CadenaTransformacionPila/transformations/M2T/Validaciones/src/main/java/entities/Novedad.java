package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;

/**
 * @author am.osorio
 *
 */
@NamedQueries({
	@NamedQuery(name="Novedad.getNovedads",
    	query="SELECT e FROM Novedad e"),
})

@Entity
public class Novedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Date fechaInicio;
	private Date fechaFin;
	private Boolean noConsolidada;
	private Date fechaCreacion;
	private String tipo;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * @return the noConsolidada
	 */
	public Boolean getNoConsolidada() {
		return noConsolidada;
	}
	/**
	 * @param noConsolidada the noConsolidada to set
	 */
	public void setNoConsolidada(Boolean noConsolidada) {
		this.noConsolidada = noConsolidada;
	}
	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Novedad{" +
				"id=" + id +
				", fechaInicio='" + fechaInicio + '\'' +
				", fechaFin='" + fechaFin + '\'' +
				", noConsolidada='" + noConsolidada + '\'' +
				", fechaCreacion='" + fechaCreacion + '\'' +
				", tipo='" + tipo + '\'' +
				'}';
	}
}
