/**
 */
package Proyecto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Proyecto.ProyectoFactory
 * @model kind="package"
 * @generated
 */
public interface ProyectoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Proyecto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/proyecto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Proyecto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectoPackage eINSTANCE = Proyecto.impl.ProyectoPackageImpl.init();

	/**
	 * The meta object id for the '{@link Proyecto.impl.PlanillaUnicaImpl <em>Planilla Unica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Proyecto.impl.PlanillaUnicaImpl
	 * @see Proyecto.impl.ProyectoPackageImpl#getPlanillaUnica()
	 * @generated
	 */
	int PLANILLA_UNICA = 0;

	/**
	 * The feature id for the '<em><b>Tipos Pensionado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_UNICA__TIPOS_PENSIONADO = 0;

	/**
	 * The feature id for the '<em><b>Tipos Pagador Pension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_UNICA__TIPOS_PAGADOR_PENSION = 1;

	/**
	 * The feature id for the '<em><b>Tipos Pension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_UNICA__TIPOS_PENSION = 2;

	/**
	 * The number of structural features of the '<em>Planilla Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_UNICA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Proyecto.impl.TipoPensionadoImpl <em>Tipo Pensionado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Proyecto.impl.TipoPensionadoImpl
	 * @see Proyecto.impl.ProyectoPackageImpl#getTipoPensionado()
	 * @generated
	 */
	int TIPO_PENSIONADO = 1;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSIONADO__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSIONADO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Tipos Pagador Pension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSIONADO__DESCRIPCION = 3;

	/**
	 * The number of structural features of the '<em>Tipo Pensionado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSIONADO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Proyecto.impl.TipoPagadorPensionImpl <em>Tipo Pagador Pension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Proyecto.impl.TipoPagadorPensionImpl
	 * @see Proyecto.impl.ProyectoPackageImpl#getTipoPagadorPension()
	 * @generated
	 */
	int TIPO_PAGADOR_PENSION = 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PAGADOR_PENSION__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PAGADOR_PENSION__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PAGADOR_PENSION__DESCRIPCION = 2;

	/**
	 * The number of structural features of the '<em>Tipo Pagador Pension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PAGADOR_PENSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Proyecto.impl.TipoPensionImpl <em>Tipo Pension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Proyecto.impl.TipoPensionImpl
	 * @see Proyecto.impl.ProyectoPackageImpl#getTipoPension()
	 * @generated
	 */
	int TIPO_PENSION = 3;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSION__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSION__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Tipos Pagador Pension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSION__TIPOS_PAGADOR_PENSION = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSION__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>Tipos Pensionado</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSION__TIPOS_PENSIONADO = 4;

	/**
	 * The number of structural features of the '<em>Tipo Pension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_PENSION_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link Proyecto.PlanillaUnica <em>Planilla Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planilla Unica</em>'.
	 * @see Proyecto.PlanillaUnica
	 * @generated
	 */
	EClass getPlanillaUnica();

	/**
	 * Returns the meta object for the containment reference list '{@link Proyecto.PlanillaUnica#getTiposPensionado <em>Tipos Pensionado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipos Pensionado</em>'.
	 * @see Proyecto.PlanillaUnica#getTiposPensionado()
	 * @see #getPlanillaUnica()
	 * @generated
	 */
	EReference getPlanillaUnica_TiposPensionado();

	/**
	 * Returns the meta object for the containment reference list '{@link Proyecto.PlanillaUnica#getTiposPagadorPension <em>Tipos Pagador Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipos Pagador Pension</em>'.
	 * @see Proyecto.PlanillaUnica#getTiposPagadorPension()
	 * @see #getPlanillaUnica()
	 * @generated
	 */
	EReference getPlanillaUnica_TiposPagadorPension();

	/**
	 * Returns the meta object for the containment reference list '{@link Proyecto.PlanillaUnica#getTiposPension <em>Tipos Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipos Pension</em>'.
	 * @see Proyecto.PlanillaUnica#getTiposPension()
	 * @see #getPlanillaUnica()
	 * @generated
	 */
	EReference getPlanillaUnica_TiposPension();

	/**
	 * Returns the meta object for class '{@link Proyecto.TipoPensionado <em>Tipo Pensionado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Pensionado</em>'.
	 * @see Proyecto.TipoPensionado
	 * @generated
	 */
	EClass getTipoPensionado();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPensionado#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see Proyecto.TipoPensionado#getCodigo()
	 * @see #getTipoPensionado()
	 * @generated
	 */
	EAttribute getTipoPensionado_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPensionado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Proyecto.TipoPensionado#getNombre()
	 * @see #getTipoPensionado()
	 * @generated
	 */
	EAttribute getTipoPensionado_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link Proyecto.TipoPensionado#getTiposPagadorPension <em>Tipos Pagador Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tipos Pagador Pension</em>'.
	 * @see Proyecto.TipoPensionado#getTiposPagadorPension()
	 * @see #getTipoPensionado()
	 * @generated
	 */
	EReference getTipoPensionado_TiposPagadorPension();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPensionado#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Proyecto.TipoPensionado#getDescripcion()
	 * @see #getTipoPensionado()
	 * @generated
	 */
	EAttribute getTipoPensionado_Descripcion();

	/**
	 * Returns the meta object for class '{@link Proyecto.TipoPagadorPension <em>Tipo Pagador Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Pagador Pension</em>'.
	 * @see Proyecto.TipoPagadorPension
	 * @generated
	 */
	EClass getTipoPagadorPension();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPagadorPension#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see Proyecto.TipoPagadorPension#getCodigo()
	 * @see #getTipoPagadorPension()
	 * @generated
	 */
	EAttribute getTipoPagadorPension_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPagadorPension#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Proyecto.TipoPagadorPension#getNombre()
	 * @see #getTipoPagadorPension()
	 * @generated
	 */
	EAttribute getTipoPagadorPension_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPagadorPension#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Proyecto.TipoPagadorPension#getDescripcion()
	 * @see #getTipoPagadorPension()
	 * @generated
	 */
	EAttribute getTipoPagadorPension_Descripcion();

	/**
	 * Returns the meta object for class '{@link Proyecto.TipoPension <em>Tipo Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Pension</em>'.
	 * @see Proyecto.TipoPension
	 * @generated
	 */
	EClass getTipoPension();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPension#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see Proyecto.TipoPension#getCodigo()
	 * @see #getTipoPension()
	 * @generated
	 */
	EAttribute getTipoPension_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPension#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Proyecto.TipoPension#getNombre()
	 * @see #getTipoPension()
	 * @generated
	 */
	EAttribute getTipoPension_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link Proyecto.TipoPension#getTiposPagadorPension <em>Tipos Pagador Pension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tipos Pagador Pension</em>'.
	 * @see Proyecto.TipoPension#getTiposPagadorPension()
	 * @see #getTipoPension()
	 * @generated
	 */
	EReference getTipoPension_TiposPagadorPension();

	/**
	 * Returns the meta object for the attribute '{@link Proyecto.TipoPension#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see Proyecto.TipoPension#getDescripcion()
	 * @see #getTipoPension()
	 * @generated
	 */
	EAttribute getTipoPension_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link Proyecto.TipoPension#getTiposPensionado <em>Tipos Pensionado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tipos Pensionado</em>'.
	 * @see Proyecto.TipoPension#getTiposPensionado()
	 * @see #getTipoPension()
	 * @generated
	 */
	EReference getTipoPension_TiposPensionado();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectoFactory getProyectoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Proyecto.impl.PlanillaUnicaImpl <em>Planilla Unica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Proyecto.impl.PlanillaUnicaImpl
		 * @see Proyecto.impl.ProyectoPackageImpl#getPlanillaUnica()
		 * @generated
		 */
		EClass PLANILLA_UNICA = eINSTANCE.getPlanillaUnica();

		/**
		 * The meta object literal for the '<em><b>Tipos Pensionado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANILLA_UNICA__TIPOS_PENSIONADO = eINSTANCE.getPlanillaUnica_TiposPensionado();

		/**
		 * The meta object literal for the '<em><b>Tipos Pagador Pension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANILLA_UNICA__TIPOS_PAGADOR_PENSION = eINSTANCE.getPlanillaUnica_TiposPagadorPension();

		/**
		 * The meta object literal for the '<em><b>Tipos Pension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANILLA_UNICA__TIPOS_PENSION = eINSTANCE.getPlanillaUnica_TiposPension();

		/**
		 * The meta object literal for the '{@link Proyecto.impl.TipoPensionadoImpl <em>Tipo Pensionado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Proyecto.impl.TipoPensionadoImpl
		 * @see Proyecto.impl.ProyectoPackageImpl#getTipoPensionado()
		 * @generated
		 */
		EClass TIPO_PENSIONADO = eINSTANCE.getTipoPensionado();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PENSIONADO__CODIGO = eINSTANCE.getTipoPensionado_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PENSIONADO__NOMBRE = eINSTANCE.getTipoPensionado_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipos Pagador Pension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION = eINSTANCE.getTipoPensionado_TiposPagadorPension();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PENSIONADO__DESCRIPCION = eINSTANCE.getTipoPensionado_Descripcion();

		/**
		 * The meta object literal for the '{@link Proyecto.impl.TipoPagadorPensionImpl <em>Tipo Pagador Pension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Proyecto.impl.TipoPagadorPensionImpl
		 * @see Proyecto.impl.ProyectoPackageImpl#getTipoPagadorPension()
		 * @generated
		 */
		EClass TIPO_PAGADOR_PENSION = eINSTANCE.getTipoPagadorPension();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PAGADOR_PENSION__CODIGO = eINSTANCE.getTipoPagadorPension_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PAGADOR_PENSION__NOMBRE = eINSTANCE.getTipoPagadorPension_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PAGADOR_PENSION__DESCRIPCION = eINSTANCE.getTipoPagadorPension_Descripcion();

		/**
		 * The meta object literal for the '{@link Proyecto.impl.TipoPensionImpl <em>Tipo Pension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Proyecto.impl.TipoPensionImpl
		 * @see Proyecto.impl.ProyectoPackageImpl#getTipoPension()
		 * @generated
		 */
		EClass TIPO_PENSION = eINSTANCE.getTipoPension();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PENSION__CODIGO = eINSTANCE.getTipoPension_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PENSION__NOMBRE = eINSTANCE.getTipoPension_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipos Pagador Pension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_PENSION__TIPOS_PAGADOR_PENSION = eINSTANCE.getTipoPension_TiposPagadorPension();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_PENSION__DESCRIPCION = eINSTANCE.getTipoPension_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Tipos Pensionado</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIPO_PENSION__TIPOS_PENSIONADO = eINSTANCE.getTipoPension_TiposPensionado();

	}

} //ProyectoPackage
