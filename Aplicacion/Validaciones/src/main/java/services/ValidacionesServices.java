package services;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import entities.*;
import persistence.ValidacionesPersistence;

public class ValidacionesServices implements IValidacionesServices {

private ValidacionesPersistence persistance;
	
	@Inject
    private EntityManager etm;
	
	public ValidacionesServices(){
		persistance = new ValidacionesPersistence();
	}
	public List<TipoPension> getTipoPension(){
		List<TipoPension> tipos = persistance.findAll();
		return tipos;
		
	}
	
	public List<TipoPensionado> getTipoPensionado(Long idPension){
		List<TipoPensionado> tipos = persistance.findByPension(idPension);
		return tipos;
	}
	
	public List<TipoPagador> getTipoPagador(Long idPension,Long idPensionado){
		List<TipoPagador> tipos = persistance.findByPensioPensionado(idPension,idPensionado);
		return tipos;
	}
}
