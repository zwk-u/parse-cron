// Generated from D:/tools/workspace/demo/src/main/java/com/zwk/cron\Cron.g4 by ANTLR 4.9.1
package com.zwk.cron;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CronLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, WEEKDAY=5, MONTH=6, INT=7, STAR=8, QUESTION=9, 
		LAST=10, WORK=11, HASH=12, SUN=13, MON=14, TUE=15, WED=16, THU=17, FRI=18, 
		SAT=19, JAN=20, FEB=21, MAR=22, APR=23, MAY=24, JUN=25, JUL=26, AUG=27, 
		SEP=28, OCT=29, NOV=30, DEC=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "WEEKDAY", "MONTH", "INT", "STAR", "QUESTION", 
			"LAST", "WORK", "HASH", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", 
			"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", 
			"NOV", "DEC", "WS"
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


	public CronLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cron.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6V\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n"+
		"\7\3\b\6\bg\n\b\r\b\16\bh\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0083\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008b\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0093\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u009b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a3\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00ab\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00b3\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00bb\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00c3\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00cb\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d3\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u00db\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00e3\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00eb\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\5\35\u00f3\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u00fb\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0103\n\37\3 \3 \3"+
		" \3 \3 \3 \5 \u010b\n \3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\6\3\2\62;\4\2NNnn"+
		"\4\2YYyy\5\2\13\f\17\17\"\"\2\u0136\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tL\3\2\2\2\13U\3\2\2\2\rc\3\2\2"+
		"\2\17f\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2"+
		"\2\2\33z\3\2\2\2\35\u0082\3\2\2\2\37\u008a\3\2\2\2!\u0092\3\2\2\2#\u009a"+
		"\3\2\2\2%\u00a2\3\2\2\2\'\u00aa\3\2\2\2)\u00b2\3\2\2\2+\u00ba\3\2\2\2"+
		"-\u00c2\3\2\2\2/\u00ca\3\2\2\2\61\u00d2\3\2\2\2\63\u00da\3\2\2\2\65\u00e2"+
		"\3\2\2\2\67\u00ea\3\2\2\29\u00f2\3\2\2\2;\u00fa\3\2\2\2=\u0102\3\2\2\2"+
		"?\u010a\3\2\2\2A\u010c\3\2\2\2CD\7\61\2\2D\4\3\2\2\2EF\7.\2\2F\6\3\2\2"+
		"\2GH\7/\2\2H\b\3\2\2\2IM\5\17\b\2JM\5\13\6\2KM\5\r\7\2LI\3\2\2\2LJ\3\2"+
		"\2\2LK\3\2\2\2M\n\3\2\2\2NV\5\33\16\2OV\5\35\17\2PV\5\37\20\2QV\5!\21"+
		"\2RV\5#\22\2SV\5%\23\2TV\5\'\24\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2"+
		"\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\f\3\2\2\2Wd\5)\25\2Xd\5+\26\2Yd\5"+
		"-\27\2Zd\5/\30\2[d\5\61\31\2\\d\5\63\32\2]d\5\65\33\2^d\5\67\34\2_d\5"+
		"9\35\2`d\5;\36\2ad\5=\37\2bd\5? \2cW\3\2\2\2cX\3\2\2\2cY\3\2\2\2cZ\3\2"+
		"\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3"+
		"\2\2\2cb\3\2\2\2d\16\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2h"+
		"i\3\2\2\2i\20\3\2\2\2jk\7,\2\2k\22\3\2\2\2lm\7A\2\2m\24\3\2\2\2no\t\3"+
		"\2\2o\26\3\2\2\2pq\t\4\2\2q\30\3\2\2\2rs\7%\2\2s\32\3\2\2\2tu\7U\2\2u"+
		"v\7W\2\2v{\7P\2\2wx\7u\2\2xy\7w\2\2y{\7p\2\2zt\3\2\2\2zw\3\2\2\2{\34\3"+
		"\2\2\2|}\7O\2\2}~\7Q\2\2~\u0083\7P\2\2\177\u0080\7o\2\2\u0080\u0081\7"+
		"q\2\2\u0081\u0083\7p\2\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\36\3\2"+
		"\2\2\u0084\u0085\7V\2\2\u0085\u0086\7W\2\2\u0086\u008b\7G\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7w\2\2\u0089\u008b\7g\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u0087\3\2\2\2\u008b \3\2\2\2\u008c\u008d\7Y\2\2\u008d\u008e\7G\2\2\u008e"+
		"\u0093\7F\2\2\u008f\u0090\7y\2\2\u0090\u0091\7g\2\2\u0091\u0093\7f\2\2"+
		"\u0092\u008c\3\2\2\2\u0092\u008f\3\2\2\2\u0093\"\3\2\2\2\u0094\u0095\7"+
		"V\2\2\u0095\u0096\7J\2\2\u0096\u009b\7W\2\2\u0097\u0098\7v\2\2\u0098\u0099"+
		"\7j\2\2\u0099\u009b\7w\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"$\3\2\2\2\u009c\u009d\7H\2\2\u009d\u009e\7T\2\2\u009e\u00a3\7K\2\2\u009f"+
		"\u00a0\7h\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a3\7k\2\2\u00a2\u009c\3\2\2"+
		"\2\u00a2\u009f\3\2\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7U\2\2\u00a5\u00a6\7"+
		"C\2\2\u00a6\u00ab\7V\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7c\2\2\u00a9\u00ab"+
		"\7v\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab(\3\2\2\2\u00ac\u00ad"+
		"\7L\2\2\u00ad\u00ae\7C\2\2\u00ae\u00b3\7P\2\2\u00af\u00b0\7l\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b3\7p\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2"+
		"\2\u00b3*\3\2\2\2\u00b4\u00b5\7H\2\2\u00b5\u00b6\7G\2\2\u00b6\u00bb\7"+
		"D\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7g\2\2\u00b9\u00bb\7d\2\2\u00ba\u00b4"+
		"\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7O\2\2\u00bd\u00be"+
		"\7C\2\2\u00be\u00c3\7T\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7c\2\2\u00c1"+
		"\u00c3\7t\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3.\3\2\2\2\u00c4"+
		"\u00c5\7C\2\2\u00c5\u00c6\7R\2\2\u00c6\u00cb\7T\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7r\2\2\u00c9\u00cb\7t\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c7"+
		"\3\2\2\2\u00cb\60\3\2\2\2\u00cc\u00cd\7O\2\2\u00cd\u00ce\7C\2\2\u00ce"+
		"\u00d3\7[\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d3\7{\2\2"+
		"\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\62\3\2\2\2\u00d4\u00d5"+
		"\7L\2\2\u00d5\u00d6\7W\2\2\u00d6\u00db\7P\2\2\u00d7\u00d8\7l\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00db\7p\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2"+
		"\2\u00db\64\3\2\2\2\u00dc\u00dd\7L\2\2\u00dd\u00de\7W\2\2\u00de\u00e3"+
		"\7N\2\2\u00df\u00e0\7l\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e3\7n\2\2\u00e2"+
		"\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7C\2\2"+
		"\u00e5\u00e6\7W\2\2\u00e6\u00eb\7I\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7w\2\2\u00e9\u00eb\7i\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb"+
		"8\3\2\2\2\u00ec\u00ed\7U\2\2\u00ed\u00ee\7G\2\2\u00ee\u00f3\7R\2\2\u00ef"+
		"\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f3\7r\2\2\u00f2\u00ec\3\2\2"+
		"\2\u00f2\u00ef\3\2\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6\7"+
		"E\2\2\u00f6\u00fb\7V\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fb"+
		"\7v\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb<\3\2\2\2\u00fc\u00fd"+
		"\7P\2\2\u00fd\u00fe\7Q\2\2\u00fe\u0103\7X\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0103\7x\2\2\u0102\u00fc\3\2\2\2\u0102\u00ff\3\2\2"+
		"\2\u0103>\3\2\2\2\u0104\u0105\7F\2\2\u0105\u0106\7G\2\2\u0106\u010b\7"+
		"E\2\2\u0107\u0108\7f\2\2\u0108\u0109\7g\2\2\u0109\u010b\7e\2\2\u010a\u0104"+
		"\3\2\2\2\u010a\u0107\3\2\2\2\u010b@\3\2\2\2\u010c\u010d\t\5\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\b!\2\2\u010fB\3\2\2\2\32\2LUchz\u0082\u008a"+
		"\u0092\u009a\u00a2\u00aa\u00b2\u00ba\u00c2\u00ca\u00d2\u00da\u00e2\u00ea"+
		"\u00f2\u00fa\u0102\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
