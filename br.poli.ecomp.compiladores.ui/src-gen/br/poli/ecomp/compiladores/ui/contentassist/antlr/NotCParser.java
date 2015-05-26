/*
* generated by Xtext
*/
package br.poli.ecomp.compiladores.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import br.poli.ecomp.compiladores.services.NotCGrammarAccess;

public class NotCParser extends AbstractContentAssistParser {
	
	@Inject
	private NotCGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected br.poli.ecomp.compiladores.ui.contentassist.antlr.internal.InternalNotCParser createParser() {
		br.poli.ecomp.compiladores.ui.contentassist.antlr.internal.InternalNotCParser result = new br.poli.ecomp.compiladores.ui.contentassist.antlr.internal.InternalNotCParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getExprAccess().getOperatorAlternatives_1_1_0(), "rule__Expr__OperatorAlternatives_1_1_0");
					put(grammarAccess.getTermAccess().getOperatorAlternatives_1_1_0(), "rule__Term__OperatorAlternatives_1_1_0");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getCodeAccess().getGroup(), "rule__Code__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFuncParamAccess().getGroup(), "rule__FuncParam__Group__0");
					put(grammarAccess.getFuncParamAccess().getGroup_2(), "rule__FuncParam__Group_2__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
					put(grammarAccess.getCommandAccess().getGroup_3(), "rule__Command__Group_3__0");
					put(grammarAccess.getIfCommandAccess().getGroup(), "rule__IfCommand__Group__0");
					put(grammarAccess.getIfCommandAccess().getGroup_5(), "rule__IfCommand__Group_5__0");
					put(grammarAccess.getWhileCommandAccess().getGroup(), "rule__WhileCommand__Group__0");
					put(grammarAccess.getReturnCommandAccess().getGroup(), "rule__ReturnCommand__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getRDeclarationAccess().getGroup(), "rule__RDeclaration__Group__0");
					put(grammarAccess.getRDeclarationAccess().getGroup_1(), "rule__RDeclaration__Group_1__0");
					put(grammarAccess.getIDDeclarationAccess().getGroup(), "rule__IDDeclaration__Group__0");
					put(grammarAccess.getIDDeclarationAccess().getGroup_1(), "rule__IDDeclaration__Group_1__0");
					put(grammarAccess.getExprAccess().getGroup(), "rule__Expr__Group__0");
					put(grammarAccess.getExprAccess().getGroup_1(), "rule__Expr__Group_1__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
					put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getCodeAccess().getDeclarationsAssignment_0(), "rule__Code__DeclarationsAssignment_0");
					put(grammarAccess.getCodeAccess().getFunctionsAssignment_1(), "rule__Code__FunctionsAssignment_1");
					put(grammarAccess.getFunctionAccess().getTypeAssignment_0(), "rule__Function__TypeAssignment_0");
					put(grammarAccess.getFunctionAccess().getIdAssignment_1(), "rule__Function__IdAssignment_1");
					put(grammarAccess.getFunctionAccess().getParamAssignment_3(), "rule__Function__ParamAssignment_3");
					put(grammarAccess.getFunctionAccess().getBlockAssignment_5(), "rule__Function__BlockAssignment_5");
					put(grammarAccess.getFuncParamAccess().getTypeAssignment_0(), "rule__FuncParam__TypeAssignment_0");
					put(grammarAccess.getFuncParamAccess().getIdAssignment_1(), "rule__FuncParam__IdAssignment_1");
					put(grammarAccess.getFuncParamAccess().getNextAssignment_2_1(), "rule__FuncParam__NextAssignment_2_1");
					put(grammarAccess.getBlockAccess().getStatementAssignment_1(), "rule__Block__StatementAssignment_1");
					put(grammarAccess.getStatementAccess().getDeclarationsAssignment_1(), "rule__Statement__DeclarationsAssignment_1");
					put(grammarAccess.getStatementAccess().getCommandsAssignment_2(), "rule__Statement__CommandsAssignment_2");
					put(grammarAccess.getIfCommandAccess().getExprAssignment_2(), "rule__IfCommand__ExprAssignment_2");
					put(grammarAccess.getIfCommandAccess().getIfBlockAssignment_4(), "rule__IfCommand__IfBlockAssignment_4");
					put(grammarAccess.getIfCommandAccess().getElseBlockAssignment_5_1(), "rule__IfCommand__ElseBlockAssignment_5_1");
					put(grammarAccess.getWhileCommandAccess().getExprAssignment_2(), "rule__WhileCommand__ExprAssignment_2");
					put(grammarAccess.getWhileCommandAccess().getWhileBlockAssignment_4(), "rule__WhileCommand__WhileBlockAssignment_4");
					put(grammarAccess.getReturnCommandAccess().getExprAssignment_1(), "rule__ReturnCommand__ExprAssignment_1");
					put(grammarAccess.getDeclarationAccess().getTypeAssignment_0(), "rule__Declaration__TypeAssignment_0");
					put(grammarAccess.getDeclarationAccess().getValueAssignment_1(), "rule__Declaration__ValueAssignment_1");
					put(grammarAccess.getRDeclarationAccess().getIdAssignment_0(), "rule__RDeclaration__IdAssignment_0");
					put(grammarAccess.getRDeclarationAccess().getNextAssignment_1_2(), "rule__RDeclaration__NextAssignment_1_2");
					put(grammarAccess.getIDDeclarationAccess().getIdAssignment_0(), "rule__IDDeclaration__IdAssignment_0");
					put(grammarAccess.getIDDeclarationAccess().getValueAssignment_1_1(), "rule__IDDeclaration__ValueAssignment_1_1");
					put(grammarAccess.getExprAccess().getOperatorAssignment_1_1(), "rule__Expr__OperatorAssignment_1_1");
					put(grammarAccess.getExprAccess().getRightAssignment_1_2(), "rule__Expr__RightAssignment_1_2");
					put(grammarAccess.getTermAccess().getOperatorAssignment_1_1(), "rule__Term__OperatorAssignment_1_1");
					put(grammarAccess.getTermAccess().getRightAssignment_1_2(), "rule__Term__RightAssignment_1_2");
					put(grammarAccess.getFactorAccess().getOperatorAssignment_1_1(), "rule__Factor__OperatorAssignment_1_1");
					put(grammarAccess.getFactorAccess().getRightAssignment_1_2(), "rule__Factor__RightAssignment_1_2");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getResultAssignment_1(), "rule__Atomic__ResultAssignment_1");
					put(grammarAccess.getTypeAccess().getValueAssignment(), "rule__Type__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			br.poli.ecomp.compiladores.ui.contentassist.antlr.internal.InternalNotCParser typedParser = (br.poli.ecomp.compiladores.ui.contentassist.antlr.internal.InternalNotCParser) parser;
			typedParser.entryRuleCode();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public NotCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NotCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
