// Generated from /Users/phil/NetBeansProjects/Calc/Expr2.g4 by ANTLR 4.2.2

package calc;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Expr2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Number=1, WS=2, NEWLINE=3, TIMES=4, DIVIDE=5, PLUS=6, MINUS=7, LPAREN=8, 
		RPAREN=9;
	public static final String[] tokenNames = {
		"<INVALID>", "Number", "WS", "NEWLINE", "'*'", "'/'", "'+'", "'-'", "'('", 
		"')'"
	};
	public static final int
		RULE_eval = 0, RULE_additionExp = 1, RULE_multiplyExp = 2, RULE_atomExp = 3;
	public static final String[] ruleNames = {
		"eval", "additionExp", "multiplyExp", "atomExp"
	};

	@Override
	public String getGrammarFileName() { return "Expr2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Expr2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public AdditionExpContext additionExp;
		public TerminalNode NEWLINE() { return getToken(Expr2Parser.NEWLINE, 0); }
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Expr2Visitor ) return ((Expr2Visitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			setState(13);
			switch (_input.LA(1)) {
			case Number:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(8); ((EvalContext)_localctx).additionExp = additionExp();
				setState(9); match(NEWLINE);
				System.out.println(((EvalContext)_localctx).additionExp.value);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(12); match(NEWLINE);
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

	public static class AdditionExpContext extends ParserRuleContext {
		public Integer value;
		public MultiplyExpContext m1;
		public MultiplyExpContext m2;
		public MultiplyExpContext multiplyExp(int i) {
			return getRuleContext(MultiplyExpContext.class,i);
		}
		public List<MultiplyExpContext> multiplyExp() {
			return getRuleContexts(MultiplyExpContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(Expr2Parser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Expr2Parser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(Expr2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Expr2Parser.PLUS, i);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).exitAdditionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Expr2Visitor ) return ((Expr2Visitor<? extends T>)visitor).visitAdditionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); ((AdditionExpContext)_localctx).m1 = multiplyExp();
			((AdditionExpContext)_localctx).value =   ((AdditionExpContext)_localctx).m1.value;
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(25);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(17); match(PLUS);
					setState(18); ((AdditionExpContext)_localctx).m2 = multiplyExp();
					_localctx.value += ((AdditionExpContext)_localctx).m2.value;
					}
					break;
				case MINUS:
					{
					setState(21); match(MINUS);
					setState(22); ((AdditionExpContext)_localctx).m2 = multiplyExp();
					_localctx.value -= ((AdditionExpContext)_localctx).m2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29);
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

	public static class MultiplyExpContext extends ParserRuleContext {
		public Integer value;
		public AtomExpContext a1;
		public AtomExpContext a2;
		public TerminalNode TIMES(int i) {
			return getToken(Expr2Parser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(Expr2Parser.TIMES); }
		public TerminalNode DIVIDE(int i) {
			return getToken(Expr2Parser.DIVIDE, i);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(Expr2Parser.DIVIDE); }
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).exitMultiplyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Expr2Visitor ) return ((Expr2Visitor<? extends T>)visitor).visitMultiplyExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); ((MultiplyExpContext)_localctx).a1 = atomExp();
			((MultiplyExpContext)_localctx).value =   ((MultiplyExpContext)_localctx).a1.value;
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIVIDE) {
				{
				setState(40);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(32); match(TIMES);
					setState(33); ((MultiplyExpContext)_localctx).a2 = atomExp();
					_localctx.value *= ((MultiplyExpContext)_localctx).a2.value;
					}
					break;
				case DIVIDE:
					{
					setState(36); match(DIVIDE);
					setState(37); ((MultiplyExpContext)_localctx).a2 = atomExp();
					_localctx.value /= ((MultiplyExpContext)_localctx).a2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
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

	public static class AtomExpContext extends ParserRuleContext {
		public Integer value;
		public Token n;
		public AdditionExpContext exp;
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public TerminalNode Number() { return getToken(Expr2Parser.Number, 0); }
		public TerminalNode RPAREN() { return getToken(Expr2Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(Expr2Parser.LPAREN, 0); }
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Expr2Listener ) ((Expr2Listener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Expr2Visitor ) return ((Expr2Visitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomExp);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); ((AtomExpContext)_localctx).n = match(Number);
				((AtomExpContext)_localctx).value =  Integer.parseInt((((AtomExpContext)_localctx).n!=null?((AtomExpContext)_localctx).n.getText():null));
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); match(LPAREN);
				setState(48); ((AtomExpContext)_localctx).exp = additionExp();
				setState(49); match(RPAREN);
				((AtomExpContext)_localctx).value =  ((AtomExpContext)_localctx).exp.value;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\139\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\5\2\20\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\67\n\5\3\5\2\2\6\2\4\6\b\2\2:\2\17\3\2\2\2\4\21\3\2\2\2\6 \3\2\2"+
		"\2\b\66\3\2\2\2\n\13\5\4\3\2\13\f\7\5\2\2\f\r\b\2\1\2\r\20\3\2\2\2\16"+
		"\20\7\5\2\2\17\n\3\2\2\2\17\16\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\35"+
		"\b\3\1\2\23\24\7\b\2\2\24\25\5\6\4\2\25\26\b\3\1\2\26\34\3\2\2\2\27\30"+
		"\7\t\2\2\30\31\5\6\4\2\31\32\b\3\1\2\32\34\3\2\2\2\33\23\3\2\2\2\33\27"+
		"\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37\35"+
		"\3\2\2\2 !\5\b\5\2!,\b\4\1\2\"#\7\6\2\2#$\5\b\5\2$%\b\4\1\2%+\3\2\2\2"+
		"&\'\7\7\2\2\'(\5\b\5\2()\b\4\1\2)+\3\2\2\2*\"\3\2\2\2*&\3\2\2\2+.\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60\7\3\2\2\60\67\b\5\1"+
		"\2\61\62\7\n\2\2\62\63\5\4\3\2\63\64\7\13\2\2\64\65\b\5\1\2\65\67\3\2"+
		"\2\2\66/\3\2\2\2\66\61\3\2\2\2\67\t\3\2\2\2\b\17\33\35*,\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}