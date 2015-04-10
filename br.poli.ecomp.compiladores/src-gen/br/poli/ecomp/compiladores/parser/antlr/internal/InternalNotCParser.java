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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNotCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", "'while'", "';'", "'='", "'+'", "'-'", "'*'", "'/'", "'^'", "'var'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNotCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNotCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNotCParser.tokenNames; }
    public String getGrammarFileName() { return "../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g"; }



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



    // $ANTLR start "entryRuleCode"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:67:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:68:2: (iv_ruleCode= ruleCode EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:69:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_ruleCode_in_entryRuleCode75);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCode85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:76:1: ruleCode returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_functions_1_0= ruleFunction ) )* ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;

        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:79:28: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_functions_1_0= ruleFunction ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_functions_1_0= ruleFunction ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_functions_1_0= ruleFunction ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_functions_1_0= ruleFunction ) )*
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_ID) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==13||(LA1_3>=19 && LA1_3<=20)) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:82:3: lv_declarations_0_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCodeAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleCode131);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_0_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:98:3: ( (lv_functions_1_0= ruleFunction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:99:1: (lv_functions_1_0= ruleFunction )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:99:1: (lv_functions_1_0= ruleFunction )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:100:3: lv_functions_1_0= ruleFunction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCodeAccess().getFunctionsFunctionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleCode153);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functions",
            	            		lv_functions_1_0, 
            	            		"Function");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleFunction"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:124:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:125:2: (iv_ruleFunction= ruleFunction EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:126:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction190);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:133:1: ruleFunction returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleFuncParam ) )? otherlv_4= ')' ( (lv_block_5_0= ruleBlock ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        EObject lv_param_3_0 = null;

        EObject lv_block_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:136:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleFuncParam ) )? otherlv_4= ')' ( (lv_block_5_0= ruleBlock ) ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:137:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleFuncParam ) )? otherlv_4= ')' ( (lv_block_5_0= ruleBlock ) ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:137:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleFuncParam ) )? otherlv_4= ')' ( (lv_block_5_0= ruleBlock ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:137:2: ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_param_3_0= ruleFuncParam ) )? otherlv_4= ')' ( (lv_block_5_0= ruleBlock ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:137:2: ( (lv_type_0_0= ruleType ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:138:1: (lv_type_0_0= ruleType )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:138:1: (lv_type_0_0= ruleType )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:139:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFunction246);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:155:2: ( (lv_id_1_0= RULE_ID ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:156:1: (lv_id_1_0= RULE_ID )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:156:1: (lv_id_1_0= RULE_ID )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:157:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction263); 

            			newLeafNode(lv_id_1_0, grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleFunction280); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:177:1: ( (lv_param_3_0= ruleFuncParam ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:178:1: (lv_param_3_0= ruleFuncParam )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:178:1: (lv_param_3_0= ruleFuncParam )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:179:3: lv_param_3_0= ruleFuncParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getParamFuncParamParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFuncParam_in_ruleFunction301);
                    lv_param_3_0=ruleFuncParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"param",
                            		lv_param_3_0, 
                            		"FuncParam");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFunction314); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:199:1: ( (lv_block_5_0= ruleBlock ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:200:1: (lv_block_5_0= ruleBlock )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:200:1: (lv_block_5_0= ruleBlock )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:201:3: lv_block_5_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getBlockBlockParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleFunction335);
            lv_block_5_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_5_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFuncParam"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:225:1: entryRuleFuncParam returns [EObject current=null] : iv_ruleFuncParam= ruleFuncParam EOF ;
    public final EObject entryRuleFuncParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParam = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:226:2: (iv_ruleFuncParam= ruleFuncParam EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:227:2: iv_ruleFuncParam= ruleFuncParam EOF
            {
             newCompositeNode(grammarAccess.getFuncParamRule()); 
            pushFollow(FOLLOW_ruleFuncParam_in_entryRuleFuncParam371);
            iv_ruleFuncParam=ruleFuncParam();

            state._fsp--;

             current =iv_ruleFuncParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncParam381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncParam"


    // $ANTLR start "ruleFuncParam"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:234:1: ruleFuncParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) ) )? ) ;
    public final EObject ruleFuncParam() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_next_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:237:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:238:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:238:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:238:2: ( (lv_type_0_0= ruleType ) ) ( (lv_id_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) ) )?
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:238:2: ( (lv_type_0_0= ruleType ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:239:1: (lv_type_0_0= ruleType )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:239:1: (lv_type_0_0= ruleType )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:240:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFuncParamAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFuncParam427);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncParamRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:256:2: ( (lv_id_1_0= RULE_ID ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:257:1: (lv_id_1_0= RULE_ID )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:257:1: (lv_id_1_0= RULE_ID )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:258:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuncParam444); 

            			newLeafNode(lv_id_1_0, grammarAccess.getFuncParamAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFuncParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:274:2: (otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:274:4: otherlv_2= ',' ( (lv_next_3_0= ruleFuncParam ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFuncParam462); 

                        	newLeafNode(otherlv_2, grammarAccess.getFuncParamAccess().getCommaKeyword_2_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:278:1: ( (lv_next_3_0= ruleFuncParam ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:279:1: (lv_next_3_0= ruleFuncParam )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:279:1: (lv_next_3_0= ruleFuncParam )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:280:3: lv_next_3_0= ruleFuncParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncParamAccess().getNextFuncParamParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFuncParam_in_ruleFuncParam483);
                    lv_next_3_0=ruleFuncParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncParamRule());
                    	        }
                           		set(
                           			current, 
                           			"next",
                            		lv_next_3_0, 
                            		"FuncParam");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncParam"


    // $ANTLR start "entryRuleBlock"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:304:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:305:2: (iv_ruleBlock= ruleBlock EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:306:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock521);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock531); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:313:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statement_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:316:28: ( (otherlv_0= '{' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= '}' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:317:1: (otherlv_0= '{' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= '}' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:317:1: (otherlv_0= '{' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= '}' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:317:3: otherlv_0= '{' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleBlock568); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:321:1: ( (lv_statement_1_0= ruleStatement ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:322:1: (lv_statement_1_0= ruleStatement )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:322:1: (lv_statement_1_0= ruleStatement )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:323:3: lv_statement_1_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleBlock589);
            lv_statement_1_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_1_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBlock601); 

                	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:351:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:352:2: (iv_ruleStatement= ruleStatement EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:353:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement637);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:360:1: ruleStatement returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_commands_2_0= ruleCommand ) )* ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_0 = null;

        EObject lv_commands_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:363:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_commands_2_0= ruleCommand ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_commands_2_0= ruleCommand ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_commands_2_0= ruleCommand ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_commands_2_0= ruleCommand ) )*
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:2: ()
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatementAccess().getStatementAction_0(),
                        current);
                

            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:370:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:371:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:371:1: (lv_declarations_1_0= ruleDeclaration )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:372:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleStatement702);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_1_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:388:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:389:1: (lv_commands_2_0= ruleCommand )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:389:1: (lv_commands_2_0= ruleCommand )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:390:3: lv_commands_2_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementAccess().getCommandsCommandParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleStatement724);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_2_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:414:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:415:2: (iv_ruleCommand= ruleCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:416:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand761);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:423:1: ruleCommand returns [EObject current=null] : (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_IfCommand_0 = null;

        EObject this_WhileCommand_1 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:426:28: ( (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:427:1: (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:427:1: (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:428:5: this_IfCommand_0= ruleIfCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfCommand_in_ruleCommand818);
                    this_IfCommand_0=ruleIfCommand();

                    state._fsp--;

                     
                            current = this_IfCommand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:438:5: this_WhileCommand_1= ruleWhileCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWhileCommand_in_ruleCommand845);
                    this_WhileCommand_1=ruleWhileCommand();

                    state._fsp--;

                     
                            current = this_WhileCommand_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleIfCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:454:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:455:2: (iv_ruleIfCommand= ruleIfCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:456:2: iv_ruleIfCommand= ruleIfCommand EOF
            {
             newCompositeNode(grammarAccess.getIfCommandRule()); 
            pushFollow(FOLLOW_ruleIfCommand_in_entryRuleIfCommand880);
            iv_ruleIfCommand=ruleIfCommand();

            state._fsp--;

             current =iv_ruleIfCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfCommand890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCommand"


    // $ANTLR start "ruleIfCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:463:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:466:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:467:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:467:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:467:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleIfCommand927); 

                	newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleIfCommand939); 

                	newLeafNode(otherlv_1, grammarAccess.getIfCommandAccess().getLeftParenthesisKeyword_1());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:475:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:476:1: (lv_expr_2_0= ruleExpr )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:476:1: (lv_expr_2_0= ruleExpr )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:477:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfCommand960);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfCommandRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleIfCommand972); 

                	newLeafNode(otherlv_3, grammarAccess.getIfCommandAccess().getRightParenthesisKeyword_3());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:497:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:498:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:498:1: (lv_ifBlock_4_0= ruleBlock )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:499:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfCommandAccess().getIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleIfCommand993);
            lv_ifBlock_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfCommandRule());
            	        }
                   		set(
                   			current, 
                   			"ifBlock",
                    		lv_ifBlock_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:515:2: (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:515:4: otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleIfCommand1006); 

                        	newLeafNode(otherlv_5, grammarAccess.getIfCommandAccess().getElseKeyword_5_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:519:1: ( (lv_elseBlock_6_0= ruleBlock ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:520:1: (lv_elseBlock_6_0= ruleBlock )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:520:1: (lv_elseBlock_6_0= ruleBlock )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:521:3: lv_elseBlock_6_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfCommandAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfCommand1027);
                    lv_elseBlock_6_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfCommandRule());
                    	        }
                           		set(
                           			current, 
                           			"elseBlock",
                            		lv_elseBlock_6_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfCommand"


    // $ANTLR start "entryRuleWhileCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:545:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:546:2: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:547:2: iv_ruleWhileCommand= ruleWhileCommand EOF
            {
             newCompositeNode(grammarAccess.getWhileCommandRule()); 
            pushFollow(FOLLOW_ruleWhileCommand_in_entryRuleWhileCommand1065);
            iv_ruleWhileCommand=ruleWhileCommand();

            state._fsp--;

             current =iv_ruleWhileCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileCommand1075); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileCommand"


    // $ANTLR start "ruleWhileCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:554:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;

        EObject lv_whileBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:557:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:558:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:558:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:558:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleWhileCommand1112); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleWhileCommand1124); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileCommandAccess().getLeftParenthesisKeyword_1());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:566:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:567:1: (lv_expr_2_0= ruleExpr )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:567:1: (lv_expr_2_0= ruleExpr )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:568:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleWhileCommand1145);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleWhileCommand1157); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileCommandAccess().getRightParenthesisKeyword_3());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:588:1: ( (lv_whileBlock_4_0= ruleBlock ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:589:1: (lv_whileBlock_4_0= ruleBlock )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:589:1: (lv_whileBlock_4_0= ruleBlock )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:590:3: lv_whileBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileCommandAccess().getWhileBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleWhileCommand1178);
            lv_whileBlock_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            	        }
                   		set(
                   			current, 
                   			"whileBlock",
                    		lv_whileBlock_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileCommand"


    // $ANTLR start "entryRuleDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:614:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:615:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:616:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1214);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:623:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:626:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:627:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:627:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:627:2: ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';'
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:627:2: ( (lv_type_0_0= ruleType ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:628:1: (lv_type_0_0= ruleType )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:628:1: (lv_type_0_0= ruleType )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:629:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleDeclaration1270);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:645:2: ( (lv_value_1_0= ruleRDeclaration ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:646:1: (lv_value_1_0= ruleRDeclaration )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:646:1: (lv_value_1_0= ruleRDeclaration )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:647:3: lv_value_1_0= ruleRDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getValueRDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRDeclaration_in_ruleDeclaration1291);
            lv_value_1_0=ruleRDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"RDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDeclaration1303); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:675:1: entryRuleRDeclaration returns [EObject current=null] : iv_ruleRDeclaration= ruleRDeclaration EOF ;
    public final EObject entryRuleRDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:676:2: (iv_ruleRDeclaration= ruleRDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:677:2: iv_ruleRDeclaration= ruleRDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRDeclarationRule()); 
            pushFollow(FOLLOW_ruleRDeclaration_in_entryRuleRDeclaration1339);
            iv_ruleRDeclaration=ruleRDeclaration();

            state._fsp--;

             current =iv_ruleRDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDeclaration1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRDeclaration"


    // $ANTLR start "ruleRDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:684:1: ruleRDeclaration returns [EObject current=null] : ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? ) ;
    public final EObject ruleRDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_id_0_0 = null;

        EObject lv_next_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:687:28: ( ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:688:1: ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:688:1: ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:688:2: ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )?
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:688:2: ( (lv_id_0_0= ruleIDDeclaration ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:689:1: (lv_id_0_0= ruleIDDeclaration )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:689:1: (lv_id_0_0= ruleIDDeclaration )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:690:3: lv_id_0_0= ruleIDDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getRDeclarationAccess().getIdIDDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDDeclaration_in_ruleRDeclaration1395);
            lv_id_0_0=ruleIDDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"IDDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:706:2: ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:706:3: () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:706:3: ()
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:707:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getRDeclarationAccess().getRDeclarationLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRDeclaration1417); 

                        	newLeafNode(otherlv_2, grammarAccess.getRDeclarationAccess().getCommaKeyword_1_1());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:716:1: ( (lv_next_3_0= ruleRDeclaration ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:717:1: (lv_next_3_0= ruleRDeclaration )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:717:1: (lv_next_3_0= ruleRDeclaration )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:718:3: lv_next_3_0= ruleRDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getRDeclarationAccess().getNextRDeclarationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRDeclaration_in_ruleRDeclaration1438);
                    lv_next_3_0=ruleRDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"next",
                            		lv_next_3_0, 
                            		"RDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRDeclaration"


    // $ANTLR start "entryRuleIDDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:742:1: entryRuleIDDeclaration returns [EObject current=null] : iv_ruleIDDeclaration= ruleIDDeclaration EOF ;
    public final EObject entryRuleIDDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:743:2: (iv_ruleIDDeclaration= ruleIDDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:744:2: iv_ruleIDDeclaration= ruleIDDeclaration EOF
            {
             newCompositeNode(grammarAccess.getIDDeclarationRule()); 
            pushFollow(FOLLOW_ruleIDDeclaration_in_entryRuleIDDeclaration1476);
            iv_ruleIDDeclaration=ruleIDDeclaration();

            state._fsp--;

             current =iv_ruleIDDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDDeclaration1486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDDeclaration"


    // $ANTLR start "ruleIDDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:751:1: ruleIDDeclaration returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleIDDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:754:28: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:755:1: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:755:1: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:755:2: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )?
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:755:2: ( (lv_id_0_0= RULE_ID ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:756:1: (lv_id_0_0= RULE_ID )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:756:1: (lv_id_0_0= RULE_ID )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:757:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDDeclaration1528); 

            			newLeafNode(lv_id_0_0, grammarAccess.getIDDeclarationAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIDDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:773:2: (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:773:4: otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleIDDeclaration1546); 

                        	newLeafNode(otherlv_1, grammarAccess.getIDDeclarationAccess().getEqualsSignKeyword_1_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:777:1: ( (lv_value_2_0= ruleExpr ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:778:1: (lv_value_2_0= ruleExpr )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:778:1: (lv_value_2_0= ruleExpr )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:779:3: lv_value_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getIDDeclarationAccess().getValueExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleIDDeclaration1567);
                    lv_value_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIDDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDDeclaration"


    // $ANTLR start "entryRuleExpr"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:803:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:804:2: (iv_ruleExpr= ruleExpr EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:805:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1605);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:812:1: ruleExpr returns [EObject current=null] : (this_Expr2_0= ruleExpr2 ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Expr2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:815:28: ( (this_Expr2_0= ruleExpr2 ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:816:1: (this_Expr2_0= ruleExpr2 ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:816:1: (this_Expr2_0= ruleExpr2 ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:817:5: this_Expr2_0= ruleExpr2 ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAccess().getExpr2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExpr2_in_ruleExpr1662);
            this_Expr2_0=ruleExpr2();

            state._fsp--;

             
                    current = this_Expr2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:825:1: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:825:2: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExpr2 ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:825:2: ()
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:826:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAccess().getExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:831:2: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:832:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:832:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:833:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:833:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==21) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==22) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:834:3: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,21,FOLLOW_21_in_ruleExpr1691); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getExprAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:846:8: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,22,FOLLOW_22_in_ruleExpr1720); 

            	                    newLeafNode(lv_operator_2_2, grammarAccess.getExprAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:861:2: ( (lv_right_3_0= ruleExpr2 ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:862:1: (lv_right_3_0= ruleExpr2 )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:862:1: (lv_right_3_0= ruleExpr2 )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:863:3: lv_right_3_0= ruleExpr2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getRightExpr2ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr2_in_ruleExpr1757);
            	    lv_right_3_0=ruleExpr2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Expr2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExpr2"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:887:1: entryRuleExpr2 returns [EObject current=null] : iv_ruleExpr2= ruleExpr2 EOF ;
    public final EObject entryRuleExpr2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr2 = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:888:2: (iv_ruleExpr2= ruleExpr2 EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:889:2: iv_ruleExpr2= ruleExpr2 EOF
            {
             newCompositeNode(grammarAccess.getExpr2Rule()); 
            pushFollow(FOLLOW_ruleExpr2_in_entryRuleExpr21795);
            iv_ruleExpr2=ruleExpr2();

            state._fsp--;

             current =iv_ruleExpr2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr21805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr2"


    // $ANTLR start "ruleExpr2"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:896:1: ruleExpr2 returns [EObject current=null] : (this_Expr3_0= ruleExpr3 ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) ) )* ) ;
    public final EObject ruleExpr2() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Expr3_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:899:28: ( (this_Expr3_0= ruleExpr3 ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:900:1: (this_Expr3_0= ruleExpr3 ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:900:1: (this_Expr3_0= ruleExpr3 ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:901:5: this_Expr3_0= ruleExpr3 ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpr2Access().getExpr3ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExpr3_in_ruleExpr21852);
            this_Expr3_0=ruleExpr3();

            state._fsp--;

             
                    current = this_Expr3_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:909:1: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=23 && LA14_0<=24)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:909:2: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleExpr3 ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:909:2: ()
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:910:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpr2Access().getExpr2LeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:915:2: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:916:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:916:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:917:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:917:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==23) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==24) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:918:3: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,23,FOLLOW_23_in_ruleExpr21881); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getExpr2Access().getOperatorAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExpr2Rule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:930:8: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,24,FOLLOW_24_in_ruleExpr21910); 

            	                    newLeafNode(lv_operator_2_2, grammarAccess.getExpr2Access().getOperatorSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExpr2Rule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:945:2: ( (lv_right_3_0= ruleExpr3 ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:946:1: (lv_right_3_0= ruleExpr3 )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:946:1: (lv_right_3_0= ruleExpr3 )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:947:3: lv_right_3_0= ruleExpr3
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpr2Access().getRightExpr3ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr3_in_ruleExpr21947);
            	    lv_right_3_0=ruleExpr3();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpr2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Expr3");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr2"


    // $ANTLR start "entryRuleExpr3"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:971:1: entryRuleExpr3 returns [EObject current=null] : iv_ruleExpr3= ruleExpr3 EOF ;
    public final EObject entryRuleExpr3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr3 = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:972:2: (iv_ruleExpr3= ruleExpr3 EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:973:2: iv_ruleExpr3= ruleExpr3 EOF
            {
             newCompositeNode(grammarAccess.getExpr3Rule()); 
            pushFollow(FOLLOW_ruleExpr3_in_entryRuleExpr31985);
            iv_ruleExpr3=ruleExpr3();

            state._fsp--;

             current =iv_ruleExpr3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr31995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr3"


    // $ANTLR start "ruleExpr3"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:980:1: ruleExpr3 returns [EObject current=null] : (this_Expr4_0= ruleExpr4 ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) ) )* ) ;
    public final EObject ruleExpr3() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Expr4_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:983:28: ( (this_Expr4_0= ruleExpr4 ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:984:1: (this_Expr4_0= ruleExpr4 ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:984:1: (this_Expr4_0= ruleExpr4 ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:985:5: this_Expr4_0= ruleExpr4 ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpr3Access().getExpr4ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExpr4_in_ruleExpr32042);
            this_Expr4_0=ruleExpr4();

            state._fsp--;

             
                    current = this_Expr4_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:993:1: ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:993:2: () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleExpr4 ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:993:2: ()
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:994:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpr3Access().getExpr3LeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:999:2: ( (lv_operator_2_0= '^' ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1000:1: (lv_operator_2_0= '^' )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1000:1: (lv_operator_2_0= '^' )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1001:3: lv_operator_2_0= '^'
            	    {
            	    lv_operator_2_0=(Token)match(input,25,FOLLOW_25_in_ruleExpr32069); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getExpr3Access().getOperatorCircumflexAccentKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpr3Rule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "^");
            	    	    

            	    }


            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1014:2: ( (lv_right_3_0= ruleExpr4 ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1015:1: (lv_right_3_0= ruleExpr4 )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1015:1: (lv_right_3_0= ruleExpr4 )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1016:3: lv_right_3_0= ruleExpr4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpr3Access().getRightExpr4ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpr4_in_ruleExpr32103);
            	    lv_right_3_0=ruleExpr4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpr3Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Expr4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr3"


    // $ANTLR start "entryRuleExpr4"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1040:1: entryRuleExpr4 returns [EObject current=null] : iv_ruleExpr4= ruleExpr4 EOF ;
    public final EObject entryRuleExpr4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr4 = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1041:2: (iv_ruleExpr4= ruleExpr4 EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1042:2: iv_ruleExpr4= ruleExpr4 EOF
            {
             newCompositeNode(grammarAccess.getExpr4Rule()); 
            pushFollow(FOLLOW_ruleExpr4_in_entryRuleExpr42141);
            iv_ruleExpr4=ruleExpr4();

            state._fsp--;

             current =iv_ruleExpr4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr42151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr4"


    // $ANTLR start "ruleExpr4"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1049:1: ruleExpr4 returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleExpr5 ) ) ) ;
    public final EObject ruleExpr4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject lv_result_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1052:28: ( ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleExpr5 ) ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1053:1: ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleExpr5 ) ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1053:1: ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleExpr5 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_INT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1053:2: (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1053:2: (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1053:4: otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleExpr42189); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpr4Access().getLeftParenthesisKeyword_0_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1057:1: ( (lv_value_1_0= ruleExpr ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1058:1: (lv_value_1_0= ruleExpr )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1058:1: (lv_value_1_0= ruleExpr )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1059:3: lv_value_1_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpr4Access().getValueExprParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleExpr42210);
                    lv_value_1_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpr4Rule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExpr42222); 

                        	newLeafNode(otherlv_2, grammarAccess.getExpr4Access().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1080:6: ( (lv_result_3_0= ruleExpr5 ) )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1080:6: ( (lv_result_3_0= ruleExpr5 ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1081:1: (lv_result_3_0= ruleExpr5 )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1081:1: (lv_result_3_0= ruleExpr5 )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1082:3: lv_result_3_0= ruleExpr5
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpr4Access().getResultExpr5ParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr5_in_ruleExpr42250);
                    lv_result_3_0=ruleExpr5();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpr4Rule());
                    	        }
                           		set(
                           			current, 
                           			"result",
                            		lv_result_3_0, 
                            		"Expr5");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr4"


    // $ANTLR start "entryRuleExpr5"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1106:1: entryRuleExpr5 returns [EObject current=null] : iv_ruleExpr5= ruleExpr5 EOF ;
    public final EObject entryRuleExpr5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr5 = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1107:2: (iv_ruleExpr5= ruleExpr5 EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1108:2: iv_ruleExpr5= ruleExpr5 EOF
            {
             newCompositeNode(grammarAccess.getExpr5Rule()); 
            pushFollow(FOLLOW_ruleExpr5_in_entryRuleExpr52286);
            iv_ruleExpr5=ruleExpr5();

            state._fsp--;

             current =iv_ruleExpr5; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr52296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr5"


    // $ANTLR start "ruleExpr5"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1115:1: ruleExpr5 returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpr5() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1118:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1119:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1119:1: ( (lv_value_0_0= RULE_INT ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1120:1: (lv_value_0_0= RULE_INT )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1120:1: (lv_value_0_0= RULE_INT )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1121:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpr52337); 

            			newLeafNode(lv_value_0_0, grammarAccess.getExpr5Access().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExpr5Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr5"


    // $ANTLR start "entryRuleType"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1145:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1146:2: (iv_ruleType= ruleType EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1147:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2377);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1154:1: ruleType returns [EObject current=null] : ( (lv_value_0_0= 'var' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1157:28: ( ( (lv_value_0_0= 'var' ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1158:1: ( (lv_value_0_0= 'var' ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1158:1: ( (lv_value_0_0= 'var' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1159:1: (lv_value_0_0= 'var' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1159:1: (lv_value_0_0= 'var' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1160:3: lv_value_0_0= 'var'
            {
            lv_value_0_0=(Token)match(input,26,FOLLOW_26_in_ruleType2429); 

                    newLeafNode(lv_value_0_0, grammarAccess.getTypeAccess().getValueVarKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "var");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCode_in_entryRuleCode75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCode85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleCode131 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleCode153 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunction246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFunction280 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_ruleFuncParam_in_ruleFunction301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunction314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunction335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncParam_in_entryRuleFuncParam371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncParam381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleFuncParam427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuncParam444 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFuncParam462 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleFuncParam_in_ruleFuncParam483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBlock568 = new BitSet(new long[]{0x0000000004050000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlock589 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlock601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatement702 = new BitSet(new long[]{0x0000000004050002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatement724 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfCommand_in_ruleCommand818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileCommand_in_ruleCommand845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfCommand_in_entryRuleIfCommand880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfCommand890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleIfCommand927 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleIfCommand939 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfCommand960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfCommand972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfCommand993 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleIfCommand1006 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfCommand1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileCommand_in_entryRuleWhileCommand1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileCommand1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWhileCommand1112 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleWhileCommand1124 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleWhileCommand1145 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWhileCommand1157 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleWhileCommand1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclaration1270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_ruleDeclaration1291 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDeclaration1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_entryRuleRDeclaration1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDeclaration1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDDeclaration_in_ruleRDeclaration1395 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRDeclaration1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_ruleRDeclaration1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDDeclaration_in_entryRuleIDDeclaration1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDDeclaration1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDDeclaration1528 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleIDDeclaration1546 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIDDeclaration1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr2_in_ruleExpr1662 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleExpr1691 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_22_in_ruleExpr1720 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr2_in_ruleExpr1757 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleExpr2_in_entryRuleExpr21795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr21805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr3_in_ruleExpr21852 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleExpr21881 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_24_in_ruleExpr21910 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr3_in_ruleExpr21947 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleExpr3_in_entryRuleExpr31985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr31995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr4_in_ruleExpr32042 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleExpr32069 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr4_in_ruleExpr32103 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleExpr4_in_entryRuleExpr42141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr42151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExpr42189 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExpr42210 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpr42222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr5_in_ruleExpr42250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr5_in_entryRuleExpr52286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr52296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpr52337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType2429 = new BitSet(new long[]{0x0000000000000002L});

}