/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.dsl.threeAddressCode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getFunctionparam <em>Functionparam</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getStruct <em>Struct</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getGoto <em>Goto</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getIf <em>If</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getFunctionCall <em>Function Call</em>}</li>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.FunctionDef#getAssignOp <em>Assign Op</em>}</li>
 * </ul>
 *
 * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef()
 * @model
 * @generated
 */
public interface FunctionDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.Function}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_Function()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunction();

  /**
   * Returns the value of the '<em><b>Functionparam</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.FunctionParam}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functionparam</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_Functionparam()
   * @model containment="true"
   * @generated
   */
  EList<FunctionParam> getFunctionparam();

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.Struct}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_Struct()
   * @model containment="true"
   * @generated
   */
  EList<Struct> getStruct();

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.Label}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_Label()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabel();

  /**
   * Returns the value of the '<em><b>Goto</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.Goto}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_Goto()
   * @model containment="true"
   * @generated
   */
  EList<Goto> getGoto();

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.If}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_If()
   * @model containment="true"
   * @generated
   */
  EList<If> getIf();

  /**
   * Returns the value of the '<em><b>Function Call</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.FunctionCall}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Call</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_FunctionCall()
   * @model containment="true"
   * @generated
   */
  EList<FunctionCall> getFunctionCall();

  /**
   * Returns the value of the '<em><b>Assign Op</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.dsl.threeAddressCode.AssignOperation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign Op</em>' containment reference list.
   * @see fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage#getFunctionDef_AssignOp()
   * @model containment="true"
   * @generated
   */
  EList<AssignOperation> getAssignOp();

} // FunctionDef
