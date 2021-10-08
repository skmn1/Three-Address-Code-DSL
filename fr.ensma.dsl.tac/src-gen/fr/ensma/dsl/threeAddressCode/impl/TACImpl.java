/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.dsl.threeAddressCode.impl;

import fr.ensma.dsl.threeAddressCode.FunctionDef;
import fr.ensma.dsl.threeAddressCode.TAC;
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
 * An implementation of the model object '<em><b>TAC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.dsl.threeAddressCode.impl.TACImpl#getTac <em>Tac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TACImpl extends MinimalEObjectImpl.Container implements TAC
{
  /**
   * The cached value of the '{@link #getTac() <em>Tac</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTac()
   * @generated
   * @ordered
   */
  protected EList<FunctionDef> tac;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TACImpl()
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
    return ThreeAddressCodePackage.Literals.TAC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FunctionDef> getTac()
  {
    if (tac == null)
    {
      tac = new EObjectContainmentEList<FunctionDef>(FunctionDef.class, this, ThreeAddressCodePackage.TAC__TAC);
    }
    return tac;
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
      case ThreeAddressCodePackage.TAC__TAC:
        return ((InternalEList<?>)getTac()).basicRemove(otherEnd, msgs);
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
      case ThreeAddressCodePackage.TAC__TAC:
        return getTac();
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
      case ThreeAddressCodePackage.TAC__TAC:
        getTac().clear();
        getTac().addAll((Collection<? extends FunctionDef>)newValue);
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
      case ThreeAddressCodePackage.TAC__TAC:
        getTac().clear();
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
      case ThreeAddressCodePackage.TAC__TAC:
        return tac != null && !tac.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TACImpl