/* The following code was generated by JFlex 1.4.3 on 6/9/24, 4:07 p. m. */

/* Simple JFlex example to tokenize arithmetic expressions */

package com.compi.scanner;
import static com.compi.scanner.TokenTypes.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/9/24, 4:07 p. m. from the specification file
 * <tt>C:/Users/vmrjo/Documents/GitHub/Scanner/Scanner/src/main/java/com/compi/scanner/SimpleLexer.flex</tt>
 */
public class SimpleLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\14\1\16\2\0\1\20\22\0\1\14\1\56\1\61\1\63"+
    "\1\0\1\56\1\60\1\0\1\51\1\51\1\17\1\52\1\51\1\11"+
    "\1\12\1\15\1\3\7\4\2\2\1\51\1\51\1\55\1\53\1\54"+
    "\1\51\1\0\3\6\1\13\1\10\1\13\5\1\1\7\13\1\1\5"+
    "\2\1\1\51\1\62\1\51\1\56\1\1\1\0\1\21\1\25\1\31"+
    "\1\36\1\27\1\37\1\43\1\33\1\35\1\1\1\30\1\40\1\41"+
    "\1\34\1\24\1\47\1\1\1\26\1\32\1\23\1\22\1\50\1\45"+
    "\1\42\1\46\1\44\1\51\1\57\1\51\1\51\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\2\4\1\5\2\4\17\2"+
    "\5\4\1\6\1\7\1\10\2\3\1\10\1\0\1\11"+
    "\1\3\1\0\1\3\2\0\1\5\1\12\17\2\2\13"+
    "\6\2\1\3\1\0\1\7\1\3\2\10\2\14\1\15"+
    "\1\3\2\0\1\16\1\3\1\0\1\12\30\2\1\3"+
    "\1\0\1\10\2\3\1\0\1\5\16\2\2\3\1\5"+
    "\1\12\11\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[142];
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
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\64\0\u0138"+
    "\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618"+
    "\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8"+
    "\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958"+
    "\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\150\0\u0bfc\0\u0c30\0\u0c64"+
    "\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\64\0\u0d68\0\u0d9c\0\u0dd0"+
    "\0\u0e04\0\u0e38\0\64\0\u064c\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08"+
    "\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248"+
    "\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8"+
    "\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588"+
    "\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728"+
    "\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8"+
    "\0\u18fc\0\u064c\0\u1930\0\64\0\u1624\0\u1964\0\u1998\0\u19cc"+
    "\0\u1a00\0\u1a34\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\4\4\3\1\6\1\7"+
    "\1\3\1\10\1\11\1\10\1\12\1\10\1\13\1\14"+
    "\1\15\1\3\1\16\1\17\1\20\1\3\1\21\1\22"+
    "\2\3\1\23\1\24\1\25\1\26\2\3\1\27\1\3"+
    "\1\30\2\3\1\31\1\7\1\32\1\12\1\33\1\34"+
    "\1\12\1\35\1\36\1\37\1\2\1\40\65\0\10\3"+
    "\2\0\1\3\5\0\30\3\14\0\1\41\3\42\2\41"+
    "\1\43\1\44\1\0\1\45\1\41\5\0\6\41\1\44"+
    "\10\41\1\43\10\41\15\0\1\46\2\47\1\50\1\0"+
    "\1\51\1\52\1\0\1\53\14\0\1\52\10\0\1\51"+
    "\1\0\1\50\32\0\1\7\41\0\2\7\23\0\1\10"+
    "\1\0\1\10\1\0\1\10\60\0\1\54\1\0\1\55"+
    "\33\0\1\7\63\0\1\7\11\0\10\3\2\0\1\3"+
    "\5\0\1\3\1\56\26\3\14\0\10\3\2\0\1\3"+
    "\5\0\13\3\1\57\14\3\14\0\10\3\2\0\1\3"+
    "\5\0\25\3\1\60\2\3\14\0\10\3\2\0\1\3"+
    "\5\0\5\3\1\61\22\3\14\0\10\3\2\0\1\3"+
    "\5\0\6\3\1\62\21\3\14\0\10\3\2\0\1\3"+
    "\5\0\13\3\1\63\3\3\1\64\1\3\1\65\6\3"+
    "\14\0\10\3\2\0\1\3\5\0\1\64\2\3\1\66"+
    "\6\3\1\67\15\3\14\0\10\3\2\0\1\3\5\0"+
    "\2\3\1\70\7\3\1\71\1\3\1\72\7\3\1\73"+
    "\3\3\14\0\10\3\2\0\1\3\5\0\13\3\1\74"+
    "\2\3\1\75\11\3\14\0\10\3\2\0\1\3\5\0"+
    "\3\3\1\76\2\3\1\77\21\3\14\0\10\3\2\0"+
    "\1\3\5\0\3\3\1\100\13\3\1\101\10\3\14\0"+
    "\10\3\2\0\1\3\5\0\3\3\1\102\24\3\14\0"+
    "\10\3\2\0\1\3\5\0\3\3\1\56\24\3\14\0"+
    "\10\3\2\0\1\3\5\0\12\3\1\103\15\3\14\0"+
    "\10\3\2\0\1\3\5\0\3\3\1\104\24\3\65\0"+
    "\2\7\63\0\1\7\1\12\62\0\1\7\1\0\1\12"+
    "\61\0\1\7\3\0\1\7\57\0\1\7\4\0\1\7"+
    "\3\0\16\37\1\0\42\37\1\105\1\106\1\37\2\107"+
    "\1\110\1\107\1\110\7\107\1\0\1\107\1\0\1\107"+
    "\1\0\43\107\1\0\10\41\2\0\1\41\5\0\30\41"+
    "\14\0\1\41\3\42\2\41\1\43\1\111\1\0\1\45"+
    "\1\41\5\0\6\41\1\111\10\41\1\43\10\41\14\0"+
    "\1\41\3\112\4\41\1\0\1\53\1\41\5\0\30\41"+
    "\13\0\1\113\1\114\3\41\4\114\1\0\1\113\1\114"+
    "\5\113\30\114\1\113\1\0\11\113\2\115\3\116\57\115"+
    "\2\0\1\46\2\117\3\0\1\120\16\0\1\120\36\0"+
    "\1\46\2\47\2\0\1\51\1\120\1\0\1\53\14\0"+
    "\1\120\10\0\1\51\23\0\2\121\3\122\1\121\1\122"+
    "\1\121\1\122\2\121\1\122\5\121\1\122\3\121\1\122"+
    "\1\121\1\122\1\121\1\122\4\121\2\122\24\121\2\0"+
    "\3\117\5\0\1\53\51\0\2\113\3\0\4\113\1\0"+
    "\40\113\1\0\11\113\2\0\3\116\57\0\16\54\1\0"+
    "\45\54\16\55\1\123\1\124\1\123\43\55\1\0\10\3"+
    "\2\0\1\3\5\0\2\3\1\125\25\3\14\0\10\3"+
    "\2\0\1\3\5\0\11\3\1\126\2\3\1\127\13\3"+
    "\14\0\10\3\2\0\1\3\5\0\26\3\1\130\1\3"+
    "\14\0\10\3\2\0\1\3\5\0\6\3\1\131\21\3"+
    "\14\0\10\3\2\0\1\3\5\0\2\3\1\132\17\3"+
    "\1\133\5\3\14\0\10\3\2\0\1\3\5\0\1\3"+
    "\1\134\26\3\14\0\10\3\2\0\1\3\5\0\11\3"+
    "\1\135\16\3\14\0\10\3\2\0\1\3\5\0\2\3"+
    "\1\136\25\3\14\0\10\3\2\0\1\3\5\0\13\3"+
    "\1\137\14\3\14\0\10\3\2\0\1\3\5\0\1\100"+
    "\27\3\14\0\10\3\2\0\1\3\5\0\1\140\4\3"+
    "\1\141\22\3\14\0\10\3\2\0\1\3\5\0\3\3"+
    "\1\142\24\3\14\0\10\3\2\0\1\3\5\0\22\3"+
    "\1\143\1\144\4\3\14\0\10\3\2\0\1\3\5\0"+
    "\14\3\1\145\13\3\14\0\10\3\2\0\1\3\5\0"+
    "\2\3\1\75\25\3\14\0\10\3\2\0\1\3\5\0"+
    "\1\3\1\146\26\3\14\0\10\3\2\0\1\3\5\0"+
    "\16\3\1\147\11\3\14\0\10\3\2\0\1\3\5\0"+
    "\5\3\1\75\22\3\14\0\10\3\2\0\1\3\5\0"+
    "\3\3\1\150\24\3\14\0\10\3\2\0\1\3\5\0"+
    "\13\3\1\151\14\3\14\0\10\3\2\0\1\3\5\0"+
    "\14\3\1\152\13\3\14\0\10\3\2\0\1\3\5\0"+
    "\14\3\1\153\2\3\1\154\10\3\13\0\16\37\1\0"+
    "\45\37\14\107\1\0\1\107\1\0\1\107\1\0\45\107"+
    "\3\110\7\107\1\0\1\107\1\0\1\107\1\0\43\107"+
    "\1\113\1\114\3\155\4\114\1\156\1\113\1\114\5\113"+
    "\30\114\1\113\1\156\11\113\1\0\1\41\3\112\3\41"+
    "\1\157\2\0\1\41\5\0\6\41\1\157\21\41\13\0"+
    "\2\115\3\0\57\115\2\0\3\116\3\0\1\120\2\0"+
    "\1\105\13\0\1\120\6\0\2\105\26\0\3\117\3\0"+
    "\1\120\16\0\1\120\36\0\3\160\4\0\1\156\40\0"+
    "\1\156\11\0\2\121\3\0\1\121\1\0\1\121\1\0"+
    "\2\121\1\0\5\121\1\0\3\121\1\0\1\121\1\0"+
    "\1\121\1\0\4\121\2\0\24\121\2\0\3\161\1\0"+
    "\1\122\1\51\1\122\1\0\1\53\1\122\5\0\1\122"+
    "\3\0\1\122\1\0\1\122\1\0\1\122\4\0\2\122"+
    "\1\51\23\0\17\123\1\162\44\123\15\55\1\163\1\123"+
    "\1\124\1\123\43\55\1\0\10\3\2\0\1\3\5\0"+
    "\3\3\1\75\24\3\14\0\10\3\2\0\1\3\5\0"+
    "\14\3\1\164\13\3\14\0\10\3\2\0\1\3\5\0"+
    "\3\3\1\165\24\3\14\0\10\3\2\0\1\3\5\0"+
    "\6\3\1\166\21\3\14\0\10\3\2\0\1\3\5\0"+
    "\1\167\27\3\14\0\10\3\2\0\1\3\5\0\1\3"+
    "\1\170\26\3\14\0\10\3\2\0\1\3\5\0\14\3"+
    "\1\171\13\3\14\0\10\3\2\0\1\3\5\0\20\3"+
    "\1\75\7\3\14\0\10\3\2\0\1\3\5\0\6\3"+
    "\1\75\21\3\14\0\10\3\2\0\1\3\5\0\6\3"+
    "\1\170\21\3\14\0\10\3\2\0\1\3\5\0\2\3"+
    "\1\172\6\3\1\74\16\3\14\0\10\3\2\0\1\3"+
    "\5\0\2\3\1\173\25\3\14\0\10\3\2\0\1\3"+
    "\5\0\1\3\1\174\26\3\14\0\10\3\2\0\1\3"+
    "\5\0\5\3\1\74\22\3\14\0\10\3\2\0\1\3"+
    "\5\0\13\3\1\175\14\3\14\0\10\3\2\0\1\3"+
    "\5\0\6\3\1\176\21\3\14\0\10\3\2\0\1\3"+
    "\5\0\2\3\1\177\25\3\14\0\10\3\2\0\1\3"+
    "\5\0\4\3\1\152\23\3\14\0\10\3\2\0\1\3"+
    "\5\0\1\200\27\3\14\0\10\3\2\0\1\3\5\0"+
    "\1\74\27\3\14\0\10\3\2\0\1\3\5\0\22\3"+
    "\1\75\5\3\14\0\10\3\2\0\1\3\5\0\17\3"+
    "\1\135\10\3\14\0\10\3\2\0\1\3\5\0\15\3"+
    "\1\75\12\3\14\0\10\3\2\0\1\3\5\0\1\201"+
    "\27\3\14\0\1\41\3\155\4\41\2\0\1\202\5\0"+
    "\15\41\2\202\11\41\15\0\3\160\60\0\1\41\3\155"+
    "\4\41\1\156\1\0\1\41\5\0\30\41\1\0\1\156"+
    "\13\0\3\160\6\0\1\105\22\0\2\105\26\0\3\161"+
    "\1\0\1\122\1\51\1\203\1\0\1\53\1\122\5\0"+
    "\1\122\3\0\1\122\1\0\1\203\1\0\1\122\4\0"+
    "\2\122\1\51\23\0\15\123\1\204\1\123\1\162\44\123"+
    "\16\205\1\0\1\205\1\0\43\205\1\0\10\3\2\0"+
    "\1\3\5\0\22\3\1\143\5\3\14\0\10\3\2\0"+
    "\1\3\5\0\13\3\1\75\14\3\14\0\10\3\2\0"+
    "\1\3\5\0\15\3\1\206\12\3\14\0\10\3\2\0"+
    "\1\3\5\0\7\3\1\75\20\3\14\0\10\3\2\0"+
    "\1\3\5\0\5\3\1\165\22\3\14\0\10\3\2\0"+
    "\1\3\5\0\11\3\1\207\16\3\14\0\10\3\2\0"+
    "\1\3\5\0\14\3\1\210\13\3\14\0\10\3\2\0"+
    "\1\3\5\0\14\3\1\211\13\3\14\0\10\3\2\0"+
    "\1\3\5\0\10\3\1\74\17\3\14\0\10\3\2\0"+
    "\1\3\5\0\6\3\1\153\21\3\14\0\10\3\2\0"+
    "\1\3\5\0\3\3\1\212\24\3\14\0\10\3\2\0"+
    "\1\3\5\0\10\3\1\213\17\3\14\0\10\3\2\0"+
    "\1\3\5\0\1\3\1\214\26\3\14\0\10\3\2\0"+
    "\1\3\5\0\2\3\1\103\25\3\15\0\3\161\1\0"+
    "\1\122\1\51\1\122\1\156\1\53\1\122\5\0\1\122"+
    "\3\0\1\122\1\0\1\122\1\0\1\122\4\0\2\122"+
    "\1\51\11\0\1\156\12\0\10\3\2\0\1\3\5\0"+
    "\6\3\1\212\21\3\14\0\10\3\2\0\1\3\5\0"+
    "\2\3\1\215\25\3\14\0\10\3\2\0\1\3\5\0"+
    "\13\3\1\216\14\3\14\0\10\3\2\0\1\3\5\0"+
    "\10\3\1\75\17\3\14\0\10\3\2\0\1\3\5\0"+
    "\16\3\1\75\11\3\14\0\10\3\2\0\1\3\5\0"+
    "\12\3\1\75\15\3\14\0\10\3\2\0\1\3\5\0"+
    "\17\3\1\74\10\3\14\0\10\3\2\0\1\3\5\0"+
    "\6\3\1\100\21\3\14\0\10\3\2\0\1\3\5\0"+
    "\1\3\1\135\26\3\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6968];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\35\1\1\0\2\1\1\0"+
    "\1\1\2\0\31\1\1\11\1\0\4\1\1\11\3\1"+
    "\2\0\2\1\1\0\32\1\1\0\3\1\1\0\21\1"+
    "\1\11\12\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[142];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    TokenList tokenList = TokenList.getInstance();
    ErrorList errorList = ErrorList.getInstance();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public SimpleLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public SimpleLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 156) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { errorList.insertError(ERROR, "Exponente mal formado -> " + yytext(), yyline);
          }
        case 15: break;
        case 4: 
          { tokenList.insertToken(OPERADOR, yytext(), yyline);
          }
        case 16: break;
        case 14: 
          { errorList.insertError(ERROR, "Hexadecimal mal formado -> " + yytext(), yyline);
          }
        case 17: break;
        case 5: 
          { /* ignore */
          }
        case 18: break;
        case 13: 
          { errorList.insertError(ERROR, "Flotante mal formado -> " + yytext(), yyline);
          }
        case 19: break;
        case 8: 
          { errorList.insertError(ERROR,"Identificador no puede empezar con un número -> " + yytext(), yyline);
          }
        case 20: break;
        case 10: 
          { tokenList.insertToken(ERROR, "Error: Comentario no cerrado -> " + yytext(), yyline);
          }
        case 21: break;
        case 3: 
          { tokenList.insertToken(LITERAL, yytext(), yyline);
          }
        case 22: break;
        case 11: 
          { tokenList.insertToken(PALABRA_RESERVADA, yytext(), yyline);
          }
        case 23: break;
        case 9: 
          { errorList.insertError(ERROR, "Octal mal formado -> " + yytext(), yyline);
          }
        case 24: break;
        case 2: 
          { tokenList.insertToken(IDENTIFICADOR, yytext(),  yyline);
          }
        case 25: break;
        case 1: 
          { errorList.insertError(ERROR, "Desconocido -> " + yytext(),  yyline);
          }
        case 26: break;
        case 7: 
          { errorList.insertError(ERROR, "Caracter invalido -> " + yytext(), yyline);
          }
        case 27: break;
        case 6: 
          { errorList.insertError(ERROR, "String no cerrado -> " + yytext(), yyline);
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
