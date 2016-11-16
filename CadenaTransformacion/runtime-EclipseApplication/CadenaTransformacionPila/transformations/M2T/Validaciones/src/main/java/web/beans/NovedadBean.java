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

/**
 * Backing Bean para la pantalla Novedad
 *
 */

@ManagedBean
@ViewScoped
public class NovedadBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Novedad> novedadList = new ArrayList<Novedad>();
	private INovedadServices services;
	private IValidacionesServices validacionesServices;
	private Novedad novedad;
	private Long identificador;
	private Boolean buttonCrud;
	private TipoDocumento [] tiposDocumento;
	

	/**
	 * Constructor de NovedadBean
	 */
	public NovedadBean() {
		services = new NovedadServices();
		validacionesServices = new ValidacionesServices();
		novedad = new Novedad();
		buttonCrud = Boolean.TRUE;
	}
	
	
	/**
	 * 
	 */
	@PostConstruct
	public void init() {
		this.novedadList = services.getAll();
	}

	public void crear() {
		services.create(this.novedad);
		this.novedadList = services.getAll();
	}

	public void delete() {
		services.delete(this.identificador);
		this.novedadList = services.getAll();
	}

	public void ver() {
		this.novedad = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
	}
	
	public void editar() {
		this.novedad = services.update(this.novedad);
		this.novedadList = services.getAll();
	}

	public void clearNovedad() {
		this.novedad = new Novedad();
		buttonCrud = Boolean.TRUE;
	}

	
	/**
	 * @return the novedadList
	 */
	public List<Novedad> getNovedadList() {
		return novedadList;
	}

	/**
	 * @param novedadList
	 * the novedadList to set
	 */
	public void setNovedadList(List<Novedad> novedadList) {
		this.novedadList = novedadList;
	}

	/**
	 * @return the novedad
	 */
	public Novedad getNovedad() {
		if (novedad == null) {
			novedad = new Novedad();
		}
		return novedad;
	}

	/**
	 * @param novedad
	 * the novedad to set
	 */
	public void setNovedad(Novedad novedad) {
		this.novedad = novedad;
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
