package services;

import entities.Aportante;

import java.util.List;

public interface IAportanteServices {
	
	public List<Aportante> getAll();
	
	public Aportante get(Long id);
	
	public Aportante create(Aportante aportante);
		
	public Aportante update(Aportante aportante);
		
	public void delete(Long id);

}
