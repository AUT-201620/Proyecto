/**
 */
package Proyecto.util;

import Proyecto.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Proyecto.ProyectoPackage
 * @generated
 */
public class ProyectoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProyectoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProyectoSwitch<Adapter> modelSwitch =
		new ProyectoSwitch<Adapter>() {
			@Override
			public Adapter casePlanillaUnica(PlanillaUnica object) {
				return createPlanillaUnicaAdapter();
			}
			@Override
			public Adapter caseTipoPensionado(TipoPensionado object) {
				return createTipoPensionadoAdapter();
			}
			@Override
			public Adapter caseTipoPagadorPension(TipoPagadorPension object) {
				return createTipoPagadorPensionAdapter();
			}
			@Override
			public Adapter caseTipoPension(TipoPension object) {
				return createTipoPensionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Proyecto.PlanillaUnica <em>Planilla Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Proyecto.PlanillaUnica
	 * @generated
	 */
	public Adapter createPlanillaUnicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Proyecto.TipoPensionado <em>Tipo Pensionado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Proyecto.TipoPensionado
	 * @generated
	 */
	public Adapter createTipoPensionadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Proyecto.TipoPagadorPension <em>Tipo Pagador Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Proyecto.TipoPagadorPension
	 * @generated
	 */
	public Adapter createTipoPagadorPensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Proyecto.TipoPension <em>Tipo Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Proyecto.TipoPension
	 * @generated
	 */
	public Adapter createTipoPensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProyectoAdapterFactory
