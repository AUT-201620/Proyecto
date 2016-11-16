/**
 */
package Proyecto.impl;

import Proyecto.ProyectoPackage;
import Proyecto.TipoPagadorPension;
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
 * An implementation of the model object '<em><b>Tipo Pensionado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Proyecto.impl.TipoPensionadoImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionadoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionadoImpl#getTiposPagadorPension <em>Tipos Pagador Pension</em>}</li>
 *   <li>{@link Proyecto.impl.TipoPensionadoImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TipoPensionadoImpl extends EObjectImpl implements TipoPensionado {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoPensionadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoPackage.Literals.TIPO_PENSIONADO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoPackage.TIPO_PENSIONADO__CODIGO, oldCodigo, codigo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoPackage.TIPO_PENSIONADO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoPagadorPension> getTiposPagadorPension() {
		if (tiposPagadorPension == null) {
			tiposPagadorPension = new EObjectResolvingEList<TipoPagadorPension>(TipoPagadorPension.class, this, ProyectoPackage.TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectoPackage.TIPO_PENSIONADO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoPackage.TIPO_PENSIONADO__CODIGO:
				return getCodigo();
			case ProyectoPackage.TIPO_PENSIONADO__NOMBRE:
				return getNombre();
			case ProyectoPackage.TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION:
				return getTiposPagadorPension();
			case ProyectoPackage.TIPO_PENSIONADO__DESCRIPCION:
				return getDescripcion();
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
			case ProyectoPackage.TIPO_PENSIONADO__CODIGO:
				setCodigo((Integer)newValue);
				return;
			case ProyectoPackage.TIPO_PENSIONADO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectoPackage.TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION:
				getTiposPagadorPension().clear();
				getTiposPagadorPension().addAll((Collection<? extends TipoPagadorPension>)newValue);
				return;
			case ProyectoPackage.TIPO_PENSIONADO__DESCRIPCION:
				setDescripcion((String)newValue);
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
			case ProyectoPackage.TIPO_PENSIONADO__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case ProyectoPackage.TIPO_PENSIONADO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectoPackage.TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION:
				getTiposPagadorPension().clear();
				return;
			case ProyectoPackage.TIPO_PENSIONADO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
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
			case ProyectoPackage.TIPO_PENSIONADO__CODIGO:
				return codigo != CODIGO_EDEFAULT;
			case ProyectoPackage.TIPO_PENSIONADO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectoPackage.TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION:
				return tiposPagadorPension != null && !tiposPagadorPension.isEmpty();
			case ProyectoPackage.TIPO_PENSIONADO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
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

} //TipoPensionadoImpl
