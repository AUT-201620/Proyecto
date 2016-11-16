/**
 */
package Proyecto.impl;

import Proyecto.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectoFactoryImpl extends EFactoryImpl implements ProyectoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProyectoFactory init() {
		try {
			ProyectoFactory theProyectoFactory = (ProyectoFactory)EPackage.Registry.INSTANCE.getEFactory(ProyectoPackage.eNS_URI);
			if (theProyectoFactory != null) {
				return theProyectoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProyectoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProyectoPackage.PLANILLA_UNICA: return createPlanillaUnica();
			case ProyectoPackage.TIPO_PENSIONADO: return createTipoPensionado();
			case ProyectoPackage.TIPO_PAGADOR_PENSION: return createTipoPagadorPension();
			case ProyectoPackage.TIPO_PENSION: return createTipoPension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanillaUnica createPlanillaUnica() {
		PlanillaUnicaImpl planillaUnica = new PlanillaUnicaImpl();
		return planillaUnica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPensionado createTipoPensionado() {
		TipoPensionadoImpl tipoPensionado = new TipoPensionadoImpl();
		return tipoPensionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPagadorPension createTipoPagadorPension() {
		TipoPagadorPensionImpl tipoPagadorPension = new TipoPagadorPensionImpl();
		return tipoPagadorPension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPension createTipoPension() {
		TipoPensionImpl tipoPension = new TipoPensionImpl();
		return tipoPension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoPackage getProyectoPackage() {
		return (ProyectoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProyectoPackage getPackage() {
		return ProyectoPackage.eINSTANCE;
	}

} //ProyectoFactoryImpl
