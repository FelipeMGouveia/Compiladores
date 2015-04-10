/*
* generated by Xtext
*/
grammar InternalNotC;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package br.poli.ecomp.compiladores.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package br.poli.ecomp.compiladores.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.poli.ecomp.compiladores.services.NotCGrammarAccess;

}

@parser::members {

 	private NotCGrammarAccess grammarAccess;
 	
    public InternalNotCParser(TokenStream input, NotCGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Code";	
   	}
   	
   	@Override
   	protected NotCGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleCode
entryRuleCode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCodeRule()); }
	 iv_ruleCode=ruleCode 
	 { $current=$iv_ruleCode.current; } 
	 EOF 
;

// Rule Code
ruleCode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCodeAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
	    }
		lv_declarations_0_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCodeRule());
	        }
       		add(
       			$current, 
       			"declarations",
        		lv_declarations_0_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getCodeAccess().getFunctionsFunctionParserRuleCall_1_0()); 
	    }
		lv_functions_1_0=ruleFunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCodeRule());
	        }
       		add(
       			$current, 
       			"functions",
        		lv_functions_1_0, 
        		"Function");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getTypeTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getParamFuncParamParserRuleCall_3_0()); 
	    }
		lv_param_3_0=ruleFuncParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		set(
       			$current, 
       			"param",
        		lv_param_3_0, 
        		"FuncParam");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getBlockBlockParserRuleCall_5_0()); 
	    }
		lv_block_5_0=ruleBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		set(
       			$current, 
       			"block",
        		lv_block_5_0, 
        		"Block");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFuncParam
entryRuleFuncParam returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFuncParamRule()); }
	 iv_ruleFuncParam=ruleFuncParam 
	 { $current=$iv_ruleFuncParam.current; } 
	 EOF 
;

// Rule FuncParam
ruleFuncParam returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFuncParamAccess().getTypeTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFuncParamRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getFuncParamAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFuncParamRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFuncParamAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFuncParamAccess().getNextFuncParamParserRuleCall_2_1_0()); 
	    }
		lv_next_3_0=ruleFuncParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFuncParamRule());
	        }
       		set(
       			$current, 
       			"next",
        		lv_next_3_0, 
        		"FuncParam");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	 iv_ruleBlock=ruleBlock 
	 { $current=$iv_ruleBlock.current; } 
	 EOF 
;

// Rule Block
ruleBlock returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_1_0()); 
	    }
		lv_statement_1_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBlockRule());
	        }
       		set(
       			$current, 
       			"statement",
        		lv_statement_1_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStatementAccess().getStatementAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStatementAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
	    }
		lv_declarations_1_0=ruleDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementRule());
	        }
       		add(
       			$current, 
       			"declarations",
        		lv_declarations_1_0, 
        		"Declaration");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStatementAccess().getCommandsCommandParserRuleCall_2_0()); 
	    }
		lv_commands_2_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementRule());
	        }
       		add(
       			$current, 
       			"commands",
        		lv_commands_2_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	 iv_ruleCommand=ruleCommand 
	 { $current=$iv_ruleCommand.current; } 
	 EOF 
;

// Rule Command
ruleCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_0()); 
    }
    this_IfCommand_0=ruleIfCommand
    { 
        $current = $this_IfCommand_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_1()); 
    }
    this_WhileCommand_1=ruleWhileCommand
    { 
        $current = $this_WhileCommand_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleIfCommand
entryRuleIfCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfCommandRule()); }
	 iv_ruleIfCommand=ruleIfCommand 
	 { $current=$iv_ruleIfCommand.current; } 
	 EOF 
;

// Rule IfCommand
ruleIfCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIfCommandAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_2_0()); 
	    }
		lv_expr_2_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfCommandRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_2_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfCommandAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfCommandAccess().getIfBlockBlockParserRuleCall_4_0()); 
	    }
		lv_ifBlock_4_0=ruleBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfCommandRule());
	        }
       		set(
       			$current, 
       			"ifBlock",
        		lv_ifBlock_4_0, 
        		"Block");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='else' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIfCommandAccess().getElseKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfCommandAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
	    }
		lv_elseBlock_6_0=ruleBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfCommandRule());
	        }
       		set(
       			$current, 
       			"elseBlock",
        		lv_elseBlock_6_0, 
        		"Block");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleWhileCommand
entryRuleWhileCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWhileCommandRule()); }
	 iv_ruleWhileCommand=ruleWhileCommand 
	 { $current=$iv_ruleWhileCommand.current; } 
	 EOF 
;

// Rule WhileCommand
ruleWhileCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='while' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getWhileCommandAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_2_0()); 
	    }
		lv_expr_2_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWhileCommandRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_2_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getWhileCommandAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWhileCommandAccess().getWhileBlockBlockParserRuleCall_4_0()); 
	    }
		lv_whileBlock_4_0=ruleBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWhileCommandRule());
	        }
       		set(
       			$current, 
       			"whileBlock",
        		lv_whileBlock_4_0, 
        		"Block");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	 iv_ruleDeclaration=ruleDeclaration 
	 { $current=$iv_ruleDeclaration.current; } 
	 EOF 
;

// Rule Declaration
ruleDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclarationAccess().getValueRDeclarationParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleRDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclarationRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"RDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleRDeclaration
entryRuleRDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRDeclarationRule()); }
	 iv_ruleRDeclaration=ruleRDeclaration 
	 { $current=$iv_ruleRDeclaration.current; } 
	 EOF 
;

// Rule RDeclaration
ruleRDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRDeclarationAccess().getIdIDDeclarationParserRuleCall_0_0()); 
	    }
		lv_id_0_0=ruleIDDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRDeclarationRule());
	        }
       		set(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"IDDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getRDeclarationAccess().getRDeclarationLeftAction_1_0(),
            $current);
    }
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRDeclarationAccess().getCommaKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRDeclarationAccess().getNextRDeclarationParserRuleCall_1_2_0()); 
	    }
		lv_next_3_0=ruleRDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRDeclarationRule());
	        }
       		set(
       			$current, 
       			"next",
        		lv_next_3_0, 
        		"RDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleIDDeclaration
entryRuleIDDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIDDeclarationRule()); }
	 iv_ruleIDDeclaration=ruleIDDeclaration 
	 { $current=$iv_ruleIDDeclaration.current; } 
	 EOF 
;

// Rule IDDeclaration
ruleIDDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_id_0_0=RULE_ID
		{
			newLeafNode(lv_id_0_0, grammarAccess.getIDDeclarationAccess().getIdIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIDDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"ID");
	    }

)
)(	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIDDeclarationAccess().getEqualsSignKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIDDeclarationAccess().getValueExprParserRuleCall_1_1_0()); 
	    }
		lv_value_2_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIDDeclarationRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	 iv_ruleExpr=ruleExpr 
	 { $current=$iv_ruleExpr.current; } 
	 EOF 
;

// Rule Expr
ruleExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExprAccess().getExpr2ParserRuleCall_0()); 
    }
    this_Expr2_0=ruleExpr2
    { 
        $current = $this_Expr2_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getExprAccess().getExprLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_operator_2_1=	'+' 
    {
        newLeafNode(lv_operator_2_1, grammarAccess.getExprAccess().getOperatorPlusSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprRule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_2_1, null);
	    }

    |		lv_operator_2_2=	'-' 
    {
        newLeafNode(lv_operator_2_2, grammarAccess.getExprAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprRule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprAccess().getRightExpr2ParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleExpr2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Expr2");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleExpr2
entryRuleExpr2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpr2Rule()); }
	 iv_ruleExpr2=ruleExpr2 
	 { $current=$iv_ruleExpr2.current; } 
	 EOF 
;

// Rule Expr2
ruleExpr2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpr2Access().getExpr3ParserRuleCall_0()); 
    }
    this_Expr3_0=ruleExpr3
    { 
        $current = $this_Expr3_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getExpr2Access().getExpr2LeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_operator_2_1=	'*' 
    {
        newLeafNode(lv_operator_2_1, grammarAccess.getExpr2Access().getOperatorAsteriskKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpr2Rule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_2_1, null);
	    }

    |		lv_operator_2_2=	'/' 
    {
        newLeafNode(lv_operator_2_2, grammarAccess.getExpr2Access().getOperatorSolidusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpr2Rule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExpr2Access().getRightExpr3ParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleExpr3		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpr2Rule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Expr3");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleExpr3
entryRuleExpr3 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpr3Rule()); }
	 iv_ruleExpr3=ruleExpr3 
	 { $current=$iv_ruleExpr3.current; } 
	 EOF 
;

// Rule Expr3
ruleExpr3 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpr3Access().getExpr4ParserRuleCall_0()); 
    }
    this_Expr4_0=ruleExpr4
    { 
        $current = $this_Expr4_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getExpr3Access().getExpr3LeftAction_1_0(),
            $current);
    }
)(
(
		lv_operator_2_0=	'^' 
    {
        newLeafNode(lv_operator_2_0, grammarAccess.getExpr3Access().getOperatorCircumflexAccentKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpr3Rule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_2_0, "^");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExpr3Access().getRightExpr4ParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleExpr4		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpr3Rule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Expr4");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleExpr4
entryRuleExpr4 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpr4Rule()); }
	 iv_ruleExpr4=ruleExpr4 
	 { $current=$iv_ruleExpr4.current; } 
	 EOF 
;

// Rule Expr4
ruleExpr4 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExpr4Access().getLeftParenthesisKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpr4Access().getValueExprParserRuleCall_0_1_0()); 
	    }
		lv_value_1_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpr4Rule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExpr4Access().getRightParenthesisKeyword_0_2());
    }
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getExpr4Access().getResultExpr5ParserRuleCall_1_0()); 
	    }
		lv_result_3_0=ruleExpr5		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpr4Rule());
	        }
       		set(
       			$current, 
       			"result",
        		lv_result_3_0, 
        		"Expr5");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpr5
entryRuleExpr5 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpr5Rule()); }
	 iv_ruleExpr5=ruleExpr5 
	 { $current=$iv_ruleExpr5.current; } 
	 EOF 
;

// Rule Expr5
ruleExpr5 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getExpr5Access().getValueINTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExpr5Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INT");
	    }

)
)
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=	'var' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getTypeAccess().getValueVarKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "var");
	    }

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


