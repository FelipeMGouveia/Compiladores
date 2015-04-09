/**
 */
package br.poli.ecomp.compiladores.notC.impl;

import br.poli.ecomp.compiladores.notC.Block;
import br.poli.ecomp.compiladores.notC.IfCommand;
import br.poli.ecomp.compiladores.notC.NotCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.impl.IfCommandImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.impl.IfCommandImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfCommandImpl extends CommandImpl implements IfCommand
{
  /**
   * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfBlock()
   * @generated
   * @ordered
   */
  protected Block ifBlock;

  /**
   * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBlock()
   * @generated
   * @ordered
   */
  protected Block elseBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfCommandImpl()
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
    return NotCPackage.Literals.IF_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getIfBlock()
  {
    return ifBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfBlock(Block newIfBlock, NotificationChain msgs)
  {
    Block oldIfBlock = ifBlock;
    ifBlock = newIfBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotCPackage.IF_COMMAND__IF_BLOCK, oldIfBlock, newIfBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfBlock(Block newIfBlock)
  {
    if (newIfBlock != ifBlock)
    {
      NotificationChain msgs = null;
      if (ifBlock != null)
        msgs = ((InternalEObject)ifBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotCPackage.IF_COMMAND__IF_BLOCK, null, msgs);
      if (newIfBlock != null)
        msgs = ((InternalEObject)newIfBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotCPackage.IF_COMMAND__IF_BLOCK, null, msgs);
      msgs = basicSetIfBlock(newIfBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NotCPackage.IF_COMMAND__IF_BLOCK, newIfBlock, newIfBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getElseBlock()
  {
    return elseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBlock(Block newElseBlock, NotificationChain msgs)
  {
    Block oldElseBlock = elseBlock;
    elseBlock = newElseBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotCPackage.IF_COMMAND__ELSE_BLOCK, oldElseBlock, newElseBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBlock(Block newElseBlock)
  {
    if (newElseBlock != elseBlock)
    {
      NotificationChain msgs = null;
      if (elseBlock != null)
        msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotCPackage.IF_COMMAND__ELSE_BLOCK, null, msgs);
      if (newElseBlock != null)
        msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotCPackage.IF_COMMAND__ELSE_BLOCK, null, msgs);
      msgs = basicSetElseBlock(newElseBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NotCPackage.IF_COMMAND__ELSE_BLOCK, newElseBlock, newElseBlock));
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
      case NotCPackage.IF_COMMAND__IF_BLOCK:
        return basicSetIfBlock(null, msgs);
      case NotCPackage.IF_COMMAND__ELSE_BLOCK:
        return basicSetElseBlock(null, msgs);
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
      case NotCPackage.IF_COMMAND__IF_BLOCK:
        return getIfBlock();
      case NotCPackage.IF_COMMAND__ELSE_BLOCK:
        return getElseBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NotCPackage.IF_COMMAND__IF_BLOCK:
        setIfBlock((Block)newValue);
        return;
      case NotCPackage.IF_COMMAND__ELSE_BLOCK:
        setElseBlock((Block)newValue);
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
      case NotCPackage.IF_COMMAND__IF_BLOCK:
        setIfBlock((Block)null);
        return;
      case NotCPackage.IF_COMMAND__ELSE_BLOCK:
        setElseBlock((Block)null);
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
      case NotCPackage.IF_COMMAND__IF_BLOCK:
        return ifBlock != null;
      case NotCPackage.IF_COMMAND__ELSE_BLOCK:
        return elseBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //IfCommandImpl
