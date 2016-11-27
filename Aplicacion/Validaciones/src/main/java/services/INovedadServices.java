package services;

import entities.*;

import java.util.List;

public interface INovedadServices {
	
	public List<Novedad> findAll();
	
	public Novedad find(Long id);
	
	public Novedad create(Novedad novedad);
		
	public Novedad update(Novedad novedad);
		
	public void delete(Long id);
	
	
	public List<Novedad> findByPensionadoId(Long pensionadoId);
    
    public List<Novedad> findByPensionadoAll(Pensionado pensionado);

}
