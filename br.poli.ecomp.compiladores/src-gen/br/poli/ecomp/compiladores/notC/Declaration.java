/**
 */
package br.poli.ecomp.compiladores.notC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.Declaration#getType <em>Type</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.Declaration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Command
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
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.Declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(RDeclaration)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  RDeclaration getValue();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.Declaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(RDeclaration value);

} // Declaration
