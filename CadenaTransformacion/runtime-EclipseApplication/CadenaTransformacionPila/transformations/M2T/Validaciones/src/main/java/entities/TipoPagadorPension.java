package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;

/**
 * @author am.osorio
 *
 */
@NamedQueries({
	@NamedQuery(name="TipoPagadorPension.getTipoPagadorPensions",
    	query="SELECT e FROM TipoPagadorPension e"),
	@NamedQuery(name="TipoPagadorPension.getTipoPagadorPensionValidaciones",
	   	query="SELECT p FROM TipoPagadorPension p" +
	    	 " join p.tipoPension tipopension " +
	    	 " join p.tipoPensionado tipopensionado " +
		" WHERE "+
	    	 " tipopension.id = :idtipoPension and"
	    	 " tipopensionado.id = :idtipoPensionado and"
)
})

@Entity
public class TipoPagadorPension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Integer codigo;
	private String nombre;
	private String descripcion;
	@ManyToMany(mappedBy = "tipoPagadorPension")
	private List<TipoPension> tipoPension;
	@ManyToMany(mappedBy = "tipoPagadorPension")
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
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public void setTipoPension(List<Novedad> tipoPension) {
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
	public void setTipoPensionado(List<Novedad> tipoPensionado) {
		this.tipoPensionado = tipoPensionado;
	}
	
	
	@Override
	public String toString() {
		return "TipoPagadorPension{" +
				"id=" + id +
				", codigo='" + codigo + '\'' +
				", nombre='" + nombre + '\'' +
				", descripcion='" + descripcion + '\'' +
				", tipoPension='" + tipoPension + '\'' +
				", tipoPensionado='" + tipoPensionado + '\'' +
				'}';
	}
}
