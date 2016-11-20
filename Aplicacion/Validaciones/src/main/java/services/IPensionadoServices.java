package services;

import entities.Pensionado;

import java.util.List;

public interface IPensionadoServices {
	
	public List<Pensionado> findAll();
	
	public Pensionado find(Long id);
	
	public Pensionado create(Pensionado entidad);
		
	public Pensionado update(Pensionado entidad);
		
	public void delete(Long id);

}
