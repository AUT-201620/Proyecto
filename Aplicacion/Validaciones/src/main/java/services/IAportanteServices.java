package services;

import entities.*;

import java.util.List;

public interface IAportanteServices {
	
	public List<Aportante> findAll();
	
	public Aportante find(Long id);
	
	public Aportante create(Aportante aportante);
		
	public Aportante update(Aportante aportante);
		
	public void delete(Long id);

}
