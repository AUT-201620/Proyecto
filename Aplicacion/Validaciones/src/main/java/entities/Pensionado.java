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
	@NamedQuery(name = "Pensionado.getPensionados",
	query = "SELECT e FROM Pensionado e")
})

@Entity
public class Pensionado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Boolean viveExterior;
	private Boolean noTieneGrupoFamiliar;
	private Boolean altoRiesgo;
	private Boolean congresista;
	private Boolean cti;
	private Boolean aviador;
	private String primerNombre;
	private String otrosNombres;
	private String primerApellido;
	private String segundoApellido;
	private String tipoIdentificacion;
	private Integer numeroIdentificacion;
	private Double montoPension;
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "pensionado")
	private List<Novedad> novedades;
	private Integer actividadEconomica;
	@ManyToOne
	private TipoPensionado tipoPensionado;
	@ManyToOne
	private TipoPagadorPension tipoPagadorPension;
	@ManyToOne
	private TipoPension tipoPension;
	
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
	* @return the noTieneGrupoFamiliar
	*/
	public Boolean getNoTieneGrupoFamiliar() {
		return noTieneGrupoFamiliar;
	}
	/**
	* @param noTieneGrupoFamiliar the noTieneGrupoFamiliar to set
	*/
	public void setNoTieneGrupoFamiliar(Boolean noTieneGrupoFamiliar) {
		this.noTieneGrupoFamiliar = noTieneGrupoFamiliar;
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
	* @return the otrosNombres
	*/
	public String getOtrosNombres() {
		return otrosNombres;
	}
	/**
	* @param otrosNombres the otrosNombres to set
	*/
	public void setOtrosNombres(String otrosNombres) {
		this.otrosNombres = otrosNombres;
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
	* @return the montoPension
	*/
	public Double getMontoPension() {
		return montoPension;
	}
	/**
	* @param montoPension the montoPension to set
	*/
	public void setMontoPension(Double montoPension) {
		this.montoPension = montoPension;
	}
	
	/**
	* @return the novedades
	*/
	public List<Novedad> getNovedades() {
		return novedades;
	}
	/**
	* @param novedades the novedades to set
	*/
	public void setNovedades(List<Novedad> novedades) {
		this.novedades = novedades;
	}
	
	/**
	* 
	* @return
	*/
	public boolean tieneNovedades(){
		return (novedades != null && !novedades.isEmpty());
	}
	
	/**
	* 
	* @return
	*/
	public Novedad ultimaNovedad(){
		if(tieneNovedades()){
			return novedades.get(novedades.size()-1);
		}
		return null;
	}
	
	/**
	* @return the actividadEconomica
	*/
	public Integer getActividadEconomica() {
		return actividadEconomica;
	}
	/**
	* @param actividadEconomica the actividadEconomica to set
	*/
	public void setActividadEconomica(Integer actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
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
	* @return the tipoPagadorPension
	*/
	public TipoPagadorPension getTipoPagadorPension() {
		return tipoPagadorPension;
	}
	/**
	* @param tipoPagadorPension the tipoPagadorPension to set
	*/
	public void setTipoPagadorPension(TipoPagadorPension tipoPagadorPension) {
		this.tipoPagadorPension = tipoPagadorPension;
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
	
	@Override
	public String toString() {
		return "Pensionado{" +
		"id=" + id +
		", viveExterior='" + viveExterior + '\'' +
		", noTieneGrupoFamiliar='" + noTieneGrupoFamiliar + '\'' +
		", altoRiesgo='" + altoRiesgo + '\'' +
		", congresista='" + congresista + '\'' +
		", cti='" + cti + '\'' +
		", aviador='" + aviador + '\'' +
		", primerNombre='" + primerNombre + '\'' +
		", otrosNombres='" + otrosNombres + '\'' +
		", primerApellido='" + primerApellido + '\'' +
		", segundoApellido='" + segundoApellido + '\'' +
		", tipoIdentificacion='" + tipoIdentificacion + '\'' +
		", numeroIdentificacion='" + numeroIdentificacion + '\'' +
		", montoPension='" + montoPension + '\'' +
		", novedades='" + novedades + '\'' +
		", actividadEconomica='" + actividadEconomica + '\'' +
		", tipoPensionado='" + tipoPensionado + '\'' +
		", tipoPagadorPension='" + tipoPagadorPension + '\'' +
		", tipoPension='" + tipoPension + '\'' +
		'}';
	}
}

