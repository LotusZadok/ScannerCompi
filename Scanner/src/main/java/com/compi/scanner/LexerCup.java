// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: C:/Users/ncque/Downloads/tec/ci/Scanner/Scanner/src/main/java/com/compi/scanner/LexerCup.flex

package com.compi.scanner;
import java_cup.runtime.Symbol;

@SuppressWarnings("fallthrough")
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\4"+
    "\6\0\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\7\16\2\17\1\0\1\20\1\21\1\22"+
    "\1\23\2\0\3\24\1\25\1\26\1\25\5\27\1\30"+
    "\13\27\1\31\2\27\4\0\1\27\1\0\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\27"+
    "\1\43\1\44\1\27\1\45\1\46\2\27\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\31\2\27\1\55\1\0"+
    "\1\56\7\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\2\12\1\13\1\14\1\15"+
    "\1\16\11\17\1\20\1\21\1\22\1\23\1\24\2\12"+
    "\1\25\1\26\1\2\1\27\1\0\1\12\1\30\1\0"+
    "\1\12\2\0\1\12\2\31\1\12\1\32\4\17\1\33"+
    "\5\17\1\0\1\12\1\0\1\12\1\0\1\12\1\0"+
    "\1\26\1\34\2\0\1\35\2\0\1\36\1\12\1\25"+
    "\1\31\1\35\1\31\4\17\1\37\4\17\1\34\1\0"+
    "\1\12\1\0\1\2\1\0\1\34\1\0\1\34\1\0"+
    "\1\34\1\12\1\34\1\31\1\17\1\40\1\17\1\41"+
    "\1\42\1\17\1\43\1\17\1\34\1\0\1\34\1\12"+
    "\1\2\1\26\1\12\1\34\1\44\1\17\1\45\1\46"+
    "\1\12\1\27\2\17\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\57\0\57\0\57\0\274"+
    "\0\57\0\353\0\u011a\0\u0149\0\u0178\0\u01a7\0\57\0\57"+
    "\0\u01d6\0\57\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0"+
    "\0\u031f\0\u034e\0\u037d\0\57\0\57\0\57\0\57\0\57"+
    "\0\u03ac\0\u03db\0\u011a\0\u040a\0\u0439\0\57\0\u0468\0\u0497"+
    "\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f"+
    "\0\u063e\0\57\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0205\0\u0729"+
    "\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1"+
    "\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea\0\57"+
    "\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u05e0\0\u0b33"+
    "\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0205\0\u0c1e\0\u0c4d\0\u0c7c"+
    "\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u011a\0\u0dc5"+
    "\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d"+
    "\0\u0205\0\u0f6c\0\u0205\0\u0205\0\u0f9b\0\u0205\0\u0fca\0\57"+
    "\0\u0ff9\0\u1028\0\u1057\0\57\0\u0d96\0\u1086\0\u10b5\0\u0205"+
    "\0\u10e4\0\u0205\0\u0205\0\u1113\0\u0df4\0\u1142\0\u1171\0\u0205";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\2\16\1\17\1\20"+
    "\1\21\1\22\7\23\1\24\1\25\1\23\1\26\3\23"+
    "\1\27\1\23\1\30\3\23\1\31\2\23\1\32\1\33"+
    "\1\34\1\35\60\0\2\3\76\0\1\36\44\0\1\37"+
    "\60\0\1\40\2\0\1\41\2\42\54\0\3\43\46\0"+
    "\1\44\4\0\1\45\54\0\1\46\1\47\1\0\2\50"+
    "\1\51\6\0\1\52\1\0\1\53\1\54\4\0\1\52"+
    "\5\0\1\53\24\0\1\46\1\55\1\0\3\56\4\0"+
    "\2\57\1\60\1\57\1\61\5\57\1\60\5\57\1\61"+
    "\10\57\24\0\1\62\51\0\3\23\4\0\31\23\17\0"+
    "\3\23\4\0\23\23\1\63\5\23\17\0\3\23\4\0"+
    "\15\23\1\64\4\23\1\65\6\23\17\0\3\23\4\0"+
    "\20\23\1\66\10\23\17\0\3\23\4\0\13\23\1\67"+
    "\5\23\1\70\7\23\17\0\3\23\4\0\22\23\1\71"+
    "\6\23\17\0\3\23\4\0\15\23\1\72\13\23\17\0"+
    "\3\23\4\0\22\23\1\73\6\23\17\0\3\23\4\0"+
    "\15\23\1\74\13\23\15\0\1\75\1\0\2\76\1\77"+
    "\10\0\1\100\1\101\12\0\1\100\25\0\1\75\1\0"+
    "\3\102\10\0\1\100\13\0\1\100\12\0\2\44\1\103"+
    "\4\44\1\104\47\44\2\45\2\0\53\45\15\0\3\105"+
    "\51\0\1\46\1\47\1\0\2\50\1\51\6\0\1\106"+
    "\1\0\1\53\5\0\1\106\5\0\1\53\25\0\1\107"+
    "\1\0\3\51\6\0\1\106\7\0\1\106\20\0\10\110"+
    "\1\0\1\110\1\0\2\110\3\0\37\110\12\0\1\46"+
    "\1\111\1\0\3\112\37\0\15\113\3\114\4\113\3\114"+
    "\3\113\6\114\17\113\15\115\3\105\37\115\12\0\1\46"+
    "\1\55\1\0\3\56\4\0\2\57\1\116\1\57\1\61"+
    "\5\57\1\116\5\57\1\61\10\57\17\0\3\57\4\0"+
    "\31\57\2\0\10\110\1\0\1\110\1\0\2\110\3\57"+
    "\4\110\31\117\2\110\12\0\1\46\1\111\1\0\3\120"+
    "\4\0\31\57\17\0\3\23\4\0\12\23\1\121\16\23"+
    "\17\0\3\23\4\0\6\23\1\122\22\23\17\0\3\23"+
    "\4\0\21\23\1\123\7\23\17\0\3\23\4\0\24\23"+
    "\1\124\4\23\17\0\3\23\4\0\25\23\1\125\3\23"+
    "\17\0\3\23\4\0\21\23\1\126\7\23\17\0\3\23"+
    "\4\0\22\23\1\127\6\23\17\0\3\23\4\0\16\23"+
    "\1\130\12\23\17\0\3\23\4\0\16\23\1\131\12\23"+
    "\17\0\3\132\52\0\1\75\1\0\2\76\1\77\6\0"+
    "\1\133\1\0\1\100\5\0\1\133\5\0\1\100\27\0"+
    "\3\77\6\0\1\133\7\0\1\133\33\0\1\75\1\0"+
    "\3\77\54\0\3\134\4\0\3\134\3\0\6\134\32\0"+
    "\1\75\1\0\3\102\6\0\1\133\1\0\1\100\5\0"+
    "\1\133\5\0\1\100\12\0\7\103\1\135\47\103\2\44"+
    "\1\103\4\44\1\104\4\44\1\136\42\44\12\0\1\46"+
    "\1\137\1\0\3\105\5\0\1\140\1\106\6\0\1\140"+
    "\1\106\1\140\27\0\1\141\1\0\1\141\2\0\3\142"+
    "\54\0\3\143\54\0\3\144\54\0\3\112\6\0\1\106"+
    "\7\0\1\106\20\0\15\113\3\0\4\113\3\0\3\113"+
    "\6\0\17\113\12\0\1\46\1\111\1\0\3\145\4\0"+
    "\3\114\1\0\1\53\1\0\6\114\4\0\1\53\12\0"+
    "\15\115\3\0\37\115\10\110\1\141\1\110\1\141\2\110"+
    "\3\146\4\110\31\117\2\110\15\0\3\120\4\0\2\57"+
    "\1\147\7\57\1\147\16\57\17\0\3\23\4\0\6\23"+
    "\1\150\22\23\17\0\3\23\4\0\23\23\1\151\5\23"+
    "\17\0\3\23\4\0\25\23\1\152\3\23\17\0\3\23"+
    "\4\0\12\23\1\153\16\23\17\0\3\23\4\0\14\23"+
    "\1\154\14\23\17\0\3\23\4\0\23\23\1\155\5\23"+
    "\17\0\3\23\4\0\11\23\1\156\17\23\17\0\3\23"+
    "\4\0\20\23\1\157\10\23\17\0\3\132\5\0\1\160"+
    "\1\133\6\0\1\160\1\133\1\160\27\0\1\161\1\0"+
    "\1\161\2\0\3\162\52\0\1\75\1\0\3\163\4\0"+
    "\3\134\1\0\1\100\1\0\6\134\4\0\1\100\12\0"+
    "\7\103\1\135\4\103\1\164\42\103\2\165\1\0\54\165"+
    "\12\0\1\46\61\0\3\142\51\0\1\46\2\0\3\142"+
    "\5\0\1\140\7\0\1\140\1\0\1\140\32\0\1\137"+
    "\1\0\3\143\51\0\1\46\2\0\3\144\5\0\1\140"+
    "\1\106\6\0\1\140\1\106\1\140\31\0\1\46\1\111"+
    "\1\0\3\145\4\0\2\114\1\166\1\0\1\53\1\0"+
    "\4\114\1\166\1\114\4\0\1\53\24\0\1\46\2\0"+
    "\3\146\4\0\1\57\1\167\7\57\1\167\1\57\1\167"+
    "\15\57\12\0\1\141\1\0\1\141\2\0\3\146\4\0"+
    "\31\57\17\0\3\23\4\0\17\23\1\170\11\23\17\0"+
    "\3\23\4\0\16\23\1\171\12\23\17\0\3\23\4\0"+
    "\25\23\1\172\3\23\17\0\3\23\4\0\12\23\1\173"+
    "\16\23\17\0\3\162\54\0\3\162\5\0\1\160\7\0"+
    "\1\160\1\0\1\160\32\0\1\75\1\0\3\163\4\0"+
    "\2\134\1\174\1\0\1\100\1\0\4\134\1\174\1\134"+
    "\4\0\1\100\22\0\1\141\1\0\1\175\1\111\1\0"+
    "\3\145\4\0\3\114\1\0\1\53\1\0\6\114\4\0"+
    "\1\53\24\0\1\46\2\0\3\57\4\0\31\57\17\0"+
    "\3\23\4\0\21\23\1\176\7\23\12\0\1\161\1\0"+
    "\1\161\1\75\1\0\3\163\4\0\3\134\1\0\1\100"+
    "\1\0\6\134\4\0\1\100\27\0\3\23\4\0\26\23"+
    "\1\177\2\23\17\0\3\23\4\0\12\23\1\200\16\23"+
    "\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4512];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\3\11\1\1\1\11\5\1\2\11"+
    "\1\1\1\11\11\1\5\11\5\1\1\11\1\0\2\1"+
    "\1\0\1\1\2\0\4\1\1\11\12\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\2\1\2\0\1\11"+
    "\2\0\20\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\14\1\1\11\1\0\2\1\1\11"+
    "\14\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[128];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
  private void reportError(String message) {
    System.err.println("Error léxico en línea " + (yyline + 1) + ", columna " + (yycolumn + 1) + ": " + message);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { reportError("Desconocido -> " + yytext());
            }
          // fall through
          case 40: break;
          case 2:
            { /* ignore */
            }
          // fall through
          case 41: break;
          case 3:
            { return new Symbol(sym.LPAREN, yyline, yycolumn, yytext());
            }
          // fall through
          case 42: break;
          case 4:
            { return new Symbol(sym.RPAREN, yyline, yycolumn, yytext());
            }
          // fall through
          case 43: break;
          case 5:
            { return new Symbol(sym.TIMES, yyline, yycolumn, yytext());
            }
          // fall through
          case 44: break;
          case 6:
            { return new Symbol(sym.PLUS, yyline, yycolumn, yytext());
            }
          // fall through
          case 45: break;
          case 7:
            { return new Symbol(sym.COMMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 46: break;
          case 8:
            { return new Symbol(sym.MINUS, yyline, yycolumn, yytext());
            }
          // fall through
          case 47: break;
          case 9:
            { return new Symbol(sym.DIV, yyline, yycolumn, yytext());
            }
          // fall through
          case 48: break;
          case 10:
            { return new Symbol(sym.INT, yyline, yycolumn, yytext());
            }
          // fall through
          case 49: break;
          case 11:
            { return new Symbol(sym.SEMI, yyline, yycolumn, yytext());
            }
          // fall through
          case 50: break;
          case 12:
            { return new Symbol(sym.LT, yyline, yycolumn, yytext());
            }
          // fall through
          case 51: break;
          case 13:
            { return new Symbol(sym.EQ, yyline, yycolumn, yytext());
            }
          // fall through
          case 52: break;
          case 14:
            { return new Symbol(sym.GT, yyline, yycolumn, yytext());
            }
          // fall through
          case 53: break;
          case 15:
            { return new Symbol(sym.ID, yyline, yycolumn, yytext());
            }
          // fall through
          case 54: break;
          case 16:
            { return new Symbol(sym.LBRACKET, yyline, yycolumn, yytext());
            }
          // fall through
          case 55: break;
          case 17:
            { return new Symbol(sym.RBRACKET, yyline, yycolumn, yytext());
            }
          // fall through
          case 56: break;
          case 18:
            { return new Symbol(sym.NOT_EQ, yyline, yycolumn, yytext());
            }
          // fall through
          case 57: break;
          case 19:
            { return new Symbol(sym.PLUS_PLUS, yyline, yycolumn, yytext());
            }
          // fall through
          case 58: break;
          case 20:
            { return new Symbol(sym.MINUS_MINUS, yyline, yycolumn, yytext());
            }
          // fall through
          case 59: break;
          case 21:
            { reportError("Flotante mal formado -> " + yytext());
            }
          // fall through
          case 60: break;
          case 22:
            { reportError("Comentario no cerrado -> " + yytext());
            }
          // fall through
          case 61: break;
          case 23:
            { reportError("Símbolo inválido después de número -> " + yytext());
            }
          // fall through
          case 62: break;
          case 24:
            { reportError("Octal mal formado -> " + yytext());
            }
          // fall through
          case 63: break;
          case 25:
            { reportError("Identificador no puede empezar con un número -> " + yytext());
            }
          // fall through
          case 64: break;
          case 26:
            { return new Symbol(sym.EQ_EQ, yyline, yycolumn, yytext());
            }
          // fall through
          case 65: break;
          case 27:
            { return new Symbol(sym.IF, yyline, yycolumn, yytext());
            }
          // fall through
          case 66: break;
          case 28:
            { return new Symbol(sym.FLOAT, yyline, yycolumn, yytext());
            }
          // fall through
          case 67: break;
          case 29:
            { reportError("Exponente mal formado -> " + yytext());
            }
          // fall through
          case 68: break;
          case 30:
            { reportError("Hexadecimal mal formado -> " + yytext());
            }
          // fall through
          case 69: break;
          case 31:
            { return new Symbol(sym.TYPE_INT, yyline, yycolumn, yytext());
            }
          // fall through
          case 70: break;
          case 32:
            { return new Symbol(sym.TYPE_CHAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 71: break;
          case 33:
            { return new Symbol(sym.ELSE, yyline, yycolumn, yytext());
            }
          // fall through
          case 72: break;
          case 34:
            { return new Symbol(sym.TYPE_LONG, yyline, yycolumn, yytext());
            }
          // fall through
          case 73: break;
          case 35:
            { return new Symbol(sym.VOID, yyline, yycolumn, yytext());
            }
          // fall through
          case 74: break;
          case 36:
            { return new Symbol(sym.BREAK, yyline, yycolumn, yytext());
            }
          // fall through
          case 75: break;
          case 37:
            { return new Symbol(sym.TYPE_SHORT, yyline, yycolumn, yytext());
            }
          // fall through
          case 76: break;
          case 38:
            { return new Symbol(sym.WHILE, yyline, yycolumn, yytext());
            }
          // fall through
          case 77: break;
          case 39:
            { return new Symbol(sym.CONTINUE, yyline, yycolumn, yytext());
            }
          // fall through
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
