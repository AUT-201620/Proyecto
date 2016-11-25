package web.beans;

import entities.Pensionado;
import org.primefaces.context.RequestContext;

import services.IPagosServices;
import services.PagosServices;
import services.PensionadoServices;
import services.IPensionadoServices;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Backing Bean Payments CRUD
 *
 */

@ManagedBean
@SessionScoped
public class PagosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private IPensionadoServices services;
	private IPagosServices servicesPagos;
	private Long pensionadoId;
	private float pagoSalud;
	private float pagoPension;
	private float pagoRiesgo;
	private float valorPorPagar;
	private Pensionado pensionado=new Pensionado();

	public PagosBean() {
		services = new PensionadoServices();
		servicesPagos = new PagosServices();

	}

	public void findPensionadoById(Long idEnt){
		pensionado=new Pensionado();
		pensionado=services.find(idEnt);
		calculoPagoTotal();
	}

	public void calculoPagoTotal() {		
		pagoSalud = servicesPagos.pagoSalud(pensionado);	
		pagoPension =  servicesPagos.pagoPension(pensionado);
		pagoRiesgo =  servicesPagos.pagoRiesgos(pensionado);	
		valorPorPagar = pagoSalud + pagoRiesgo + pagoPension;
	}

	public void showMessagePago() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Pago exitoso", "Su pago fue realizado por los siguientes conceptos Salud: "+pagoSalud+" Pension: "+pagoPension+" Riesgos: "+pagoRiesgo+" Valor Total: "+valorPorPagar);
		RequestContext.getCurrentInstance().showMessageInDialog(message);
	}


	public Pensionado getPensionado() {
		return pensionado;
	}

	public void setPensionado(Pensionado pensionado) {
		this.pensionado = pensionado;
	}


	public float getValorPorPagar() {
		return valorPorPagar;
	}

	public void setValorPorPagar(float valorPorPagar) {
		this.valorPorPagar = valorPorPagar;
	}

	public Long getPensionadoId() {
		return pensionadoId;
	}

	public void setPensionadoId(Long pensionadoId) {
		this.pensionadoId = pensionadoId;
	}

	public float getPagoPension() {
		return pagoPension;
	}

	public void setPagoPension(float pagoPension) {
		this.pagoPension = pagoPension;
	}
	
	public float getPagoSalud() {
		return pagoSalud;
	}

	public void setPagoSalud(float pagoSalud) {
		this.pagoSalud = pagoSalud;
	}
	
	public float getPagoRiesgo() {
		return pagoRiesgo;
	}

	public void setPagoRiesgo(float pagoRiesgo) {
		this.pagoRiesgo = pagoRiesgo;
	}

}
