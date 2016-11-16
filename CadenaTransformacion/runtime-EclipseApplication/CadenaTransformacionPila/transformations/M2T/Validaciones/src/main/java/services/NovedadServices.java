package services;

import entities.Novedad;
import persistence.NovedadPersistence;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.List;

/**
 * @author am.osorio
 * Servicios CRUD de Novedad
 */
@ManagedBean
public class NovedadServices implements INovedadServices {

	private NovedadPersistence persistance;
	
	@Inject
    private EntityManager etm;

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
	public List<Novedad> getAll() {
		List<Novedad> novedadList = persistance.getAll();
		return novedadList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Novedad get(Long id) {
		Novedad novedad = persistance.get(id);
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
}