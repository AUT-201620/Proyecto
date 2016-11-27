package services;

import entities.Pensionado;
import entities.Novedad;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.List;

/**
* @author am.osorio
* Servicios de Computo
*/
@ManagedBean
public class ComputoServices implements IComputoServices{

	public double pagoPension(Pensionado pensionado) {
		double tarifa = 0;
		if (pensionado.getAltoRiesgo()) {
			tarifa = 1.26;
		}
		else if (pensionado.getCongresista()) {
			tarifa = 1.255;
		}
		else if (pensionado.getCti()) {
			tarifa = 1.35;
		}
		else if (pensionado.getAviador()) {
			tarifa = 1.21;
		}
		else {
			if (pensionado.tieneNovedades()) {
				Novedad ultimaNovedad = pensionado.ultimaNovedad();
				int dias = ultimaNovedad.diasEntreFechaFinInicio();
				if (dias < 4) {
					tarifa = 0;
				}
				else if (dias < 8) {
					tarifa = 1.12;
				}
				else {
					tarifa = 1.16;
				}
			}
			else {
				tarifa = 1.16;
			}
		}
		return pensionado.getMontoPension() * tarifa;
		
	}
	public double pagoSalud(Pensionado pensionado) {
		double tarifa = 1.12;
		if (pensionado.getViveExterior() && pensionado.getNoTieneGrupoFamiliar()) {
			tarifa = 0;
		}
		else if (pensionado.getCti()) {
			tarifa = 0;
		}
		return pensionado.getMontoPension() * tarifa;
		
	}
	public double pagoRiesgos(Pensionado pensionado) {
		double tarifa = 0;
		if (pensionado.getActividadEconomica() == 8022) {
			tarifa = 1.00522;
		}
		else if (pensionado.getActividadEconomica() == 8513) {
			tarifa = 1.00522;
		}
		else if (pensionado.getActividadEconomica() == 117) {
			tarifa = 1.01044;
		}
		else if (pensionado.getActividadEconomica() == 1541) {
			tarifa = 1.01044;
		}
		else if (pensionado.getActividadEconomica() == 1592) {
			tarifa = 1.02436;
		}
		else if (pensionado.getActividadEconomica() == 1743) {
			tarifa = 1.02436;
		}
		else if (pensionado.getActividadEconomica() == 2101) {
			tarifa = 1.0435;
		}
		else if (pensionado.getActividadEconomica() == 2322) {
			tarifa = 1.04345;
		}
		else if (pensionado.getActividadEconomica() == 1431) {
			tarifa = 1.0696;
		}
		else if (pensionado.getActividadEconomica() == 2321) {
			tarifa = 1.0696;
		}
		return pensionado.getMontoPension() * tarifa;
		
	}
	
}

