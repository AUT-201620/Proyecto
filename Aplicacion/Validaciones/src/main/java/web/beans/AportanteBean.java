package web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.Aportante;
//import entities.TipoActividad;
import services.AportanteServices;
import services.IAportanteServices;
import services.IValidacionesServices;
import services.ValidacionesServices;

/**
 * Backing Bean SuperEntity CRUD
 *
 */

@ManagedBean
@ViewScoped
public class AportanteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private IAportanteServices services;
	private Aportante aportante;
	private List<Aportante> aportanteList = new ArrayList<Aportante>();
	private Long identificador;
	private IValidacionesServices validacionesservices;
	private Boolean buttonCrud;
	private TipoDocumento [] tiposDocumento;

	//public List<TipoActividad> getTipoActividad()
	//{
	//	this.tipoActividad = validacionesservices.getTipoActividad();
	//	return tipoActividad;
	//}

	//public void setTipoActividad(List<TipoActividad> tipoActividad) {
	//	this.tipoActividad = tipoActividad;
	//}

	//private List<TipoActividad> tipoActividad;

	public AportanteBean() {
		services = new AportanteServices();
		validacionesservices = new ValidacionesServices();
		aportante = new Aportante();
		buttonCrud = Boolean.TRUE;
		//aportante.setNaturalezaJuridica(new TipoActividad());
	}

	@PostConstruct
	public void init() {
		this.aportanteList = services.findAll();
	}

	public void crear() {
		services.create(this.aportante);
		this.aportanteList = services.findAll();
	}

	public void delete() {
		services.delete(this.identificador);
		this.aportanteList = services.findAll();
	}

	public void ver() {
		this.aportante = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
	}
	
	public void editar() {
		this.aportante = services.update(this.aportante);
		this.aportanteList = services.findAll();
	}
	
	public void clearAportante(){
		this.aportante= new Aportante();
		buttonCrud = Boolean.TRUE;
	}
	/**
	 * @return the entityList
	 */
	public List<Aportante> getAportanteList() {
		return aportanteList;
	}

	/**
	 *            the entityList to set
	 */
	public void setAportanteList(List<Aportante> aportanteList) {
		this.aportanteList = aportanteList;
	}

	/**
	 * @return the superEntidad
	 */
	public Aportante getAportante() {
		if (aportante == null) {
			aportante = new Aportante();
		}
		return aportante;
	}

	/**
	 *
	 *            the superEntidad to set
	 */
	public void setAportante(Aportante aportante) {
		this.aportante = aportante;
	}

	/*
	 * @return the identificador
	 */
	public Long getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador
	 *            the identificador to set
	 */
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the buttonCrud
	 */
	public Boolean getButtonCrud() {
		return buttonCrud;
	}

	/**
	 * @param buttonCrud the buttonCrud to set
	 */
	public void setButtonCrud(Boolean buttonCrud) {
		this.buttonCrud = buttonCrud;
	}


	/**
	 * @return the tiposDocumento
	 */
	public TipoDocumento[] getTiposDocumento() {
		return TipoDocumento.values();
	}

	/**
	 * @param tiposDocumento the tiposDocumento to set
	 */
	public void setTiposDocumento(TipoDocumento[] tiposDocumento) {
		this.tiposDocumento = tiposDocumento;
	}
}