package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import entities.SuperEntidad;

@Stateless
public class SuperEntidadPersistence {

    public List<SuperEntidad> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<SuperEntidad> entidadList = (List<SuperEntidad>)em.createNamedQuery("SuperEntidad.getSuperEntidades").getResultList();
		em.close();		
    	return entidadList;
    	
    }
    
    public SuperEntidad find(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		SuperEntidad superEntidad = em.find(SuperEntidad.class, id);
    	em.close();
		return superEntidad;
    }
    
    public SuperEntidad create(SuperEntidad superEntidad){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
    	em.getTransaction().begin();
    	em.persist(superEntidad);
    	em.getTransaction().commit();
    	em.close();
		return superEntidad;
    }

	public SuperEntidad update(SuperEntidad superEntidad){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		SuperEntidad superEntidadtmp = em.find(SuperEntidad.class, superEntidad.getId());
		superEntidadtmp.setDigitoVerificacion(superEntidad.getDigitoVerificacion());
		superEntidadtmp.setNaturalezaJuridica(superEntidad.getNaturalezaJuridica());
		superEntidadtmp.setNombreRazonSocial(superEntidad.getNombreRazonSocial());
		superEntidadtmp.setNumeroIdentificacion(superEntidad.getNumeroIdentificacion());
		superEntidadtmp.setTipoIdentificacion(superEntidad.getTipoIdentificacion());
		em.getTransaction().commit();
		em.close();
		return superEntidad;
	}
	
	public void delete(Long id){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		SuperEntidad superEntidad = em.find(SuperEntidad.class, id);
		em.remove(superEntidad);
		em.getTransaction().commit();
		em.close();
	}
}