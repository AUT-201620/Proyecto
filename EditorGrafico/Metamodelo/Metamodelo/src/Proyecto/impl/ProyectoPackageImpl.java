/**
 */
package Proyecto.impl;

import Proyecto.PlanillaUnica;
import Proyecto.ProyectoFactory;
import Proyecto.ProyectoPackage;
import Proyecto.TipoPagadorPension;
import Proyecto.TipoPension;
import Proyecto.TipoPensionado;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectoPackageImpl extends EPackageImpl implements ProyectoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planillaUnicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoPensionadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoPagadorPensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoPensionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Proyecto.ProyectoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectoPackageImpl() {
		super(eNS_URI, ProyectoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProyectoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectoPackage init() {
		if (isInited) return (ProyectoPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectoPackage.eNS_URI);

		// Obtain or create and register package
		ProyectoPackageImpl theProyectoPackage = (ProyectoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProyectoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProyectoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProyectoPackage.createPackageContents();

		// Initialize created meta-data
		theProyectoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProyectoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectoPackage.eNS_URI, theProyectoPackage);
		return theProyectoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanillaUnica() {
		return planillaUnicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanillaUnica_TiposPensionado() {
		return (EReference)planillaUnicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanillaUnica_TiposPagadorPension() {
		return (EReference)planillaUnicaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanillaUnica_TiposPension() {
		return (EReference)planillaUnicaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoPensionado() {
		return tipoPensionadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPensionado_Codigo() {
		return (EAttribute)tipoPensionadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPensionado_Nombre() {
		return (EAttribute)tipoPensionadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTipoPensionado_TiposPagadorPension() {
		return (EReference)tipoPensionadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPensionado_Descripcion() {
		return (EAttribute)tipoPensionadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoPagadorPension() {
		return tipoPagadorPensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPagadorPension_Codigo() {
		return (EAttribute)tipoPagadorPensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPagadorPension_Nombre() {
		return (EAttribute)tipoPagadorPensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPagadorPension_Descripcion() {
		return (EAttribute)tipoPagadorPensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoPension() {
		return tipoPensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPension_Codigo() {
		return (EAttribute)tipoPensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPension_Nombre() {
		return (EAttribute)tipoPensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTipoPension_TiposPagadorPension() {
		return (EReference)tipoPensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoPension_Descripcion() {
		return (EAttribute)tipoPensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTipoPension_TiposPensionado() {
		return (EReference)tipoPensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectoFactory getProyectoFactory() {
		return (ProyectoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		planillaUnicaEClass = createEClass(PLANILLA_UNICA);
		createEReference(planillaUnicaEClass, PLANILLA_UNICA__TIPOS_PENSIONADO);
		createEReference(planillaUnicaEClass, PLANILLA_UNICA__TIPOS_PAGADOR_PENSION);
		createEReference(planillaUnicaEClass, PLANILLA_UNICA__TIPOS_PENSION);

		tipoPensionadoEClass = createEClass(TIPO_PENSIONADO);
		createEAttribute(tipoPensionadoEClass, TIPO_PENSIONADO__CODIGO);
		createEAttribute(tipoPensionadoEClass, TIPO_PENSIONADO__NOMBRE);
		createEReference(tipoPensionadoEClass, TIPO_PENSIONADO__TIPOS_PAGADOR_PENSION);
		createEAttribute(tipoPensionadoEClass, TIPO_PENSIONADO__DESCRIPCION);

		tipoPagadorPensionEClass = createEClass(TIPO_PAGADOR_PENSION);
		createEAttribute(tipoPagadorPensionEClass, TIPO_PAGADOR_PENSION__CODIGO);
		createEAttribute(tipoPagadorPensionEClass, TIPO_PAGADOR_PENSION__NOMBRE);
		createEAttribute(tipoPagadorPensionEClass, TIPO_PAGADOR_PENSION__DESCRIPCION);

		tipoPensionEClass = createEClass(TIPO_PENSION);
		createEAttribute(tipoPensionEClass, TIPO_PENSION__CODIGO);
		createEAttribute(tipoPensionEClass, TIPO_PENSION__NOMBRE);
		createEReference(tipoPensionEClass, TIPO_PENSION__TIPOS_PAGADOR_PENSION);
		createEAttribute(tipoPensionEClass, TIPO_PENSION__DESCRIPCION);
		createEReference(tipoPensionEClass, TIPO_PENSION__TIPOS_PENSIONADO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(planillaUnicaEClass, PlanillaUnica.class, "PlanillaUnica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanillaUnica_TiposPensionado(), this.getTipoPensionado(), null, "tiposPensionado", null, 0, -1, PlanillaUnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanillaUnica_TiposPagadorPension(), this.getTipoPagadorPension(), null, "tiposPagadorPension", null, 0, -1, PlanillaUnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanillaUnica_TiposPension(), this.getTipoPension(), null, "tiposPension", null, 0, -1, PlanillaUnica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoPensionadoEClass, TipoPensionado.class, "TipoPensionado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoPensionado_Codigo(), ecorePackage.getEInt(), "codigo", null, 0, 1, TipoPensionado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoPensionado_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TipoPensionado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTipoPensionado_TiposPagadorPension(), this.getTipoPagadorPension(), null, "tiposPagadorPension", null, 0, -1, TipoPensionado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoPensionado_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, TipoPensionado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoPagadorPensionEClass, TipoPagadorPension.class, "TipoPagadorPension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoPagadorPension_Codigo(), ecorePackage.getEInt(), "codigo", null, 0, 1, TipoPagadorPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoPagadorPension_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TipoPagadorPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoPagadorPension_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, TipoPagadorPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoPensionEClass, TipoPension.class, "TipoPension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoPension_Codigo(), ecorePackage.getEInt(), "codigo", null, 0, 1, TipoPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoPension_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TipoPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTipoPension_TiposPagadorPension(), this.getTipoPagadorPension(), null, "tiposPagadorPension", null, 0, -1, TipoPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTipoPension_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, TipoPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTipoPension_TiposPensionado(), this.getTipoPensionado(), null, "tiposPensionado", null, 0, -1, TipoPension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProyectoPackageImpl
