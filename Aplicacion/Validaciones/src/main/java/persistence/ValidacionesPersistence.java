package persistence;

import java.util.List;

import javax.persistence.EntityManager;

//import entities.TipoActividad;
import entities.TipoPagadorPension;
import entities.TipoPension;
import entities.TipoPensionado;

public class ValidacionesPersistence {
	
	public List<TipoPension> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPension> tipos = (List<TipoPension>)em.createNamedQuery("TipoPension.getAll").getResultList();
		em.close();		
    	return tipos;
    	
    }

	
	public List<TipoPensionado> findByPension (Long idPension){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPensionado> tipos = (List<TipoPensionado>)em.createNamedQuery("TipoPensionado.getByPension").setParameter("idPension", idPension).getResultList();
		em.close();		
    	return tipos;
	}
	
	public List<TipoPagadorPension> findByPensionPensionado(Long idPension, Long idPensionado){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPagadorPension> tipos = (List<TipoPagadorPension>)em.createNamedQuery("TipoPagadorPension.getByPensionPensionado").
    			setParameter("idPension", idPension).
    			setParameter("idPensionado", idPensionado).
    			getResultList();
		em.close();		
    	return tipos;
	}
	

}
