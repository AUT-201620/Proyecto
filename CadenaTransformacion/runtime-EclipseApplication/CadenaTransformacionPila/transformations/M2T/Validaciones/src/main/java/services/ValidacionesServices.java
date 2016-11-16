package services;

import java.util.List;

import javax.inject.Inject;
import persistence.*;

import entities.TipoPagadorPension;
import entities.TipoPensionado;
import entities.TipoPension;

/**
 * @author am.osorio
 * Servicios de Validaciones
 */
public class ValidacionesServices implements IValidacionesServices {

private ValidacionesPersistence persistance;
	
	@Inject
    private EntityManager etm;
    
	/**
	 * Constructor ValidacionesServices
	 */
	public ValidacionesServices(){
		persistance = new ValidacionesPersistence();
	}
	
	/**
	 *
	 * @return
	 */
	public List<TipoPagadorPension> getAllTipoPagadorPension(){
		List<TipoPagadorPension> tipoPagadorPension = persistance.getAllTipoPagadorPension();
		return tipoPagadorPension;
	}
	/**
	 *
	 * @return
	 */
	public List<TipoPensionado> getAllTipoPensionado(){
		List<TipoPensionado> tipoPensionado = persistance.getAllTipoPensionado();
		return tipoPensionado;
	}
	/**
	 *
	 * @return
	 */
	public List<TipoPension> getAllTipoPension(){
		List<TipoPension> tipoPension = persistance.getAllTipoPension();
		return tipoPension;
	}
	

}
