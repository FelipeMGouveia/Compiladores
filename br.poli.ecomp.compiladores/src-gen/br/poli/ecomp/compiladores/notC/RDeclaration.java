/**
 */
package br.poli.ecomp.compiladores.notC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDeclaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.RDeclaration#getId <em>Id</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.RDeclaration#getLeft <em>Left</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.RDeclaration#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getRDeclaration()
 * @model
 * @generated
 */
public interface RDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(IDDeclaration)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getRDeclaration_Id()
   * @model containment="true"
   * @generated
   */
  IDDeclaration getId();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.RDeclaration#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(IDDeclaration value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(RDeclaration)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getRDeclaration_Left()
   * @model containment="true"
   * @generated
   */
  RDeclaration getLeft();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.RDeclaration#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(RDeclaration value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(RDeclaration)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getRDeclaration_Next()
   * @model containment="true"
   * @generated
   */
  RDeclaration getNext();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.RDeclaration#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(RDeclaration value);

} // RDeclaration
