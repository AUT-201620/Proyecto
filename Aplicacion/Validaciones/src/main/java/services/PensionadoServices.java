/**
 * 
 */
package services;

import entities.Pensionado;
import persistence.PensionadoPersistence;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.List;

/**
 * @author am.osorio
 *
 */
@ManagedBean
public class PensionadoServices implements IPensionadoServices {

	private PensionadoPersistence persistance;
	
	@Inject
    private EntityManager etm;

	
	public PensionadoServices() {
		persistance = new PensionadoPersistence();
	}
	
	@Override
	public List<Pensionado> findAll() {
		List<Pensionado> entidadList = persistance.findAll();
		return entidadList;
	}
	
	@Override
	public Pensionado find(Long id) {
		Pensionado entidad = persistance.find(id);
		return entidad;
	}
	
	
	@Override
	public Pensionado create(Pensionado entidad) {
		return persistance.create(entidad);
	}
	@Override
	public Pensionado update(Pensionado entidad) {
		return persistance.update(entidad);
	}
	@Override
	public void delete(Long id) {
		persistance.delete(id);
	}
}