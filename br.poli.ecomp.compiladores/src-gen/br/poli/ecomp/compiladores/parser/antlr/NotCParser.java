/*
* generated by Xtext
*/
package br.poli.ecomp.compiladores.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import br.poli.ecomp.compiladores.services.NotCGrammarAccess;

public class NotCParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private NotCGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected br.poli.ecomp.compiladores.parser.antlr.internal.InternalNotCParser createParser(XtextTokenStream stream) {
		return new br.poli.ecomp.compiladores.parser.antlr.internal.InternalNotCParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Code";
	}
	
	public NotCGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NotCGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
