package web.beans;

import entities.Pensionado;
import entities.Novedad;
import services.PensionadoServices;
import services.NovedadServices;
import services.IPensionadoServices;
import services.INovedadServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by santi on 14/10/2016.
 * Modified by Juan Carlos on 23/10/2016.
 */

@ManagedBean
@SessionScoped
public class NovedadBean implements Serializable{
	
    private static final long serialVersionUID = 1L;

    private List<Novedad> novedadList = new ArrayList<Novedad>();
    private INovedadServices services;
    private IPensionadoServices servicesEntidad;
    private Novedad novedad;
    private Pensionado entidad;
    private Long identificador;

    private Long entidadId;
    private Boolean buttonCrud;
    private TipoNovedad [] tiposNovedad;

    /**
     *
     */
    public NovedadBean()
    {
        services = new NovedadServices();
        servicesEntidad = new PensionadoServices();
        entidadId = (-1L);        
        novedad = new Novedad();
        buttonCrud = Boolean.TRUE;
    }

	public void findEntidadById(Long idEn)
    {
        entidad = new Pensionado();
		entidad=servicesEntidad.find(idEn);
	}
	
	public void findByEntidad(Long idEn){

		this.novedadList = services.findByPensionadoAll(entidad);
        findEntidadById(idEn);
	}

    public void crear()
    {
        novedad.setPensionado(entidad);
        services.create(this.novedad);
        this.novedadList = services.findByPensionadoAll(entidad);
    }

    public void delete() {
        services.delete(this.identificador);
        this.novedadList = services.findAll();
    }

    public void ver() {
        this.novedad = services.find(this.identificador);
        buttonCrud = Boolean.FALSE;
    }

    public void editar() {
        this.novedad = services.update(this.novedad);
        this.novedadList = services.findAll();
    }

    public void clearNovedad() {
        this.novedad = new Novedad();
        buttonCrud = Boolean.TRUE;
    }

    /**
     * @return the entityList
     */
    public List<Novedad> getNovedadList() {
        return novedadList;
    }

    /**
     * @param entidadList
     *            the entityList to set
     */
    public void setNovedadList(List<Novedad> entidadList) {
        this.novedadList = novedadList;
    }

    /**
     * @return the novedad
     */
    public Novedad getNovedad() {
        if (novedad == null) {
            novedad = new Novedad();
        }
        return novedad;
    }

    /**
     * @param entidad
     *            the novedad to set
     */
    public void setNovedad(Novedad entidad) {
        this.novedad = novedad;
    }

    /**
     * @return the identificador
     */
    public Long getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador
     *            the identificador to set
     */
    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the buttonCrud
     */
    public Boolean getButtonCrud() {
        return buttonCrud;
    }

    /**
     * @param buttonCrud the buttonCrud to set
     */
    public void setButtonCrud(Boolean buttonCrud) {
        this.buttonCrud = buttonCrud;
    }

	public Pensionado getEntidad() {
		return entidad;
	}

	public void setEntidad(Pensionado entidad) {
		this.entidad = entidad;
	}

	public Long getEntidadId() {
		return entidadId;
	}

	public void setEntidadId(Long entidadId) {
		this.entidadId = entidadId;
	}

	/**
	 * @return the tiposNovedad
	 */
	public TipoNovedad [] getTiposNovedad() {
		return TipoNovedad.values();
	}

	/**
	 * @param tiposNovedad the tiposNovedad to set
	 */
	public void setTiposNovedad(TipoNovedad [] tiposNovedad) {
		this.tiposNovedad = tiposNovedad;
	}
    
}
