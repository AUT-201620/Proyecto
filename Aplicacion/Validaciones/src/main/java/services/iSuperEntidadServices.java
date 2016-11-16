package services;

import java.util.List;

import entities.SuperEntidad;;

public interface iSuperEntidadServices {
	
	public List<SuperEntidad> findAll();
	
	public SuperEntidad find(Long id);
	
	public SuperEntidad create(SuperEntidad superEntidad);
		
	public SuperEntidad update(SuperEntidad superEntidad);
		
	public void delete(Long id);

}
