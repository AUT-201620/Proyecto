package services;

import entities.Pensionado;
import persistence.PensionadoPersistence;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import java.util.List;

/**
 * @author am.osorio
 * Servicios CRUD de Pensionado
 */
@ManagedBean
public class PensionadoServices implements IPensionadoServices {

	private PensionadoPersistence persistance;
	
	@Inject
    private EntityManager etm;

	/**
	 * Constructor  PensionadoServices
	 */
	public PensionadoServices() {
		persistance = new PensionadoPersistence();
	}
	
	/**
	 *
	 * @return
	 */
	@Override
	public List<Pensionado> getAll() {
		List<Pensionado> pensionadoList = persistance.getAll();
		return pensionadoList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Pensionado get(Long id) {
		Pensionado pensionado = persistance.get(id);
		return pensionado;
	}
	
	/**
	 * 
	 * @param pensionado
	 * @return
	 */
	@Override
	public Pensionado create(Pensionado pensionado) {
		return persistance.create(pensionado);
	}
	
	/**
	 * 
	 * @param pensionado
	 * @return
	 */
	@Override
	public Pensionado update(Pensionado pensionado) {
		return persistance.update(pensionado);
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