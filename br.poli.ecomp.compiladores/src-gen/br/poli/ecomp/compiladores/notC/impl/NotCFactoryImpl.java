/**
 */
package br.poli.ecomp.compiladores.notC.impl;

import br.poli.ecomp.compiladores.notC.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotCFactoryImpl extends EFactoryImpl implements NotCFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NotCFactory init()
  {
    try
    {
      NotCFactory theNotCFactory = (NotCFactory)EPackage.Registry.INSTANCE.getEFactory(NotCPackage.eNS_URI);
      if (theNotCFactory != null)
      {
        return theNotCFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NotCFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotCFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NotCPackage.CODE: return createCode();
      case NotCPackage.FUNCTION: return createFunction();
      case NotCPackage.FUNC_PARAM: return createFuncParam();
      case NotCPackage.BLOCK: return createBlock();
      case NotCPackage.STATEMENT: return createStatement();
      case NotCPackage.COMMAND: return createCommand();
      case NotCPackage.IF_COMMAND: return createIfCommand();
      case NotCPackage.WHILE_COMMAND: return createWhileCommand();
      case NotCPackage.DECLARATION: return createDeclaration();
      case NotCPackage.RDECLARATION: return createRDeclaration();
      case NotCPackage.ID_DECLARATION: return createIDDeclaration();
      case NotCPackage.EXPRESSION: return createExpression();
      case NotCPackage.EXPR5: return createExpr5();
      case NotCPackage.EXPR: return createExpr();
      case NotCPackage.EXPR2: return createExpr2();
      case NotCPackage.EXPR3: return createExpr3();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Code createCode()
  {
    CodeImpl code = new CodeImpl();
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncParam createFuncParam()
  {
    FuncParamImpl funcParam = new FuncParamImpl();
    return funcParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfCommand createIfCommand()
  {
    IfCommandImpl ifCommand = new IfCommandImpl();
    return ifCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileCommand createWhileCommand()
  {
    WhileCommandImpl whileCommand = new WhileCommandImpl();
    return whileCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RDeclaration createRDeclaration()
  {
    RDeclarationImpl rDeclaration = new RDeclarationImpl();
    return rDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDDeclaration createIDDeclaration()
  {
    IDDeclarationImpl idDeclaration = new IDDeclarationImpl();
    return idDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr5 createExpr5()
  {
    Expr5Impl expr5 = new Expr5Impl();
    return expr5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr2 createExpr2()
  {
    Expr2Impl expr2 = new Expr2Impl();
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr3 createExpr3()
  {
    Expr3Impl expr3 = new Expr3Impl();
    return expr3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotCPackage getNotCPackage()
  {
    return (NotCPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NotCPackage getPackage()
  {
    return NotCPackage.eINSTANCE;
  }

} //NotCFactoryImpl
