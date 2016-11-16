package web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.Entidad;
import services.EntidadServices;
import services.iEntidadServices;

/**
 * Backing Bean Entity CRUD
 *
 */

@ManagedBean
@ViewScoped
public class EntidadBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Entidad> entidadList = new ArrayList<Entidad>();
	private EntidadServices services;
	private Entidad entidad;
	private Long identificador;
	private Boolean buttonCrud;

	/**
	 * 
	 */
	public EntidadBean() {
		services = new EntidadServices();
		entidad = new Entidad();
		buttonCrud = Boolean.TRUE;
	}

	/**
	 * 
	 */
	@PostConstruct
	public void init() {
		this.entidadList = services.findAll();
	}

	public void crear() {
		services.create(this.entidad);
		this.entidadList = services.findAll();
	}

	public void delete() {
		services.delete(this.identificador);
		this.entidadList = services.findAll();
	}

	public void ver() {
		this.entidad = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
	}
	
	public void editar() {
		this.entidad = services.update(this.entidad);
		this.entidadList = services.findAll();
	}

	public void clearEntidad() {
		this.entidad = new Entidad();
		buttonCrud = Boolean.TRUE;
	}

	/**
	 * @return the entityList
	 */
	public List<Entidad> getEntidadList() {
		return entidadList;
	}

	/**
	 * @param entityList
	 *            the entityList to set
	 */
	public void setEntidadList(List<Entidad> entidadList) {
		this.entidadList = entidadList;
	}

	/**
	 * @return the entidad
	 */
	public Entidad getEntidad() {
		if (entidad == null) {
			entidad = new Entidad();
		}
		return entidad;
	}

	/**
	 * @param entidad
	 *            the entidad to set
	 */
	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	/**
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
