package services;

import entities.*;
import persistence.*;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import java.util.*;

/**
 * @author am.osorio
 * Servicios CRUD de Aportante
 */
@ManagedBean
public class AportanteServices implements IAportanteServices {

	private AportantePersistence persistance;

	/**
	 * Constructor  AportanteServices
	 */
	public AportanteServices() {
		persistance = new AportantePersistence();
	}
	
	/**
	 *
	 * @return
	 */
	@Override
	public List<Aportante> findAll() {
		List<Aportante> aportanteList = persistance.findAll();
		return aportanteList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Aportante find(Long id) {
		Aportante aportante = persistance.find(id);
		return aportante;
	}
	
	/**
	 * 
	 * @param aportante
	 * @return
	 */
	@Override
	public Aportante create(Aportante aportante) {
		return persistance.create(aportante);
	}
	
	/**
	 * 
	 * @param aportante
	 * @return
	 */
	@Override
	public Aportante update(Aportante aportante) {
		return persistance.update(aportante);
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
}