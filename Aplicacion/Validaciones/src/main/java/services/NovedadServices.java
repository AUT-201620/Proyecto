package services;

import entities.Entidad;
import entities.Novedad;
import persistence.NovedadPersistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import java.util.List;

/**
 * Created by santi on 14/10/2016.
 */
public class NovedadServices implements iNovedadServices 
{
    private NovedadPersistence persistance;

    @Inject
    private EntityManager etm;

    public NovedadServices() {
        persistance = new NovedadPersistence();
    }

    @Override
    public List<Novedad> findAll() {
        List<Novedad> novedadList = persistance.findAll();
        return novedadList;
    }

    @Override
    public Novedad find(Long id) {
        Novedad novedad = persistance.find(id);
        return novedad;
    }

    @Override
	 public List<Novedad> findByEntidadId(Long entidadId) {
    	List<Novedad> novedadListByIdEntidad = persistance.findByEntidadId(entidadId);
    	return novedadListByIdEntidad;        
	    }

    @Override
    public Novedad create(Novedad novedad) {
        return persistance.create(novedad);
    }
    @Override
    public Novedad update(Novedad novedad) {
        return persistance.update(novedad);
    }
    @Override
    public void delete(Long id) {
        persistance.delete(id);
    }
}
