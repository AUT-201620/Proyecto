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
public class TipoPensionado implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long codigo;
	private String descripcion;
	@ManyToMany(mappedBy = "tipoPensionado")
	private List<TipoPension> tipoPension;
	@ManyToMany
	private List<TipoPagador> tipoPagadorPensionado;
	
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
	 * @return the tipoPension
	 */
	public List<TipoPension> getTipoPension() {
		return tipoPension;
	}
	/**
	 * @param tipoPension the tipoPension to set
	 */
	public void setTipoPension(List<TipoPension> tipoPension) {
		this.tipoPension = tipoPension;
	}
	/**
	 * @return the tipoPagadorPensionado
	 */
	public List<TipoPagador> getTipoPagadorPensionado() {
		return tipoPagadorPensionado;
	}
	/**
	 * @param tipoPagadorPensionado the tipoPagadorPensionado to set
	 */
	public void setTipoPagadorPensionado(List<TipoPagador> tipoPagadorPensionado) {
		this.tipoPagadorPensionado = tipoPagadorPensionado;
	}
}
