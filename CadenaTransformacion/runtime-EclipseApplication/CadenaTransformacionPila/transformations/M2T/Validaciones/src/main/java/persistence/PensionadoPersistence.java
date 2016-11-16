package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entities.Pensionado;

/**
 * @author am.osorio
 * Clases de Persistencia para Pensionado
 */
@Stateless
public class PensionadoPersistence {

    public List<Pensionado> getAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Pensionado> pensionadoList = (List<Pensionado>)em.createNamedQuery("Pensionado.getPensionados").getResultList();
		em.close();		
    	return pensionadoList;
    	
    }
    
    public Pensionado get(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Pensionado pensionado = em.find(Pensionado.class, id);
    	em.close();
		return pensionado;
    }
    
    public Pensionado create(Pensionado pensionado){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	em.persist(pensionado);
    	em.getTransaction().commit();
    	em.close();
		return pensionado;
    }

	public Pensionado update(Pensionado pensionado){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.merge(pensionado);
		em.getTransaction().commit();
		em.close();
		return pensionado;
	}
	
	public void delete(Long id){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Pensionado pensionado = em.find(Pensionado.class, id);
		em.remove(pensionado);
		em.getTransaction().commit();
		em.close();
	}
}