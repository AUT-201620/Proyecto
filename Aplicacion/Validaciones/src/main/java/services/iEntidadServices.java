package services;

import entities.Entidad;

import java.util.List;

public interface iEntidadServices {
	
	public List<Entidad> findAll();
	
	public Entidad find(Long id);
	
	public Entidad create(Entidad entidad);
		
	public Entidad update(Entidad entidad);
		
	public void delete(Long id);

}
