/**
 */
package Proyecto.impl;

import Proyecto.ProyectoPackage;
import Proyecto.TipoPagadorPension;
import Proyecto.TipoPension;

import Proyecto.TipoPensionado;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tipo Pension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Proyecto.impl.TipoPensionImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionImpl#getTiposPagadorPension <em>Tipos Pagador Pension</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionImpl#getTiposPensionado <em>Tipos Pensionado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TipoPensionImpl extends EObjectImpl implements TipoPension {
	/**
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected int codigo = CODIGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTiposPagadorPension() <em>Tipos Pagador Pension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiposPagadorPension()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoPagadorPension> tiposPagadorPension;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTiposPensionado() <em>Tipos Pensionado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiposPensionado()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoPensionado> tiposPensionado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoPensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoPackage.Literals.TIPO_PENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigo(int newCodigo) {
		int oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoPackage.TIPO_PENSION__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoPackage.TIPO_PENSION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoPagadorPension> getTiposPagadorPension() {
		if (tiposPagadorPension == null) {
			tiposPagadorPension = new EObjectResolvingEList<TipoPagadorPension>(TipoPagadorPension.class, this, ProyectoPackage.TIPO_PENSION__TIPOS_PAGADOR_PENSION);
		}
		return tiposPagadorPension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoPackage.TIPO_PENSION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoPensionado> getTiposPensionado() {
		if (tiposPensionado == null) {
			tiposPensionado = new EObjectResolvingEList<TipoPensionado>(TipoPensionado.class, this, ProyectoPackage.TIPO_PENSION__TIPOS_PENSIONADO);
		}
		return tiposPensionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoPackage.TIPO_PENSION__CODIGO:
				return getCodigo();
			case ProyectoPackage.TIPO_PENSION__NOMBRE:
				return getNombre();
			case ProyectoPackage.TIPO_PENSION__TIPOS_PAGADOR_PENSION:
				return getTiposPagadorPension();
			case ProyectoPackage.TIPO_PENSION__DESCRIPCION:
				return getDescripcion();
			case ProyectoPackage.TIPO_PENSION__TIPOS_PENSIONADO:
				return getTiposPensionado();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectoPackage.TIPO_PENSION__CODIGO:
				setCodigo((Integer)newValue);
				return;
			case ProyectoPackage.TIPO_PENSION__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectoPackage.TIPO_PENSION__TIPOS_PAGADOR_PENSION:
				getTiposPagadorPension().clear();
				getTiposPagadorPension().addAll((Collection<? extends TipoPagadorPension>)newValue);
				return;
			case ProyectoPackage.TIPO_PENSION__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case ProyectoPackage.TIPO_PENSION__TIPOS_PENSIONADO:
				getTiposPensionado().clear();
				getTiposPensionado().addAll((Collection<? extends TipoPensionado>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProyectoPackage.TIPO_PENSION__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ProyectoPackage.TIPO_PENSION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectoPackage.TIPO_PENSION__TIPOS_PAGADOR_PENSION:
				getTiposPagadorPension().clear();
				return;
			case ProyectoPackage.TIPO_PENSION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case ProyectoPackage.TIPO_PENSION__TIPOS_PENSIONADO:
				getTiposPensionado().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProyectoPackage.TIPO_PENSION__CODIGO:
				return codigo != CODIGO_EDEFAULT;
			case ProyectoPackage.TIPO_PENSION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectoPackage.TIPO_PENSION__TIPOS_PAGADOR_PENSION:
				return tiposPagadorPension != null && !tiposPagadorPension.isEmpty();
			case ProyectoPackage.TIPO_PENSION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case ProyectoPackage.TIPO_PENSION__TIPOS_PENSIONADO:
				return tiposPensionado != null && !tiposPensionado.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (codigo: ");
		result.append(codigo);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //TipoPensionImpl
