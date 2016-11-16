package web.beans;

import entities.Entidad;
import entities.Novedad;

import org.primefaces.context.RequestContext;

import services.EntidadServices;
import services.NovedadServices;
import services.iEntidadServices;
import services.iNovedadServices;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.ArrayList;

/**
 * Backing Bean Payments CRUD
 *
 */

@ManagedBean
@ViewScoped
public class PagosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Entidad> entidadList = new ArrayList<Entidad>();
	private Integer identificacion;
	private iEntidadServices services;
	private iNovedadServices servicesNovedad;
	private Long entidadId;
	private BigDecimal pagoSalud;
	private BigDecimal pagoPension;
	private List<Novedad> novedadesList = new ArrayList<Novedad>();;
	private BigDecimal valorPorPagar;
	private Entidad entidad=new Entidad();

	public PagosBean() {
		services = new EntidadServices();
		servicesNovedad = new NovedadServices();
		entidadId = (-1L);

	}

	@PostConstruct
	public void init() {
		this.entidadList = services.findAll();
	}
	
	public void findEntidadById(){
		entidad=services.find(entidadId);
		calculoPagoTotal();
	}

	public void calculoPagoTotal() {		
		calculoPagoSalud();	
		calculoPagoPension();
		valorPorPagar = pagoSalud.add(pagoPension);
		valorPorPagar =valorPorPagar.setScale(0,RoundingMode.HALF_DOWN);
	}

	public void calculoPagoSalud() {		
		if (entidad.getViveExterior() == true
				&& entidad.getGrupoFamiliar() == false) {
			pagoSalud = entidad.getIngresoBaseCotizacion().multiply(
					new BigDecimal(0));

		} else {
			novedadesList = servicesNovedad.findByEntidadId(entidad.getId());

			if (novedadesList.isEmpty()) {
				pagoSalud = entidad.getIngresoBaseCotizacion().multiply(
						new BigDecimal(12)).divide(new BigDecimal(100)); // el valor 12, 0 y demas debe ser
												// consultado de un entity a
												// crear luego, esto con el fin
												// que si el valor en el entity
												// cambio, el sistema lo asuma
												// de forma automatica.
			} else {
				Long diasNovedad = 0L;
				for (Novedad nov : novedadesList) {
					diasNovedad = diasNovedad
							+ (nov.getFechaFin().getTime() - nov
									.getFechaInicio().getTime());
				}
				Long totalDiasNovedad = diasNovedad / 86400000L;
				if (totalDiasNovedad > 7) {
					pagoSalud = entidad.getIngresoBaseCotizacion().multiply(
							new BigDecimal(16)).divide(new BigDecimal(100));
				} else if (totalDiasNovedad <= 7 && totalDiasNovedad > 3) {
					pagoSalud = entidad.getIngresoBaseCotizacion().multiply(
							new BigDecimal(12)).divide(new BigDecimal(100));

				} else {
					pagoSalud = entidad.getIngresoBaseCotizacion().multiply(
							new BigDecimal(0));
				}
			}
		}
		pagoSalud=pagoSalud.setScale(0,RoundingMode.HALF_DOWN);		
	}
	
	
	
	public void calculoPagoPension() {	
		
		if (entidad.getCti() == true) {
			pagoPension = entidad.getIngresoBaseCotizacion().multiply(
					new BigDecimal(0.31));
		}
		else if(entidad.getAltoRiesgo() == true){
			pagoPension = entidad.getIngresoBaseCotizacion().multiply(new BigDecimal(0.26));
		}
		else if (entidad.getCongresista()==true){
			pagoPension=entidad.getIngresoBaseCotizacion().multiply(new BigDecimal(0.255));			
		}
		else if (entidad.getAviador()==true){
			pagoPension=entidad.getIngresoBaseCotizacion().multiply(new BigDecimal(0.21));			
		}
		else { novedadesList = servicesNovedad.findByEntidadId(entidad.getId());
		
			if (novedadesList.isEmpty()){
				pagoPension=entidad.getIngresoBaseCotizacion().multiply(new BigDecimal(0.16));			
		}
			else{
				Long diasNovedad = 0L;
				for (Novedad nov : novedadesList) {
					diasNovedad = diasNovedad
							+ (nov.getFechaFin().getTime() - nov
									.getFechaInicio().getTime());
				}
				Long totalDiasNovedad = diasNovedad / 86400000L;
				if (totalDiasNovedad > 7) {
					pagoPension= entidad.getIngresoBaseCotizacion().multiply(
							new BigDecimal(0.16));
				} else if (totalDiasNovedad <= 7 && totalDiasNovedad > 3) {
					pagoPension = entidad.getIngresoBaseCotizacion().multiply(
							new BigDecimal(0.12));

				} else {
					pagoPension = entidad.getIngresoBaseCotizacion().multiply(
							new BigDecimal(0));
				}
			}
			
		}
		pagoPension=pagoPension.setScale(0,RoundingMode.HALF_DOWN);
	}

	public void showMessagePago() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Pago exitoso", "Su pago fue realizado por los siguientes conceptos Salud: "+pagoSalud+" Pension: "+pagoPension+" Riesgos: 0 Valor Total: "+valorPorPagar);
		RequestContext.getCurrentInstance().showMessageInDialog(message);
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public BigDecimal getPagoSalud() {
		return pagoSalud;
	}

	public void setPagoSalud(BigDecimal pagoSalud) {
		this.pagoSalud = pagoSalud;
	}

	public List<Novedad> getNovedadesList() {
		return novedadesList;
	}

	public void setNovedadesList(List<Novedad> novedadesList) {
		this.novedadesList = novedadesList;
	}

	public BigDecimal getValorPorPagar() {
		return valorPorPagar;
	}

	public void setValorPorPagar(BigDecimal valorPorPagar) {
		this.valorPorPagar = valorPorPagar;
	}

	public List<Entidad> getEntidadList() {
		return entidadList;
	}

	public void setEntidadList(List<Entidad> entidadList) {
		this.entidadList = entidadList;
	}

	public Long getEntidadId() {
		return entidadId;
	}

	public void setEntidadId(Long entidadId) {
		this.entidadId = entidadId;
	}

	public BigDecimal getPagoPension() {
		return pagoPension;
	}

	public void setPagoPension(BigDecimal pagoPension) {
		this.pagoPension = pagoPension;
	}

}
