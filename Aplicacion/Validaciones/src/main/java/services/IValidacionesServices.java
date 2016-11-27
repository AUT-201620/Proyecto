package services;

import java.util.List;
import entities.TipoPagadorPension;
import entities.TipoPensionado;
import entities.TipoPension;

public interface IValidacionesServices {
	public List<TipoPagadorPension> getTipoPagadorPensiones();
	public List<TipoPagadorPension> getByTipoPensionadoTipoPension(Long idTipoPensionado, Long idTipoPension);
	public List<TipoPensionado> getTipoPensionados();
	public List<TipoPensionado> getByTipoPension(Long idTipoPension);
	public List<TipoPension> getTipoPensiones();
}

