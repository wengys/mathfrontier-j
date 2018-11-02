// Generated from E:/workspace_java/mathfrontier-j/document\Formula.g4 by ANTLR 4.7

package cn.teleware.cp3.mathfrontier.impl.interpreter.gramma.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LogicSymbol=18, CmpSymbol=19, RangeStart=20, RangeEnd=21, NumeralLiteral=22, 
		Identifier=23, MethodOrPropertyIdentity=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"LogicSymbol", "CmpSymbol", "RangeStart", "RangeEnd", "NumeralLiteral", 
		"Identifier", "MethodOrPropertyIdentity", "Letter", "LetterOrDigit", "DecimalNumeral", 
		"FloatingPointNumeral", "Digits", "Digit", "NonZeroDigit", "Sign", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'when'", "'{'", "';'", 
		"'}'", "'=>'", "':'", "'else'", "','", "'${'", "'%'", "'null'"
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


	public FormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23w\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0081\n\24\3\25\3\25\3\25\3\25\5\25\u0087\n\25\3\26\3\26\3"+
		"\26\3\26\5\26\u008d\n\26\3\27\3\27\5\27\u0091\n\27\3\30\3\30\7\30\u0095"+
		"\n\30\f\30\16\30\u0098\13\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00a0"+
		"\n\32\3\33\3\33\5\33\u00a4\n\33\3\34\3\34\3\34\5\34\u00a9\n\34\5\34\u00ab"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\6\36\u00b2\n\36\r\36\16\36\u00b3\3\37\3"+
		"\37\5\37\u00b8\n\37\3 \3 \3!\3!\3\"\6\"\u00bf\n\"\r\"\16\"\u00c0\3\"\3"+
		"\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2"+
		";\2=\2?\2A\2C\33\3\2\b\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\7\2&&\62;"+
		"C\\aac|\3\2\63;\4\2--//\5\2\13\f\16\17\"\"\2\u00cb\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2C\3\2"+
		"\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2"+
		"\2\17Q\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31_\3"+
		"\2\2\2\33a\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!k\3\2\2\2#m\3\2\2\2%v\3\2\2"+
		"\2\'\u0080\3\2\2\2)\u0086\3\2\2\2+\u008c\3\2\2\2-\u0090\3\2\2\2/\u0092"+
		"\3\2\2\2\61\u0099\3\2\2\2\63\u009f\3\2\2\2\65\u00a3\3\2\2\2\67\u00aa\3"+
		"\2\2\29\u00ac\3\2\2\2;\u00b1\3\2\2\2=\u00b7\3\2\2\2?\u00b9\3\2\2\2A\u00bb"+
		"\3\2\2\2C\u00be\3\2\2\2EF\7*\2\2F\4\3\2\2\2GH\7+\2\2H\6\3\2\2\2IJ\7,\2"+
		"\2J\b\3\2\2\2KL\7\61\2\2L\n\3\2\2\2MN\7-\2\2N\f\3\2\2\2OP\7/\2\2P\16\3"+
		"\2\2\2QR\7y\2\2RS\7j\2\2ST\7g\2\2TU\7p\2\2U\20\3\2\2\2VW\7}\2\2W\22\3"+
		"\2\2\2XY\7=\2\2Y\24\3\2\2\2Z[\7\177\2\2[\26\3\2\2\2\\]\7?\2\2]^\7@\2\2"+
		"^\30\3\2\2\2_`\7<\2\2`\32\3\2\2\2ab\7g\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2"+
		"e\34\3\2\2\2fg\7.\2\2g\36\3\2\2\2hi\7&\2\2ij\7}\2\2j \3\2\2\2kl\7\'\2"+
		"\2l\"\3\2\2\2mn\7p\2\2no\7w\2\2op\7n\2\2pq\7n\2\2q$\3\2\2\2rs\7(\2\2s"+
		"w\7(\2\2tu\7~\2\2uw\7~\2\2vr\3\2\2\2vt\3\2\2\2w&\3\2\2\2x\u0081\7@\2\2"+
		"yz\7@\2\2z\u0081\7?\2\2{\u0081\7>\2\2|}\7>\2\2}\u0081\7?\2\2~\177\7?\2"+
		"\2\177\u0081\7?\2\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080{\3\2\2\2\u0080"+
		"|\3\2\2\2\u0080~\3\2\2\2\u0081(\3\2\2\2\u0082\u0083\7b\2\2\u0083\u0087"+
		"\7*\2\2\u0084\u0085\7b\2\2\u0085\u0087\7]\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087*\3\2\2\2\u0088\u0089\7+\2\2\u0089\u008d\7b\2\2\u008a"+
		"\u008b\7_\2\2\u008b\u008d\7b\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d,\3\2\2\2\u008e\u0091\5\67\34\2\u008f\u0091\59\35\2\u0090\u008e"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091.\3\2\2\2\u0092\u0096\5\63\32\2\u0093"+
		"\u0095\5\65\33\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\60\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\5/\30\2\u009a\u009b\7\60\2\2\u009b\u009c\5/\30\2\u009c\62\3\2\2"+
		"\2\u009d\u00a0\t\2\2\2\u009e\u00a0\n\3\2\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\64\3\2\2\2\u00a1\u00a4\t\4\2\2\u00a2\u00a4\n\3\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\66\3\2\2\2\u00a5\u00ab\7\62\2"+
		"\2\u00a6\u00a8\5? \2\u00a7\u00a9\5;\36\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab"+
		"8\3\2\2\2\u00ac\u00ad\5;\36\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\5;\36\2"+
		"\u00af:\3\2\2\2\u00b0\u00b2\5=\37\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4<\3\2\2\2\u00b5\u00b8"+
		"\7\62\2\2\u00b6\u00b8\5? \2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		">\3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba@\3\2\2\2\u00bb\u00bc\t\6\2\2\u00bc"+
		"B\3\2\2\2\u00bd\u00bf\t\7\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\b\"\2\2\u00c3D\3\2\2\2\20\2v\u0080\u0086\u008c\u0090\u0096\u009f\u00a3"+
		"\u00a8\u00aa\u00b3\u00b7\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}