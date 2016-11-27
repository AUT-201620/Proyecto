package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import entities.TipoPagadorPension;
import entities.TipoPensionado;
import entities.TipoPension;

/**
 * @author am.osorio
 * Servicios de Persistencia para Validaciones
 */
public class ValidacionesPersistence {
	

	public List<TipoPagadorPension> findTipoPagadorPensiones() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPagadorPension> tipoPagadorPensiones = (List<TipoPagadorPension>) em.createNamedQuery("TipoPagadorPension.getTipoPagadorPensiones").getResultList();
		em.close();		
    	return tipoPagadorPensiones;
	}

	public List<TipoPagadorPension> findByTipoPensionadoTipoPension(Long idTipoPensionado, Long idTipoPension) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPagadorPension> tipoPagadorPensiones = (List<TipoPagadorPension>) em.createNamedQuery("TipoPagadorPension.getByTipoPensionadoTipoPension")
			.setParameter("idTipoPension", idTipoPension)
			.setParameter("idTipoPensionado", idTipoPensionado)
    		.getResultList();
		em.close();		
    	return tipoPagadorPensiones;
	}

	public List<TipoPensionado> findTipoPensionados() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPensionado> tipoPensionados = (List<TipoPensionado>) em.createNamedQuery("TipoPensionado.getTipoPensionados").getResultList();
		em.close();		
    	return tipoPensionados;
	}

	public List<TipoPensionado> findByTipoPension(Long idTipoPension) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPensionado> tipoPensionados = (List<TipoPensionado>) em.createNamedQuery("TipoPensionado.getByTipoPension")
			.setParameter("idTipoPension", idTipoPension)
    		.getResultList();
		em.close();		
    	return tipoPensionados;
	}

	public List<TipoPension> findTipoPensiones() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPension> tipoPensiones = (List<TipoPension>) em.createNamedQuery("TipoPension.getTipoPensiones").getResultList();
		em.close();		
    	return tipoPensiones;
	}
}
