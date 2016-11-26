package web.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entities.Pensionado;
import entities.TipoPagadorPension;
import entities.TipoPension;
import entities.TipoPensionado;
import enumerators.TipoIdentificacionEnum;
import services.PensionadoServices;
import services.ValidacionesServices;
import services.IPensionadoServices;
import services.IValidacionesServices;

/**
 * Backing Bean Entity CRUD
 *
 */

@ManagedBean
@ViewScoped
public class PensionadoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Pensionado> pensionadoList = new ArrayList<Pensionado>();
	private IPensionadoServices services;
	private IValidacionesServices validacionesservices;
	private Pensionado pensionado;
	private Long identificador;
	private Boolean buttonCrud;
	private TipoIdentificacionEnum [] tipoIdentificacionEnum;
	private List<TipoPension> tipoPension;
	private List<TipoPensionado> tipoPensionado;
	private List<TipoPagadorPension> tipoPagadorPension;

	/**
	 * 
	 */
	public PensionadoBean() {
		services = new PensionadoServices();
		validacionesservices = new ValidacionesServices();
		pensionado = new Pensionado();
		pensionado.setTipoPension(new TipoPension());
		pensionado.setTipoPensionado(new TipoPensionado());
		pensionado.setTipoPagadorPension(new TipoPagadorPension());
		buttonCrud = Boolean.TRUE;
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

	public void novedades()
	{

	}

	public void clearPensionado() {
		this.pensionado = new Pensionado();
		pensionado.setTipoPension(new TipoPension());
		pensionado.setTipoPensionado(new TipoPensionado());
		pensionado.setTipoPagadorPension(new TipoPagadorPension());
		this.tipoPensionado = null;
		this.tipoPagadorPension = null;
		buttonCrud = Boolean.TRUE;
	}

	
	public void getListTipos() {
        if(pensionado.getTipoPension() != null && pensionado.getTipoPension().getId()>0){
			this.setTipoPensionado(validacionesservices.getTipoPensionado(pensionado.getTipoPension().getId()));
		} else{
			this.setTipoPensionado(new ArrayList<TipoPensionado>());
		}
        if(pensionado.getTipoPension() != null && pensionado.getTipoPension().getId()>0 
        		&& pensionado.getTipoPensionado().getId() != null && pensionado.getTipoPensionado().getId() >0){
			this.setTipoPagadorPension(validacionesservices.getTipoPagadorPension(pensionado.getTipoPension().getId(),pensionado.getTipoPensionado().getId()));
		}
        else{
			this.setTipoPagadorPension(new ArrayList<TipoPagadorPension>());
		}
    }
	
	/**
	 * @return the entityList
	 */
	public List<Pensionado> getPensionadoList() {
		return pensionadoList;
	}

	/**
	 * @param entityList
	 *            the entityList to set
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
	 *            the pensionado to set
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
	public TipoIdentificacionEnum[] getTipoIdentificacionEnum() {
		return TipoIdentificacionEnum.values();
	}

	/**
	 * @param tiposDocumento the tiposDocumento to set
	 */
	public void setTipoIdentificacionEnum(TipoIdentificacionEnum[] tipoIdentificacionEnum) {
		this.tipoIdentificacionEnum = tipoIdentificacionEnum;
	}

	/**
	 * @return the tipoPension
	 */
	public List<TipoPension> getTipoPension() {
		this.tipoPension= validacionesservices.getTipoPension();
		return tipoPension;
	}

	/**
	 * @param tipoPension the tipoPension to set
	 */
	public void setTipoPension(List<TipoPension> tipoPension) {
		this.tipoPension = tipoPension;
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
	 * @return the tipoPagador
	 */
	public List<TipoPagadorPension> getTipoPagadorPension() {
		return tipoPagadorPension;
	}

	/**
	 * @param tipoPagador the tipoPagador to set
	 */
	public void setTipoPagadorPension(List<TipoPagadorPension> tipoPagador) {
		this.tipoPagadorPension = tipoPagador;
	}

}
