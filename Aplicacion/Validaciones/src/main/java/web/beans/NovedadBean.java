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
* Backing Bean para la pantalla Novedad
*
*/

@ManagedBean
@SessionScoped
public class NovedadBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Novedad> novedadList = new ArrayList<Novedad>();
	private INovedadServices services;
	private IPensionadoServices servicesPensionado;
	private Pensionado pensionado;	
	private Novedad novedad;
	private Long identificador;
	private Boolean buttonCrud;
	private TipoNovedadEnum [] tipoNovedadEnum;
	
	/**
	* Constructor de NovedadBean
	*/
	public NovedadBean() {
		services = new NovedadServices();
		novedad = new Novedad();
		buttonCrud = Boolean.TRUE;
		servicesPensionado = new PensionadoServices();
	}
	
	
	public void findByPensionado(Long idPensionado){
		pensionado = new Pensionado();
		pensionado =servicesPensionado.find(idPensionado);
		this.novedadList = services.findByPensionadoAll(pensionado);
	}
	public void crear() {
		novedad.setPensionado(pensionado);
		services.create(this.novedad);
		this.novedadList = services.findByPensionadoAll(pensionado);
	}
	
	public void delete() {
		services.delete(this.identificador);
		this.novedadList = services.findByPensionadoAll(pensionado);
	}
	
	public void ver() {
		this.novedad = services.find(this.identificador);
		buttonCrud = Boolean.FALSE;
	}
	
	
	public void editar() {
		this.novedad = services.update(this.novedad);
		this.novedadList = services.findAll();
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
	* @return the pensionado
	*/
	public Pensionado getPensionado() {
		return pensionado;
	}
	/**
	* @param pensionadothe pensionadoto set
	*/
	public void setPensionado(Pensionado pensionado ) {
		this.pensionado=pensionado;
	}
	/**
	* @return thetipoNovedad
	*/ 
	public TipoNovedadEnum[] getTipoNovedadEnum() {
		return TipoNovedadEnum.values();
	}
	/**
	* @param tipoNovedad the tipoNovedad to set
	*/
	public void setTipoNovedadEnum(TipoNovedadEnum[] tipoNovedadEnum) {
		this.tipoNovedadEnum = tipoNovedadEnum;
	}
}

