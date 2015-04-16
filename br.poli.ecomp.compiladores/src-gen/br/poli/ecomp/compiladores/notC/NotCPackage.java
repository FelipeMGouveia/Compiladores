/**
 */
package br.poli.ecomp.compiladores.notC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.poli.ecomp.compiladores.notC.NotCFactory
 * @model kind="package"
 * @generated
 */
public interface NotCPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "notC";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.poli.br/ecomp/compiladores/NotC";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "notC";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NotCPackage eINSTANCE = br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl.init();

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.CodeImpl <em>Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.CodeImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getCode()
   * @generated
   */
  int CODE = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__FUNCTIONS = 1;

  /**
   * The number of structural features of the '<em>Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.FunctionImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ID = 1;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAM = 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BLOCK = 3;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.FuncParamImpl <em>Func Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.FuncParamImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getFuncParam()
   * @generated
   */
  int FUNC_PARAM = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PARAM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PARAM__ID = 1;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PARAM__NEXT = 2;

  /**
   * The number of structural features of the '<em>Func Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PARAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.BlockImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 3;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.StatementImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__COMMANDS = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.CommandImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 5;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXPR = 0;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.IfCommandImpl <em>If Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.IfCommandImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getIfCommand()
   * @generated
   */
  int IF_COMMAND = 6;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_COMMAND__EXPR = COMMAND__EXPR;

  /**
   * The feature id for the '<em><b>If Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_COMMAND__IF_BLOCK = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_COMMAND__ELSE_BLOCK = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.WhileCommandImpl <em>While Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.WhileCommandImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getWhileCommand()
   * @generated
   */
  int WHILE_COMMAND = 7;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_COMMAND__EXPR = COMMAND__EXPR;

  /**
   * The feature id for the '<em><b>While Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_COMMAND__WHILE_BLOCK = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>While Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.ReturnCommandImpl <em>Return Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.ReturnCommandImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getReturnCommand()
   * @generated
   */
  int RETURN_COMMAND = 8;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_COMMAND__EXPR = COMMAND__EXPR;

  /**
   * The number of structural features of the '<em>Return Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.DeclarationImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.RDeclarationImpl <em>RDeclaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.RDeclarationImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getRDeclaration()
   * @generated
   */
  int RDECLARATION = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDECLARATION__ID = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDECLARATION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDECLARATION__NEXT = 2;

  /**
   * The number of structural features of the '<em>RDeclaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RDECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.IDDeclarationImpl <em>ID Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.IDDeclarationImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getIDDeclaration()
   * @generated
   */
  int ID_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_DECLARATION__ID = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>ID Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.ExpressionImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RESULT = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = 3;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 4;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.TypeImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getType()
   * @generated
   */
  int TYPE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.ExprImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__RESULT = EXPRESSION__RESULT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.TermImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getTerm()
   * @generated
   */
  int TERM = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RESULT = EXPRESSION__RESULT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link br.poli.ecomp.compiladores.notC.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.poli.ecomp.compiladores.notC.impl.FactorImpl
   * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__RESULT = EXPRESSION__RESULT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__OPERATOR = EXPRESSION__OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Code <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code</em>'.
   * @see br.poli.ecomp.compiladores.notC.Code
   * @generated
   */
  EClass getCode();

  /**
   * Returns the meta object for the containment reference list '{@link br.poli.ecomp.compiladores.notC.Code#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see br.poli.ecomp.compiladores.notC.Code#getDeclarations()
   * @see #getCode()
   * @generated
   */
  EReference getCode_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link br.poli.ecomp.compiladores.notC.Code#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see br.poli.ecomp.compiladores.notC.Code#getFunctions()
   * @see #getCode()
   * @generated
   */
  EReference getCode_Functions();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see br.poli.ecomp.compiladores.notC.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Function#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see br.poli.ecomp.compiladores.notC.Function#getType()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Type();

  /**
   * Returns the meta object for the attribute '{@link br.poli.ecomp.compiladores.notC.Function#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see br.poli.ecomp.compiladores.notC.Function#getId()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Id();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Function#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see br.poli.ecomp.compiladores.notC.Function#getParam()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Param();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Function#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see br.poli.ecomp.compiladores.notC.Function#getBlock()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Block();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.FuncParam <em>Func Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Param</em>'.
   * @see br.poli.ecomp.compiladores.notC.FuncParam
   * @generated
   */
  EClass getFuncParam();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.FuncParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see br.poli.ecomp.compiladores.notC.FuncParam#getType()
   * @see #getFuncParam()
   * @generated
   */
  EReference getFuncParam_Type();

  /**
   * Returns the meta object for the attribute '{@link br.poli.ecomp.compiladores.notC.FuncParam#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see br.poli.ecomp.compiladores.notC.FuncParam#getId()
   * @see #getFuncParam()
   * @generated
   */
  EAttribute getFuncParam_Id();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.FuncParam#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see br.poli.ecomp.compiladores.notC.FuncParam#getNext()
   * @see #getFuncParam()
   * @generated
   */
  EReference getFuncParam_Next();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see br.poli.ecomp.compiladores.notC.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Block#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see br.poli.ecomp.compiladores.notC.Block#getStatement()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statement();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see br.poli.ecomp.compiladores.notC.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference list '{@link br.poli.ecomp.compiladores.notC.Statement#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see br.poli.ecomp.compiladores.notC.Statement#getDeclarations()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link br.poli.ecomp.compiladores.notC.Statement#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see br.poli.ecomp.compiladores.notC.Statement#getCommands()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Commands();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see br.poli.ecomp.compiladores.notC.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Command#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see br.poli.ecomp.compiladores.notC.Command#getExpr()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Expr();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.IfCommand <em>If Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Command</em>'.
   * @see br.poli.ecomp.compiladores.notC.IfCommand
   * @generated
   */
  EClass getIfCommand();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.IfCommand#getIfBlock <em>If Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Block</em>'.
   * @see br.poli.ecomp.compiladores.notC.IfCommand#getIfBlock()
   * @see #getIfCommand()
   * @generated
   */
  EReference getIfCommand_IfBlock();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.IfCommand#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see br.poli.ecomp.compiladores.notC.IfCommand#getElseBlock()
   * @see #getIfCommand()
   * @generated
   */
  EReference getIfCommand_ElseBlock();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.WhileCommand <em>While Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Command</em>'.
   * @see br.poli.ecomp.compiladores.notC.WhileCommand
   * @generated
   */
  EClass getWhileCommand();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.WhileCommand#getWhileBlock <em>While Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Block</em>'.
   * @see br.poli.ecomp.compiladores.notC.WhileCommand#getWhileBlock()
   * @see #getWhileCommand()
   * @generated
   */
  EReference getWhileCommand_WhileBlock();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.ReturnCommand <em>Return Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Command</em>'.
   * @see br.poli.ecomp.compiladores.notC.ReturnCommand
   * @generated
   */
  EClass getReturnCommand();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see br.poli.ecomp.compiladores.notC.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see br.poli.ecomp.compiladores.notC.Declaration#getType()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Declaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see br.poli.ecomp.compiladores.notC.Declaration#getValue()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Value();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.RDeclaration <em>RDeclaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RDeclaration</em>'.
   * @see br.poli.ecomp.compiladores.notC.RDeclaration
   * @generated
   */
  EClass getRDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.RDeclaration#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see br.poli.ecomp.compiladores.notC.RDeclaration#getId()
   * @see #getRDeclaration()
   * @generated
   */
  EReference getRDeclaration_Id();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.RDeclaration#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see br.poli.ecomp.compiladores.notC.RDeclaration#getLeft()
   * @see #getRDeclaration()
   * @generated
   */
  EReference getRDeclaration_Left();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.RDeclaration#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see br.poli.ecomp.compiladores.notC.RDeclaration#getNext()
   * @see #getRDeclaration()
   * @generated
   */
  EReference getRDeclaration_Next();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.IDDeclaration <em>ID Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Declaration</em>'.
   * @see br.poli.ecomp.compiladores.notC.IDDeclaration
   * @generated
   */
  EClass getIDDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.poli.ecomp.compiladores.notC.IDDeclaration#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see br.poli.ecomp.compiladores.notC.IDDeclaration#getId()
   * @see #getIDDeclaration()
   * @generated
   */
  EAttribute getIDDeclaration_Id();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.IDDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see br.poli.ecomp.compiladores.notC.IDDeclaration#getValue()
   * @see #getIDDeclaration()
   * @generated
   */
  EReference getIDDeclaration_Value();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link br.poli.ecomp.compiladores.notC.Expression#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expression#getResult()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Result();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link br.poli.ecomp.compiladores.notC.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link br.poli.ecomp.compiladores.notC.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see br.poli.ecomp.compiladores.notC.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link br.poli.ecomp.compiladores.notC.Type#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see br.poli.ecomp.compiladores.notC.Type#getValue()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Value();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see br.poli.ecomp.compiladores.notC.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see br.poli.ecomp.compiladores.notC.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link br.poli.ecomp.compiladores.notC.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see br.poli.ecomp.compiladores.notC.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NotCFactory getNotCFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.CodeImpl <em>Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.CodeImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getCode()
     * @generated
     */
    EClass CODE = eINSTANCE.getCode();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE__DECLARATIONS = eINSTANCE.getCode_Declarations();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE__FUNCTIONS = eINSTANCE.getCode_Functions();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.FunctionImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__TYPE = eINSTANCE.getFunction_Type();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__ID = eINSTANCE.getFunction_Id();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAM = eINSTANCE.getFunction_Param();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__BLOCK = eINSTANCE.getFunction_Block();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.FuncParamImpl <em>Func Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.FuncParamImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getFuncParam()
     * @generated
     */
    EClass FUNC_PARAM = eINSTANCE.getFuncParam();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_PARAM__TYPE = eINSTANCE.getFuncParam_Type();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_PARAM__ID = eINSTANCE.getFuncParam_Id();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_PARAM__NEXT = eINSTANCE.getFuncParam_Next();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.BlockImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENT = eINSTANCE.getBlock_Statement();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.StatementImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DECLARATIONS = eINSTANCE.getStatement_Declarations();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__COMMANDS = eINSTANCE.getStatement_Commands();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.CommandImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EXPR = eINSTANCE.getCommand_Expr();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.IfCommandImpl <em>If Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.IfCommandImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getIfCommand()
     * @generated
     */
    EClass IF_COMMAND = eINSTANCE.getIfCommand();

    /**
     * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_COMMAND__IF_BLOCK = eINSTANCE.getIfCommand_IfBlock();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_COMMAND__ELSE_BLOCK = eINSTANCE.getIfCommand_ElseBlock();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.WhileCommandImpl <em>While Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.WhileCommandImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getWhileCommand()
     * @generated
     */
    EClass WHILE_COMMAND = eINSTANCE.getWhileCommand();

    /**
     * The meta object literal for the '<em><b>While Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_COMMAND__WHILE_BLOCK = eINSTANCE.getWhileCommand_WhileBlock();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.ReturnCommandImpl <em>Return Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.ReturnCommandImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getReturnCommand()
     * @generated
     */
    EClass RETURN_COMMAND = eINSTANCE.getReturnCommand();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.DeclarationImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VALUE = eINSTANCE.getDeclaration_Value();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.RDeclarationImpl <em>RDeclaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.RDeclarationImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getRDeclaration()
     * @generated
     */
    EClass RDECLARATION = eINSTANCE.getRDeclaration();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RDECLARATION__ID = eINSTANCE.getRDeclaration_Id();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RDECLARATION__LEFT = eINSTANCE.getRDeclaration_Left();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RDECLARATION__NEXT = eINSTANCE.getRDeclaration_Next();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.IDDeclarationImpl <em>ID Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.IDDeclarationImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getIDDeclaration()
     * @generated
     */
    EClass ID_DECLARATION = eINSTANCE.getIDDeclaration();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_DECLARATION__ID = eINSTANCE.getIDDeclaration_Id();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_DECLARATION__VALUE = eINSTANCE.getIDDeclaration_Value();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.ExpressionImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__RESULT = eINSTANCE.getExpression_Result();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.TypeImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VALUE = eINSTANCE.getType_Value();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.ExprImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.TermImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link br.poli.ecomp.compiladores.notC.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.poli.ecomp.compiladores.notC.impl.FactorImpl
     * @see br.poli.ecomp.compiladores.notC.impl.NotCPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

  }

} //NotCPackage
