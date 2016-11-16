/**
 * 
 */
package services;

import java.util.List;

import javax.annotation.ManagedBean;

import entities.SuperEntidad;
import persistence.SuperEntidadPersistence;

/**
 * @author am.osorio
 *
 */
@ManagedBean
public class SuperEntidadServices implements iSuperEntidadServices {
	private SuperEntidadPersistence persistance;


	public SuperEntidadServices() {
		persistance = new SuperEntidadPersistence();
	}
	
	@Override
	public List<SuperEntidad> findAll() {
		List<SuperEntidad> entidadList = persistance.findAll();
		return entidadList;
	}
	
	@Override
	public SuperEntidad find(Long id) {
		SuperEntidad superEntidad = persistance.find(id);
		return superEntidad;
	}
	
	@Override
	public SuperEntidad create(SuperEntidad superEntidad) {
		return persistance.create(superEntidad);
	}
	@Override
	public SuperEntidad update(SuperEntidad superEntidad) {
		return persistance.update(superEntidad);
	}
	@Override
	public void delete(Long id) {
		persistance.delete(id);
	}
}