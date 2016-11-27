package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entities.*;

/**
 * @author am.osorio
 * Clases de Persistencia para Novedad
 */
@Stateless
public class NovedadPersistence {

    public List<Novedad> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Novedad> novedadList = (List<Novedad>)em.createNamedQuery("Novedad.getNovedades").getResultList();
		em.close();		
    	return novedadList;
    	
    }
    
    public Novedad find(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Novedad novedad = em.find(Novedad.class, id);
    	em.close();
		return novedad;
    }
    
    public Novedad create(Novedad novedad){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	em.persist(novedad);
    	em.getTransaction().commit();
    	em.close();
		return novedad;
    }

	public Novedad update(Novedad novedad){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.merge(novedad);
		em.getTransaction().commit();
		em.close();
		return novedad;
	}
	
	public void delete(Long id){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Novedad novedad = em.find(Novedad.class, id);
		em.remove(novedad);
		em.getTransaction().commit();
		em.close();
	}
	
	
	   public List<Novedad> findByPensionadoAll(Pensionado pensionado){    	
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();       
		List<Novedad> novedadListByEntidadId = (List<Novedad>)em.createNamedQuery("Novedad.findByPensionadoAll").setParameter("pensionado", pensionado).getResultList();        
        em.close();
        return novedadListByEntidadId;
    }
    
	    
    public List<Novedad> findByPensionadoId(Long id){
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
		List<Novedad> novedadListByPensionadoId = 
			(List<Novedad>)em.createNamedQuery("Novedad.findByPensionadoId").setParameter("pensionadoId", id).getResultList();        
        em.close();
        return novedadListByPensionadoId;
    }
}


