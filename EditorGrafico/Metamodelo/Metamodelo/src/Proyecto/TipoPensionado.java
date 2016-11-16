/**
 */
package Proyecto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo Pensionado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Proyecto.TipoPensionado#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link Proyecto.TipoPensionado#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Proyecto.TipoPensionado#getTiposPagadorPension <em>Tipos Pagador Pension</em>}</li>
 *   <li>{@link Proyecto.TipoPensionado#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see Proyecto.ProyectoPackage#getTipoPensionado()
 * @model
 * @generated
 */
public interface TipoPensionado extends EObject {
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
	 * @see Proyecto.ProyectoPackage#getTipoPensionado_Codigo()
	 * @model
	 * @generated
	 */
	int getCodigo();

	/**
	 * Sets the value of the '{@link Proyecto.TipoPensionado#getCodigo <em>Codigo</em>}' attribute.
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
	 * @see Proyecto.ProyectoPackage#getTipoPensionado_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Proyecto.TipoPensionado#getNombre <em>Nombre</em>}' attribute.
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
	 * @see Proyecto.ProyectoPackage#getTipoPensionado_TiposPagadorPension()
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
	 * @see Proyecto.ProyectoPackage#getTipoPensionado_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Proyecto.TipoPensionado#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // TipoPensionado
