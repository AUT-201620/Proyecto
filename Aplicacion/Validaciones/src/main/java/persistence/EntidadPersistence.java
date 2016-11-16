package persistence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import entities.Entidad;
import entities.Novedad;

@Stateless
public class EntidadPersistence {

    public List<Entidad> findAll(){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	List<Entidad> entidadList = (List<Entidad>)em.createNamedQuery("Entidad.getEntidades").getResultList();
		em.close();		
    	return entidadList;
    	
    }
    
    public Entidad find(Long id){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Entidad entidad = em.find(Entidad.class, id);
    	em.close();
		return entidad;
    }
    
    public Entidad create(Entidad entidad){
    	EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
    	em.persist(entidad);
    	em.getTransaction().commit();
    	em.close();
		return entidad;
    }

	public Entidad update(Entidad entidad){
		System.out.println(entidad.toString());
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		//Entidad entidadtmp = new Entidad();
		//Long ID = entidad.getId();
		//entidadtmp.setActividadEconomica(entidad.getActividadEconomica());
		//entidadtmp.setAltoRiesgo(entidad.getAltoRiesgo());
		//entidadtmp.setAviador(entidad.getAviador());
		//entidadtmp.setCongresista(entidad.getCongresista());
		//entidadtmp.setCti(entidad.getCti());
		//entidadtmp.setGrupoFamiliar(entidad.getGrupoFamiliar());
		//entidadtmp.setIngresoBaseCotizacion(entidad.getIngresoBaseCotizacion());
		//entidadtmp.setNumeroIdentificacion(entidad.getNumeroIdentificacion());
		//entidadtmp.setPrimerApellido(entidad.getPrimerApellido());
		//entidadtmp.setPrimerNombre(entidad.getPrimerNombre());
		//entidadtmp.setSegundoApellido(entidad.getSegundoApellido());
		//entidadtmp.setSegundoNombre(entidad.getSegundoNombre());
		//entidadtmp.setTipoIdentificacion(entidad.getTipoIdentificacion());
		//entidadtmp.setViveExterior(entidad.getViveExterior());
		//entidadtmp.setNovedades(entidad.getNovedades());
		//em.merge(entidadtmp);
		em.merge(entidad);
		//em.remove(em.merge(entidad));
		//em.clear();
		//entidadtmp.setId(ID);
		//em.merge(entidadtmp);
		em.getTransaction().commit();
		em.close();
		return entidad;
	}
	
	public void delete(Long id){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		Entidad entidad = em.find(Entidad.class, id);
		//List<Novedad> novedades = entidad.getNovedades();
		//for (Novedad novedad: novedades)
		//{
		//	em.remove(novedad);
		//}
		em.remove(entidad);
		em.getTransaction().commit();
		em.close();
	}
}