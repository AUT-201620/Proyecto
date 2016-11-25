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
    @NamedQuery(name="TipoPensionado.getByPension",
            query="SELECT p from TipoPensionado p join p.tipoPension e where e.id = :idPension")
})


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
	private List<TipoPagadorPension> TipoPagadorPensionPensionado;
	
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
	public List<TipoPagadorPension> getTipoPagadorPensionPensionado() {
		return TipoPagadorPensionPensionado;
	}
	public void setTipoPagadorPensionPensionado(
			List<TipoPagadorPension> tipoPagadorPensionPensionado) {
		TipoPagadorPensionPensionado = tipoPagadorPensionPensionado;
	}

}
