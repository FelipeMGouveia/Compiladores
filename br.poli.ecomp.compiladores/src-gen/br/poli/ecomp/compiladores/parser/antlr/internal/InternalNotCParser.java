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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", "'while'", "'return'", "';'", "'='", "'+'", "'-'", "'*'", "'/'", "'^'", "'var'"
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
    public static final int T__27=27;
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

                if ( (LA1_0==27) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_ID) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==13||(LA1_3>=20 && LA1_3<=21)) ) {
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

                if ( (LA2_0==27) ) {
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

            if ( (LA3_0==27) ) {
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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:360:1: ruleStatement returns [EObject current=null] : ( () ( (lv_commands_1_0= ruleCommand ) )* ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:363:28: ( ( () ( (lv_commands_1_0= ruleCommand ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:1: ( () ( (lv_commands_1_0= ruleCommand ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:1: ( () ( (lv_commands_1_0= ruleCommand ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:2: () ( (lv_commands_1_0= ruleCommand ) )*
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:364:2: ()
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatementAccess().getStatementAction_0(),
                        current);
                

            }

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:370:2: ( (lv_commands_1_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==14||LA5_0==16||(LA5_0>=18 && LA5_0<=19)||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:371:1: (lv_commands_1_0= ruleCommand )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:371:1: (lv_commands_1_0= ruleCommand )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:372:3: lv_commands_1_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementAccess().getCommandsCommandParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleStatement702);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_1_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:396:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:397:2: (iv_ruleCommand= ruleCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:398:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand739);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand749); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:405:1: ruleCommand returns [EObject current=null] : (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand | this_ReturnCommand_2= ruleReturnCommand | this_KDeclaration_3= ruleKDeclaration | this_Declaration_4= ruleDeclaration | this_Block_5= ruleBlock ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_IfCommand_0 = null;

        EObject this_WhileCommand_1 = null;

        EObject this_ReturnCommand_2 = null;

        EObject this_KDeclaration_3 = null;

        EObject this_Declaration_4 = null;

        EObject this_Block_5 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:408:28: ( (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand | this_ReturnCommand_2= ruleReturnCommand | this_KDeclaration_3= ruleKDeclaration | this_Declaration_4= ruleDeclaration | this_Block_5= ruleBlock ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:409:1: (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand | this_ReturnCommand_2= ruleReturnCommand | this_KDeclaration_3= ruleKDeclaration | this_Declaration_4= ruleDeclaration | this_Block_5= ruleBlock )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:409:1: (this_IfCommand_0= ruleIfCommand | this_WhileCommand_1= ruleWhileCommand | this_ReturnCommand_2= ruleReturnCommand | this_KDeclaration_3= ruleKDeclaration | this_Declaration_4= ruleDeclaration | this_Block_5= ruleBlock )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 14:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:410:5: this_IfCommand_0= ruleIfCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfCommand_in_ruleCommand796);
                    this_IfCommand_0=ruleIfCommand();

                    state._fsp--;

                     
                            current = this_IfCommand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:420:5: this_WhileCommand_1= ruleWhileCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWhileCommand_in_ruleCommand823);
                    this_WhileCommand_1=ruleWhileCommand();

                    state._fsp--;

                     
                            current = this_WhileCommand_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:430:5: this_ReturnCommand_2= ruleReturnCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getReturnCommandParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReturnCommand_in_ruleCommand850);
                    this_ReturnCommand_2=ruleReturnCommand();

                    state._fsp--;

                     
                            current = this_ReturnCommand_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:440:5: this_KDeclaration_3= ruleKDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getKDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleKDeclaration_in_ruleCommand877);
                    this_KDeclaration_3=ruleKDeclaration();

                    state._fsp--;

                     
                            current = this_KDeclaration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:450:5: this_Declaration_4= ruleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleCommand904);
                    this_Declaration_4=ruleDeclaration();

                    state._fsp--;

                     
                            current = this_Declaration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:460:5: this_Block_5= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getBlockParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleCommand931);
                    this_Block_5=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_5; 
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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:476:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:477:2: (iv_ruleIfCommand= ruleIfCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:478:2: iv_ruleIfCommand= ruleIfCommand EOF
            {
             newCompositeNode(grammarAccess.getIfCommandRule()); 
            pushFollow(FOLLOW_ruleIfCommand_in_entryRuleIfCommand966);
            iv_ruleIfCommand=ruleIfCommand();

            state._fsp--;

             current =iv_ruleIfCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfCommand976); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:485:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) ;
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
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:488:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:489:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:489:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:489:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleIfCommand1013); 

                	newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleIfCommand1025); 

                	newLeafNode(otherlv_1, grammarAccess.getIfCommandAccess().getLeftParenthesisKeyword_1());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:497:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:498:1: (lv_expr_2_0= ruleExpr )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:498:1: (lv_expr_2_0= ruleExpr )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:499:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfCommand1046);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleIfCommand1058); 

                	newLeafNode(otherlv_3, grammarAccess.getIfCommandAccess().getRightParenthesisKeyword_3());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:519:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:520:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:520:1: (lv_ifBlock_4_0= ruleBlock )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:521:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfCommandAccess().getIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleIfCommand1079);
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

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:537:2: (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:537:4: otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleIfCommand1092); 

                        	newLeafNode(otherlv_5, grammarAccess.getIfCommandAccess().getElseKeyword_5_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:541:1: ( (lv_elseBlock_6_0= ruleBlock ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:542:1: (lv_elseBlock_6_0= ruleBlock )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:542:1: (lv_elseBlock_6_0= ruleBlock )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:543:3: lv_elseBlock_6_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfCommandAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfCommand1113);
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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:567:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:568:2: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:569:2: iv_ruleWhileCommand= ruleWhileCommand EOF
            {
             newCompositeNode(grammarAccess.getWhileCommandRule()); 
            pushFollow(FOLLOW_ruleWhileCommand_in_entryRuleWhileCommand1151);
            iv_ruleWhileCommand=ruleWhileCommand();

            state._fsp--;

             current =iv_ruleWhileCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileCommand1161); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:576:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;

        EObject lv_whileBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:579:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:580:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:580:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:580:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_whileBlock_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleWhileCommand1198); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleWhileCommand1210); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileCommandAccess().getLeftParenthesisKeyword_1());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:588:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:589:1: (lv_expr_2_0= ruleExpr )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:589:1: (lv_expr_2_0= ruleExpr )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:590:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleWhileCommand1231);
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleWhileCommand1243); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileCommandAccess().getRightParenthesisKeyword_3());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:610:1: ( (lv_whileBlock_4_0= ruleBlock ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:611:1: (lv_whileBlock_4_0= ruleBlock )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:611:1: (lv_whileBlock_4_0= ruleBlock )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:612:3: lv_whileBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileCommandAccess().getWhileBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleWhileCommand1264);
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


    // $ANTLR start "entryRuleReturnCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:636:1: entryRuleReturnCommand returns [EObject current=null] : iv_ruleReturnCommand= ruleReturnCommand EOF ;
    public final EObject entryRuleReturnCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnCommand = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:637:2: (iv_ruleReturnCommand= ruleReturnCommand EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:638:2: iv_ruleReturnCommand= ruleReturnCommand EOF
            {
             newCompositeNode(grammarAccess.getReturnCommandRule()); 
            pushFollow(FOLLOW_ruleReturnCommand_in_entryRuleReturnCommand1300);
            iv_ruleReturnCommand=ruleReturnCommand();

            state._fsp--;

             current =iv_ruleReturnCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnCommand1310); 

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
    // $ANTLR end "entryRuleReturnCommand"


    // $ANTLR start "ruleReturnCommand"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:645:1: ruleReturnCommand returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturnCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:648:28: ( (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:649:1: (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:649:1: (otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:649:3: otherlv_0= 'return' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleReturnCommand1347); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnCommandAccess().getReturnKeyword_0());
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:653:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:654:1: (lv_expr_1_0= ruleExpr )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:654:1: (lv_expr_1_0= ruleExpr )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:655:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getReturnCommandAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleReturnCommand1368);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnCommandRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleReturnCommand1380); 

                	newLeafNode(otherlv_2, grammarAccess.getReturnCommandAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleReturnCommand"


    // $ANTLR start "entryRuleDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:683:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:684:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:685:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1416);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1426); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:692:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:695:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:696:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:696:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:696:2: ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= ruleRDeclaration ) ) otherlv_2= ';'
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:696:2: ( (lv_type_0_0= ruleType ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:697:1: (lv_type_0_0= ruleType )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:697:1: (lv_type_0_0= ruleType )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:698:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleDeclaration1472);
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

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:714:2: ( (lv_value_1_0= ruleRDeclaration ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:715:1: (lv_value_1_0= ruleRDeclaration )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:715:1: (lv_value_1_0= ruleRDeclaration )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:716:3: lv_value_1_0= ruleRDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getValueRDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRDeclaration_in_ruleDeclaration1493);
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDeclaration1505); 

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


    // $ANTLR start "entryRuleKDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:744:1: entryRuleKDeclaration returns [EObject current=null] : iv_ruleKDeclaration= ruleKDeclaration EOF ;
    public final EObject entryRuleKDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:745:2: (iv_ruleKDeclaration= ruleKDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:746:2: iv_ruleKDeclaration= ruleKDeclaration EOF
            {
             newCompositeNode(grammarAccess.getKDeclarationRule()); 
            pushFollow(FOLLOW_ruleKDeclaration_in_entryRuleKDeclaration1541);
            iv_ruleKDeclaration=ruleKDeclaration();

            state._fsp--;

             current =iv_ruleKDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKDeclaration1551); 

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
    // $ANTLR end "entryRuleKDeclaration"


    // $ANTLR start "ruleKDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:753:1: ruleKDeclaration returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleRDeclaration ) ) otherlv_1= ';' ) ;
    public final EObject ruleKDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_declaration_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:756:28: ( ( ( (lv_declaration_0_0= ruleRDeclaration ) ) otherlv_1= ';' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:757:1: ( ( (lv_declaration_0_0= ruleRDeclaration ) ) otherlv_1= ';' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:757:1: ( ( (lv_declaration_0_0= ruleRDeclaration ) ) otherlv_1= ';' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:757:2: ( (lv_declaration_0_0= ruleRDeclaration ) ) otherlv_1= ';'
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:757:2: ( (lv_declaration_0_0= ruleRDeclaration ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:758:1: (lv_declaration_0_0= ruleRDeclaration )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:758:1: (lv_declaration_0_0= ruleRDeclaration )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:759:3: lv_declaration_0_0= ruleRDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getKDeclarationAccess().getDeclarationRDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRDeclaration_in_ruleKDeclaration1597);
            lv_declaration_0_0=ruleRDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"declaration",
                    		lv_declaration_0_0, 
                    		"RDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleKDeclaration1609); 

                	newLeafNode(otherlv_1, grammarAccess.getKDeclarationAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleKDeclaration"


    // $ANTLR start "entryRuleRDeclaration"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:787:1: entryRuleRDeclaration returns [EObject current=null] : iv_ruleRDeclaration= ruleRDeclaration EOF ;
    public final EObject entryRuleRDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:788:2: (iv_ruleRDeclaration= ruleRDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:789:2: iv_ruleRDeclaration= ruleRDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRDeclarationRule()); 
            pushFollow(FOLLOW_ruleRDeclaration_in_entryRuleRDeclaration1645);
            iv_ruleRDeclaration=ruleRDeclaration();

            state._fsp--;

             current =iv_ruleRDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDeclaration1655); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:796:1: ruleRDeclaration returns [EObject current=null] : ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? ) ;
    public final EObject ruleRDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_id_0_0 = null;

        EObject lv_next_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:799:28: ( ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:800:1: ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:800:1: ( ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:800:2: ( (lv_id_0_0= ruleIDDeclaration ) ) ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )?
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:800:2: ( (lv_id_0_0= ruleIDDeclaration ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:801:1: (lv_id_0_0= ruleIDDeclaration )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:801:1: (lv_id_0_0= ruleIDDeclaration )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:802:3: lv_id_0_0= ruleIDDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getRDeclarationAccess().getIdIDDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDDeclaration_in_ruleRDeclaration1701);
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

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:818:2: ( () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:818:3: () otherlv_2= ',' ( (lv_next_3_0= ruleRDeclaration ) )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:818:3: ()
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:819:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getRDeclarationAccess().getRDeclarationLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRDeclaration1723); 

                        	newLeafNode(otherlv_2, grammarAccess.getRDeclarationAccess().getCommaKeyword_1_1());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:828:1: ( (lv_next_3_0= ruleRDeclaration ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:829:1: (lv_next_3_0= ruleRDeclaration )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:829:1: (lv_next_3_0= ruleRDeclaration )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:830:3: lv_next_3_0= ruleRDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getRDeclarationAccess().getNextRDeclarationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRDeclaration_in_ruleRDeclaration1744);
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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:854:1: entryRuleIDDeclaration returns [EObject current=null] : iv_ruleIDDeclaration= ruleIDDeclaration EOF ;
    public final EObject entryRuleIDDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDDeclaration = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:855:2: (iv_ruleIDDeclaration= ruleIDDeclaration EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:856:2: iv_ruleIDDeclaration= ruleIDDeclaration EOF
            {
             newCompositeNode(grammarAccess.getIDDeclarationRule()); 
            pushFollow(FOLLOW_ruleIDDeclaration_in_entryRuleIDDeclaration1782);
            iv_ruleIDDeclaration=ruleIDDeclaration();

            state._fsp--;

             current =iv_ruleIDDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDDeclaration1792); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:863:1: ruleIDDeclaration returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? ) ;
    public final EObject ruleIDDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:866:28: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:867:1: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:867:1: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )? )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:867:2: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )?
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:867:2: ( (lv_id_0_0= RULE_ID ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:868:1: (lv_id_0_0= RULE_ID )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:868:1: (lv_id_0_0= RULE_ID )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:869:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDDeclaration1834); 

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

            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:885:2: (otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:885:4: otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIDDeclaration1852); 

                        	newLeafNode(otherlv_1, grammarAccess.getIDDeclarationAccess().getEqualsSignKeyword_1_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:889:1: ( (lv_value_2_0= ruleExpr ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:890:1: (lv_value_2_0= ruleExpr )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:890:1: (lv_value_2_0= ruleExpr )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:891:3: lv_value_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getIDDeclarationAccess().getValueExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleIDDeclaration1873);
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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:915:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:916:2: (iv_ruleExpr= ruleExpr EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:917:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1911);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1921); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:924:1: ruleExpr returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:927:28: ( (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:928:1: (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:928:1: (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:929:5: this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleExpr1968);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:937:1: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:937:2: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:937:2: ()
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:938:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAccess().getExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:943:2: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:944:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:944:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:945:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:945:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==22) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==23) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:946:3: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,22,FOLLOW_22_in_ruleExpr1997); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getExprAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:958:8: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,23,FOLLOW_23_in_ruleExpr2026); 

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

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:973:2: ( (lv_right_3_0= ruleTerm ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:974:1: (lv_right_3_0= ruleTerm )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:974:1: (lv_right_3_0= ruleTerm )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:975:3: lv_right_3_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getRightTermParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleExpr2063);
            	    lv_right_3_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleTerm"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:999:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1000:2: (iv_ruleTerm= ruleTerm EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1001:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2101);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2111); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1008:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Factor_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1011:28: ( (this_Factor_0= ruleFactor ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1012:1: (this_Factor_0= ruleFactor ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1012:1: (this_Factor_0= ruleFactor ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1013:5: this_Factor_0= ruleFactor ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleTerm2158);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1021:1: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=24 && LA13_0<=25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1021:2: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1021:2: ()
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1022:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1027:2: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1028:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1028:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1029:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1029:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==24) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==25) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1030:3: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,24,FOLLOW_24_in_ruleTerm2187); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getTermAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1042:8: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,25,FOLLOW_25_in_ruleTerm2216); 

            	                    newLeafNode(lv_operator_2_2, grammarAccess.getTermAccess().getOperatorSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1057:2: ( (lv_right_3_0= ruleFactor ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1058:1: (lv_right_3_0= ruleFactor )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1058:1: (lv_right_3_0= ruleFactor )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1059:3: lv_right_3_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleTerm2253);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1083:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1084:2: (iv_ruleFactor= ruleFactor EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1085:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor2291);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor2301); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1092:1: ruleFactor returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1095:28: ( (this_Atomic_0= ruleAtomic ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) ) )* ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1096:1: (this_Atomic_0= ruleAtomic ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1096:1: (this_Atomic_0= ruleAtomic ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) ) )* )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1097:5: this_Atomic_0= ruleAtomic ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getFactorAccess().getAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomic_in_ruleFactor2348);
            this_Atomic_0=ruleAtomic();

            state._fsp--;

             
                    current = this_Atomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1105:1: ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1105:2: () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleAtomic ) )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1105:2: ()
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1106:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getFactorAccess().getFactorLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1111:2: ( (lv_operator_2_0= '^' ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1112:1: (lv_operator_2_0= '^' )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1112:1: (lv_operator_2_0= '^' )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1113:3: lv_operator_2_0= '^'
            	    {
            	    lv_operator_2_0=(Token)match(input,26,FOLLOW_26_in_ruleFactor2375); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getFactorAccess().getOperatorCircumflexAccentKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFactorRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "^");
            	    	    

            	    }


            	    }

            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1126:2: ( (lv_right_3_0= ruleAtomic ) )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1127:1: (lv_right_3_0= ruleAtomic )
            	    {
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1127:1: (lv_right_3_0= ruleAtomic )
            	    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1128:3: lv_right_3_0= ruleAtomic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getRightAtomicParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomic_in_ruleFactor2409);
            	    lv_right_3_0=ruleAtomic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Atomic");
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleAtomic"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1152:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1153:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1154:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2447);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2457); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1161:1: ruleAtomic returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleElement ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_result_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1164:28: ( ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleElement ) ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1165:1: ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleElement ) ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1165:1: ( (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( (lv_result_3_0= ruleElement ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1165:2: (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1165:2: (otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')' )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1165:4: otherlv_0= '(' ( (lv_value_1_0= ruleExpr ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAtomic2495); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1169:1: ( (lv_value_1_0= ruleExpr ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1170:1: (lv_value_1_0= ruleExpr )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1170:1: (lv_value_1_0= ruleExpr )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1171:3: lv_value_1_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getValueExprParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic2516);
                    lv_value_1_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAtomic2528); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1192:6: ( (lv_result_3_0= ruleElement ) )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1192:6: ( (lv_result_3_0= ruleElement ) )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1193:1: (lv_result_3_0= ruleElement )
                    {
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1193:1: (lv_result_3_0= ruleElement )
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1194:3: lv_result_3_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getResultElementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElement_in_ruleAtomic2556);
                    lv_result_3_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		set(
                           			current, 
                           			"result",
                            		lv_result_3_0, 
                            		"Element");
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleElement"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1218:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1219:2: (iv_ruleElement= ruleElement EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1220:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement2593);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement2604); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1227:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1230:28: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1231:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1231:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1231:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleElement2644); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getElementAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1239:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElement2670); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getElementAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1254:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1255:2: (iv_ruleType= ruleType EOF )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1256:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2715);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2725); 

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
    // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1263:1: ruleType returns [EObject current=null] : ( (lv_value_0_0= 'var' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1266:28: ( ( (lv_value_0_0= 'var' ) ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1267:1: ( (lv_value_0_0= 'var' ) )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1267:1: ( (lv_value_0_0= 'var' ) )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1268:1: (lv_value_0_0= 'var' )
            {
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1268:1: (lv_value_0_0= 'var' )
            // ../br.poli.ecomp.compiladores/src-gen/br/poli/ecomp/compiladores/parser/antlr/internal/InternalNotC.g:1269:3: lv_value_0_0= 'var'
            {
            lv_value_0_0=(Token)match(input,27,FOLLOW_27_in_ruleType2767); 

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
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleCode131 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleCode153 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunction246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction263 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFunction280 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_ruleFuncParam_in_ruleFunction301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunction314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunction335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncParam_in_entryRuleFuncParam371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncParam381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleFuncParam427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuncParam444 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFuncParam462 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleFuncParam_in_ruleFuncParam483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBlock568 = new BitSet(new long[]{0x00000000080DC010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlock589 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlock601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatement702 = new BitSet(new long[]{0x00000000080D4012L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfCommand_in_ruleCommand796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileCommand_in_ruleCommand823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnCommand_in_ruleCommand850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKDeclaration_in_ruleCommand877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleCommand904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCommand931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfCommand_in_entryRuleIfCommand966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfCommand976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleIfCommand1013 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleIfCommand1025 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfCommand1046 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfCommand1058 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfCommand1079 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleIfCommand1092 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfCommand1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileCommand_in_entryRuleWhileCommand1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileCommand1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWhileCommand1198 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleWhileCommand1210 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleWhileCommand1231 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWhileCommand1243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleWhileCommand1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnCommand_in_entryRuleReturnCommand1300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnCommand1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleReturnCommand1347 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleReturnCommand1368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReturnCommand1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDeclaration1472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_ruleDeclaration1493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDeclaration1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKDeclaration_in_entryRuleKDeclaration1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKDeclaration1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_ruleKDeclaration1597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleKDeclaration1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_entryRuleRDeclaration1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDeclaration1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDDeclaration_in_ruleRDeclaration1701 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRDeclaration1723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRDeclaration_in_ruleRDeclaration1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDDeclaration_in_entryRuleIDDeclaration1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDDeclaration1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDDeclaration1834 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleIDDeclaration1852 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIDDeclaration1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpr1968 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleExpr1997 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_23_in_ruleExpr2026 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleExpr2063 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm2158 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleTerm2187 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_25_in_ruleTerm2216 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleTerm2253 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleFactor2348 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFactor2375 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleFactor2409 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAtomic2495 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic2516 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAtomic2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleAtomic2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleElement2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElement2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType2767 = new BitSet(new long[]{0x0000000000000002L});

}