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
	@NamedQuery(name="TipoPensionado.getTipoPensionados",
    	query="SELECT e FROM TipoPensionado e"),
	@NamedQuery(name="TipoPensionado.getTipoPensionadoValidaciones",
	   	query="SELECT p FROM TipoPensionado p" +
	    	 " join p.tipoPagadorPension tipopagadorpension " +
	    	 " join p.tipoPension tipopension " +
		" WHERE "+
	    	 " tipopagadorpension.id = :idtipoPagadorPension and"
	    	 " tipopension.id = :idtipoPension and"
)
})

@Entity
public class TipoPensionado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Integer codigo;
	private String nombre;
	private String descripcion;
	@ManyToMany(mappedBy = "tipoPensionado")
	private List<TipoPagadorPension> tipoPagadorPension;
	@ManyToMany(mappedBy = "tipoPensionado")
	private List<TipoPension> tipoPension;
	
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
	 * @return the tipoPagadorPension
	 */
	public List<TipoPagadorPension> getTipoPagadorPension() {
		return tipoPagadorPension;
	}
	/**
	 * @param tipoPagadorPension the tipoPagadorPension to set
	 */
	public void setTipoPagadorPension(List<Novedad> tipoPagadorPension) {
		this.tipoPagadorPension = tipoPagadorPension;
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
	
	
	@Override
	public String toString() {
		return "TipoPensionado{" +
				"id=" + id +
				", codigo='" + codigo + '\'' +
				", nombre='" + nombre + '\'' +
				", descripcion='" + descripcion + '\'' +
				", tipoPagadorPension='" + tipoPagadorPension + '\'' +
				", tipoPension='" + tipoPension + '\'' +
				'}';
	}
}
