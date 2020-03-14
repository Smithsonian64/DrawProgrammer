// Generated from inputCommands.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inputCommandsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BOOLEAN=9, 
		FOR=10, DO=11, END=12, NUM=13, ID=14, WHITESPACE=15;
	public static final int
		RULE_inputCommands = 0, RULE_command_list = 1, RULE_command = 2, RULE_left = 3, 
		RULE_right = 4, RULE_up = 5, RULE_down = 6, RULE_move = 7, RULE_set_brush_size = 8, 
		RULE_set_heading = 9, RULE_for_statement = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"inputCommands", "command_list", "command", "left", "right", "up", "down", 
			"move", "set_brush_size", "set_heading", "for_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'left('", "')'", "'right('", "'up('", "'down('", "'move('", "'setBrushSize('", 
			"'setHeading('", null, "'for'", "'do'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "BOOLEAN", "FOR", 
			"DO", "END", "NUM", "ID", "WHITESPACE"
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
	public String getGrammarFileName() { return "inputCommands.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public inputCommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputCommandsContext extends ParserRuleContext {
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public InputCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterInputCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitInputCommands(this);
		}
	}

	public final InputCommandsContext inputCommands() throws RecognitionException {
		InputCommandsContext _localctx = new InputCommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inputCommands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			command_list();
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

	public static class Command_listContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public Command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterCommand_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitCommand_list(this);
		}
	}

	public final Command_listContext command_list() throws RecognitionException {
		Command_listContext _localctx = new Command_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command_list);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				command();
				setState(26);
				command_list();
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

	public static class CommandContext extends ParserRuleContext {
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public UpContext up() {
			return getRuleContext(UpContext.class,0);
		}
		public DownContext down() {
			return getRuleContext(DownContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public Set_brush_sizeContext set_brush_size() {
			return getRuleContext(Set_brush_sizeContext.class,0);
		}
		public Set_headingContext set_heading() {
			return getRuleContext(Set_headingContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				left();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				right();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				up();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				down();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				move();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				set_brush_size();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				set_heading();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(37);
				for_statement();
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

	public static class LeftContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitLeft(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			((LeftContext)_localctx).NUM = match(NUM);
			setState(42);
			match(T__1);

			                        Window.drawPanel.left(Integer.parseInt((((LeftContext)_localctx).NUM!=null?((LeftContext)_localctx).NUM.getText():null)));
			                    
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

	public static class RightContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitRight(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(46);
			((RightContext)_localctx).NUM = match(NUM);
			setState(47);
			match(T__1);

			                        Window.drawPanel.right(Integer.parseInt((((RightContext)_localctx).NUM!=null?((RightContext)_localctx).NUM.getText():null)));
			                    
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

	public static class UpContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public UpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitUp(this);
		}
	}

	public final UpContext up() throws RecognitionException {
		UpContext _localctx = new UpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			((UpContext)_localctx).NUM = match(NUM);
			setState(52);
			match(T__1);

			                        Window.drawPanel.up(Integer.parseInt((((UpContext)_localctx).NUM!=null?((UpContext)_localctx).NUM.getText():null)));
			                    
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

	public static class DownContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public DownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_down; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitDown(this);
		}
	}

	public final DownContext down() throws RecognitionException {
		DownContext _localctx = new DownContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			((DownContext)_localctx).NUM = match(NUM);
			setState(57);
			match(T__1);

			                        Window.drawPanel.down(Integer.parseInt((((DownContext)_localctx).NUM!=null?((DownContext)_localctx).NUM.getText():null)));
			                    
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

	public static class MoveContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			((MoveContext)_localctx).NUM = match(NUM);
			setState(62);
			match(T__1);

			                        Window.drawPanel.move(Integer.parseInt((((MoveContext)_localctx).NUM!=null?((MoveContext)_localctx).NUM.getText():null)));
			                    
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

	public static class Set_brush_sizeContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public Set_brush_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_brush_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterSet_brush_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitSet_brush_size(this);
		}
	}

	public final Set_brush_sizeContext set_brush_size() throws RecognitionException {
		Set_brush_sizeContext _localctx = new Set_brush_sizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_set_brush_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__6);
			setState(66);
			((Set_brush_sizeContext)_localctx).NUM = match(NUM);
			setState(67);
			match(T__1);

			                        Window.drawPanel.setBrushSize(Integer.parseInt((((Set_brush_sizeContext)_localctx).NUM!=null?((Set_brush_sizeContext)_localctx).NUM.getText():null)));
			                    
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

	public static class Set_headingContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public Set_headingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterSet_heading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitSet_heading(this);
		}
	}

	public final Set_headingContext set_heading() throws RecognitionException {
		Set_headingContext _localctx = new Set_headingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_set_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__7);
			setState(71);
			((Set_headingContext)_localctx).NUM = match(NUM);
			setState(72);
			match(T__1);

			                        Window.drawPanel.setHeading(Integer.parseInt((((Set_headingContext)_localctx).NUM!=null?((Set_headingContext)_localctx).NUM.getText():null)));
			                    
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(inputCommandsParser.FOR, 0); }
		public TerminalNode NUM() { return getToken(inputCommandsParser.NUM, 0); }
		public TerminalNode DO() { return getToken(inputCommandsParser.DO, 0); }
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public TerminalNode END() { return getToken(inputCommandsParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputCommandsListener ) ((inputCommandsListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FOR);
			setState(76);
			match(NUM);
			setState(77);
			match(DO);
			setState(78);
			command_list();
			setState(79);
			match(END);


			                    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\2\2Q\2\30\3\2\2\2\4\36\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2"+
		"\n/\3\2\2\2\f\64\3\2\2\2\169\3\2\2\2\20>\3\2\2\2\22C\3\2\2\2\24H\3\2\2"+
		"\2\26M\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\37\5\6\4\2\33\34\5\6\4\2"+
		"\34\35\5\4\3\2\35\37\3\2\2\2\36\32\3\2\2\2\36\33\3\2\2\2\37\5\3\2\2\2"+
		" )\5\b\5\2!)\5\n\6\2\")\5\f\7\2#)\5\16\b\2$)\5\20\t\2%)\5\22\n\2&)\5\24"+
		"\13\2\')\5\26\f\2( \3\2\2\2(!\3\2\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2("+
		"%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+\7\3\2\2+,\7\17\2\2,-\7\4\2"+
		"\2-.\b\5\1\2.\t\3\2\2\2/\60\7\5\2\2\60\61\7\17\2\2\61\62\7\4\2\2\62\63"+
		"\b\6\1\2\63\13\3\2\2\2\64\65\7\6\2\2\65\66\7\17\2\2\66\67\7\4\2\2\678"+
		"\b\7\1\28\r\3\2\2\29:\7\7\2\2:;\7\17\2\2;<\7\4\2\2<=\b\b\1\2=\17\3\2\2"+
		"\2>?\7\b\2\2?@\7\17\2\2@A\7\4\2\2AB\b\t\1\2B\21\3\2\2\2CD\7\t\2\2DE\7"+
		"\17\2\2EF\7\4\2\2FG\b\n\1\2G\23\3\2\2\2HI\7\n\2\2IJ\7\17\2\2JK\7\4\2\2"+
		"KL\b\13\1\2L\25\3\2\2\2MN\7\f\2\2NO\7\17\2\2OP\7\r\2\2PQ\5\4\3\2QR\7\16"+
		"\2\2RS\b\f\1\2S\27\3\2\2\2\4\36(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}