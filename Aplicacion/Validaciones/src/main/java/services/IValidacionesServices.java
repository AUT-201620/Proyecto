package services;

import java.util.List;
import entities.TipoPagadorPension;
import entities.TipoPension;
import entities.TipoPensionado;

public interface IValidacionesServices {
	public List<TipoPagadorPension> getTipoPagadorPensiones();
	public List<TipoPagadorPension> getByTipoPensionTipoPensionado(Long idTipoPension, Long idTipoPensionado);
	public List<TipoPension> getTipoPensiones();
	public List<TipoPensionado> getTipoPensionados();
	public List<TipoPensionado> getByTipoPension(Long idTipoPension);
}

