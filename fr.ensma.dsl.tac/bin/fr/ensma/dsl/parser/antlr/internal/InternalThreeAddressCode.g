/*
 * generated by Xtext 2.25.0
 */
grammar InternalThreeAddressCode;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.ensma.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.ensma.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ensma.dsl.services.ThreeAddressCodeGrammarAccess;

}

@parser::members {

 	private ThreeAddressCodeGrammarAccess grammarAccess;

    public InternalThreeAddressCodeParser(TokenStream input, ThreeAddressCodeGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TAC";
   	}

   	@Override
   	protected ThreeAddressCodeGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTAC
entryRuleTAC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTACRule()); }
	iv_ruleTAC=ruleTAC
	{ $current=$iv_ruleTAC.current; }
	EOF;

// Rule TAC
ruleTAC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTACAccess().getTacFunctionDefParserRuleCall_0());
			}
			lv_tac_0_0=ruleFunctionDef
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTACRule());
				}
				add(
					$current,
					"tac",
					lv_tac_0_0,
					"fr.ensma.dsl.ThreeAddressCode.FunctionDef");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleFunctionDef
entryRuleFunctionDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionDefRule()); }
	iv_ruleFunctionDef=ruleFunctionDef
	{ $current=$iv_ruleFunctionDef.current; }
	EOF;

// Rule FunctionDef
ruleFunctionDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunctionDefAccess().getFunctionDefAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionDefAccess().getFunctionFunctionParserRuleCall_1_0());
				}
				lv_function_1_0=ruleFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
					}
					add(
						$current,
						"function",
						lv_function_1_0,
						"fr.ensma.dsl.ThreeAddressCode.Function");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionDefAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionDefAccess().getFunctionparamFunctionParamParserRuleCall_3_0_0());
					}
					lv_functionparam_3_0=ruleFunctionParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
						}
						add(
							$current,
							"functionparam",
							lv_functionparam_3_0,
							"fr.ensma.dsl.ThreeAddressCode.FunctionParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getFunctionDefAccess().getCommaKeyword_3_1());
				}
			)?
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionDefAccess().getRightParenthesisKeyword_4());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionDefAccess().getStructStructParserRuleCall_6_0_0_0());
						}
						lv_struct_7_0=ruleStruct
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
							}
							add(
								$current,
								"struct",
								lv_struct_7_0,
								"fr.ensma.dsl.ThreeAddressCode.Struct");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_8=';'
				{
					newLeafNode(otherlv_8, grammarAccess.getFunctionDefAccess().getSemicolonKeyword_6_0_1());
				}
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionDefAccess().getLabelLabelParserRuleCall_6_1_0());
					}
					lv_label_9_0=ruleLabel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
						}
						add(
							$current,
							"label",
							lv_label_9_0,
							"fr.ensma.dsl.ThreeAddressCode.Label");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionDefAccess().getGotoGotoParserRuleCall_6_2_0());
					}
					lv_goto_10_0=ruleGoto
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
						}
						add(
							$current,
							"goto",
							lv_goto_10_0,
							"fr.ensma.dsl.ThreeAddressCode.Goto");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionDefAccess().getIfIfParserRuleCall_6_3_0());
					}
					lv_if_11_0=ruleIf
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
						}
						add(
							$current,
							"if",
							lv_if_11_0,
							"fr.ensma.dsl.ThreeAddressCode.If");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_12='#'
				{
					newLeafNode(otherlv_12, grammarAccess.getFunctionDefAccess().getNumberSignKeyword_6_4_0());
				}
				otherlv_13='DEBUG'
				{
					newLeafNode(otherlv_13, grammarAccess.getFunctionDefAccess().getDEBUGKeyword_6_4_1());
				}
				otherlv_14='BEGIN_STMT'
				{
					newLeafNode(otherlv_14, grammarAccess.getFunctionDefAccess().getBEGIN_STMTKeyword_6_4_2());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionDefAccess().getFunctionCallFunctionCallParserRuleCall_6_5_0_0());
						}
						lv_functionCall_15_0=ruleFunctionCall
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
							}
							add(
								$current,
								"functionCall",
								lv_functionCall_15_0,
								"fr.ensma.dsl.ThreeAddressCode.FunctionCall");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_16=';'
				{
					newLeafNode(otherlv_16, grammarAccess.getFunctionDefAccess().getSemicolonKeyword_6_5_1());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionDefAccess().getAssignOpAssignOperationParserRuleCall_6_6_0_0());
						}
						lv_assignOp_17_0=ruleAssignOperation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionDefRule());
							}
							add(
								$current,
								"assignOp",
								lv_assignOp_17_0,
								"fr.ensma.dsl.ThreeAddressCode.AssignOperation");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_18=';'
				{
					newLeafNode(otherlv_18, grammarAccess.getFunctionDefAccess().getSemicolonKeyword_6_6_1());
				}
			)
		)*
		(
			otherlv_19='return;'
			{
				newLeafNode(otherlv_19, grammarAccess.getFunctionDefAccess().getReturnKeyword_7());
			}
		)?
		otherlv_20='}'
		{
			newLeafNode(otherlv_20, grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFunctionCall
entryRuleFunctionCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallRule()); }
	iv_ruleFunctionCall=ruleFunctionCall
	{ $current=$iv_ruleFunctionCall.current; }
	EOF;

// Rule FunctionCall
ruleFunctionCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionCallFunctionCrossReference_1_0());
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionArgumentFunctionArgumentParserRuleCall_3_0_0());
					}
					lv_functionArgument_3_0=ruleFunctionArgument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallRule());
						}
						add(
							$current,
							"functionArgument",
							lv_functionArgument_3_0,
							"fr.ensma.dsl.ThreeAddressCode.FunctionArgument");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1());
				}
			)?
		)*
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleFunctionParam
entryRuleFunctionParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionParamRule()); }
	iv_ruleFunctionParam=ruleFunctionParam
	{ $current=$iv_ruleFunctionParam.current; }
	EOF;

// Rule FunctionParam
ruleFunctionParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFunctionParamAccess().getFunctionParamAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionParamAccess().getStructStructParserRuleCall_0_1_0());
					}
					lv_struct_1_0=ruleStruct
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionParamRule());
						}
						add(
							$current,
							"struct",
							lv_struct_1_0,
							"fr.ensma.dsl.ThreeAddressCode.Struct");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionParamAccess().getDatatypeDataTypeParserRuleCall_1_0_0());
					}
					lv_datatype_2_0=ruleDataType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionParamRule());
						}
						set(
							$current,
							"datatype",
							lv_datatype_2_0,
							"fr.ensma.dsl.ThreeAddressCode.DataType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3='*'
				{
					newLeafNode(otherlv_3, grammarAccess.getFunctionParamAccess().getAsteriskKeyword_1_1());
				}
			)?
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getFunctionParamAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionParamRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleFunctionArgument
entryRuleFunctionArgument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionArgumentRule()); }
	iv_ruleFunctionArgument=ruleFunctionArgument
	{ $current=$iv_ruleFunctionArgument.current; }
	EOF;

// Rule FunctionArgument
ruleFunctionArgument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFunctionArgumentAccess().getFunctionArgumentAction_0_0(),
						$current);
				}
			)
			(
				(
					otherlv_1='&'
					{
						newLeafNode(otherlv_1, grammarAccess.getFunctionArgumentAccess().getAmpersandKeyword_0_1_0());
					}
				)?
				this_ID_2=RULE_ID
				{
					newLeafNode(this_ID_2, grammarAccess.getFunctionArgumentAccess().getIDTerminalRuleCall_0_1_1());
				}
			)
		)
		    |
		this_INT_3=RULE_INT
		{
			newLeafNode(this_INT_3, grammarAccess.getFunctionArgumentAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
						$current);
				}
			)
			otherlv_1='float'
			{
				newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getFloatKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getDataTypeAction_1_0(),
						$current);
				}
			)
			otherlv_3='int'
			{
				newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getIntKeyword_1_1());
			}
		)
		    |
		otherlv_4='uint8_t'
		{
			newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getUint8_tKeyword_2());
		}
		    |
		otherlv_5='int16_t'
		{
			newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getInt16_tKeyword_3());
		}
	)
;

// Entry rule entryRuleStruct
entryRuleStruct returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStructRule()); }
	iv_ruleStruct=ruleStruct
	{ $current=$iv_ruleStruct.current; }
	EOF;

// Rule Struct
ruleStruct returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStructAccess().getStructAction_0(),
					$current);
			}
		)
		otherlv_1='struct'
		{
			newLeafNode(otherlv_1, grammarAccess.getStructAccess().getStructKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			newLeafNode(this_ID_2, grammarAccess.getStructAccess().getIDTerminalRuleCall_2());
		}
		(
			otherlv_3='*'
			{
				newLeafNode(otherlv_3, grammarAccess.getStructAccess().getAsteriskKeyword_3());
			}
		)?
		this_ID_4=RULE_ID
		{
			newLeafNode(this_ID_4, grammarAccess.getStructAccess().getIDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleGoto
entryRuleGoto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGotoRule()); }
	iv_ruleGoto=ruleGoto
	{ $current=$iv_ruleGoto.current; }
	EOF;

// Rule Goto
ruleGoto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGotoAccess().getGotoAction_0(),
					$current);
			}
		)
		otherlv_1='goto'
		{
			newLeafNode(otherlv_1, grammarAccess.getGotoAccess().getGotoKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			newLeafNode(this_ID_2, grammarAccess.getGotoAccess().getIDTerminalRuleCall_2());
		}
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getGotoAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	iv_ruleLabel=ruleLabel
	{ $current=$iv_ruleLabel.current; }
	EOF;

// Rule Label
ruleLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLabelAccess().getLabelAction_0(),
					$current);
			}
		)
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLessThanSignKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			newLeafNode(this_ID_2, grammarAccess.getLabelAccess().getIDTerminalRuleCall_2());
		}
		this_INT_3=RULE_INT
		{
			newLeafNode(this_INT_3, grammarAccess.getLabelAccess().getINTTerminalRuleCall_3());
		}
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getGreaterThanSignKeyword_4());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getColonKeyword_5());
		}
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getIfAccess().getBooleanExpressionParserRuleCall_2());
		}
		this_BooleanExpression_2=ruleBooleanExpression
		{
			$current = $this_BooleanExpression_2.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleAssignOperation
entryRuleAssignOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignOperationRule()); }
	iv_ruleAssignOperation=ruleAssignOperation
	{ $current=$iv_ruleAssignOperation.current; }
	EOF;

// Rule AssignOperation
ruleAssignOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAssignOperationAccess().getAssignOperationAction_0(),
					$current);
			}
		)
		this_ID_1=RULE_ID
		{
			newLeafNode(this_ID_1, grammarAccess.getAssignOperationAccess().getIDTerminalRuleCall_1());
		}
		(
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getAssignOperationAccess().getFullStopKeyword_2_0());
			}
			this_ID_3=RULE_ID
			{
				newLeafNode(this_ID_3, grammarAccess.getAssignOperationAccess().getIDTerminalRuleCall_2_1());
			}
		)?
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getAssignOperationAccess().getEqualsSignKeyword_3());
		}
		(
			this_ID_5=RULE_ID
			{
				newLeafNode(this_ID_5, grammarAccess.getAssignOperationAccess().getIDTerminalRuleCall_4_0());
			}
			    |
			this_STRING_6=RULE_STRING
			{
				newLeafNode(this_STRING_6, grammarAccess.getAssignOperationAccess().getSTRINGTerminalRuleCall_4_1());
			}
			    |
			this_INT_7=RULE_INT
			{
				newLeafNode(this_INT_7, grammarAccess.getAssignOperationAccess().getINTTerminalRuleCall_4_2());
			}
			    |
			(
				otherlv_8='&'
				{
					newLeafNode(otherlv_8, grammarAccess.getAssignOperationAccess().getAmpersandKeyword_4_3_0());
				}
				this_ID_9=RULE_ID
				{
					newLeafNode(this_ID_9, grammarAccess.getAssignOperationAccess().getIDTerminalRuleCall_4_3_1());
				}
				otherlv_10='->'
				{
					newLeafNode(otherlv_10, grammarAccess.getAssignOperationAccess().getHyphenMinusGreaterThanSignKeyword_4_3_2());
				}
				this_ID_11=RULE_ID
				{
					newLeafNode(this_ID_11, grammarAccess.getAssignOperationAccess().getIDTerminalRuleCall_4_3_3());
				}
			)
			    |
			otherlv_12='{CLOBBER}'
			{
				newLeafNode(otherlv_12, grammarAccess.getAssignOperationAccess().getCLOBBERKeyword_4_4());
			}
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignOperationAccess().getFunctionCallFunctionCallParserRuleCall_4_5_0());
					}
					lv_functionCall_13_0=ruleFunctionCall
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignOperationRule());
						}
						add(
							$current,
							"functionCall",
							lv_functionCall_13_0,
							"fr.ensma.dsl.ThreeAddressCode.FunctionCall");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunctionAccess().getFunctionAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleBooleanExpression
entryRuleBooleanExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanExpressionRule()); }
	iv_ruleBooleanExpression=ruleBooleanExpression
	{ $current=$iv_ruleBooleanExpression.current; }
	EOF;

// Rule BooleanExpression
ruleBooleanExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				newLeafNode(this_ID_0, grammarAccess.getBooleanExpressionAccess().getIDTerminalRuleCall_0_0());
			}
			{
				newCompositeNode(grammarAccess.getBooleanExpressionAccess().getLogicalOperationParserRuleCall_0_1());
			}
			this_LogicalOperation_1=ruleLogicalOperation
			{
				$current = $this_LogicalOperation_1.current;
				afterParserOrEnumRuleCall();
			}
			this_INT_2=RULE_INT
			{
				newLeafNode(this_INT_2, grammarAccess.getBooleanExpressionAccess().getINTTerminalRuleCall_0_2());
			}
		)
		    |
		this_ID_3=RULE_ID
		{
			newLeafNode(this_ID_3, grammarAccess.getBooleanExpressionAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleLogicalOperation
entryRuleLogicalOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLogicalOperationRule()); }
	iv_ruleLogicalOperation=ruleLogicalOperation
	{ $current=$iv_ruleLogicalOperation.current; }
	EOF;

// Rule LogicalOperation
ruleLogicalOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='and'
		{
			newLeafNode(otherlv_0, grammarAccess.getLogicalOperationAccess().getAndKeyword_0());
		}
		    |
		otherlv_1='or'
		{
			newLeafNode(otherlv_1, grammarAccess.getLogicalOperationAccess().getOrKeyword_1());
		}
		    |
		otherlv_2='=<'
		{
			newLeafNode(otherlv_2, grammarAccess.getLogicalOperationAccess().getEqualsSignLessThanSignKeyword_2());
		}
		    |
		otherlv_3='<'
		{
			newLeafNode(otherlv_3, grammarAccess.getLogicalOperationAccess().getLessThanSignKeyword_3());
		}
		    |
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getLogicalOperationAccess().getGreaterThanSignKeyword_4());
		}
		    |
		otherlv_5='=>'
		{
			newLeafNode(otherlv_5, grammarAccess.getLogicalOperationAccess().getEqualsSignGreaterThanSignKeyword_5());
		}
		    |
		otherlv_6='=='
		{
			newLeafNode(otherlv_6, grammarAccess.getLogicalOperationAccess().getEqualsSignEqualsSignKeyword_6());
		}
		    |
		otherlv_7='!='
		{
			newLeafNode(otherlv_7, grammarAccess.getLogicalOperationAccess().getExclamationMarkEqualsSignKeyword_7());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
