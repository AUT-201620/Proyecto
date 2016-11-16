/**
 */
package Proyecto.impl;

import Proyecto.PlanillaUnica;
import Proyecto.ProyectoPackage;
import Proyecto.TipoPagadorPension;
import Proyecto.TipoPension;
import Proyecto.TipoPensionado;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planilla Unica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Proyecto.impl.PlanillaUnicaImpl#getTiposPensionado <em>Tipos Pensionado</em>}</li>
 *   <li>{@link Proyecto.impl.PlanillaUnicaImpl#getTiposPagadorPension <em>Tipos Pagador Pension</em>}</li>
 *   <li>{@link Proyecto.impl.PlanillaUnicaImpl#getTiposPension <em>Tipos Pension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanillaUnicaImpl extends EObjectImpl implements PlanillaUnica {
	/**
	 * The cached value of the '{@link #getTiposPensionado() <em>Tipos Pensionado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiposPensionado()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoPensionado> tiposPensionado;

	/**
	 * The cached value of the '{@link #getTiposPagadorPension() <em>Tipos Pagador Pension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiposPagadorPension()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoPagadorPension> tiposPagadorPension;

	/**
	 * The cached value of the '{@link #getTiposPension() <em>Tipos Pension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiposPension()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoPension> tiposPension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanillaUnicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectoPackage.Literals.PLANILLA_UNICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoPensionado> getTiposPensionado() {
		if (tiposPensionado == null) {
			tiposPensionado = new EObjectContainmentEList<TipoPensionado>(TipoPensionado.class, this, ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSIONADO);
		}
		return tiposPensionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoPagadorPension> getTiposPagadorPension() {
		if (tiposPagadorPension == null) {
			tiposPagadorPension = new EObjectContainmentEList<TipoPagadorPension>(TipoPagadorPension.class, this, ProyectoPackage.PLANILLA_UNICA__TIPOS_PAGADOR_PENSION);
		}
		return tiposPagadorPension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoPension> getTiposPension() {
		if (tiposPension == null) {
			tiposPension = new EObjectContainmentEList<TipoPension>(TipoPension.class, this, ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSION);
		}
		return tiposPension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSIONADO:
				return ((InternalEList<?>)getTiposPensionado()).basicRemove(otherEnd, msgs);
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PAGADOR_PENSION:
				return ((InternalEList<?>)getTiposPagadorPension()).basicRemove(otherEnd, msgs);
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSION:
				return ((InternalEList<?>)getTiposPension()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSIONADO:
				return getTiposPensionado();
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PAGADOR_PENSION:
				return getTiposPagadorPension();
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSION:
				return getTiposPension();
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
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSIONADO:
				getTiposPensionado().clear();
				getTiposPensionado().addAll((Collection<? extends TipoPensionado>)newValue);
				return;
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PAGADOR_PENSION:
				getTiposPagadorPension().clear();
				getTiposPagadorPension().addAll((Collection<? extends TipoPagadorPension>)newValue);
				return;
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSION:
				getTiposPension().clear();
				getTiposPension().addAll((Collection<? extends TipoPension>)newValue);
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
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSIONADO:
				getTiposPensionado().clear();
				return;
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PAGADOR_PENSION:
				getTiposPagadorPension().clear();
				return;
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSION:
				getTiposPension().clear();
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
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSIONADO:
				return tiposPensionado != null && !tiposPensionado.isEmpty();
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PAGADOR_PENSION:
				return tiposPagadorPension != null && !tiposPagadorPension.isEmpty();
			case ProyectoPackage.PLANILLA_UNICA__TIPOS_PENSION:
				return tiposPension != null && !tiposPension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanillaUnicaImpl
