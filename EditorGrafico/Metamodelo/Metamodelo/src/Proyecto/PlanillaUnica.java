/**
 */
package Proyecto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planilla Unica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Proyecto.PlanillaUnica#getTiposPensionado <em>Tipos Pensionado</em>}</li>
 *   <li>{@link Proyecto.PlanillaUnica#getTiposPagadorPension <em>Tipos Pagador Pension</em>}</li>
 *   <li>{@link Proyecto.PlanillaUnica#getTiposPension <em>Tipos Pension</em>}</li>
 * </ul>
 *
 * @see Proyecto.ProyectoPackage#getPlanillaUnica()
 * @model
 * @generated
 */
public interface PlanillaUnica extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipos Pensionado</b></em>' containment reference list.
	 * The list contents are of type {@link Proyecto.TipoPensionado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos Pensionado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos Pensionado</em>' containment reference list.
	 * @see Proyecto.ProyectoPackage#getPlanillaUnica_TiposPensionado()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoPensionado> getTiposPensionado();

	/**
	 * Returns the value of the '<em><b>Tipos Pagador Pension</b></em>' containment reference list.
	 * The list contents are of type {@link Proyecto.TipoPagadorPension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos Pagador Pension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos Pagador Pension</em>' containment reference list.
	 * @see Proyecto.ProyectoPackage#getPlanillaUnica_TiposPagadorPension()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoPagadorPension> getTiposPagadorPension();

	/**
	 * Returns the value of the '<em><b>Tipos Pension</b></em>' containment reference list.
	 * The list contents are of type {@link Proyecto.TipoPension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos Pension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos Pension</em>' containment reference list.
	 * @see Proyecto.ProyectoPackage#getPlanillaUnica_TiposPension()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoPension> getTiposPension();

} // PlanillaUnica
