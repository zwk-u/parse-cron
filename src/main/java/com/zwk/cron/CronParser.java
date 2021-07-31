// Generated from D:/tools/workspace/demo/src/main/java/com/zwk/cron\Cron.g4 by ANTLR 4.9.1
package com.zwk.cron;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CronParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, WEEKDAY=5, MONTH=6, INT=7, STAR=8, QUESTION=9, 
		LAST=10, WORK=11, HASH=12, SUN=13, MON=14, TUE=15, WED=16, THU=17, FRI=18, 
		SAT=19, JAN=20, FEB=21, MAR=22, APR=23, MAY=24, JUN=25, JUL=26, AUG=27, 
		SEP=28, OCT=29, NOV=30, DEC=31, WS=32;
	public static final int
		RULE_cron = 0, RULE_common = 1, RULE_last = 2, RULE_step = 3, RULE_set = 4, 
		RULE_interval = 5, RULE_workDay = 6, RULE_hash = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"cron", "common", "last", "step", "set", "interval", "workDay", "hash"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "','", "'-'", null, null, null, null, "'*'", "'?'", null, 
			null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "WEEKDAY", "MONTH", "INT", "STAR", "QUESTION", 
			"LAST", "WORK", "HASH", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", 
			"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", 
			"NOV", "DEC", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Cron.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CronParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CronContext extends ParserRuleContext {
		public CommonContext second;
		public CommonContext minute;
		public CommonContext hour;
		public CommonContext dayOfMonth;
		public CommonContext month;
		public CommonContext dayOfWeek;
		public CommonContext year;
		public TerminalNode EOF() { return getToken(CronParser.EOF, 0); }
		public List<CommonContext> common() {
			return getRuleContexts(CommonContext.class);
		}
		public CommonContext common(int i) {
			return getRuleContext(CommonContext.class,i);
		}
		public CronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cron; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterCron(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitCron(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitCron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CronContext cron() throws RecognitionException {
		CronContext _localctx = new CronContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cron);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((CronContext)_localctx).second = common();
			setState(17);
			((CronContext)_localctx).minute = common();
			setState(18);
			((CronContext)_localctx).hour = common();
			setState(19);
			((CronContext)_localctx).dayOfMonth = common();
			setState(20);
			((CronContext)_localctx).month = common();
			setState(21);
			((CronContext)_localctx).dayOfWeek = common();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STAR) | (1L << QUESTION) | (1L << LAST))) != 0)) {
				{
				setState(22);
				((CronContext)_localctx).year = common();
				}
			}

			setState(25);
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

	public static class CommonContext extends ParserRuleContext {
		public CommonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common; }
	 
		public CommonContext() { }
		public void copyFrom(CommonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarExpContext extends CommonContext {
		public TerminalNode STAR() { return getToken(CronParser.STAR, 0); }
		public StarExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterStarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitStarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitStarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StepExpContext extends CommonContext {
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public StepExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterStepExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitStepExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitStepExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastExpContext extends CommonContext {
		public LastContext last() {
			return getRuleContext(LastContext.class,0);
		}
		public LastExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterLastExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitLastExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitLastExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalExpContext extends CommonContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterIntervalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitIntervalExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitIntervalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetExpContext extends CommonContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public SetExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterSetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitSetExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitSetExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WorkDayExpContext extends CommonContext {
		public WorkDayContext workDay() {
			return getRuleContext(WorkDayContext.class,0);
		}
		public WorkDayExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterWorkDayExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitWorkDayExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitWorkDayExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HashExpContext extends CommonContext {
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public HashExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterHashExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitHashExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitHashExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionExpContext extends CommonContext {
		public TerminalNode QUESTION() { return getToken(CronParser.QUESTION, 0); }
		public QuestionExpContext(CommonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterQuestionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitQuestionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitQuestionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonContext common() throws RecognitionException {
		CommonContext _localctx = new CommonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_common);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StarExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(STAR);
				}
				break;
			case 2:
				_localctx = new QuestionExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(QUESTION);
				}
				break;
			case 3:
				_localctx = new LastExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				last();
				}
				break;
			case 4:
				_localctx = new SetExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				set();
				}
				break;
			case 5:
				_localctx = new IntervalExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				interval();
				}
				break;
			case 6:
				_localctx = new StepExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				step();
				}
				break;
			case 7:
				_localctx = new WorkDayExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(33);
				workDay();
				}
				break;
			case 8:
				_localctx = new HashExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(34);
				hash();
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

	public static class LastContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CronParser.ID, 0); }
		public TerminalNode LAST() { return getToken(CronParser.LAST, 0); }
		public LastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastContext last() throws RecognitionException {
		LastContext _localctx = new LastContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_last);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(ID);
				setState(38);
				match(LAST);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(LAST);
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

	public static class StepContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CronParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CronParser.ID, i);
		}
		public TerminalNode STAR() { return getToken(CronParser.STAR, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
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

	public static class SetContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CronParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CronParser.ID, i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(47);
				match(T__1);
				setState(48);
				match(ID);
				}
				}
				setState(53);
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

	public static class IntervalContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CronParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CronParser.ID, i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(55);
			match(T__2);
			setState(56);
			match(ID);
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

	public static class WorkDayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CronParser.ID, 0); }
		public TerminalNode WORK() { return getToken(CronParser.WORK, 0); }
		public TerminalNode LAST() { return getToken(CronParser.LAST, 0); }
		public WorkDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_workDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterWorkDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitWorkDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitWorkDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WorkDayContext workDay() throws RecognitionException {
		WorkDayContext _localctx = new WorkDayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_workDay);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ID);
				setState(59);
				match(WORK);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(LAST);
				setState(61);
				match(WORK);
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

	public static class HashContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CronParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CronParser.ID, i);
		}
		public TerminalNode HASH() { return getToken(CronParser.HASH, 0); }
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CronListener ) ((CronListener)listener).exitHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CronVisitor ) return ((CronVisitor<? extends T>)visitor).visitHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(HASH);
			setState(66);
			match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3\3"+
		"\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\64\n\6\f\6\16\6\67"+
		"\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bA\n\b\3\t\3\t\3\t\3\t\3\t\2\2"+
		"\n\2\4\6\b\n\f\16\20\2\3\4\2\6\6\n\n\2I\2\22\3\2\2\2\4%\3\2\2\2\6*\3\2"+
		"\2\2\b,\3\2\2\2\n\60\3\2\2\2\f8\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2\22\23"+
		"\5\4\3\2\23\24\5\4\3\2\24\25\5\4\3\2\25\26\5\4\3\2\26\27\5\4\3\2\27\31"+
		"\5\4\3\2\30\32\5\4\3\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34"+
		"\7\2\2\3\34\3\3\2\2\2\35&\7\n\2\2\36&\7\13\2\2\37&\5\6\4\2 &\5\n\6\2!"+
		"&\5\f\7\2\"&\5\b\5\2#&\5\16\b\2$&\5\20\t\2%\35\3\2\2\2%\36\3\2\2\2%\37"+
		"\3\2\2\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\5\3\2\2\2"+
		"\'(\7\6\2\2(+\7\f\2\2)+\7\f\2\2*\'\3\2\2\2*)\3\2\2\2+\7\3\2\2\2,-\t\2"+
		"\2\2-.\7\3\2\2./\7\6\2\2/\t\3\2\2\2\60\65\7\6\2\2\61\62\7\4\2\2\62\64"+
		"\7\6\2\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13"+
		"\3\2\2\2\67\65\3\2\2\289\7\6\2\29:\7\5\2\2:;\7\6\2\2;\r\3\2\2\2<=\7\6"+
		"\2\2=A\7\r\2\2>?\7\f\2\2?A\7\r\2\2@<\3\2\2\2@>\3\2\2\2A\17\3\2\2\2BC\7"+
		"\6\2\2CD\7\16\2\2DE\7\6\2\2E\21\3\2\2\2\7\31%*\65@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
