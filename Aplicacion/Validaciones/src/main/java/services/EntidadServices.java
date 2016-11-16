/**
 * 
 */
package services;

import entities.Entidad;
import persistence.EntidadPersistence;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import java.util.List;

/**
 * @author am.osorio
 *
 */
@ManagedBean
public class EntidadServices implements iEntidadServices {

	private EntidadPersistence persistance;
	
	@Inject
    private EntityManager etm;

	
	public EntidadServices() {
		persistance = new EntidadPersistence();
	}
	
	@Override
	public List<Entidad> findAll() {
		List<Entidad> entidadList = persistance.findAll();
		return entidadList;
	}
	
	@Override
	public Entidad find(Long id) {
		Entidad entidad = persistance.find(id);
		return entidad;
	}
	
	
	@Override
	public Entidad create(Entidad entidad) {
		return persistance.create(entidad);
	}
	@Override
	public Entidad update(Entidad entidad) {
		return persistance.update(entidad);
	}
	@Override
	public void delete(Long id) {
		persistance.delete(id);
	}
}