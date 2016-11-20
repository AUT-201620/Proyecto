package services;

import java.util.List;

import entities.Aportante;;

public interface IAportanteServices {
	
	public List<Aportante> findAll();
	
	public Aportante find(Long id);
	
	public Aportante create(Aportante superEntidad);
		
	public Aportante update(Aportante superEntidad);
		
	public void delete(Long id);

}
