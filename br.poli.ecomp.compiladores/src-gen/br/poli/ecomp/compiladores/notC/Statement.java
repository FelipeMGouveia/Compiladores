/**
 */
package br.poli.ecomp.compiladores.notC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.poli.ecomp.compiladores.notC.Statement#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.poli.ecomp.compiladores.notC.NotCPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link br.poli.ecomp.compiladores.notC.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see br.poli.ecomp.compiladores.notC.NotCPackage#getStatement_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Statement
