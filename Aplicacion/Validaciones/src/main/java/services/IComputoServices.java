package services;

import entities.Pensionado;


public interface IComputoServices {
	
	public float pagoRiesgos(Pensionado pensionado);
	
	public float pagoPension(Pensionado pensionado);
	
	public float pagoSalud(Pensionado pensionado);
}
