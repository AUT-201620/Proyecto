/**
 * 
 */
package entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author am.osorio
 *
 */

@NamedQueries({
@NamedQuery(name="Aportante.getAportantes",
    query="SELECT e FROM Aportante e")          
})

@Entity
public class Aportante implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nombreRazonSocial;
	private String digitoVerificacion;

	private String naturalezaJuridica;
	private Integer numeroIdentificacion;
	private String tipoIdentificacion;

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
	 * @return the nombreRazonSocial
	 */
	public String getNombreRazonSocial() {
		return nombreRazonSocial;
	}
	/**
	 * @param nombreRazonSocial the nombreRazonSocial to set
	 */
	public void setNombreRazonSocial(String nombreRazonSocial) {
		this.nombreRazonSocial = nombreRazonSocial;
	}
	/**
	 * @return the digitoVerificacion
	 */
	public String getDigitoVerificacion() {
		return digitoVerificacion;
	}
	/**
	 * @param digitoVerificacion the digitoVerificacion to set
	 */
	public void setDigitoVerificacion(String digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}
	/**
	 * @return the naturalezaJuridica
	 */
	//public TipoActividad getNaturalezaJuridica() {
	//	return naturalezaJuridica;
	//}

	public String getNaturalezaJuridica() {
		return naturalezaJuridica;
	}

	public void setNaturalezaJuridica(String naturalezaJuridica) {
		this.naturalezaJuridica = naturalezaJuridica;
	}

	/**
	 *
	 * @param naturalezaJuridica the naturalezaJuridica to set
	 */
	//public void setNaturalezaJuridica(TipoActividad naturalezaJuridica) {
	//	this.naturalezaJuridica = naturalezaJuridica;
	//}
	/**
	 * @return the numeroIdentificacion
	 */
	public Integer getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(Integer numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	/**
	 * @return the tipoIdentificacion
	 */
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	/**
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

}
