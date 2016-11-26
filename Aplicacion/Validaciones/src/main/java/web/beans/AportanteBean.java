package web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

import entities.*;
import services.*;
import enumerators.*;

/**
* Backing Bean para la pantalla Aportante
*
*/

@ManagedBean
@ViewScoped
public class AportanteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Aportante> aportanteList = new ArrayList<Aportante>();
	private IAportanteServices services;
	private Aportante aportante;
	private Long identificador;
	private Boolean buttonCrud;
	private TipoIdentificacionEnum [] tipoIdentificacionEnum;
	
	/**
	* Constructor de AportanteBean
	*/
	public AportanteBean() {
		services = new AportanteServices();
		aportante = new Aportante();
		buttonCrud = Boolean.TRUE;
	}
	
	
	/**
	* 
	*/
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
	
	public void clearAportante() {
		this.aportante = new Aportante();
		buttonCrud = Boolean.TRUE;
	}
	
	/**
	* @return the aportanteList
	*/
	public List<Aportante> getAportanteList() {
		return aportanteList;
	}
	
	/**
	* @param aportanteList
	* the aportanteList to set
	*/
	public void setAportanteList(List<Aportante> aportanteList) {
		this.aportanteList = aportanteList;
	}
	
	/**
	* @return the aportante
	*/
	public Aportante getAportante() {
		if (aportante == null) {
			aportante = new Aportante();
		}
		return aportante;
	}
	
	/**
	* @param aportante
	* the aportante to set
	*/
	public void setAportante(Aportante aportante) {
		this.aportante = aportante;
	}
	
	/**
	* @return the identificador
	*/
	public Long getIdentificador() {
		return identificador;
	}
	
	/**
	* @param identificador
	* the identificador to set
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
	* @return thetipoIdentificacion
	*/ 
	public TipoIdentificacionEnum[] getTipoIdentificacionEnum() {
		return TipoIdentificacionEnum.values();
	}
	/**
	* @param tipoIdentificacion the tipoIdentificacion to set
	*/
	public void setTipoIdentificacionEnum(TipoIdentificacionEnum[] tipoIdentificacionEnum) {
		this.tipoIdentificacionEnum = tipoIdentificacionEnum;
	}
}

