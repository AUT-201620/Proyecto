package services;

import entities.*;
import persistence.*;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import java.util.*;

/**
 * @author am.osorio
 * Servicios CRUD de Pensionado
 */
@ManagedBean
public class PensionadoServices implements IPensionadoServices {

	private PensionadoPersistence persistance;

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
	public List<Pensionado> findAll() {
		List<Pensionado> pensionadoList = persistance.findAll();
		return pensionadoList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Pensionado find(Long id) {
		Pensionado pensionado = persistance.find(id);
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