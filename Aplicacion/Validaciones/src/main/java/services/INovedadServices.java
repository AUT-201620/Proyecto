package services;

import entities.Novedad;

import java.util.List;

/**
 * Created by santi on 14/10/2016.
 */
public interface INovedadServices
{
    public List<Novedad> findAll();

    public Novedad find(Long id);

    public List<Novedad> findByPensionadoId(Long entidadId);

    public Novedad create(Novedad entidad);

    public Novedad update(Novedad entidad);

    public void delete(Long id);
}
