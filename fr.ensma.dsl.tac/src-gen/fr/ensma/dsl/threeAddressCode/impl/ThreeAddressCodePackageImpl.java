/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.dsl.threeAddressCode.impl;

import fr.ensma.dsl.threeAddressCode.ArithmeticOperation;
import fr.ensma.dsl.threeAddressCode.AssignOperation;
import fr.ensma.dsl.threeAddressCode.BouleanExrpession;
import fr.ensma.dsl.threeAddressCode.DataType;
import fr.ensma.dsl.threeAddressCode.Function;
import fr.ensma.dsl.threeAddressCode.FunctionArgument;
import fr.ensma.dsl.threeAddressCode.FunctionCall;
import fr.ensma.dsl.threeAddressCode.FunctionDef;
import fr.ensma.dsl.threeAddressCode.FunctionParam;
import fr.ensma.dsl.threeAddressCode.Goto;
import fr.ensma.dsl.threeAddressCode.If;
import fr.ensma.dsl.threeAddressCode.Label;
import fr.ensma.dsl.threeAddressCode.LogicalOperation;
import fr.ensma.dsl.threeAddressCode.Struct;
import fr.ensma.dsl.threeAddressCode.ThreeAddressCodeFactory;
import fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage;

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
public class ThreeAddressCodePackageImpl extends EPackageImpl implements ThreeAddressCodePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tacEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bouleanExrpessionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOperationEClass = null;

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
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ThreeAddressCodePackageImpl()
  {
    super(eNS_URI, ThreeAddressCodeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ThreeAddressCodePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ThreeAddressCodePackage init()
  {
    if (isInited) return (ThreeAddressCodePackage)EPackage.Registry.INSTANCE.getEPackage(ThreeAddressCodePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredThreeAddressCodePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ThreeAddressCodePackageImpl theThreeAddressCodePackage = registeredThreeAddressCodePackage instanceof ThreeAddressCodePackageImpl ? (ThreeAddressCodePackageImpl)registeredThreeAddressCodePackage : new ThreeAddressCodePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theThreeAddressCodePackage.createPackageContents();

    // Initialize created meta-data
    theThreeAddressCodePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theThreeAddressCodePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ThreeAddressCodePackage.eNS_URI, theThreeAddressCodePackage);
    return theThreeAddressCodePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTAC()
  {
    return tacEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTAC_Tac()
  {
    return (EReference)tacEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunctionDef()
  {
    return functionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_Function()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_Functionparam()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_Struct()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_Label()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_Goto()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_If()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_FunctionCall()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionDef_AssignOp()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunctionCall()
  {
    return functionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionCall_FunctionCall()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionCall_FunctionArgument()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunctionParam()
  {
    return functionParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionParam_Struct()
  {
    return (EReference)functionParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctionParam_Datatype()
  {
    return (EReference)functionParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunctionParam_Name()
  {
    return (EAttribute)functionParamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunctionArgument()
  {
    return functionArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStruct()
  {
    return structEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGoto()
  {
    return gotoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIf()
  {
    return ifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAssignOperation()
  {
    return assignOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAssignOperation_FunctionCall()
  {
    return (EReference)assignOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBouleanExrpession()
  {
    return bouleanExrpessionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArithmeticOperation()
  {
    return arithmeticOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLogicalOperation()
  {
    return logicalOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ThreeAddressCodeFactory getThreeAddressCodeFactory()
  {
    return (ThreeAddressCodeFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tacEClass = createEClass(TAC);
    createEReference(tacEClass, TAC__TAC);

    functionDefEClass = createEClass(FUNCTION_DEF);
    createEReference(functionDefEClass, FUNCTION_DEF__FUNCTION);
    createEReference(functionDefEClass, FUNCTION_DEF__FUNCTIONPARAM);
    createEReference(functionDefEClass, FUNCTION_DEF__STRUCT);
    createEReference(functionDefEClass, FUNCTION_DEF__LABEL);
    createEReference(functionDefEClass, FUNCTION_DEF__GOTO);
    createEReference(functionDefEClass, FUNCTION_DEF__IF);
    createEReference(functionDefEClass, FUNCTION_DEF__FUNCTION_CALL);
    createEReference(functionDefEClass, FUNCTION_DEF__ASSIGN_OP);

    functionCallEClass = createEClass(FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__FUNCTION_ARGUMENT);

    functionParamEClass = createEClass(FUNCTION_PARAM);
    createEReference(functionParamEClass, FUNCTION_PARAM__STRUCT);
    createEReference(functionParamEClass, FUNCTION_PARAM__DATATYPE);
    createEAttribute(functionParamEClass, FUNCTION_PARAM__NAME);

    functionArgumentEClass = createEClass(FUNCTION_ARGUMENT);

    dataTypeEClass = createEClass(DATA_TYPE);

    structEClass = createEClass(STRUCT);

    gotoEClass = createEClass(GOTO);

    labelEClass = createEClass(LABEL);

    ifEClass = createEClass(IF);

    assignOperationEClass = createEClass(ASSIGN_OPERATION);
    createEReference(assignOperationEClass, ASSIGN_OPERATION__FUNCTION_CALL);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);

    bouleanExrpessionEClass = createEClass(BOULEAN_EXRPESSION);

    arithmeticOperationEClass = createEClass(ARITHMETIC_OPERATION);

    logicalOperationEClass = createEClass(LOGICAL_OPERATION);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bouleanExrpessionEClass.getESuperTypes().add(this.getIf());
    logicalOperationEClass.getESuperTypes().add(this.getBouleanExrpession());

    // Initialize classes and features; add operations and parameters
    initEClass(tacEClass, fr.ensma.dsl.threeAddressCode.TAC.class, "TAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTAC_Tac(), this.getFunctionDef(), null, "tac", null, 0, -1, fr.ensma.dsl.threeAddressCode.TAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefEClass, FunctionDef.class, "FunctionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDef_Function(), this.getFunction(), null, "function", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_Functionparam(), this.getFunctionParam(), null, "functionparam", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_Struct(), this.getStruct(), null, "struct", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_Label(), this.getLabel(), null, "label", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_Goto(), this.getGoto(), null, "goto", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_If(), this.getIf(), null, "if", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_FunctionCall(), this.getFunctionCall(), null, "functionCall", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_AssignOp(), this.getAssignOperation(), null, "assignOp", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionCall_FunctionCall(), this.getFunction(), null, "functionCall", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionCall_FunctionArgument(), this.getFunctionArgument(), null, "functionArgument", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionParamEClass, FunctionParam.class, "FunctionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionParam_Struct(), this.getStruct(), null, "struct", null, 0, -1, FunctionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionParam_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, FunctionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgumentEClass, FunctionArgument.class, "FunctionArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignOperationEClass, AssignOperation.class, "AssignOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignOperation_FunctionCall(), this.getFunctionCall(), null, "functionCall", null, 0, -1, AssignOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bouleanExrpessionEClass, BouleanExrpession.class, "BouleanExrpession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arithmeticOperationEClass, ArithmeticOperation.class, "ArithmeticOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalOperationEClass, LogicalOperation.class, "LogicalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ThreeAddressCodePackageImpl
