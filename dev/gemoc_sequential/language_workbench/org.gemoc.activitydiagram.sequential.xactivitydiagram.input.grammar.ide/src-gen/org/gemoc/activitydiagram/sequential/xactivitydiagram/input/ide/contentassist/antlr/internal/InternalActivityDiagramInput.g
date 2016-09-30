/*
 * generated by Xtext 2.9.1
 */
grammar InternalActivityDiagramInput;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.gemoc.activitydiagram.sequential.xactivitydiagram.input.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.gemoc.activitydiagram.sequential.xactivitydiagram.input.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.input.services.ActivityDiagramInputGrammarAccess;

}
@parser::members {
	private ActivityDiagramInputGrammarAccess grammarAccess;

	public void setGrammarAccess(ActivityDiagramInputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleInput
entryRuleInput
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputAccess().getInputValuesAssignment()); }
		(rule__Input__InputValuesAssignment)
		{ after(grammarAccess.getInputAccess().getInputValuesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInputValue
entryRuleInputValue
:
{ before(grammarAccess.getInputValueRule()); }
	 ruleInputValue
{ after(grammarAccess.getInputValueRule()); } 
	 EOF 
;

// Rule InputValue
ruleInputValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputValueAccess().getGroup()); }
		(rule__InputValue__Group__0)
		{ after(grammarAccess.getInputValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValue
entryRuleBooleanValue
:
{ before(grammarAccess.getBooleanValueRule()); }
	 ruleBooleanValue
{ after(grammarAccess.getBooleanValueRule()); } 
	 EOF 
;

// Rule BooleanValue
ruleBooleanValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueAccess().getValueAssignment()); }
		(rule__BooleanValue__ValueAssignment)
		{ after(grammarAccess.getBooleanValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValue
entryRuleIntegerValue
:
{ before(grammarAccess.getIntegerValueRule()); }
	 ruleIntegerValue
{ after(grammarAccess.getIntegerValueRule()); } 
	 EOF 
;

// Rule IntegerValue
ruleIntegerValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueAccess().getValueAssignment()); }
		(rule__IntegerValue__ValueAssignment)
		{ after(grammarAccess.getIntegerValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEBoolean
entryRuleEBoolean
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
		(rule__EBoolean__Alternatives)
		{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); }
		ruleBooleanValue
		{ after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); }
		ruleIntegerValue
		{ after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputValue__Group__0__Impl
	rule__InputValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputValueAccess().getVariableAssignment_0()); }
	(rule__InputValue__VariableAssignment_0)
	{ after(grammarAccess.getInputValueAccess().getVariableAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputValue__Group__1__Impl
	rule__InputValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getInputValueAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InputValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputValueAccess().getValueAssignment_2()); }
	(rule__InputValue__ValueAssignment_2)
	{ after(grammarAccess.getInputValueAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Input__InputValuesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_0()); }
		ruleInputValue
		{ after(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__VariableAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); }
			ruleEString
			{ after(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InputValue__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); }
		ruleValue
		{ after(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); }
		ruleEBoolean
		{ after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); }
		ruleEInt
		{ after(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
