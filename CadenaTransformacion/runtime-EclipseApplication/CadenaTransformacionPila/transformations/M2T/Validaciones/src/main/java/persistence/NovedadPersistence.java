package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entities.Novedad;

/**
 * @author am.osorio
 * Clases de Persistencia para Novedad
 */
@Stateless
public class NovedadPersistence {

    public List<Novedad> getAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Novedad> novedadList = (List<Novedad>)em.createNamedQuery("Novedad.getNovedads").getResultList();
		em.close();		
    	return novedadList;
    	
    }
    
    public Novedad get(Long id){
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
}