/**
 */
package br.poli.ecomp.compiladores.notC.impl;

import br.poli.ecomp.compiladores.notC.Block;
import br.poli.ecomp.compiladores.notC.Expression;
import br.poli.ecomp.compiladores.notC.NotCPackage;
import br.poli.ecomp.compiladores.notC.WhileCommand;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.impl.WhileCommandImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.impl.WhileCommandImpl#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileCommandImpl extends CommandImpl implements WhileCommand
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getWhileBlock() <em>While Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhileBlock()
   * @generated
   * @ordered
   */
  protected Block whileBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileCommandImpl()
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
    return NotCPackage.Literals.WHILE_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotCPackage.WHILE_COMMAND__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotCPackage.WHILE_COMMAND__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotCPackage.WHILE_COMMAND__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NotCPackage.WHILE_COMMAND__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getWhileBlock()
  {
    return whileBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhileBlock(Block newWhileBlock, NotificationChain msgs)
  {
    Block oldWhileBlock = whileBlock;
    whileBlock = newWhileBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotCPackage.WHILE_COMMAND__WHILE_BLOCK, oldWhileBlock, newWhileBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhileBlock(Block newWhileBlock)
  {
    if (newWhileBlock != whileBlock)
    {
      NotificationChain msgs = null;
      if (whileBlock != null)
        msgs = ((InternalEObject)whileBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NotCPackage.WHILE_COMMAND__WHILE_BLOCK, null, msgs);
      if (newWhileBlock != null)
        msgs = ((InternalEObject)newWhileBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NotCPackage.WHILE_COMMAND__WHILE_BLOCK, null, msgs);
      msgs = basicSetWhileBlock(newWhileBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NotCPackage.WHILE_COMMAND__WHILE_BLOCK, newWhileBlock, newWhileBlock));
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
      case NotCPackage.WHILE_COMMAND__EXPR:
        return basicSetExpr(null, msgs);
      case NotCPackage.WHILE_COMMAND__WHILE_BLOCK:
        return basicSetWhileBlock(null, msgs);
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
      case NotCPackage.WHILE_COMMAND__EXPR:
        return getExpr();
      case NotCPackage.WHILE_COMMAND__WHILE_BLOCK:
        return getWhileBlock();
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
      case NotCPackage.WHILE_COMMAND__EXPR:
        setExpr((Expression)newValue);
        return;
      case NotCPackage.WHILE_COMMAND__WHILE_BLOCK:
        setWhileBlock((Block)newValue);
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
      case NotCPackage.WHILE_COMMAND__EXPR:
        setExpr((Expression)null);
        return;
      case NotCPackage.WHILE_COMMAND__WHILE_BLOCK:
        setWhileBlock((Block)null);
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
      case NotCPackage.WHILE_COMMAND__EXPR:
        return expr != null;
      case NotCPackage.WHILE_COMMAND__WHILE_BLOCK:
        return whileBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileCommandImpl
