package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import entities.TipoPensionado;
import entities.TipoPension;
import entities.TipoPagadorPension;

/**
 * @author am.osorio
 * Servicios de Persistencia para Validaciones
 */
public class ValidacionesPersistence {
	
	/**
	 *
	 * @return
	 */
	public List<TipoPensionado> getAllTipoPensionado(){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPensionado> tipoPensionado = (List<TipoPensionado>)em.createNamedQuery("TipoPensionado.getTipoPensionados").getResultList();
		em.close();		
    	return tipoPensionado;
    }
	/**
	 *
	 * @return
	 */
	public List<TipoPension> getAllTipoPension(){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPension> tipoPension = (List<TipoPension>)em.createNamedQuery("TipoPension.getTipoPensions").getResultList();
		em.close();		
    	return tipoPension;
    }
	/**
	 *
	 * @return
	 */
	public List<TipoPagadorPension> getAllTipoPagadorPension(){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPagadorPension> tipoPagadorPension = (List<TipoPagadorPension>)em.createNamedQuery("TipoPagadorPension.getTipoPagadorPensions").getResultList();
		em.close();		
    	return tipoPagadorPension;
    }
}
