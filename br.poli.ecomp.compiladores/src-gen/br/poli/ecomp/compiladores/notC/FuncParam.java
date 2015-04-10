/**
 */
package br.poli.ecomp.compiladores.notC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.FuncParam#getType <em>Type</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.FuncParam#getId <em>Id</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.FuncParam#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getFuncParam()
 * @model
 * @generated
 */
public interface FuncParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getFuncParam_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.FuncParam#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getFuncParam_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.FuncParam#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(FuncParam)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getFuncParam_Next()
   * @model containment="true"
   * @generated
   */
  FuncParam getNext();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.FuncParam#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(FuncParam value);

} // FuncParam
