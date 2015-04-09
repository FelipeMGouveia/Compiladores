/**
 */
package br.poli.ecomp.compiladores.notC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.IfCommand#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link br.poli.ecomp.compiladores.notC.IfCommand#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getIfCommand()
 * @model
 * @generated
 */
public interface IfCommand extends Command
{
  /**
   * Returns the value of the '<em><b>If Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Block</em>' containment reference.
   * @see #setIfBlock(Block)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getIfCommand_IfBlock()
   * @model containment="true"
   * @generated
   */
  Block getIfBlock();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.IfCommand#getIfBlock <em>If Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Block</em>' containment reference.
   * @see #getIfBlock()
   * @generated
   */
  void setIfBlock(Block value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(Block)
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getIfCommand_ElseBlock()
   * @model containment="true"
   * @generated
   */
  Block getElseBlock();

  /**
   * Sets the value of the '{@link br.poli.ecomp.compiladores.notC.IfCommand#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(Block value);

} // IfCommand
