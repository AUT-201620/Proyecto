package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entities.Pensionado;

@Stateless
public class PensionadoPersistence {

    public List<Pensionado> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Pensionado> entidadList = (List<Pensionado>)em.createNamedQuery("Pensionado.getPensionados").getResultList();
		em.close();		
    	return entidadList;
    	
    }
    
    public Pensionado find(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Pensionado entidad = em.find(Pensionado.class, id);
    	em.close();
		return entidad;
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
		System.out.println(pensionado.toString());
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