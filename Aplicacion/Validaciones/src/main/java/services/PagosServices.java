/**
 * 
 */
package services;

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
	public float pagoRiesgos(Pensionado pensionado) {
		float tarifa = 0;
		if (pensionado.getActividadEconomica() == 8022) {
			tarifa = (float) 0.00522;
		}
		else if (pensionado.getActividadEconomica() == 8513) {
			tarifa = (float) 0.00522;
		}
		else if (pensionado.getActividadEconomica() == 117) {
			tarifa = (float) 0.01044;
		}
		else if (pensionado.getActividadEconomica() == 1541) {
			tarifa = (float) 0.01044;
		}
		else if (pensionado.getActividadEconomica() == 1592) {
			tarifa = (float) 0.02436;
		}
		else if (pensionado.getActividadEconomica() == 1743) {
			tarifa = (float) 0.02436;
		}
		else if (pensionado.getActividadEconomica() == 2101) {
			tarifa = (float) 0.0435;
		}
		else if (pensionado.getActividadEconomica() == 2322) {
			tarifa = (float) 0.04345;
		}
		else if (pensionado.getActividadEconomica() == 1431) {
			tarifa = (float) 0.0696;
		}
		else if (pensionado.getActividadEconomica() == 2321) {
			tarifa = (float) 0.0696;
		}
		return pensionado.getMontoPension() * tarifa;
		
	}
	
	@Override
	public float pagoPension(Pensionado pensionado) {
		List<Novedad> novedadesList = servicesNovedad.findByPensionadoId(pensionado.getId());
		
		float tarifa = 0;
		if (pensionado.getAltoRiesgo()) {
			tarifa = (float) 1.26;
		}
		else if (pensionado.getCongresista()) {
			tarifa = (float) 1.255;
		}
		else if (pensionado.getCti()) {
			tarifa = (float) 1.35;
		}
		else if (pensionado.getAviador()) {
			tarifa = (float) 1.21;
		}
		else {
			if (!novedadesList.isEmpty()) {
				Novedad ultimaNovedad = novedadesList.get(novedadesList.size()-1);
				long dias = ultimaNovedad.getFechaFin().getTime() - ultimaNovedad.getFechaInicio().getTime();
				if (dias < 4) {
					tarifa = 0;
				}
				else if (dias < 8) {
					tarifa = (float) 1.12;
				}
				else {
					tarifa = (float) 1.16;
				}
			}
			else {
				tarifa = (float) 1.16;
			}
		}
		return pensionado.getMontoPension() * tarifa;
		
	}
	
	@Override
	public float pagoSalud(Pensionado pensionado) {
		float tarifa = (float) 1.12;
		if (pensionado.getViveExterior() && pensionado.getNoTieneGrupoFamiliar()) {
			tarifa = (float) 0;
		}
		else if (pensionado.getCti()) {
			tarifa = (float) 0;
		}
		return pensionado.getMontoPension() * tarifa;
		
	}

}