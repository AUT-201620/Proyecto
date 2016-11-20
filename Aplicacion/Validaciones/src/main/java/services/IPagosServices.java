package services;

import entities.Pensionado;


public interface IPagosServices {
	
	public float calculoPagoSalud(Pensionado pensionado);
	
	public float calculoPagoPension(Pensionado pensionado);
	
	public float calculoPagoRiesgo(Pensionado pensionado);
}
