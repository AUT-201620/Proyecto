package services;

import entities.*;

import java.util.List;

public interface IPensionadoServices {
	
	public List<Pensionado> findAll();
	
	public Pensionado find(Long id);
	
	public Pensionado create(Pensionado pensionado);
		
	public Pensionado update(Pensionado pensionado);
		
	public void delete(Long id);

}
