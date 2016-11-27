package services;

import entities.*;


public interface IComputoServices {

	public double pagoPension(Pensionado pensionado);
	public double pagoSalud(Pensionado pensionado);
	public double pagoRiesgos(Pensionado pensionado);
	
}
