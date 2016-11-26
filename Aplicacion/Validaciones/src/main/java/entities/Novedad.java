package entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by santi on 14/10/2016.
 * Modified by Juan Carlos on 23/10/2016
 */
@NamedQueries({
        @NamedQuery(name="Novedad.getNovedades",
                query="SELECT e FROM Novedad e"),
        @NamedQuery(name="Novedad.findByEntidadId",
        query = "SELECT e FROM Novedad e where e.pensionado.id = :entidadId ORDER BY e.fechaCreacion "),
        @NamedQuery(name="Novedad.findByPensionadoAll",
        query = "SELECT e FROM Novedad e where e.pensionado = :pensionado")
})
@Entity
public class Novedad implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;
    private String tipoNovedad;
    private Boolean noConsolidada;

    @ManyToOne
    @JoinColumn(name="pensionado_id", nullable = false)
    private Pensionado pensionado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public Pensionado getPensionado() {
        return pensionado;
    }

    public void setPensionado(Pensionado pensionado) {
        this.pensionado = pensionado;
    }
    
    public long diasEntreFechaFinInicio(){
		return (fechaFin.getTime() - fechaInicio.getTime());
	}

	public Boolean getNoConsolidada() {
		return noConsolidada;
	}

	public void setNoConsolidada(Boolean noConsolidada) {
		this.noConsolidada = noConsolidada;
	}
}
