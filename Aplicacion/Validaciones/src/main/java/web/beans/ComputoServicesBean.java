package web.beans;

import entities.Pensionado;
import org.primefaces.context.RequestContext;

import services.IComputoServices;
import services.ComputoServices;
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
public class ComputoServicesBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private IPensionadoServices services;
	private IComputoServices servicesPagos;
	private Long pensionadoId;
	private double pagoSalud;
	private double pagoPension;
	private double pagoRiesgo;
	private double valorPorPagar;
	private Pensionado pensionado=new Pensionado();

	public ComputoServicesBean() {
		services = new PensionadoServices();
		servicesPagos = new ComputoServices();

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


	public double getValorPorPagar() {
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

	public double getPagoPension() {
		return pagoPension;
	}

	public void setPagoPension(double pagoPension) {
		this.pagoPension = pagoPension;
	}
	
	public double getPagoSalud() {
		return pagoSalud;
	}

	public void setPagoSalud(double pagoSalud) {
		this.pagoSalud = pagoSalud;
	}
	
	public double getPagoRiesgo() {
		return pagoRiesgo;
	}

	public void setPagoRiesgo(double pagoRiesgo) {
		this.pagoRiesgo = pagoRiesgo;
	}

}
