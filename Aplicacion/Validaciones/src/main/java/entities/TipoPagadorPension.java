package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.*;
import java.util.*;

/**
* @author am.osorio
*
*/

@NamedQueries({
	@NamedQuery(name = "TipoPagadorPension.getTipoPagadorPensiones",
	query = "SELECT e FROM TipoPagadorPension e")
	
	, @NamedQuery(name = "TipoPagadorPension.getByTipoPensionadoTipoPension",
	query = "SELECT t0 FROM TipoPagadorPension t0" +
	" join t0.tipoPensionado t1 join t0.tipoPension t2 WHERE t1.id = :idTipoPensionado and t2.id = :idTipoPension")
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
	//Referencia Bidireccional a Entidades que refieren a esta entidad como Many To Many
	@ManyToMany(mappedBy = "tipoPagadorPension")
	private List<TipoPensionado> tipoPensionado;
	@ManyToMany(mappedBy = "tipoPagadorPension")
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
	@Override
	public String toString() {
		return "TipoPagadorPension{" +
		"id=" + id +
		", codigo='" + codigo + '\'' +
		", nombre='" + nombre + '\'' +
		", descripcion='" + descripcion + '\'' +
		'}';
	}
}

