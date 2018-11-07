// Generated from E:/workspace_java/mathfrontier-j/document\Formula.g4 by ANTLR 4.7

package cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LogicSymbol=18, CmpSymbol=19, RangeStart=20, RangeEnd=21, NumeralLiteral=22, 
		Identifier=23, MethodOrPropertyIdentity=24, WS=25;
	public static final int
		RULE_formula = 0, RULE_expression = 1, RULE_whenExpression = 2, RULE_whenBranches = 3, 
		RULE_whenBranch = 4, RULE_whenCondition = 5, RULE_logicExpression = 6, 
		RULE_leftOmittedLogicExpression = 7, RULE_elseBranch = 8, RULE_logicSymbol = 9, 
		RULE_cmpSymbol = 10, RULE_methodInvocation = 11, RULE_methodName = 12, 
		RULE_methodParameterPart = 13, RULE_methodParameterList = 14, RULE_methodParameter = 15, 
		RULE_variableReference = 16, RULE_variableReferenceStart = 17, RULE_variableReferenceEnd = 18, 
		RULE_variableIndex = 19, RULE_numeral = 20, RULE_range = 21, RULE_rangeParameter = 22, 
		RULE_infinitySymbol = 23;
	public static final String[] ruleNames = {
		"formula", "expression", "whenExpression", "whenBranches", "whenBranch", 
		"whenCondition", "logicExpression", "leftOmittedLogicExpression", "elseBranch", 
		"logicSymbol", "cmpSymbol", "methodInvocation", "methodName", "methodParameterPart", 
		"methodParameterList", "methodParameter", "variableReference", "variableReferenceStart", 
		"variableReferenceEnd", "variableIndex", "numeral", "range", "rangeParameter", 
		"infinitySymbol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'when'", "'{'", "';'", 
		"'}'", "'=>'", "':'", "'else'", "','", "'${'", "'%'", "'infinity'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "LogicSymbol", "CmpSymbol", "RangeStart", 
		"RangeEnd", "NumeralLiteral", "Identifier", "MethodOrPropertyIdentity", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormulaContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FormulaParser.EOF, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			expression(0);
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumeralValueContext extends ExpressionContext {
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public NumeralValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterNumeralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitNumeralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitNumeralValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExpressionDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExpressionDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitExpressionDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionWhenContext extends ExpressionContext {
		public WhenExpressionContext whenExpression() {
			return getRuleContext(WhenExpressionContext.class,0);
		}
		public ExpressionWhenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExpressionWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExpressionWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitExpressionWhen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionMultContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExpressionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitExpressionMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionMinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodInvokContext extends ExpressionContext {
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodInvokContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodInvok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodInvok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMethodInvok(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterBracketsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitBracketsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitBracketsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionPlusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExpressionPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitExpressionPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				variableReference();
				}
				break;
			case T__5:
			case NumeralLiteral:
				{
				_localctx = new NumeralValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				numeral();
				}
				break;
			case MethodOrPropertyIdentity:
				{
				_localctx = new MethodInvokContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				methodInvocation();
				}
				break;
			case T__6:
				{
				_localctx = new ExpressionWhenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				whenExpression();
				}
				break;
			case T__0:
				{
				_localctx = new BracketsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__0);
				setState(57);
				expression(0);
				setState(58);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						match(T__2);
						setState(64);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						match(T__3);
						setState(67);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						match(T__4);
						setState(70);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(72);
						match(T__5);
						setState(73);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WhenExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenBranchesContext whenBranches() {
			return getRuleContext(WhenBranchesContext.class,0);
		}
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterWhenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitWhenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitWhenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__6);
			setState(80);
			match(T__0);
			setState(81);
			expression(0);
			setState(82);
			match(T__1);
			setState(83);
			match(T__7);
			setState(84);
			whenBranches();
			setState(85);
			match(T__8);
			setState(86);
			elseBranch();
			setState(87);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenBranchesContext extends ParserRuleContext {
		public List<WhenBranchContext> whenBranch() {
			return getRuleContexts(WhenBranchContext.class);
		}
		public WhenBranchContext whenBranch(int i) {
			return getRuleContext(WhenBranchContext.class,i);
		}
		public WhenBranchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenBranches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterWhenBranches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitWhenBranches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitWhenBranches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenBranchesContext whenBranches() throws RecognitionException {
		WhenBranchesContext _localctx = new WhenBranchesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whenBranches);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			whenBranch();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__8);
					setState(91);
					whenBranch();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenBranchContext extends ParserRuleContext {
		public WhenConditionContext whenCondition() {
			return getRuleContext(WhenConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterWhenBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitWhenBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitWhenBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenBranchContext whenBranch() throws RecognitionException {
		WhenBranchContext _localctx = new WhenBranchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whenBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			whenCondition();
			setState(98);
			match(T__10);
			setState(99);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenConditionContext extends ParserRuleContext {
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public LeftOmittedLogicExpressionContext leftOmittedLogicExpression() {
			return getRuleContext(LeftOmittedLogicExpressionContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitWhenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whenCondition);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				logicExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				leftOmittedLogicExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpSymbolContext cmpSymbol() {
			return getRuleContext(CmpSymbolContext.class,0);
		}
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicSymbolContext logicSymbol() {
			return getRuleContext(LogicSymbolContext.class,0);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_logicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				expression(0);
				setState(107);
				cmpSymbol();
				setState(108);
				expression(0);
				}
				break;
			case 2:
				{
				setState(110);
				match(T__0);
				setState(111);
				logicExpression(0);
				setState(112);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117);
					logicSymbol();
					setState(118);
					logicExpression(3);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LeftOmittedLogicExpressionContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public CmpSymbolContext cmpSymbol() {
			return getRuleContext(CmpSymbolContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LeftOmittedLogicExpressionContext> leftOmittedLogicExpression() {
			return getRuleContexts(LeftOmittedLogicExpressionContext.class);
		}
		public LeftOmittedLogicExpressionContext leftOmittedLogicExpression(int i) {
			return getRuleContext(LeftOmittedLogicExpressionContext.class,i);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public LogicSymbolContext logicSymbol() {
			return getRuleContext(LogicSymbolContext.class,0);
		}
		public LeftOmittedLogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftOmittedLogicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLeftOmittedLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLeftOmittedLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitLeftOmittedLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftOmittedLogicExpressionContext leftOmittedLogicExpression() throws RecognitionException {
		return leftOmittedLogicExpression(0);
	}

	private LeftOmittedLogicExpressionContext leftOmittedLogicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LeftOmittedLogicExpressionContext _localctx = new LeftOmittedLogicExpressionContext(_ctx, _parentState);
		LeftOmittedLogicExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_leftOmittedLogicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(126);
				match(T__11);
				setState(127);
				range();
				}
				break;
			case 2:
				{
				setState(128);
				match(T__11);
				setState(129);
				cmpSymbol();
				setState(130);
				expression(0);
				}
				break;
			case 3:
				{
				setState(132);
				match(T__0);
				setState(133);
				leftOmittedLogicExpression(0);
				setState(134);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(136);
				logicExpression(0);
				setState(137);
				logicSymbol();
				setState(138);
				leftOmittedLogicExpression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LeftOmittedLogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_leftOmittedLogicExpression);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
						logicSymbol();
						setState(144);
						leftOmittedLogicExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LeftOmittedLogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_leftOmittedLogicExpression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						logicSymbol();
						setState(148);
						logicExpression(0);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElseBranchContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterElseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitElseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitElseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBranchContext elseBranch() throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__12);
			setState(156);
			match(T__10);
			setState(157);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicSymbolContext extends ParserRuleContext {
		public TerminalNode LogicSymbol() { return getToken(FormulaParser.LogicSymbol, 0); }
		public LogicSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLogicSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLogicSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitLogicSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicSymbolContext logicSymbol() throws RecognitionException {
		LogicSymbolContext _localctx = new LogicSymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LogicSymbol);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmpSymbolContext extends ParserRuleContext {
		public TerminalNode CmpSymbol() { return getToken(FormulaParser.CmpSymbol, 0); }
		public CmpSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterCmpSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitCmpSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitCmpSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpSymbolContext cmpSymbol() throws RecognitionException {
		CmpSymbolContext _localctx = new CmpSymbolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmpSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(CmpSymbol);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodParameterPartContext methodParameterPart() {
			return getRuleContext(MethodParameterPartContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			methodName();
			setState(164);
			methodParameterPart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode MethodOrPropertyIdentity() { return getToken(FormulaParser.MethodOrPropertyIdentity, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(MethodOrPropertyIdentity);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParameterPartContext extends ParserRuleContext {
		public MethodParameterListContext methodParameterList() {
			return getRuleContext(MethodParameterListContext.class,0);
		}
		public MethodParameterPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameterPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodParameterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodParameterPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMethodParameterPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterPartContext methodParameterPart() throws RecognitionException {
		MethodParameterPartContext _localctx = new MethodParameterPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodParameterPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << NumeralLiteral) | (1L << MethodOrPropertyIdentity))) != 0)) {
				{
				setState(169);
				methodParameterList();
				}
			}

			setState(172);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParameterListContext extends ParserRuleContext {
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public MethodParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMethodParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterListContext methodParameterList() throws RecognitionException {
		MethodParameterListContext _localctx = new MethodParameterListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			methodParameter();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(175);
				match(T__13);
				setState(176);
				methodParameter();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public VariableReferenceStartContext variableReferenceStart() {
			return getRuleContext(VariableReferenceStartContext.class,0);
		}
		public VariableIndexContext variableIndex() {
			return getRuleContext(VariableIndexContext.class,0);
		}
		public VariableReferenceEndContext variableReferenceEnd() {
			return getRuleContext(VariableReferenceEndContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			variableReferenceStart();
			setState(185);
			variableIndex();
			setState(186);
			variableReferenceEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceStartContext extends ParserRuleContext {
		public VariableReferenceStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReferenceStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterVariableReferenceStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitVariableReferenceStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitVariableReferenceStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceStartContext variableReferenceStart() throws RecognitionException {
		VariableReferenceStartContext _localctx = new VariableReferenceStartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableReferenceStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceEndContext extends ParserRuleContext {
		public VariableReferenceEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReferenceEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterVariableReferenceEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitVariableReferenceEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitVariableReferenceEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceEndContext variableReferenceEnd() throws RecognitionException {
		VariableReferenceEndContext _localctx = new VariableReferenceEndContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableReferenceEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIndexContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FormulaParser.Identifier, 0); }
		public VariableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterVariableIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitVariableIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitVariableIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIndexContext variableIndex() throws RecognitionException {
		VariableIndexContext _localctx = new VariableIndexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeralContext extends ParserRuleContext {
		public TerminalNode NumeralLiteral() { return getToken(FormulaParser.NumeralLiteral, 0); }
		public NumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitNumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeralContext numeral() throws RecognitionException {
		NumeralContext _localctx = new NumeralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numeral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(194);
				match(T__5);
				}
			}

			setState(197);
			match(NumeralLiteral);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(198);
				match(T__15);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode RangeStart() { return getToken(FormulaParser.RangeStart, 0); }
		public List<RangeParameterContext> rangeParameter() {
			return getRuleContexts(RangeParameterContext.class);
		}
		public RangeParameterContext rangeParameter(int i) {
			return getRuleContext(RangeParameterContext.class,i);
		}
		public TerminalNode RangeEnd() { return getToken(FormulaParser.RangeEnd, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(RangeStart);
			setState(202);
			rangeParameter();
			setState(203);
			match(T__13);
			setState(204);
			rangeParameter();
			setState(205);
			match(RangeEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public RangeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterRangeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitRangeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitRangeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeParameterContext rangeParameter() throws RecognitionException {
		RangeParameterContext _localctx = new RangeParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rangeParameter);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__14:
			case NumeralLiteral:
			case MethodOrPropertyIdentity:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				expression(0);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				infinitySymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfinitySymbolContext extends ParserRuleContext {
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterInfinitySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitInfinitySymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FormulaVisitor ) return ((FormulaVisitor<? extends T>)visitor).visitInfinitySymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfinitySymbolContext infinitySymbol() throws RecognitionException {
		InfinitySymbolContext _localctx = new InfinitySymbolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_infinitySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		case 7:
			return leftOmittedLogicExpression_sempred((LeftOmittedLogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean leftOmittedLogicExpression_sempred(LeftOmittedLogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"u\n\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u00ad\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\7\20\u00b4\n\20\f\20\16\20\u00b7\13\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26\u00c6\n\26\3\26"+
		"\3\26\5\26\u00ca\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00d4"+
		"\n\30\3\31\3\31\3\31\2\5\4\16\20\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\2\2\u00d5\2\62\3\2\2\2\4>\3\2\2\2\6Q\3\2\2\2\b[\3\2"+
		"\2\2\nc\3\2\2\2\fi\3\2\2\2\16t\3\2\2\2\20\u008e\3\2\2\2\22\u009d\3\2\2"+
		"\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a5\3\2\2\2\32\u00a8\3\2\2\2"+
		"\34\u00aa\3\2\2\2\36\u00b0\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00be"+
		"\3\2\2\2&\u00c0\3\2\2\2(\u00c2\3\2\2\2*\u00c5\3\2\2\2,\u00cb\3\2\2\2."+
		"\u00d3\3\2\2\2\60\u00d5\3\2\2\2\62\63\5\4\3\2\63\64\7\2\2\3\64\3\3\2\2"+
		"\2\65\66\b\3\1\2\66?\5\"\22\2\67?\5*\26\28?\5\30\r\29?\5\6\4\2:;\7\3\2"+
		"\2;<\5\4\3\2<=\7\4\2\2=?\3\2\2\2>\65\3\2\2\2>\67\3\2\2\2>8\3\2\2\2>9\3"+
		"\2\2\2>:\3\2\2\2?N\3\2\2\2@A\f\6\2\2AB\7\5\2\2BM\5\4\3\7CD\f\5\2\2DE\7"+
		"\6\2\2EM\5\4\3\6FG\f\4\2\2GH\7\7\2\2HM\5\4\3\5IJ\f\3\2\2JK\7\b\2\2KM\5"+
		"\4\3\4L@\3\2\2\2LC\3\2\2\2LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2O\5\3\2\2\2PN\3\2\2\2QR\7\t\2\2RS\7\3\2\2ST\5\4\3\2TU\7\4\2\2UV"+
		"\7\n\2\2VW\5\b\5\2WX\7\13\2\2XY\5\22\n\2YZ\7\f\2\2Z\7\3\2\2\2[`\5\n\6"+
		"\2\\]\7\13\2\2]_\5\n\6\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3"+
		"\2\2\2b`\3\2\2\2cd\5\f\7\2de\7\r\2\2ef\5\4\3\2f\13\3\2\2\2gj\5\16\b\2"+
		"hj\5\20\t\2ig\3\2\2\2ih\3\2\2\2j\r\3\2\2\2kl\b\b\1\2lm\5\4\3\2mn\5\26"+
		"\f\2no\5\4\3\2ou\3\2\2\2pq\7\3\2\2qr\5\16\b\2rs\7\4\2\2su\3\2\2\2tk\3"+
		"\2\2\2tp\3\2\2\2u|\3\2\2\2vw\f\4\2\2wx\5\24\13\2xy\5\16\b\5y{\3\2\2\2"+
		"zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\b\t\1\2\u0080\u0081\7\16\2\2\u0081\u008f\5,\27\2\u0082\u0083\7\16\2\2"+
		"\u0083\u0084\5\26\f\2\u0084\u0085\5\4\3\2\u0085\u008f\3\2\2\2\u0086\u0087"+
		"\7\3\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7\4\2\2\u0089\u008f\3\2\2\2"+
		"\u008a\u008b\5\16\b\2\u008b\u008c\5\24\13\2\u008c\u008d\5\20\t\3\u008d"+
		"\u008f\3\2\2\2\u008e\177\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0086\3\2\2"+
		"\2\u008e\u008a\3\2\2\2\u008f\u009a\3\2\2\2\u0090\u0091\f\5\2\2\u0091\u0092"+
		"\5\24\13\2\u0092\u0093\5\20\t\6\u0093\u0099\3\2\2\2\u0094\u0095\f\4\2"+
		"\2\u0095\u0096\5\24\13\2\u0096\u0097\5\16\b\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\21\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\7\17\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\5\4\3\2\u00a0\23\3\2\2\2\u00a1"+
		"\u00a2\7\24\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\25\2\2\u00a4\27\3\2\2\2"+
		"\u00a5\u00a6\5\32\16\2\u00a6\u00a7\5\34\17\2\u00a7\31\3\2\2\2\u00a8\u00a9"+
		"\7\32\2\2\u00a9\33\3\2\2\2\u00aa\u00ac\7\3\2\2\u00ab\u00ad\5\36\20\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\4"+
		"\2\2\u00af\35\3\2\2\2\u00b0\u00b5\5 \21\2\u00b1\u00b2\7\20\2\2\u00b2\u00b4"+
		"\5 \21\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\37\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5\4\3"+
		"\2\u00b9!\3\2\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\5(\25\2\u00bc\u00bd"+
		"\5&\24\2\u00bd#\3\2\2\2\u00be\u00bf\7\21\2\2\u00bf%\3\2\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\7\31\2\2\u00c3)\3\2\2\2\u00c4\u00c6"+
		"\7\b\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\7\30\2\2\u00c8\u00ca\7\22\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca+\3\2\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\5.\30\2\u00cd\u00ce"+
		"\7\20\2\2\u00ce\u00cf\5.\30\2\u00cf\u00d0\7\27\2\2\u00d0-\3\2\2\2\u00d1"+
		"\u00d4\5\4\3\2\u00d2\u00d4\5\60\31\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4/\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\61\3\2\2\2\21>LN`it|"+
		"\u008e\u0098\u009a\u00ac\u00b5\u00c5\u00c9\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}