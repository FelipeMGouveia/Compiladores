package br.poli.ecomp.compiladores.serializer;

import br.poli.ecomp.compiladores.notC.Block;
import br.poli.ecomp.compiladores.notC.Code;
import br.poli.ecomp.compiladores.notC.Declaration;
import br.poli.ecomp.compiladores.notC.Expr;
import br.poli.ecomp.compiladores.notC.Expression;
import br.poli.ecomp.compiladores.notC.Factor;
import br.poli.ecomp.compiladores.notC.FuncParam;
import br.poli.ecomp.compiladores.notC.Function;
import br.poli.ecomp.compiladores.notC.IDDeclaration;
import br.poli.ecomp.compiladores.notC.IfCommand;
import br.poli.ecomp.compiladores.notC.NotCPackage;
import br.poli.ecomp.compiladores.notC.RDeclaration;
import br.poli.ecomp.compiladores.notC.ReturnCommand;
import br.poli.ecomp.compiladores.notC.Statement;
import br.poli.ecomp.compiladores.notC.Term;
import br.poli.ecomp.compiladores.notC.Type;
import br.poli.ecomp.compiladores.notC.WhileCommand;
import br.poli.ecomp.compiladores.services.NotCGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class NotCSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NotCGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == NotCPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NotCPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.CODE:
				if(context == grammarAccess.getCodeRule()) {
					sequence_Code(context, (Code) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.EXPR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprAccess().getExprLeftAction_1_0()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.EXPRESSION:
				if(context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprAccess().getExprLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftAction_1_0() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermAccess().getTermLeftAction_1_0()) {
					sequence_Atomic(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.FACTOR:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprAccess().getExprLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftAction_1_0() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermAccess().getTermLeftAction_1_0()) {
					sequence_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.FUNC_PARAM:
				if(context == grammarAccess.getFuncParamRule()) {
					sequence_FuncParam(context, (FuncParam) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.ID_DECLARATION:
				if(context == grammarAccess.getIDDeclarationRule()) {
					sequence_IDDeclaration(context, (IDDeclaration) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.IF_COMMAND:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getIfCommandRule()) {
					sequence_IfCommand(context, (IfCommand) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.RDECLARATION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getRDeclarationRule()) {
					sequence_RDeclaration(context, (RDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRDeclarationAccess().getRDeclarationLeftAction_1_0()) {
					sequence_RDeclaration_RDeclaration_1_0(context, (RDeclaration) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.RETURN_COMMAND:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getReturnCommandRule()) {
					sequence_ReturnCommand(context, (ReturnCommand) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.TERM:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprAccess().getExprLeftAction_1_0() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermAccess().getTermLeftAction_1_0()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case NotCPackage.WHILE_COMMAND:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getWhileCommandRule()) {
					sequence_WhileCommand(context, (WhileCommand) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=Expr | result=Element)
	 */
	protected void sequence_Atomic(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.BLOCK__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.BLOCK__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration* functions+=Function*)
	 */
	protected void sequence_Code(EObject context, Code semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type value=RDeclaration)
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.DECLARATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDeclarationAccess().getValueRDeclarationParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expr_Expr_1_0 (operator='+' | operator='-') right=Term)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Factor_Factor_1_0 operator='^' right=Atomic)
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type id=ID next=FuncParam?)
	 */
	protected void sequence_FuncParam(EObject context, FuncParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type id=ID param=FuncParam? block=Block)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID value=Expr?)
	 */
	protected void sequence_IDDeclaration(EObject context, IDDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr ifBlock=Block elseBlock=Block?)
	 */
	protected void sequence_IfCommand(EObject context, IfCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=RDeclaration_RDeclaration_1_0 next=RDeclaration) | id=IDDeclaration)
	 */
	protected void sequence_RDeclaration(EObject context, RDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=IDDeclaration
	 */
	protected void sequence_RDeclaration_RDeclaration_1_0(EObject context, RDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_ReturnCommand(EObject context, ReturnCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.RETURN_COMMAND__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.RETURN_COMMAND__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnCommandAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration* commands+=Command*)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Term_Term_1_0 (operator='*' | operator='/') right=Factor)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='var'
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getValueVarKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr whileBlock=Block)
	 */
	protected void sequence_WhileCommand(EObject context, WhileCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.WHILE_COMMAND__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.WHILE_COMMAND__EXPR));
			if(transientValues.isValueTransient(semanticObject, NotCPackage.Literals.WHILE_COMMAND__WHILE_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NotCPackage.Literals.WHILE_COMMAND__WHILE_BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getWhileCommandAccess().getWhileBlockBlockParserRuleCall_4_0(), semanticObject.getWhileBlock());
		feeder.finish();
	}
}
