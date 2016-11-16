package services;

import java.util.List;
import entities.TipoPagadorPension;
import entities.TipoPensionado;
import entities.TipoPension;

public interface IValidacionesServices {
	public List<TipoPagadorPension> getAllTipoPagadorPension();
	public List<TipoPensionado> getAllTipoPensionado();
	public List<TipoPension> getAllTipoPension();
	
}
