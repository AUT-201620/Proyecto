/**
 */
package Proyecto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Pension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Proyecto.TipoPension#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link Proyecto.TipoPension#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Proyecto.TipoPension#getTiposPagadorPension <em>Tipos Pagador Pension</em>}</li>
 *   <li>{@link Proyecto.TipoPension#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Proyecto.TipoPension#getTiposPensionado <em>Tipos Pensionado</em>}</li>
 * </ul>
 *
 * @see Proyecto.ProyectoPackage#getTipoPension()
 * @model
 * @generated
 */
public interface TipoPension extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(int)
	 * @see Proyecto.ProyectoPackage#getTipoPension_Codigo()
	 * @model
	 * @generated
	 */
	int getCodigo();

	/**
	 * Sets the value of the '{@link Proyecto.TipoPension#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(int value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Proyecto.ProyectoPackage#getTipoPension_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Proyecto.TipoPension#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipos Pagador Pension</b></em>' reference list.
	 * The list contents are of type {@link Proyecto.TipoPagadorPension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos Pagador Pension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos Pagador Pension</em>' reference list.
	 * @see Proyecto.ProyectoPackage#getTipoPension_TiposPagadorPension()
	 * @model
	 * @generated
	 */
	EList<TipoPagadorPension> getTiposPagadorPension();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see Proyecto.ProyectoPackage#getTipoPension_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Proyecto.TipoPension#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Tipos Pensionado</b></em>' reference list.
	 * The list contents are of type {@link Proyecto.TipoPensionado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos Pensionado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos Pensionado</em>' reference list.
	 * @see Proyecto.ProyectoPackage#getTipoPension_TiposPensionado()
	 * @model
	 * @generated
	 */
	EList<TipoPensionado> getTiposPensionado();

} // TipoPension
