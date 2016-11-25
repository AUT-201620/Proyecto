package services;

import java.util.List;

//import entities.TipoActividad;
import entities.TipoPagador;
import entities.TipoPension;
import entities.TipoPensionado;


public interface IValidacionesServices {
	
	public List<TipoPension> getTipoPension();
	public List<TipoPensionado> getTipoPensionado(Long idPension);
	public List<TipoPagador> getTipoPagador(Long idPension,Long idPensionado);
}
