package web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.SuperEntidad;
import services.SuperEntidadServices;
import services.iSuperEntidadServices;

/**
 * Backing Bean SuperEntity CRUD
 *
 */

@ManagedBean
@ViewScoped
public class SuperEntidadBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private iSuperEntidadServices services;
	private SuperEntidad superEntidad;
	private List<SuperEntidad> superEntidadList = new ArrayList<SuperEntidad>();
	private Long identificador;
	private Boolean buttonCrud;

	public SuperEntidadBean() {
		services = new SuperEntidadServices();
		superEntidad = new SuperEntidad();
		buttonCrud = Boolean.TRUE;
	}

	@PostConstruct
	public void init() {
		this.superEntidadList = services.findAll();
	}

	public void crear() {
		services.create(this.superEntidad);
		this.superEntidadList = services.findAll();
	}

	public void delete() {
		services.delete(this.identificador);
		this.superEntidadList = services.findAll();
	}

	public void ver() {
		this.superEntidad = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
	}
	
	public void editar() {
		this.superEntidad = services.update(this.superEntidad);
		this.superEntidadList = services.findAll();
	}
	
	public void clearSuperEntidad(){
		this.superEntidad= new SuperEntidad();
		buttonCrud = Boolean.TRUE;
	}
	/**
	 * @return the entityList
	 */
	public List<SuperEntidad> getSuperEntidadList() {
		return superEntidadList;
	}

	/**
	 * @param entityList
	 *            the entityList to set
	 */
	public void setSuperEntidadList(List<SuperEntidad> superEntidadList) {
		this.superEntidadList = superEntidadList;
	}

	/**
	 * @return the superEntidad
	 */
	public SuperEntidad getSuperEntidad() {
		if (superEntidad == null) {
			superEntidad = new SuperEntidad();
		}
		return superEntidad;
	}

	/**
	 * @param superEntidad
	 *            the superEntidad to set
	 */
	public void setSuperEntidad(SuperEntidad superEntidad) {
		this.superEntidad = superEntidad;
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

}
