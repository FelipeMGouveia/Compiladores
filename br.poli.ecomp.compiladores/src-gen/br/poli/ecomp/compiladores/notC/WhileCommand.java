/**
 */
package br.poli.ecomp.compiladores.notC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.WhileCommand#getWhileBlock <em>While Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getWhileCommand()
 * @model
 * @generated
 */
public interface WhileCommand extends Command
{
  /**
   * Returns the value of the '<em><b>While Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While Block</em>' containment reference.
   * @see #setWhileBlock(Block)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getWhileCommand_WhileBlock()
   * @model containment="true"
   * @generated
   */
  Block getWhileBlock();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.WhileCommand#getWhileBlock <em>While Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While Block</em>' containment reference.
   * @see #getWhileBlock()
   * @generated
   */
  void setWhileBlock(Block value);

} // WhileCommand
