package services;

import entities.Pensionado;

import java.util.List;

public interface IPensionadoServices {
	
	public List<Pensionado> getAll();
	
	public Pensionado get(Long id);
	
	public Pensionado create(Pensionado pensionado);
		
	public Pensionado update(Pensionado pensionado);
		
	public void delete(Long id);

}
