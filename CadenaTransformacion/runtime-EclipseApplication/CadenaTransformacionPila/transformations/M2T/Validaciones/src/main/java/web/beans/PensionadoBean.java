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
 * Backing Bean para la pantalla Pensionado
 *
 */

@ManagedBean
@ViewScoped
public class PensionadoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Pensionado> pensionadoList = new ArrayList<Pensionado>();
	private IPensionadoServices services;
	private IValidacionesServices validacionesServices;
	private Pensionado pensionado;
	private Long identificador;
	private Boolean buttonCrud;
	private TipoDocumento [] tiposDocumento;
	

	/**
	 * Constructor de PensionadoBean
	 */
	public PensionadoBean() {
		services = new PensionadoServices();
		validacionesServices = new ValidacionesServices();
		pensionado = new Pensionado();
		buttonCrud = Boolean.TRUE;
	}
	
	
	/**
	 * 
	 */
	@PostConstruct
	public void init() {
		this.pensionadoList = services.getAll();
	}

	public void crear() {
		services.create(this.pensionado);
		this.pensionadoList = services.getAll();
	}

	public void delete() {
		services.delete(this.identificador);
		this.pensionadoList = services.getAll();
	}

	public void ver() {
		this.pensionado = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
	}
	
	public void editar() {
		this.pensionado = services.update(this.pensionado);
		this.pensionadoList = services.getAll();
	}

	public void clearPensionado() {
		this.pensionado = new Pensionado();
		buttonCrud = Boolean.TRUE;
	}

	
	/**
	 * @return the pensionadoList
	 */
	public List<Pensionado> getPensionadoList() {
		return pensionadoList;
	}

	/**
	 * @param pensionadoList
	 * the pensionadoList to set
	 */
	public void setPensionadoList(List<Pensionado> pensionadoList) {
		this.pensionadoList = pensionadoList;
	}

	/**
	 * @return the pensionado
	 */
	public Pensionado getPensionado() {
		if (pensionado == null) {
			pensionado = new Pensionado();
		}
		return pensionado;
	}

	/**
	 * @param pensionado
	 * the pensionado to set
	 */
	public void setPensionado(Pensionado pensionado) {
		this.pensionado = pensionado;
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
