package services;

import java.util.List;

import javax.inject.Inject;
import persistence.*;
import entities.*;


/**
 * @author am.osorio
 * Servicios de Validaciones
 */
public class ValidacionesServices implements IValidacionesServices {

private ValidacionesPersistence persistance;
	    
	/**
	 * Constructor ValidacionesServices
	 */
	public ValidacionesServices(){
		persistance = new ValidacionesPersistence();
	}
	@Override
	public List<TipoPagadorPension> getTipoPagadorPensiones() {
		List<TipoPagadorPension> tipoPagadorPensiones = persistance.findTipoPagadorPensiones();
		return tipoPagadorPensiones;
	}
	@Override
	public List<TipoPagadorPension> getByTipoPensionTipoPensionado(Long idTipoPension, Long idTipoPensionado) {
		List<TipoPagadorPension> tipoPagadorPensiones = persistance.findByTipoPensionTipoPensionado(idTipoPension, idTipoPensionado);
		return tipoPagadorPensiones;
	}
	@Override
	public List<TipoPension> getTipoPensiones() {
		List<TipoPension> tipoPensiones = persistance.findTipoPensiones();
		return tipoPensiones;
	}
	@Override
	public List<TipoPensionado> getTipoPensionados() {
		List<TipoPensionado> tipoPensionados = persistance.findTipoPensionados();
		return tipoPensionados;
	}
	@Override
	public List<TipoPensionado> getByTipoPension(Long idTipoPension) {
		List<TipoPensionado> tipoPensionados = persistance.findByTipoPension(idTipoPension);
		return tipoPensionados;
	}
}

