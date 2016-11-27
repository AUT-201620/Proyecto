package services;

import entities.*;
import persistence.*;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import java.util.*;

/**
 * @author am.osorio
 * Servicios CRUD de Novedad
 */
@ManagedBean
public class NovedadServices implements INovedadServices {

	private NovedadPersistence persistance;

	/**
	 * Constructor  NovedadServices
	 */
	public NovedadServices() {
		persistance = new NovedadPersistence();
	}
	
	/**
	 *
	 * @return
	 */
	@Override
	public List<Novedad> findAll() {
		List<Novedad> novedadList = persistance.findAll();
		return novedadList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Novedad find(Long id) {
		Novedad novedad = persistance.find(id);
		return novedad;
	}
	
	/**
	 * 
	 * @param novedad
	 * @return
	 */
	@Override
	public Novedad create(Novedad novedad) {
		return persistance.create(novedad);
	}
	
	/**
	 * 
	 * @param novedad
	 * @return
	 */
	@Override
	public Novedad update(Novedad novedad) {
		return persistance.update(novedad);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public void delete(Long id) {
		persistance.delete(id);
	}
	
	 @Override
	 public List<Novedad> findByPensionadoId(Long pensionadoId) {
    	List<Novedad> novedadList = persistance.findByPensionadoId(pensionadoId);
    	return novedadList;        
	    }
    
    @Override
    public List<Novedad> findByPensionadoAll(Pensionado pensionado) {
    	List<Novedad> novedadList = persistance.findByPensionadoAll(pensionado);
    	return novedadList;        

    }
 
}