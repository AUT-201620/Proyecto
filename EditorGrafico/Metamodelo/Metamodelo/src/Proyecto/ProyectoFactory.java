/**
 */
package Proyecto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Proyecto.ProyectoPackage
 * @generated
 */
public interface ProyectoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectoFactory eINSTANCE = Proyecto.impl.ProyectoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Planilla Unica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planilla Unica</em>'.
	 * @generated
	 */
	PlanillaUnica createPlanillaUnica();

	/**
	 * Returns a new object of class '<em>Tipo Pensionado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Pensionado</em>'.
	 * @generated
	 */
	TipoPensionado createTipoPensionado();

	/**
	 * Returns a new object of class '<em>Tipo Pagador Pension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Pagador Pension</em>'.
	 * @generated
	 */
	TipoPagadorPension createTipoPagadorPension();

	/**
	 * Returns a new object of class '<em>Tipo Pension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Pension</em>'.
	 * @generated
	 */
	TipoPension createTipoPension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProyectoPackage getProyectoPackage();

} //ProyectoFactory
