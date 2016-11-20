package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import entities.Aportante;

@Stateless
public class AportantePersistence {

    public List<Aportante> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Aportante> entidadList = (List<Aportante>)em.createNamedQuery("Aportante.getAportantes").getResultList();
		em.close();		
    	return entidadList;
    	
    }
    
    public Aportante find(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Aportante superEntidad = em.find(Aportante.class, id);
    	em.close();
		return superEntidad;
    }
    
    public Aportante create(Aportante superEntidad){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
    	em.getTransaction().begin();
    	em.persist(superEntidad);
    	em.getTransaction().commit();
    	em.close();
		return superEntidad;
    }

	public Aportante update(Aportante superEntidad){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Aportante superEntidadtmp = em.find(Aportante.class, superEntidad.getId());
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
		Aportante superEntidad = em.find(Aportante.class, id);
		em.remove(superEntidad);
		em.getTransaction().commit();
		em.close();
	}
}