package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entities.*;

/**
 * @author am.osorio
 * Clases de Persistencia para Aportante
 */
@Stateless
public class AportantePersistence {

    public List<Aportante> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Aportante> aportanteList = (List<Aportante>)em.createNamedQuery("Aportante.getAportantes").getResultList();
		em.close();		
    	return aportanteList;
    	
    }
    
    public Aportante find(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Aportante aportante = em.find(Aportante.class, id);
    	em.close();
		return aportante;
    }
    
    public Aportante create(Aportante aportante){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	em.persist(aportante);
    	em.getTransaction().commit();
    	em.close();
		return aportante;
    }

	public Aportante update(Aportante aportante){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.merge(aportante);
		em.getTransaction().commit();
		em.close();
		return aportante;
	}
	
	public void delete(Long id){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Aportante aportante = em.find(Aportante.class, id);
		em.remove(aportante);
		em.getTransaction().commit();
		em.close();
	}
}