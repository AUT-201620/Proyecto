package persistence;

import java.util.List;

import javax.persistence.EntityManager;

//import entities.TipoActividad;
import entities.TipoPagador;
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

    //public List<TipoActividad> findAllActivity()
	//{
	//	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	//	em.getTransaction().begin();
	//	List<TipoActividad> tipos = (List<TipoActividad>) em.createNamedQuery("TipoActivity.getAll").getResultList();
	//	em.close();
	//	return tipos;
	//}
	
	public List<TipoPensionado> findByPension (Long idPension){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPensionado> tipos = (List<TipoPensionado>)em.createNamedQuery("TipoPensionado.getByPension").setParameter("idPension", idPension).getResultList();
		em.close();		
    	return tipos;
	}
	
	public List<TipoPagador> findByPensioPensionado(Long idPension, Long idPensionado){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<TipoPagador> tipos = (List<TipoPagador>)em.createNamedQuery("TipoPagador.getByPensionPensionado").
    			setParameter("idPension", idPension).
    			setParameter("idPensionado", idPensionado).
    			getResultList();
		em.close();		
    	return tipos;
	}
	

}
