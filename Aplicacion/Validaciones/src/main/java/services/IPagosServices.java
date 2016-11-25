package services;

import entities.Pensionado;


public interface IPagosServices {
	
	public float pagoRiesgos(Pensionado pensionado);
	
	public float pagoPension(Pensionado pensionado);
	
	public float pagoSalud(Pensionado pensionado);
}
