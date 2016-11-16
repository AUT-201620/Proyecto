package services;

import entities.Aportante;
import persistence.AportantePersistence;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.List;

/**
 * @author am.osorio
 * Servicios CRUD de Aportante
 */
@ManagedBean
public class AportanteServices implements IAportanteServices {

	private AportantePersistence persistance;
	
	@Inject
    private EntityManager etm;

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
	public List<Aportante> getAll() {
		List<Aportante> aportanteList = persistance.getAll();
		return aportanteList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Aportante get(Long id) {
		Aportante aportante = persistance.get(id);
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