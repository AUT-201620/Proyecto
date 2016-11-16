package web.beans;

import entities.Entidad;
import entities.Novedad;
import services.EntidadServices;
import services.NovedadServices;
import services.iEntidadServices;
import services.iNovedadServices;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by santi on 14/10/2016.
 * Modified by Juan Carlos on 23/10/2016.
 */

@ManagedBean
@ViewScoped
public class NovedadBean implements Serializable{
	
    private static final long serialVersionUID = 1L;

    private List<Novedad> novedadList = new ArrayList<Novedad>();
    private List<Entidad> entidadList = new ArrayList<Entidad>();
    private NovedadServices services;
    private EntidadServices servicesEntidad;
    private Novedad novedad;
    private Entidad entidad;
    private Long identificador;
    private Long entidadId;
    private Boolean buttonCrud;

    /**
     *
     */
    public NovedadBean() {
        services = new NovedadServices();
        servicesEntidad = new EntidadServices();
        entidadId = (-1L);        
        novedad = new Novedad();
        buttonCrud = Boolean.TRUE;
    }

    /**
     *
     */
    @PostConstruct
    public void init() {        
        this.entidadList = servicesEntidad.findAll();
    }
    
    
	
	public void findEntidadById(){
		entidad=servicesEntidad.find(entidadId);
		findByEntidad();
	}
	
	public void findByEntidad(){
		this.novedadList = services.findByEntidadId(entidadId);
	}

    public void crear()
    {
        novedad.setEntidad(entidad);
        //entidad.getNovedades().add(this.novedad);
        //servicesEntidad.update(entidad);
        services.create(this.novedad);
        this.novedadList = services.findByEntidadId(entidad.getId());
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

	public List<Entidad> getEntidadList() {
		return entidadList;
	}

	public void setEntidadList(List<Entidad> entidadList) {
		this.entidadList = entidadList;
	}

	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public Long getEntidadId() {
		return entidadId;
	}

	public void setEntidadId(Long entidadId) {
		this.entidadId = entidadId;
	}
    
}
