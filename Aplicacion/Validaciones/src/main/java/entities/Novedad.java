package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.*;
import java.util.*;

/**
* @author am.osorio
*
*/

@NamedQueries({
	@NamedQuery(name = "Novedad.getNovedades",
	query = "SELECT e FROM Novedad e")
	, @NamedQuery(name="Novedad.findByPensionadoId",
	query = "SELECT e FROM Novedad e WHERE e.pensionado.id = :pensionadoId ORDER BY e.fechaCreacion ")
	, @NamedQuery(name="Novedad.findByPensionadoAll",
	query = "SELECT e FROM Novedad e WHERE e.pensionado = :pensionado")
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
	private String tipoNovedad;
	//Referencia Bidireccional a Entidades que refieren a esta entidad como One To Many
	@ManyToOne
	@JoinColumn(name="pensionado_id", nullable = false)
	private Pensionado pensionado;
	
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
	* @return the tipoNovedad
	*/
	public String getTipoNovedad() {
		return tipoNovedad;
	}
	/**
	* @param tipoNovedad the tipoNovedad to set
	*/
	public void setTipoNovedad(String tipoNovedad) {
		this.tipoNovedad = tipoNovedad;
	}
	
	/**
	* @return the pensionado
	*/
	public Pensionado getPensionado() {
		return pensionado;
	}
	/**
	* @param pensionado the pensionado to set
	*/
	public void setPensionado(Pensionado pensionado) {
		this.pensionado = pensionado;
	}
	
	public int diasEntreFechaFinInicio(){
		long difference =  (fechaFin.getTime()-fechaInicio.getTime())/86400000;
		return (int) Math.abs(difference);
	}
	@Override
	public String toString() {
		return "Novedad{" +
		"id=" + id +
		", fechaInicio='" + fechaInicio + '\'' +
		", fechaFin='" + fechaFin + '\'' +
		", noConsolidada='" + noConsolidada + '\'' +
		", fechaCreacion='" + fechaCreacion + '\'' +
		", tipoNovedad='" + tipoNovedad + '\'' +
		'}';
	}
}

