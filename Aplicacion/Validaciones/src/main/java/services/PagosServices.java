/**
 * 
 */
package services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import entities.Novedad;
import entities.Pensionado;

/**
 * @author am.osorio
 *
 */
@ManagedBean
public class PagosServices implements IPagosServices {

	private INovedadServices servicesNovedad;
	
	public PagosServices() {
		servicesNovedad= new NovedadServices();
	}


	@Override
	public float calculoPagoSalud(Pensionado pensionado) {
		float pagoSalud;
		List<Novedad> novedadesList = new ArrayList<Novedad>();
		
		if (pensionado.getViveExterior() == true
				&& pensionado.getGrupoFamiliar() == false) {
			pagoSalud = pensionado.getMontoPension() * 0;

		} else {
			novedadesList = servicesNovedad.findByPensionadoId(pensionado.getId());

			if (novedadesList.isEmpty()) {
				pagoSalud = (pensionado.getMontoPension()* 12) /100 ; // el valor 12, 0 y demas debe ser
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
					pagoSalud = pensionado.getMontoPension()*16 / 100;
				} else if (totalDiasNovedad <= 7 && totalDiasNovedad > 3) {
					pagoSalud = pensionado.getMontoPension() *12 /100;

				} else {
					pagoSalud = pensionado.getMontoPension() * 0;
				}
			}
		}
		return pagoSalud;
	}


	@Override
	public float calculoPagoPension(Pensionado pensionado) {
		float pagoPension;
		List<Novedad> novedadesList = new ArrayList<Novedad>();
		if (pensionado.getCti() == true) {
			pagoPension = (float) (pensionado.getMontoPension() * 0.31);
		}
		else if(pensionado.getAltoRiesgo() == true){
			pagoPension = (float) (pensionado.getMontoPension() *0.26);
		}
		else if (pensionado.getCongresista()==true){
			pagoPension=(float) (pensionado.getMontoPension() * 0.255);			
		}
		else if (pensionado.getAviador()==true){
			pagoPension=(float) (pensionado.getMontoPension() * 0.21);			
		}
		else { novedadesList = servicesNovedad.findByPensionadoId(pensionado.getId());
		
			if (novedadesList.isEmpty()){
				pagoPension=(float) (pensionado.getMontoPension() *0.16);			
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
					pagoPension= (float) (pensionado.getMontoPension() * 0.16);
				} else if (totalDiasNovedad <= 7 && totalDiasNovedad > 3) {
					pagoPension = (float) (pensionado.getMontoPension() * 0.12);

				} else {
					pagoPension = pensionado.getMontoPension() * 0;
				}
			}
			
		}
		
		return pagoPension;
	}


	@Override
	public float calculoPagoRiesgo(Pensionado pensionado) {
		// TODO Auto-generated method stub
		return 0;
	}

}