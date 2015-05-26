/**
 */
package br.poli.ecomp.compiladores.notC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDeclaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.KDeclaration#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getKDeclaration()
 * @model
 * @generated
 */
public interface KDeclaration extends Command
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(RDeclaration)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getKDeclaration_Declaration()
   * @model containment="true"
   * @generated
   */
  RDeclaration getDeclaration();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.KDeclaration#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(RDeclaration value);

} // KDeclaration
