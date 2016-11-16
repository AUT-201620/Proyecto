/**
 * 
 */
package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author am.osorio
 *
 */
@Entity
public class TipoPension implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long codigo;
	private String descripcion;
	@ManyToMany
	private List<TipoPensionado> tipoPensionado;
	@ManyToMany
	private List<TipoPagador> tipoPagador;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the tipoPendionado
	 */
	public List<TipoPensionado> getTipoPensionado() {
		return tipoPensionado;
	}
	/**
	 * @param tipoPendionado the tipoPendionado to set
	 */
	public void setTipoPensionado(List<TipoPensionado> tipoPensionado) {
		this.tipoPensionado = tipoPensionado;
	}
	/**
	 * @return the tipoPagador
	 */
	public List<TipoPagador> getTipoPagador() {
		return tipoPagador;
	}
	/**
	 * @param tipoPagador the tipoPagador to set
	 */
	public void setTipoPagador(List<TipoPagador> tipoPagador) {
		this.tipoPagador = tipoPagador;
	}
}
