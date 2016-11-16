package services;

import entities.Novedad;

import java.util.List;

public interface INovedadServices {
	
	public List<Novedad> getAll();
	
	public Novedad get(Long id);
	
	public Novedad create(Novedad novedad);
		
	public Novedad update(Novedad novedad);
		
	public void delete(Long id);

}
