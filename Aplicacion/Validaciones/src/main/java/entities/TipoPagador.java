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
@NamedQueries({
    @NamedQuery(name="TipoPagador.getByPensionPensionado",
            query="SELECT p from TipoPagador p join p.tipoPension e join p.tipoPensionado pe where e.id = :idPension and pe.id= :idPensionado")
})
@Entity
public class TipoPagador implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long codigo;
	private String descripcion;
	@ManyToMany(mappedBy = "tipoPagador")
	private List<TipoPension> tipoPension;
	@ManyToMany(mappedBy = "tipoPagadorPensionado")
	private List<TipoPensionado> tipoPensionado;
	
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
	 * @return the tipoPensionado
	 */
	public List<TipoPensionado> getTipoPensionado() {
		return tipoPensionado;
	}
	/**
	 * @param tipoPensionado the tipoPensionado to set
	 */
	public void setTipoPensionado(List<TipoPensionado> tipoPensionado) {
		this.tipoPensionado = tipoPensionado;
	}
	
}
