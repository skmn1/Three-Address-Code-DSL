/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.dsl.threeAddressCode.impl;

import fr.ensma.dsl.threeAddressCode.AssignOperation;
import fr.ensma.dsl.threeAddressCode.FunctionCall;
import fr.ensma.dsl.threeAddressCode.ThreeAddressCodePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.impl.AssignOperationImpl#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignOperationImpl extends MinimalEObjectImpl.Container implements AssignOperation
{
  /**
   * The cached value of the '{@link #getFunctionCall() <em>Function Call</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionCall()
   * @generated
   * @ordered
   */
  protected EList<FunctionCall> functionCall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThreeAddressCodePackage.Literals.ASSIGN_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FunctionCall> getFunctionCall()
  {
    if (functionCall == null)
    {
      functionCall = new EObjectContainmentEList<FunctionCall>(FunctionCall.class, this, ThreeAddressCodePackage.ASSIGN_OPERATION__FUNCTION_CALL);
    }
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ThreeAddressCodePackage.ASSIGN_OPERATION__FUNCTION_CALL:
        return ((InternalEList<?>)getFunctionCall()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThreeAddressCodePackage.ASSIGN_OPERATION__FUNCTION_CALL:
        return getFunctionCall();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThreeAddressCodePackage.ASSIGN_OPERATION__FUNCTION_CALL:
        getFunctionCall().clear();
        getFunctionCall().addAll((Collection<? extends FunctionCall>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThreeAddressCodePackage.ASSIGN_OPERATION__FUNCTION_CALL:
        getFunctionCall().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThreeAddressCodePackage.ASSIGN_OPERATION__FUNCTION_CALL:
        return functionCall != null && !functionCall.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssignOperationImpl