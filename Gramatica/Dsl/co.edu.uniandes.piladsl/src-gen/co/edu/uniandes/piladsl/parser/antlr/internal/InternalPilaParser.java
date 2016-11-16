package co.edu.uniandes.piladsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.piladsl.services.PilaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPilaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LLAVEI", "RULE_LLAVED", "RULE_DOSPTOS", "RULE_COMA", "RULE_PTOCOMA", "RULE_INT", "RULE_IGUAL", "RULE_CADENA_LITERAL", "RULE_PARENTI", "RULE_PARENTD", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entidad'", "'atributo'", "'Lista'", "'Referencia'", "'servicioComputo'", "'retornar'", "'var'", "'si'", "'siNo'", "'siNinguno'", "'.'", "'NoAsignado'", "'CadenaCaracteres'", "'Entero'", "'Flotante'", "'Fecha'", "'Booleano'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'"
    };
    public static final int RULE_CADENA_LITERAL=12;
    public static final int RULE_DOSPTOS=7;
    public static final int RULE_ID=4;
    public static final int RULE_LLAVED=6;
    public static final int RULE_LLAVEI=5;
    public static final int RULE_PARENTD=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int RULE_IGUAL=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_PARENTI=13;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMA=8;
    public static final int RULE_STRING=15;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_PTOCOMA=9;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPilaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPilaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPilaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPila.g"; }



     	private PilaGrammarAccess grammarAccess;

        public InternalPilaParser(TokenStream input, PilaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PagoServicio";
       	}

       	@Override
       	protected PilaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePagoServicio"
    // InternalPila.g:65:1: entryRulePagoServicio returns [EObject current=null] : iv_rulePagoServicio= rulePagoServicio EOF ;
    public final EObject entryRulePagoServicio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagoServicio = null;


        try {
            // InternalPila.g:65:53: (iv_rulePagoServicio= rulePagoServicio EOF )
            // InternalPila.g:66:2: iv_rulePagoServicio= rulePagoServicio EOF
            {
             newCompositeNode(grammarAccess.getPagoServicioRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePagoServicio=rulePagoServicio();

            state._fsp--;

             current =iv_rulePagoServicio; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePagoServicio"


    // $ANTLR start "rulePagoServicio"
    // InternalPila.g:72:1: rulePagoServicio returns [EObject current=null] : ( ( (lv_entidades_0_0= ruleEntidad ) )+ ( (lv_serviciosComputo_1_0= ruleServicioComputo ) )* ) ;
    public final EObject rulePagoServicio() throws RecognitionException {
        EObject current = null;

        EObject lv_entidades_0_0 = null;

        EObject lv_serviciosComputo_1_0 = null;



        	enterRule();

        try {
            // InternalPila.g:78:2: ( ( ( (lv_entidades_0_0= ruleEntidad ) )+ ( (lv_serviciosComputo_1_0= ruleServicioComputo ) )* ) )
            // InternalPila.g:79:2: ( ( (lv_entidades_0_0= ruleEntidad ) )+ ( (lv_serviciosComputo_1_0= ruleServicioComputo ) )* )
            {
            // InternalPila.g:79:2: ( ( (lv_entidades_0_0= ruleEntidad ) )+ ( (lv_serviciosComputo_1_0= ruleServicioComputo ) )* )
            // InternalPila.g:80:3: ( (lv_entidades_0_0= ruleEntidad ) )+ ( (lv_serviciosComputo_1_0= ruleServicioComputo ) )*
            {
            // InternalPila.g:80:3: ( (lv_entidades_0_0= ruleEntidad ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPila.g:81:4: (lv_entidades_0_0= ruleEntidad )
            	    {
            	    // InternalPila.g:81:4: (lv_entidades_0_0= ruleEntidad )
            	    // InternalPila.g:82:5: lv_entidades_0_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getPagoServicioAccess().getEntidadesEntidadParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entidades_0_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPagoServicioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_0_0,
            	    						"co.edu.uniandes.piladsl.Pila.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalPila.g:99:3: ( (lv_serviciosComputo_1_0= ruleServicioComputo ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPila.g:100:4: (lv_serviciosComputo_1_0= ruleServicioComputo )
            	    {
            	    // InternalPila.g:100:4: (lv_serviciosComputo_1_0= ruleServicioComputo )
            	    // InternalPila.g:101:5: lv_serviciosComputo_1_0= ruleServicioComputo
            	    {

            	    					newCompositeNode(grammarAccess.getPagoServicioAccess().getServiciosComputoServicioComputoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_serviciosComputo_1_0=ruleServicioComputo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPagoServicioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"serviciosComputo",
            	    						lv_serviciosComputo_1_0,
            	    						"co.edu.uniandes.piladsl.Pila.ServicioComputo");
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
    // $ANTLR end "rulePagoServicio"


    // $ANTLR start "entryRuleEntidad"
    // InternalPila.g:122:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalPila.g:122:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalPila.g:123:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalPila.g:129:1: ruleEntidad returns [EObject current=null] : (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_atributos_3_0= ruleAtributo ) )* this_LLAVED_4= RULE_LLAVED ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LLAVEI_2=null;
        Token this_LLAVED_4=null;
        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalPila.g:135:2: ( (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_atributos_3_0= ruleAtributo ) )* this_LLAVED_4= RULE_LLAVED ) )
            // InternalPila.g:136:2: (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_atributos_3_0= ruleAtributo ) )* this_LLAVED_4= RULE_LLAVED )
            {
            // InternalPila.g:136:2: (otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_atributos_3_0= ruleAtributo ) )* this_LLAVED_4= RULE_LLAVED )
            // InternalPila.g:137:3: otherlv_0= 'entidad' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_atributos_3_0= ruleAtributo ) )* this_LLAVED_4= RULE_LLAVED
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadAccess().getEntidadKeyword_0());
            		
            // InternalPila.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPila.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPila.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalPila.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntidadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_LLAVEI_2=(Token)match(input,RULE_LLAVEI,FOLLOW_7); 

            			newLeafNode(this_LLAVEI_2, grammarAccess.getEntidadAccess().getLLAVEITerminalRuleCall_2());
            		
            // InternalPila.g:163:3: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPila.g:164:4: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // InternalPila.g:164:4: (lv_atributos_3_0= ruleAtributo )
            	    // InternalPila.g:165:5: lv_atributos_3_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_atributos_3_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_3_0,
            	    						"co.edu.uniandes.piladsl.Pila.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_LLAVED_4=(Token)match(input,RULE_LLAVED,FOLLOW_2); 

            			newLeafNode(this_LLAVED_4, grammarAccess.getEntidadAccess().getLLAVEDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalPila.g:190:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalPila.g:190:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalPila.g:191:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalPila.g:197:1: ruleAtributo returns [EObject current=null] : (otherlv_0= 'atributo' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? ) | (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) ) ) this_PTOCOMA_13= RULE_PTOCOMA ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_DOSPTOS_2=null;
        Token this_LLAVEI_4=null;
        Token this_COMA_6=null;
        Token this_LLAVED_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_referencia_12_0=null;
        Token this_PTOCOMA_13=null;
        Enumerator lv_tipoPrimitivo_3_0 = null;

        EObject lv_listaLlaveValor_5_0 = null;

        EObject lv_listaLlaveValor_7_0 = null;



        	enterRule();

        try {
            // InternalPila.g:203:2: ( (otherlv_0= 'atributo' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? ) | (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) ) ) this_PTOCOMA_13= RULE_PTOCOMA ) )
            // InternalPila.g:204:2: (otherlv_0= 'atributo' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? ) | (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) ) ) this_PTOCOMA_13= RULE_PTOCOMA )
            {
            // InternalPila.g:204:2: (otherlv_0= 'atributo' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? ) | (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) ) ) this_PTOCOMA_13= RULE_PTOCOMA )
            // InternalPila.g:205:3: otherlv_0= 'atributo' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? ) | (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) ) ) this_PTOCOMA_13= RULE_PTOCOMA
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getAtributoKeyword_0());
            		
            // InternalPila.g:209:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPila.g:210:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPila.g:210:4: (lv_name_1_0= RULE_ID )
            // InternalPila.g:211:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_DOSPTOS_2=(Token)match(input,RULE_DOSPTOS,FOLLOW_9); 

            			newLeafNode(this_DOSPTOS_2, grammarAccess.getAtributoAccess().getDOSPTOSTerminalRuleCall_2());
            		
            // InternalPila.g:231:3: ( ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? ) | (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) ) | (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPila.g:232:4: ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? )
                    {
                    // InternalPila.g:232:4: ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )? )
                    // InternalPila.g:233:5: ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )?
                    {
                    // InternalPila.g:233:5: ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) )
                    // InternalPila.g:234:6: (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo )
                    {
                    // InternalPila.g:234:6: (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo )
                    // InternalPila.g:235:7: lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo
                    {

                    							newCompositeNode(grammarAccess.getAtributoAccess().getTipoPrimitivoTipoDatoPrimitivoEnumRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoPrimitivo_3_0=ruleTipoDatoPrimitivo();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAtributoRule());
                    							}
                    							set(
                    								current,
                    								"tipoPrimitivo",
                    								lv_tipoPrimitivo_3_0,
                    								"co.edu.uniandes.piladsl.Pila.TipoDatoPrimitivo");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPila.g:252:5: (this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_LLAVEI) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPila.g:253:6: this_LLAVEI_4= RULE_LLAVEI ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) ) (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )* this_LLAVED_8= RULE_LLAVED
                            {
                            this_LLAVEI_4=(Token)match(input,RULE_LLAVEI,FOLLOW_11); 

                            						newLeafNode(this_LLAVEI_4, grammarAccess.getAtributoAccess().getLLAVEITerminalRuleCall_3_0_1_0());
                            					
                            // InternalPila.g:257:6: ( (lv_listaLlaveValor_5_0= ruleLlaveValor ) )
                            // InternalPila.g:258:7: (lv_listaLlaveValor_5_0= ruleLlaveValor )
                            {
                            // InternalPila.g:258:7: (lv_listaLlaveValor_5_0= ruleLlaveValor )
                            // InternalPila.g:259:8: lv_listaLlaveValor_5_0= ruleLlaveValor
                            {

                            								newCompositeNode(grammarAccess.getAtributoAccess().getListaLlaveValorLlaveValorParserRuleCall_3_0_1_1_0());
                            							
                            pushFollow(FOLLOW_12);
                            lv_listaLlaveValor_5_0=ruleLlaveValor();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAtributoRule());
                            								}
                            								add(
                            									current,
                            									"listaLlaveValor",
                            									lv_listaLlaveValor_5_0,
                            									"co.edu.uniandes.piladsl.Pila.LlaveValor");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalPila.g:276:6: (this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==RULE_COMA) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalPila.g:277:7: this_COMA_6= RULE_COMA ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) )
                            	    {
                            	    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_11); 

                            	    							newLeafNode(this_COMA_6, grammarAccess.getAtributoAccess().getCOMATerminalRuleCall_3_0_1_2_0());
                            	    						
                            	    // InternalPila.g:281:7: ( (lv_listaLlaveValor_7_0= ruleLlaveValor ) )
                            	    // InternalPila.g:282:8: (lv_listaLlaveValor_7_0= ruleLlaveValor )
                            	    {
                            	    // InternalPila.g:282:8: (lv_listaLlaveValor_7_0= ruleLlaveValor )
                            	    // InternalPila.g:283:9: lv_listaLlaveValor_7_0= ruleLlaveValor
                            	    {

                            	    									newCompositeNode(grammarAccess.getAtributoAccess().getListaLlaveValorLlaveValorParserRuleCall_3_0_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_12);
                            	    lv_listaLlaveValor_7_0=ruleLlaveValor();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getAtributoRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"listaLlaveValor",
                            	    										lv_listaLlaveValor_7_0,
                            	    										"co.edu.uniandes.piladsl.Pila.LlaveValor");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);

                            this_LLAVED_8=(Token)match(input,RULE_LLAVED,FOLLOW_13); 

                            						newLeafNode(this_LLAVED_8, grammarAccess.getAtributoAccess().getLLAVEDTerminalRuleCall_3_0_1_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPila.g:308:4: (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalPila.g:308:4: (otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) ) )
                    // InternalPila.g:309:5: otherlv_9= 'Lista' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getListaKeyword_3_1_0());
                    				
                    // InternalPila.g:313:5: ( (otherlv_10= RULE_ID ) )
                    // InternalPila.g:314:6: (otherlv_10= RULE_ID )
                    {
                    // InternalPila.g:314:6: (otherlv_10= RULE_ID )
                    // InternalPila.g:315:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAtributoRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getListaEntidadEntidadCrossReference_3_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPila.g:328:4: (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) )
                    {
                    // InternalPila.g:328:4: (otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) ) )
                    // InternalPila.g:329:5: otherlv_11= 'Referencia' ( (lv_referencia_12_0= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_5); 

                    					newLeafNode(otherlv_11, grammarAccess.getAtributoAccess().getReferenciaKeyword_3_2_0());
                    				
                    // InternalPila.g:333:5: ( (lv_referencia_12_0= RULE_ID ) )
                    // InternalPila.g:334:6: (lv_referencia_12_0= RULE_ID )
                    {
                    // InternalPila.g:334:6: (lv_referencia_12_0= RULE_ID )
                    // InternalPila.g:335:7: lv_referencia_12_0= RULE_ID
                    {
                    lv_referencia_12_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    							newLeafNode(lv_referencia_12_0, grammarAccess.getAtributoAccess().getReferenciaIDTerminalRuleCall_3_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAtributoRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"referencia",
                    								lv_referencia_12_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            this_PTOCOMA_13=(Token)match(input,RULE_PTOCOMA,FOLLOW_2); 

            			newLeafNode(this_PTOCOMA_13, grammarAccess.getAtributoAccess().getPTOCOMATerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleLlaveValor"
    // InternalPila.g:361:1: entryRuleLlaveValor returns [EObject current=null] : iv_ruleLlaveValor= ruleLlaveValor EOF ;
    public final EObject entryRuleLlaveValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlaveValor = null;


        try {
            // InternalPila.g:361:51: (iv_ruleLlaveValor= ruleLlaveValor EOF )
            // InternalPila.g:362:2: iv_ruleLlaveValor= ruleLlaveValor EOF
            {
             newCompositeNode(grammarAccess.getLlaveValorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlaveValor=ruleLlaveValor();

            state._fsp--;

             current =iv_ruleLlaveValor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLlaveValor"


    // $ANTLR start "ruleLlaveValor"
    // InternalPila.g:368:1: ruleLlaveValor returns [EObject current=null] : ( ( (lv_llave_0_0= RULE_INT ) ) this_IGUAL_1= RULE_IGUAL ( (lv_valor_2_0= RULE_CADENA_LITERAL ) ) ) ;
    public final EObject ruleLlaveValor() throws RecognitionException {
        EObject current = null;

        Token lv_llave_0_0=null;
        Token this_IGUAL_1=null;
        Token lv_valor_2_0=null;


        	enterRule();

        try {
            // InternalPila.g:374:2: ( ( ( (lv_llave_0_0= RULE_INT ) ) this_IGUAL_1= RULE_IGUAL ( (lv_valor_2_0= RULE_CADENA_LITERAL ) ) ) )
            // InternalPila.g:375:2: ( ( (lv_llave_0_0= RULE_INT ) ) this_IGUAL_1= RULE_IGUAL ( (lv_valor_2_0= RULE_CADENA_LITERAL ) ) )
            {
            // InternalPila.g:375:2: ( ( (lv_llave_0_0= RULE_INT ) ) this_IGUAL_1= RULE_IGUAL ( (lv_valor_2_0= RULE_CADENA_LITERAL ) ) )
            // InternalPila.g:376:3: ( (lv_llave_0_0= RULE_INT ) ) this_IGUAL_1= RULE_IGUAL ( (lv_valor_2_0= RULE_CADENA_LITERAL ) )
            {
            // InternalPila.g:376:3: ( (lv_llave_0_0= RULE_INT ) )
            // InternalPila.g:377:4: (lv_llave_0_0= RULE_INT )
            {
            // InternalPila.g:377:4: (lv_llave_0_0= RULE_INT )
            // InternalPila.g:378:5: lv_llave_0_0= RULE_INT
            {
            lv_llave_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_llave_0_0, grammarAccess.getLlaveValorAccess().getLlaveINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLlaveValorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"llave",
            						lv_llave_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_IGUAL_1=(Token)match(input,RULE_IGUAL,FOLLOW_15); 

            			newLeafNode(this_IGUAL_1, grammarAccess.getLlaveValorAccess().getIGUALTerminalRuleCall_1());
            		
            // InternalPila.g:398:3: ( (lv_valor_2_0= RULE_CADENA_LITERAL ) )
            // InternalPila.g:399:4: (lv_valor_2_0= RULE_CADENA_LITERAL )
            {
            // InternalPila.g:399:4: (lv_valor_2_0= RULE_CADENA_LITERAL )
            // InternalPila.g:400:5: lv_valor_2_0= RULE_CADENA_LITERAL
            {
            lv_valor_2_0=(Token)match(input,RULE_CADENA_LITERAL,FOLLOW_2); 

            					newLeafNode(lv_valor_2_0, grammarAccess.getLlaveValorAccess().getValorCADENA_LITERALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLlaveValorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valor",
            						lv_valor_2_0,
            						"co.edu.uniandes.piladsl.Pila.CADENA_LITERAL");
            				

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
    // $ANTLR end "ruleLlaveValor"


    // $ANTLR start "entryRuleServicioComputo"
    // InternalPila.g:420:1: entryRuleServicioComputo returns [EObject current=null] : iv_ruleServicioComputo= ruleServicioComputo EOF ;
    public final EObject entryRuleServicioComputo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicioComputo = null;


        try {
            // InternalPila.g:420:56: (iv_ruleServicioComputo= ruleServicioComputo EOF )
            // InternalPila.g:421:2: iv_ruleServicioComputo= ruleServicioComputo EOF
            {
             newCompositeNode(grammarAccess.getServicioComputoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServicioComputo=ruleServicioComputo();

            state._fsp--;

             current =iv_ruleServicioComputo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServicioComputo"


    // $ANTLR start "ruleServicioComputo"
    // InternalPila.g:427:1: ruleServicioComputo returns [EObject current=null] : (otherlv_0= 'servicioComputo' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_variables_3_0= ruleVariable ) )* ( (lv_condiciones_4_0= ruleCondicion ) )* (otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )? this_LLAVED_8= RULE_LLAVED ) ;
    public final EObject ruleServicioComputo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LLAVEI_2=null;
        Token otherlv_5=null;
        Token this_PTOCOMA_7=null;
        Token this_LLAVED_8=null;
        EObject lv_variables_3_0 = null;

        EObject lv_condiciones_4_0 = null;

        EObject lv_expresionRetorno_6_0 = null;



        	enterRule();

        try {
            // InternalPila.g:433:2: ( (otherlv_0= 'servicioComputo' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_variables_3_0= ruleVariable ) )* ( (lv_condiciones_4_0= ruleCondicion ) )* (otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )? this_LLAVED_8= RULE_LLAVED ) )
            // InternalPila.g:434:2: (otherlv_0= 'servicioComputo' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_variables_3_0= ruleVariable ) )* ( (lv_condiciones_4_0= ruleCondicion ) )* (otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )? this_LLAVED_8= RULE_LLAVED )
            {
            // InternalPila.g:434:2: (otherlv_0= 'servicioComputo' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_variables_3_0= ruleVariable ) )* ( (lv_condiciones_4_0= ruleCondicion ) )* (otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )? this_LLAVED_8= RULE_LLAVED )
            // InternalPila.g:435:3: otherlv_0= 'servicioComputo' ( (lv_name_1_0= RULE_ID ) ) this_LLAVEI_2= RULE_LLAVEI ( (lv_variables_3_0= ruleVariable ) )* ( (lv_condiciones_4_0= ruleCondicion ) )* (otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )? this_LLAVED_8= RULE_LLAVED
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServicioComputoAccess().getServicioComputoKeyword_0());
            		
            // InternalPila.g:439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPila.g:440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPila.g:440:4: (lv_name_1_0= RULE_ID )
            // InternalPila.g:441:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServicioComputoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServicioComputoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_LLAVEI_2=(Token)match(input,RULE_LLAVEI,FOLLOW_16); 

            			newLeafNode(this_LLAVEI_2, grammarAccess.getServicioComputoAccess().getLLAVEITerminalRuleCall_2());
            		
            // InternalPila.g:461:3: ( (lv_variables_3_0= ruleVariable ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPila.g:462:4: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalPila.g:462:4: (lv_variables_3_0= ruleVariable )
            	    // InternalPila.g:463:5: lv_variables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getServicioComputoAccess().getVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_variables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServicioComputoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"co.edu.uniandes.piladsl.Pila.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalPila.g:480:3: ( (lv_condiciones_4_0= ruleCondicion ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPila.g:481:4: (lv_condiciones_4_0= ruleCondicion )
            	    {
            	    // InternalPila.g:481:4: (lv_condiciones_4_0= ruleCondicion )
            	    // InternalPila.g:482:5: lv_condiciones_4_0= ruleCondicion
            	    {

            	    					newCompositeNode(grammarAccess.getServicioComputoAccess().getCondicionesCondicionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_condiciones_4_0=ruleCondicion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServicioComputoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condiciones",
            	    						lv_condiciones_4_0,
            	    						"co.edu.uniandes.piladsl.Pila.Condicion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPila.g:499:3: (otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPila.g:500:4: otherlv_5= 'retornar' ( (lv_expresionRetorno_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getServicioComputoAccess().getRetornarKeyword_5_0());
                    			
                    // InternalPila.g:504:4: ( (lv_expresionRetorno_6_0= ruleExpresion ) )
                    // InternalPila.g:505:5: (lv_expresionRetorno_6_0= ruleExpresion )
                    {
                    // InternalPila.g:505:5: (lv_expresionRetorno_6_0= ruleExpresion )
                    // InternalPila.g:506:6: lv_expresionRetorno_6_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getServicioComputoAccess().getExpresionRetornoExpresionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expresionRetorno_6_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServicioComputoRule());
                    						}
                    						set(
                    							current,
                    							"expresionRetorno",
                    							lv_expresionRetorno_6_0,
                    							"co.edu.uniandes.piladsl.Pila.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_PTOCOMA_7=(Token)match(input,RULE_PTOCOMA,FOLLOW_19); 

                    				newLeafNode(this_PTOCOMA_7, grammarAccess.getServicioComputoAccess().getPTOCOMATerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            this_LLAVED_8=(Token)match(input,RULE_LLAVED,FOLLOW_2); 

            			newLeafNode(this_LLAVED_8, grammarAccess.getServicioComputoAccess().getLLAVEDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleServicioComputo"


    // $ANTLR start "entryRuleVariable"
    // InternalPila.g:536:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPila.g:536:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPila.g:537:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPila.g:543:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) | ( (otherlv_4= RULE_ID ) ) ) this_IGUAL_5= RULE_IGUAL ( (lv_expresion_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_DOSPTOS_2=null;
        Token otherlv_4=null;
        Token this_IGUAL_5=null;
        Token this_PTOCOMA_7=null;
        Enumerator lv_tipoPrimitivo_3_0 = null;

        EObject lv_expresion_6_0 = null;



        	enterRule();

        try {
            // InternalPila.g:549:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) | ( (otherlv_4= RULE_ID ) ) ) this_IGUAL_5= RULE_IGUAL ( (lv_expresion_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA ) )
            // InternalPila.g:550:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) | ( (otherlv_4= RULE_ID ) ) ) this_IGUAL_5= RULE_IGUAL ( (lv_expresion_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )
            {
            // InternalPila.g:550:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) | ( (otherlv_4= RULE_ID ) ) ) this_IGUAL_5= RULE_IGUAL ( (lv_expresion_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA )
            // InternalPila.g:551:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) this_DOSPTOS_2= RULE_DOSPTOS ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) | ( (otherlv_4= RULE_ID ) ) ) this_IGUAL_5= RULE_IGUAL ( (lv_expresion_6_0= ruleExpresion ) ) this_PTOCOMA_7= RULE_PTOCOMA
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalPila.g:555:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPila.g:556:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPila.g:556:4: (lv_name_1_0= RULE_ID )
            // InternalPila.g:557:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_DOSPTOS_2=(Token)match(input,RULE_DOSPTOS,FOLLOW_20); 

            			newLeafNode(this_DOSPTOS_2, grammarAccess.getVariableAccess().getDOSPTOSTerminalRuleCall_2());
            		
            // InternalPila.g:577:3: ( ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=31 && LA10_0<=36)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPila.g:578:4: ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) )
                    {
                    // InternalPila.g:578:4: ( (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo ) )
                    // InternalPila.g:579:5: (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo )
                    {
                    // InternalPila.g:579:5: (lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo )
                    // InternalPila.g:580:6: lv_tipoPrimitivo_3_0= ruleTipoDatoPrimitivo
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getTipoPrimitivoTipoDatoPrimitivoEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_tipoPrimitivo_3_0=ruleTipoDatoPrimitivo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"tipoPrimitivo",
                    							lv_tipoPrimitivo_3_0,
                    							"co.edu.uniandes.piladsl.Pila.TipoDatoPrimitivo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPila.g:598:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalPila.g:598:4: ( (otherlv_4= RULE_ID ) )
                    // InternalPila.g:599:5: (otherlv_4= RULE_ID )
                    {
                    // InternalPila.g:599:5: (otherlv_4= RULE_ID )
                    // InternalPila.g:600:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getReferenciaEntidadEntidadCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            this_IGUAL_5=(Token)match(input,RULE_IGUAL,FOLLOW_18); 

            			newLeafNode(this_IGUAL_5, grammarAccess.getVariableAccess().getIGUALTerminalRuleCall_4());
            		
            // InternalPila.g:616:3: ( (lv_expresion_6_0= ruleExpresion ) )
            // InternalPila.g:617:4: (lv_expresion_6_0= ruleExpresion )
            {
            // InternalPila.g:617:4: (lv_expresion_6_0= ruleExpresion )
            // InternalPila.g:618:5: lv_expresion_6_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpresionExpresionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_expresion_6_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_6_0,
            						"co.edu.uniandes.piladsl.Pila.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PTOCOMA_7=(Token)match(input,RULE_PTOCOMA,FOLLOW_2); 

            			newLeafNode(this_PTOCOMA_7, grammarAccess.getVariableAccess().getPTOCOMATerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicion"
    // InternalPila.g:643:1: entryRuleCondicion returns [EObject current=null] : iv_ruleCondicion= ruleCondicion EOF ;
    public final EObject entryRuleCondicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicion = null;


        try {
            // InternalPila.g:643:50: (iv_ruleCondicion= ruleCondicion EOF )
            // InternalPila.g:644:2: iv_ruleCondicion= ruleCondicion EOF
            {
             newCompositeNode(grammarAccess.getCondicionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicion=ruleCondicion();

            state._fsp--;

             current =iv_ruleCondicion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondicion"


    // $ANTLR start "ruleCondicion"
    // InternalPila.g:650:1: ruleCondicion returns [EObject current=null] : ( ( ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) ) | ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) ) ) this_LLAVEI_3= RULE_LLAVEI ( (lv_variables_4_0= ruleVariable ) )* ( ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA )? ( (lv_subCondiciones_9_0= ruleCondicion ) )* (otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA )? this_LLAVED_13= RULE_LLAVED ) ;
    public final EObject ruleCondicion() throws RecognitionException {
        EObject current = null;

        Token lv_condicionSi_0_1=null;
        Token lv_condicionSi_0_2=null;
        Token lv_condicionSiNinguno_2_0=null;
        Token this_LLAVEI_3=null;
        Token otherlv_5=null;
        Token this_IGUAL_6=null;
        Token this_PTOCOMA_8=null;
        Token otherlv_10=null;
        Token this_PTOCOMA_12=null;
        Token this_LLAVED_13=null;
        EObject lv_expresionCondicion_1_0 = null;

        EObject lv_variables_4_0 = null;

        EObject lv_expresion_7_0 = null;

        EObject lv_subCondiciones_9_0 = null;

        EObject lv_expresionRetorno_11_0 = null;



        	enterRule();

        try {
            // InternalPila.g:656:2: ( ( ( ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) ) | ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) ) ) this_LLAVEI_3= RULE_LLAVEI ( (lv_variables_4_0= ruleVariable ) )* ( ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA )? ( (lv_subCondiciones_9_0= ruleCondicion ) )* (otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA )? this_LLAVED_13= RULE_LLAVED ) )
            // InternalPila.g:657:2: ( ( ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) ) | ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) ) ) this_LLAVEI_3= RULE_LLAVEI ( (lv_variables_4_0= ruleVariable ) )* ( ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA )? ( (lv_subCondiciones_9_0= ruleCondicion ) )* (otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA )? this_LLAVED_13= RULE_LLAVED )
            {
            // InternalPila.g:657:2: ( ( ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) ) | ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) ) ) this_LLAVEI_3= RULE_LLAVEI ( (lv_variables_4_0= ruleVariable ) )* ( ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA )? ( (lv_subCondiciones_9_0= ruleCondicion ) )* (otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA )? this_LLAVED_13= RULE_LLAVED )
            // InternalPila.g:658:3: ( ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) ) | ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) ) ) this_LLAVEI_3= RULE_LLAVEI ( (lv_variables_4_0= ruleVariable ) )* ( ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA )? ( (lv_subCondiciones_9_0= ruleCondicion ) )* (otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA )? this_LLAVED_13= RULE_LLAVED
            {
            // InternalPila.g:658:3: ( ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) ) | ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPila.g:659:4: ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) )
                    {
                    // InternalPila.g:659:4: ( ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) ) )
                    // InternalPila.g:660:5: ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) ) ( (lv_expresionCondicion_1_0= ruleExpresion ) )
                    {
                    // InternalPila.g:660:5: ( ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) ) )
                    // InternalPila.g:661:6: ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) )
                    {
                    // InternalPila.g:661:6: ( (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' ) )
                    // InternalPila.g:662:7: (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' )
                    {
                    // InternalPila.g:662:7: (lv_condicionSi_0_1= 'si' | lv_condicionSi_0_2= 'siNo' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==28) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPila.g:663:8: lv_condicionSi_0_1= 'si'
                            {
                            lv_condicionSi_0_1=(Token)match(input,27,FOLLOW_18); 

                            								newLeafNode(lv_condicionSi_0_1, grammarAccess.getCondicionAccess().getCondicionSiSiKeyword_0_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCondicionRule());
                            								}
                            								setWithLastConsumed(current, "condicionSi", lv_condicionSi_0_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalPila.g:674:8: lv_condicionSi_0_2= 'siNo'
                            {
                            lv_condicionSi_0_2=(Token)match(input,28,FOLLOW_18); 

                            								newLeafNode(lv_condicionSi_0_2, grammarAccess.getCondicionAccess().getCondicionSiSiNoKeyword_0_0_0_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCondicionRule());
                            								}
                            								setWithLastConsumed(current, "condicionSi", lv_condicionSi_0_2, null);
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalPila.g:687:5: ( (lv_expresionCondicion_1_0= ruleExpresion ) )
                    // InternalPila.g:688:6: (lv_expresionCondicion_1_0= ruleExpresion )
                    {
                    // InternalPila.g:688:6: (lv_expresionCondicion_1_0= ruleExpresion )
                    // InternalPila.g:689:7: lv_expresionCondicion_1_0= ruleExpresion
                    {

                    							newCompositeNode(grammarAccess.getCondicionAccess().getExpresionCondicionExpresionParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_expresionCondicion_1_0=ruleExpresion();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCondicionRule());
                    							}
                    							set(
                    								current,
                    								"expresionCondicion",
                    								lv_expresionCondicion_1_0,
                    								"co.edu.uniandes.piladsl.Pila.Expresion");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPila.g:708:4: ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) )
                    {
                    // InternalPila.g:708:4: ( (lv_condicionSiNinguno_2_0= 'siNinguno' ) )
                    // InternalPila.g:709:5: (lv_condicionSiNinguno_2_0= 'siNinguno' )
                    {
                    // InternalPila.g:709:5: (lv_condicionSiNinguno_2_0= 'siNinguno' )
                    // InternalPila.g:710:6: lv_condicionSiNinguno_2_0= 'siNinguno'
                    {
                    lv_condicionSiNinguno_2_0=(Token)match(input,29,FOLLOW_6); 

                    						newLeafNode(lv_condicionSiNinguno_2_0, grammarAccess.getCondicionAccess().getCondicionSiNingunoSiNingunoKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCondicionRule());
                    						}
                    						setWithLastConsumed(current, "condicionSiNinguno", lv_condicionSiNinguno_2_0, "siNinguno");
                    					

                    }


                    }


                    }
                    break;

            }

            this_LLAVEI_3=(Token)match(input,RULE_LLAVEI,FOLLOW_21); 

            			newLeafNode(this_LLAVEI_3, grammarAccess.getCondicionAccess().getLLAVEITerminalRuleCall_1());
            		
            // InternalPila.g:727:3: ( (lv_variables_4_0= ruleVariable ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPila.g:728:4: (lv_variables_4_0= ruleVariable )
            	    {
            	    // InternalPila.g:728:4: (lv_variables_4_0= ruleVariable )
            	    // InternalPila.g:729:5: lv_variables_4_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionAccess().getVariablesVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_4_0,
            	    						"co.edu.uniandes.piladsl.Pila.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPila.g:746:3: ( ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPila.g:747:4: ( (otherlv_5= RULE_ID ) ) this_IGUAL_6= RULE_IGUAL ( (lv_expresion_7_0= ruleExpresion ) ) this_PTOCOMA_8= RULE_PTOCOMA
                    {
                    // InternalPila.g:747:4: ( (otherlv_5= RULE_ID ) )
                    // InternalPila.g:748:5: (otherlv_5= RULE_ID )
                    {
                    // InternalPila.g:748:5: (otherlv_5= RULE_ID )
                    // InternalPila.g:749:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCondicionRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_5, grammarAccess.getCondicionAccess().getAsignacionVariableVariableCrossReference_3_0_0());
                    					

                    }


                    }

                    this_IGUAL_6=(Token)match(input,RULE_IGUAL,FOLLOW_18); 

                    				newLeafNode(this_IGUAL_6, grammarAccess.getCondicionAccess().getIGUALTerminalRuleCall_3_1());
                    			
                    // InternalPila.g:764:4: ( (lv_expresion_7_0= ruleExpresion ) )
                    // InternalPila.g:765:5: (lv_expresion_7_0= ruleExpresion )
                    {
                    // InternalPila.g:765:5: (lv_expresion_7_0= ruleExpresion )
                    // InternalPila.g:766:6: lv_expresion_7_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getCondicionAccess().getExpresionExpresionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expresion_7_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionRule());
                    						}
                    						add(
                    							current,
                    							"expresion",
                    							lv_expresion_7_0,
                    							"co.edu.uniandes.piladsl.Pila.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_PTOCOMA_8=(Token)match(input,RULE_PTOCOMA,FOLLOW_17); 

                    				newLeafNode(this_PTOCOMA_8, grammarAccess.getCondicionAccess().getPTOCOMATerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            // InternalPila.g:788:3: ( (lv_subCondiciones_9_0= ruleCondicion ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=27 && LA15_0<=29)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPila.g:789:4: (lv_subCondiciones_9_0= ruleCondicion )
            	    {
            	    // InternalPila.g:789:4: (lv_subCondiciones_9_0= ruleCondicion )
            	    // InternalPila.g:790:5: lv_subCondiciones_9_0= ruleCondicion
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionAccess().getSubCondicionesCondicionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_subCondiciones_9_0=ruleCondicion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subCondiciones",
            	    						lv_subCondiciones_9_0,
            	    						"co.edu.uniandes.piladsl.Pila.Condicion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalPila.g:807:3: (otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPila.g:808:4: otherlv_10= 'retornar' ( (lv_expresionRetorno_11_0= ruleExpresion ) ) this_PTOCOMA_12= RULE_PTOCOMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getCondicionAccess().getRetornarKeyword_5_0());
                    			
                    // InternalPila.g:812:4: ( (lv_expresionRetorno_11_0= ruleExpresion ) )
                    // InternalPila.g:813:5: (lv_expresionRetorno_11_0= ruleExpresion )
                    {
                    // InternalPila.g:813:5: (lv_expresionRetorno_11_0= ruleExpresion )
                    // InternalPila.g:814:6: lv_expresionRetorno_11_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getCondicionAccess().getExpresionRetornoExpresionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expresionRetorno_11_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionRule());
                    						}
                    						set(
                    							current,
                    							"expresionRetorno",
                    							lv_expresionRetorno_11_0,
                    							"co.edu.uniandes.piladsl.Pila.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_PTOCOMA_12=(Token)match(input,RULE_PTOCOMA,FOLLOW_19); 

                    				newLeafNode(this_PTOCOMA_12, grammarAccess.getCondicionAccess().getPTOCOMATerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            this_LLAVED_13=(Token)match(input,RULE_LLAVED,FOLLOW_2); 

            			newLeafNode(this_LLAVED_13, grammarAccess.getCondicionAccess().getLLAVEDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleCondicion"


    // $ANTLR start "entryRuleExpresion"
    // InternalPila.g:844:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalPila.g:844:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalPila.g:845:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalPila.g:851:1: ruleExpresion returns [EObject current=null] : ( ( (lv_izquierda_0_0= ruleExpresionTerminal ) ) ( ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) ) )* ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject lv_izquierda_0_0 = null;

        Enumerator lv_operador_1_0 = null;

        EObject lv_derechas_2_0 = null;



        	enterRule();

        try {
            // InternalPila.g:857:2: ( ( ( (lv_izquierda_0_0= ruleExpresionTerminal ) ) ( ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) ) )* ) )
            // InternalPila.g:858:2: ( ( (lv_izquierda_0_0= ruleExpresionTerminal ) ) ( ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) ) )* )
            {
            // InternalPila.g:858:2: ( ( (lv_izquierda_0_0= ruleExpresionTerminal ) ) ( ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) ) )* )
            // InternalPila.g:859:3: ( (lv_izquierda_0_0= ruleExpresionTerminal ) ) ( ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) ) )*
            {
            // InternalPila.g:859:3: ( (lv_izquierda_0_0= ruleExpresionTerminal ) )
            // InternalPila.g:860:4: (lv_izquierda_0_0= ruleExpresionTerminal )
            {
            // InternalPila.g:860:4: (lv_izquierda_0_0= ruleExpresionTerminal )
            // InternalPila.g:861:5: lv_izquierda_0_0= ruleExpresionTerminal
            {

            					newCompositeNode(grammarAccess.getExpresionAccess().getIzquierdaExpresionTerminalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_izquierda_0_0=ruleExpresionTerminal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRule());
            					}
            					set(
            						current,
            						"izquierda",
            						lv_izquierda_0_0,
            						"co.edu.uniandes.piladsl.Pila.ExpresionTerminal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPila.g:878:3: ( ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=48)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPila.g:879:4: ( (lv_operador_1_0= ruleOperador ) ) ( (lv_derechas_2_0= ruleExpresionTerminal ) )
            	    {
            	    // InternalPila.g:879:4: ( (lv_operador_1_0= ruleOperador ) )
            	    // InternalPila.g:880:5: (lv_operador_1_0= ruleOperador )
            	    {
            	    // InternalPila.g:880:5: (lv_operador_1_0= ruleOperador )
            	    // InternalPila.g:881:6: lv_operador_1_0= ruleOperador
            	    {

            	    						newCompositeNode(grammarAccess.getExpresionAccess().getOperadorOperadorEnumRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_operador_1_0=ruleOperador();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpresionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operador",
            	    							lv_operador_1_0,
            	    							"co.edu.uniandes.piladsl.Pila.Operador");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPila.g:898:4: ( (lv_derechas_2_0= ruleExpresionTerminal ) )
            	    // InternalPila.g:899:5: (lv_derechas_2_0= ruleExpresionTerminal )
            	    {
            	    // InternalPila.g:899:5: (lv_derechas_2_0= ruleExpresionTerminal )
            	    // InternalPila.g:900:6: lv_derechas_2_0= ruleExpresionTerminal
            	    {

            	    						newCompositeNode(grammarAccess.getExpresionAccess().getDerechasExpresionTerminalParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_derechas_2_0=ruleExpresionTerminal();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpresionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"derechas",
            	    							lv_derechas_2_0,
            	    							"co.edu.uniandes.piladsl.Pila.ExpresionTerminal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleExpresionTerminal"
    // InternalPila.g:922:1: entryRuleExpresionTerminal returns [EObject current=null] : iv_ruleExpresionTerminal= ruleExpresionTerminal EOF ;
    public final EObject entryRuleExpresionTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionTerminal = null;


        try {
            // InternalPila.g:922:58: (iv_ruleExpresionTerminal= ruleExpresionTerminal EOF )
            // InternalPila.g:923:2: iv_ruleExpresionTerminal= ruleExpresionTerminal EOF
            {
             newCompositeNode(grammarAccess.getExpresionTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionTerminal=ruleExpresionTerminal();

            state._fsp--;

             current =iv_ruleExpresionTerminal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpresionTerminal"


    // $ANTLR start "ruleExpresionTerminal"
    // InternalPila.g:929:1: ruleExpresionTerminal returns [EObject current=null] : ( ( (lv_entero_0_0= RULE_INT ) ) | ( ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT ) | ( (lv_nombreCalificado_4_0= ruleNombreCalificado ) ) ) ;
    public final EObject ruleExpresionTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_entero_0_0=null;
        Token lv_real_1_0=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        EObject lv_nombreCalificado_4_0 = null;



        	enterRule();

        try {
            // InternalPila.g:935:2: ( ( ( (lv_entero_0_0= RULE_INT ) ) | ( ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT ) | ( (lv_nombreCalificado_4_0= ruleNombreCalificado ) ) ) )
            // InternalPila.g:936:2: ( ( (lv_entero_0_0= RULE_INT ) ) | ( ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT ) | ( (lv_nombreCalificado_4_0= ruleNombreCalificado ) ) )
            {
            // InternalPila.g:936:2: ( ( (lv_entero_0_0= RULE_INT ) ) | ( ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT ) | ( (lv_nombreCalificado_4_0= ruleNombreCalificado ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||LA18_1==RULE_LLAVEI||LA18_1==RULE_PTOCOMA||(LA18_1>=37 && LA18_1<=48)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==30) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPila.g:937:3: ( (lv_entero_0_0= RULE_INT ) )
                    {
                    // InternalPila.g:937:3: ( (lv_entero_0_0= RULE_INT ) )
                    // InternalPila.g:938:4: (lv_entero_0_0= RULE_INT )
                    {
                    // InternalPila.g:938:4: (lv_entero_0_0= RULE_INT )
                    // InternalPila.g:939:5: lv_entero_0_0= RULE_INT
                    {
                    lv_entero_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_entero_0_0, grammarAccess.getExpresionTerminalAccess().getEnteroINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionTerminalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"entero",
                    						lv_entero_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPila.g:956:3: ( ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT )
                    {
                    // InternalPila.g:956:3: ( ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT )
                    // InternalPila.g:957:4: ( (lv_real_1_0= RULE_INT ) ) otherlv_2= '.' this_INT_3= RULE_INT
                    {
                    // InternalPila.g:957:4: ( (lv_real_1_0= RULE_INT ) )
                    // InternalPila.g:958:5: (lv_real_1_0= RULE_INT )
                    {
                    // InternalPila.g:958:5: (lv_real_1_0= RULE_INT )
                    // InternalPila.g:959:6: lv_real_1_0= RULE_INT
                    {
                    lv_real_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_real_1_0, grammarAccess.getExpresionTerminalAccess().getRealINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpresionTerminalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"real",
                    							lv_real_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionTerminalAccess().getFullStopKeyword_1_1());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_3, grammarAccess.getExpresionTerminalAccess().getINTTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPila.g:985:3: ( (lv_nombreCalificado_4_0= ruleNombreCalificado ) )
                    {
                    // InternalPila.g:985:3: ( (lv_nombreCalificado_4_0= ruleNombreCalificado ) )
                    // InternalPila.g:986:4: (lv_nombreCalificado_4_0= ruleNombreCalificado )
                    {
                    // InternalPila.g:986:4: (lv_nombreCalificado_4_0= ruleNombreCalificado )
                    // InternalPila.g:987:5: lv_nombreCalificado_4_0= ruleNombreCalificado
                    {

                    					newCompositeNode(grammarAccess.getExpresionTerminalAccess().getNombreCalificadoNombreCalificadoParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nombreCalificado_4_0=ruleNombreCalificado();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionTerminalRule());
                    					}
                    					set(
                    						current,
                    						"nombreCalificado",
                    						lv_nombreCalificado_4_0,
                    						"co.edu.uniandes.piladsl.Pila.NombreCalificado");
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
    // $ANTLR end "ruleExpresionTerminal"


    // $ANTLR start "entryRuleNombreCalificado"
    // InternalPila.g:1008:1: entryRuleNombreCalificado returns [EObject current=null] : iv_ruleNombreCalificado= ruleNombreCalificado EOF ;
    public final EObject entryRuleNombreCalificado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNombreCalificado = null;


        try {
            // InternalPila.g:1008:57: (iv_ruleNombreCalificado= ruleNombreCalificado EOF )
            // InternalPila.g:1009:2: iv_ruleNombreCalificado= ruleNombreCalificado EOF
            {
             newCompositeNode(grammarAccess.getNombreCalificadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombreCalificado=ruleNombreCalificado();

            state._fsp--;

             current =iv_ruleNombreCalificado; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNombreCalificado"


    // $ANTLR start "ruleNombreCalificado"
    // InternalPila.g:1015:1: ruleNombreCalificado returns [EObject current=null] : ( ( (lv_ides_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleNombreCalificado() throws RecognitionException {
        EObject current = null;

        Token lv_ides_0_0=null;
        Token otherlv_1=null;
        Token lv_ides_2_0=null;


        	enterRule();

        try {
            // InternalPila.g:1021:2: ( ( ( (lv_ides_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) ) )* ) )
            // InternalPila.g:1022:2: ( ( (lv_ides_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) ) )* )
            {
            // InternalPila.g:1022:2: ( ( (lv_ides_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) ) )* )
            // InternalPila.g:1023:3: ( (lv_ides_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) ) )*
            {
            // InternalPila.g:1023:3: ( (lv_ides_0_0= RULE_ID ) )
            // InternalPila.g:1024:4: (lv_ides_0_0= RULE_ID )
            {
            // InternalPila.g:1024:4: (lv_ides_0_0= RULE_ID )
            // InternalPila.g:1025:5: lv_ides_0_0= RULE_ID
            {
            lv_ides_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_ides_0_0, grammarAccess.getNombreCalificadoAccess().getIdesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNombreCalificadoRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ides",
            						lv_ides_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPila.g:1041:3: (otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPila.g:1042:4: otherlv_1= '.' ( (lv_ides_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNombreCalificadoAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalPila.g:1046:4: ( (lv_ides_2_0= RULE_ID ) )
            	    // InternalPila.g:1047:5: (lv_ides_2_0= RULE_ID )
            	    {
            	    // InternalPila.g:1047:5: (lv_ides_2_0= RULE_ID )
            	    // InternalPila.g:1048:6: lv_ides_2_0= RULE_ID
            	    {
            	    lv_ides_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(lv_ides_2_0, grammarAccess.getNombreCalificadoAccess().getIdesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNombreCalificadoRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"ides",
            	    							lv_ides_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleNombreCalificado"


    // $ANTLR start "ruleTipoDatoPrimitivo"
    // InternalPila.g:1069:1: ruleTipoDatoPrimitivo returns [Enumerator current=null] : ( (enumLiteral_0= 'NoAsignado' ) | (enumLiteral_1= 'CadenaCaracteres' ) | (enumLiteral_2= 'Entero' ) | (enumLiteral_3= 'Flotante' ) | (enumLiteral_4= 'Fecha' ) | (enumLiteral_5= 'Booleano' ) ) ;
    public final Enumerator ruleTipoDatoPrimitivo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalPila.g:1075:2: ( ( (enumLiteral_0= 'NoAsignado' ) | (enumLiteral_1= 'CadenaCaracteres' ) | (enumLiteral_2= 'Entero' ) | (enumLiteral_3= 'Flotante' ) | (enumLiteral_4= 'Fecha' ) | (enumLiteral_5= 'Booleano' ) ) )
            // InternalPila.g:1076:2: ( (enumLiteral_0= 'NoAsignado' ) | (enumLiteral_1= 'CadenaCaracteres' ) | (enumLiteral_2= 'Entero' ) | (enumLiteral_3= 'Flotante' ) | (enumLiteral_4= 'Fecha' ) | (enumLiteral_5= 'Booleano' ) )
            {
            // InternalPila.g:1076:2: ( (enumLiteral_0= 'NoAsignado' ) | (enumLiteral_1= 'CadenaCaracteres' ) | (enumLiteral_2= 'Entero' ) | (enumLiteral_3= 'Flotante' ) | (enumLiteral_4= 'Fecha' ) | (enumLiteral_5= 'Booleano' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            case 34:
                {
                alt20=4;
                }
                break;
            case 35:
                {
                alt20=5;
                }
                break;
            case 36:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPila.g:1077:3: (enumLiteral_0= 'NoAsignado' )
                    {
                    // InternalPila.g:1077:3: (enumLiteral_0= 'NoAsignado' )
                    // InternalPila.g:1078:4: enumLiteral_0= 'NoAsignado'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoPrimitivoAccess().getNO_ASIGNADOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoDatoPrimitivoAccess().getNO_ASIGNADOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPila.g:1085:3: (enumLiteral_1= 'CadenaCaracteres' )
                    {
                    // InternalPila.g:1085:3: (enumLiteral_1= 'CadenaCaracteres' )
                    // InternalPila.g:1086:4: enumLiteral_1= 'CadenaCaracteres'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoPrimitivoAccess().getCADENA_CARACTERESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoDatoPrimitivoAccess().getCADENA_CARACTERESEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPila.g:1093:3: (enumLiteral_2= 'Entero' )
                    {
                    // InternalPila.g:1093:3: (enumLiteral_2= 'Entero' )
                    // InternalPila.g:1094:4: enumLiteral_2= 'Entero'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoPrimitivoAccess().getENTEROEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoDatoPrimitivoAccess().getENTEROEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPila.g:1101:3: (enumLiteral_3= 'Flotante' )
                    {
                    // InternalPila.g:1101:3: (enumLiteral_3= 'Flotante' )
                    // InternalPila.g:1102:4: enumLiteral_3= 'Flotante'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoPrimitivoAccess().getFLOTANTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoDatoPrimitivoAccess().getFLOTANTEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPila.g:1109:3: (enumLiteral_4= 'Fecha' )
                    {
                    // InternalPila.g:1109:3: (enumLiteral_4= 'Fecha' )
                    // InternalPila.g:1110:4: enumLiteral_4= 'Fecha'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoPrimitivoAccess().getFECHAEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTipoDatoPrimitivoAccess().getFECHAEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPila.g:1117:3: (enumLiteral_5= 'Booleano' )
                    {
                    // InternalPila.g:1117:3: (enumLiteral_5= 'Booleano' )
                    // InternalPila.g:1118:4: enumLiteral_5= 'Booleano'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoPrimitivoAccess().getBOOLEANOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTipoDatoPrimitivoAccess().getBOOLEANOEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleTipoDatoPrimitivo"


    // $ANTLR start "ruleOperador"
    // InternalPila.g:1128:1: ruleOperador returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) | (enumLiteral_10= '&&' ) | (enumLiteral_11= '||' ) ) ;
    public final Enumerator ruleOperador() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalPila.g:1134:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) | (enumLiteral_10= '&&' ) | (enumLiteral_11= '||' ) ) )
            // InternalPila.g:1135:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) | (enumLiteral_10= '&&' ) | (enumLiteral_11= '||' ) )
            {
            // InternalPila.g:1135:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) | (enumLiteral_10= '&&' ) | (enumLiteral_11= '||' ) )
            int alt21=12;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 39:
                {
                alt21=3;
                }
                break;
            case 40:
                {
                alt21=4;
                }
                break;
            case 41:
                {
                alt21=5;
                }
                break;
            case 42:
                {
                alt21=6;
                }
                break;
            case 43:
                {
                alt21=7;
                }
                break;
            case 44:
                {
                alt21=8;
                }
                break;
            case 45:
                {
                alt21=9;
                }
                break;
            case 46:
                {
                alt21=10;
                }
                break;
            case 47:
                {
                alt21=11;
                }
                break;
            case 48:
                {
                alt21=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPila.g:1136:3: (enumLiteral_0= '+' )
                    {
                    // InternalPila.g:1136:3: (enumLiteral_0= '+' )
                    // InternalPila.g:1137:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getSUMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorAccess().getSUMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPila.g:1144:3: (enumLiteral_1= '-' )
                    {
                    // InternalPila.g:1144:3: (enumLiteral_1= '-' )
                    // InternalPila.g:1145:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getRESTAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorAccess().getRESTAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPila.g:1152:3: (enumLiteral_2= '*' )
                    {
                    // InternalPila.g:1152:3: (enumLiteral_2= '*' )
                    // InternalPila.g:1153:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMULTIPLICACIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorAccess().getMULTIPLICACIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPila.g:1160:3: (enumLiteral_3= '/' )
                    {
                    // InternalPila.g:1160:3: (enumLiteral_3= '/' )
                    // InternalPila.g:1161:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPila.g:1168:3: (enumLiteral_4= '==' )
                    {
                    // InternalPila.g:1168:3: (enumLiteral_4= '==' )
                    // InternalPila.g:1169:4: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPila.g:1176:3: (enumLiteral_5= '!=' )
                    {
                    // InternalPila.g:1176:3: (enumLiteral_5= '!=' )
                    // InternalPila.g:1177:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDIFERENTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorAccess().getDIFERENTEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPila.g:1184:3: (enumLiteral_6= '>' )
                    {
                    // InternalPila.g:1184:3: (enumLiteral_6= '>' )
                    // InternalPila.g:1185:4: enumLiteral_6= '>'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMAYOREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorAccess().getMAYOREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPila.g:1192:3: (enumLiteral_7= '>=' )
                    {
                    // InternalPila.g:1192:3: (enumLiteral_7= '>=' )
                    // InternalPila.g:1193:4: enumLiteral_7= '>='
                    {
                    enumLiteral_7=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMAYOR_IGUALEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOperadorAccess().getMAYOR_IGUALEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPila.g:1200:3: (enumLiteral_8= '<' )
                    {
                    // InternalPila.g:1200:3: (enumLiteral_8= '<' )
                    // InternalPila.g:1201:4: enumLiteral_8= '<'
                    {
                    enumLiteral_8=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMENOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getOperadorAccess().getMENOREnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPila.g:1208:3: (enumLiteral_9= '<=' )
                    {
                    // InternalPila.g:1208:3: (enumLiteral_9= '<=' )
                    // InternalPila.g:1209:4: enumLiteral_9= '<='
                    {
                    enumLiteral_9=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMENOR_IGUALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getOperadorAccess().getMENOR_IGUALEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalPila.g:1216:3: (enumLiteral_10= '&&' )
                    {
                    // InternalPila.g:1216:3: (enumLiteral_10= '&&' )
                    // InternalPila.g:1217:4: enumLiteral_10= '&&'
                    {
                    enumLiteral_10=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getYEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getOperadorAccess().getYEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalPila.g:1224:3: (enumLiteral_11= '||' )
                    {
                    // InternalPila.g:1224:3: (enumLiteral_11= '||' )
                    // InternalPila.g:1225:4: enumLiteral_11= '||'
                    {
                    enumLiteral_11=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getOEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getOperadorAccess().getOEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "ruleOperador"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001F80C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003E000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003A000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001F80000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003E000050L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001FFE000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});

}