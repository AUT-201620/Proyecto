package web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import javax.faces.event.ValueChangeEvent;

import entities.*;
import services.*;
import enumerators.*;

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
	private TipoIdentificacionEnum [] tipoIdentificacionEnum;
	private List<TipoPensionado> tipoPensionado;
	private List<TipoPagadorPension> tipoPagadorPension;
	private List<TipoPension> tipoPension;
	
	/**
	* Constructor de PensionadoBean
	*/
	public PensionadoBean() {
		services = new PensionadoServices();
		pensionado = new Pensionado();
		buttonCrud = Boolean.TRUE;
		validacionesServices = new ValidacionesServices();
		pensionado.setTipoPensionado(new TipoPensionado());
		pensionado.setTipoPagadorPension(new TipoPagadorPension());
		pensionado.setTipoPension(new TipoPension());
	}
	
	/**
	* 
	*/
	@PostConstruct
	public void init() {
		this.pensionadoList = services.findAll();
	}
	
	public void crear() {
		services.create(this.pensionado);
		this.pensionadoList = services.findAll();
	}
	
	public void delete() {
		services.delete(this.identificador);
		this.pensionadoList = services.findAll();
	}
	
	public void ver() {
		this.pensionado = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
		getListTipos();
	}
	
	
	public void editar() {
		this.pensionado = services.update(this.pensionado);
		this.pensionadoList = services.findAll();
	}
	
	public void clearPensionado() {
		this.pensionado = new Pensionado();
		buttonCrud = Boolean.TRUE;
		pensionado.setTipoPensionado(new TipoPensionado());
		pensionado.setTipoPagadorPension(new TipoPagadorPension());
		pensionado.setTipoPension(new TipoPension());
		this.tipoPensionado = null;
		this.tipoPagadorPension = null;
	}
	public void getListTipos() {
		if(pensionado.getTipoPension() != null && pensionado.getTipoPension().getId()>0){
			this.setTipoPensionado(validacionesServices.getByTipoPension(pensionado.getTipoPension().getId()));
		} else{
			this.setTipoPensionado(new ArrayList<TipoPensionado>());
		}if(pensionado.getTipoPension() != null && pensionado.getTipoPension().getId()>0 && pensionado.getTipoPensionado().getId() != null && pensionado.getTipoPensionado().getId() >0){
			this.setTipoPagadorPension(validacionesServices.getByTipoPensionTipoPensionado(pensionado.getTipoPension().getId(),pensionado.getTipoPensionado().getId()));
		}
		else{
			this.setTipoPagadorPension(new ArrayList<TipoPagadorPension>());
		}
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
	/**
	* @return the tipoPensionado
	*/ 
	public List<TipoPensionado> getTipoPensionado() {
		return tipoPensionado;
	}
	/**
	* @param tipoPensionado the tipoPensionado to set
	*/
	public void setTipoPensionado(List<TipoPensionado> tipoPensionado) {
		this.tipoPensionado = tipoPensionado;
	}
	/**
	* @return the tipoPagadorPension
	*/ 
	public List<TipoPagadorPension> getTipoPagadorPension() {
		return tipoPagadorPension;
	}
	/**
	* @param tipoPagadorPension the tipoPagadorPension to set
	*/
	public void setTipoPagadorPension(List<TipoPagadorPension> tipoPagadorPension) {
		this.tipoPagadorPension = tipoPagadorPension;
	}
	/**
	* @return the tipoPension
	*/ 
	public List<TipoPension> getTipoPension() {
		this.tipoPension= validacionesServices.getTipoPensiones();
		return tipoPension;
	}
	/**
	* @param tipoPension the tipoPension to set
	*/
	public void setTipoPension(List<TipoPension> tipoPension) {
		this.tipoPension = tipoPension;
	}
}

