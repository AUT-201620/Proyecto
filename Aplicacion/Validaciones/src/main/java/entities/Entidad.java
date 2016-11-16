/**
 * 
 */
package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author am.osorio
 *
 */

@NamedQueries({
@NamedQuery(name="Entidad.getEntidades",
    query="SELECT e FROM Entidad e"),
		@NamedQuery(name="Entidad.findByIdentificacion",
				query="SELECT e FROM Entidad e WHERE e.numeroIdentificacion = :identificacion")
})

@Entity
public class Entidad implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String FIND_BY_IDENTIFICACION ="Entidad.findByIdentificacion";
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String tipoIdentificacion;
	private Integer numeroIdentificacion;
	private Boolean viveExterior;
	private Boolean grupoFamiliar;
	private Boolean actividadEconomica;
	private Boolean altoRiesgo;
	private Boolean congresista;
	private Boolean cti;
	private Boolean aviador;
	private BigDecimal ingresoBaseCotizacion;
	private TipoPension tipoPension;
	private TipoPensionado tipoPensionado;
	private TipoPagador tipoPagador;

	@ManyToOne
	private SuperEntidad superEntidad;

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "entidad")
	private List<Novedad> novedades;
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
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}
	/**
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	/**
	 * @return the segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}
	/**
	 * @param segundoNombre the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
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
	 * @return the viveExterior
	 */
	public Boolean getViveExterior() {
		return viveExterior;
	}
	/**
	 * @param viveExterior the viveExterior to set
	 */
	public void setViveExterior(Boolean viveExterior) {
		this.viveExterior = viveExterior;
	}
	/**
	 * @return the grupoFamiliar
	 */
	public Boolean getGrupoFamiliar() {
		return grupoFamiliar;
	}
	/**
	 * @param grupoFamiliar the grupoFamiliar to set
	 */
	public void setGrupoFamiliar(Boolean grupoFamiliar) {
		this.grupoFamiliar = grupoFamiliar;
	}
	/**
	 * @return the actividadEconomica
	 */
	public Boolean getActividadEconomica() {
		return actividadEconomica;
	}
	/**
	 * @param actividadEconomica the actividadEconomica to set
	 */
	public void setActividadEconomica(Boolean actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}
	/**
	 * @return the altoRiesgo
	 */
	public Boolean getAltoRiesgo() {
		return altoRiesgo;
	}
	/**
	 * @param altoRiesgo the altoRiesgo to set
	 */
	public void setAltoRiesgo(Boolean altoRiesgo) {
		this.altoRiesgo = altoRiesgo;
	}
	/**
	 * @return the congresista
	 */
	public Boolean getCongresista() {
		return congresista;
	}
	/**
	 * @param congresista the congresista to set
	 */
	public void setCongresista(Boolean congresista) {
		this.congresista = congresista;
	}
	/**
	 * @return the cti
	 */
	public Boolean getCti() {
		return cti;
	}
	/**
	 * @param cti the cti to set
	 */
	public void setCti(Boolean cti) {
		this.cti = cti;
	}
	/**
	 * @return the aviador
	 */
	public Boolean getAviador() {
		return aviador;
	}
	/**
	 * @param aviador the aviador to set
	 */
	public void setAviador(Boolean aviador) {
		this.aviador = aviador;
	}
	/**
	 * @return the ingresoBaseCotizacion
	 */
	public BigDecimal getIngresoBaseCotizacion() {
		return ingresoBaseCotizacion;
	}
	/**
	 * @param ingresoBaseCotizacion the ingresoBaseCotizacion to set
	 */
	public void setIngresoBaseCotizacion(BigDecimal ingresoBaseCotizacion) {
		this.ingresoBaseCotizacion = ingresoBaseCotizacion;
	}

	public SuperEntidad getSuperEntidad() {
		return superEntidad;
	}

	public void setSuperEntidad(SuperEntidad superEntidad) {
		this.superEntidad = superEntidad;
	}

	public List<Novedad> getNovedades() {
		return novedades;
	}

	public void setNovedades(List<Novedad> novedades) {
		this.novedades = novedades;
	}

	/**
	 * @return the tipoPension
	 */
	public TipoPension getTipoPension() {
		return tipoPension;
	}
	/**
	 * @param tipoPension the tipoPension to set
	 */
	public void setTipoPension(TipoPension tipoPension) {
		this.tipoPension = tipoPension;
	}
	/**
	 * @return the tipoPensionado
	 */
	public TipoPensionado getTipoPensionado() {
		return tipoPensionado;
	}
	/**
	 * @param tipoPensionado the tipoPensionado to set
	 */
	public void setTipoPensionado(TipoPensionado tipoPensionado) {
		this.tipoPensionado = tipoPensionado;
	}
	/**
	 * @return the tipoPagador
	 */
	public TipoPagador getTipoPagador() {
		return tipoPagador;
	}
	/**
	 * @param tipoPagador the tipoPagador to set
	 */
	public void setTipoPagador(TipoPagador tipoPagador) {
		this.tipoPagador = tipoPagador;
	}
	@Override
	public String toString() {
		return "Entidad{" +
				"id=" + id +
				", primerNombre='" + primerNombre + '\'' +
				", segundoNombre='" + segundoNombre + '\'' +
				", primerApellido='" + primerApellido + '\'' +
				", segundoApellido='" + segundoApellido + '\'' +
				", tipoIdentificacion='" + tipoIdentificacion + '\'' +
				", numeroIdentificacion=" + numeroIdentificacion +
				", viveExterior=" + viveExterior +
				", grupoFamiliar=" + grupoFamiliar +
				", actividadEconomica=" + actividadEconomica +
				", altoRiesgo=" + altoRiesgo +
				", congresista=" + congresista +
				", cti=" + cti +
				", aviador=" + aviador +
				", ingresoBaseCotizacion=" + ingresoBaseCotizacion +
				", superEntidad=" + superEntidad +
				", novedades=" + novedades +
				'}';
	}
}
