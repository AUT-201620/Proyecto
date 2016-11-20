package persistence;

import entities.Novedad;

import javax.persistence.EntityManager;

import java.util.List;

/**
 * Created by santi on 14/10/2016.
 */
public class NovedadPersistence
{
    public List<Novedad> findAll(){
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        @SuppressWarnings("unchecked")
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
    
    public List<Novedad> findByPensionadoId(Long id){
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        @SuppressWarnings("unchecked")
		List<Novedad> novedadListByEntidadId = (List<Novedad>)em.createNamedQuery("Novedad.findByEntidadId").setParameter("entidadId", id).getResultList();        
        em.close();
        return novedadListByEntidadId;
    }

    public Novedad create(Novedad novedad){
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        em.merge(novedad);
        em.getTransaction().commit();
        em.close();
        return novedad;
    }

    public Novedad update(Novedad novedad){
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        Novedad novedadtmp = em.find(Novedad.class, novedad.getId());
        novedadtmp.setFechaCreacion(novedad.getFechaCreacion());
        novedadtmp.setFechaFin(novedad.getFechaFin());
        novedadtmp.setFechaInicio(novedad.getFechaInicio());
        novedadtmp.setTipo(novedad.getTipo());
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
