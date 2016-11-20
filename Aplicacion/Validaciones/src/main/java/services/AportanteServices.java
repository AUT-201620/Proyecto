/**
 * 
 */
package services;

import java.util.List;

import javax.annotation.ManagedBean;

import entities.Aportante;
import persistence.AportantePersistence;

/**
 * @author am.osorio
 *
 */
@ManagedBean
public class AportanteServices implements IAportanteServices {
	private AportantePersistence persistance;


	public AportanteServices() {
		persistance = new AportantePersistence();
	}
	
	@Override
	public List<Aportante> findAll() {
		List<Aportante> entidadList = persistance.findAll();
		return entidadList;
	}
	
	@Override
	public Aportante find(Long id) {
		Aportante superEntidad = persistance.find(id);
		return superEntidad;
	}
	
	@Override
	public Aportante create(Aportante superEntidad) {
		return persistance.create(superEntidad);
	}
	@Override
	public Aportante update(Aportante superEntidad) {
		return persistance.update(superEntidad);
	}
	@Override
	public void delete(Long id) {
		persistance.delete(id);
	}
}