package com.compi.scanner;
import static com.compi.scanner.TokenTypes.*;

@SuppressWarnings("FallThrough")
public class SimpleLexer {

  public static final int YYEOF = -1;

  private static final int ZZ_BUFFERSIZE = 16384;

  public static final int YYINITIAL = 0;

  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

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
    int i = 0;
    int j = offset;
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\1\6\1\7\1\0\1\5\1\10\1\11\2\12\1\13"+
    "\1\14\1\12\1\15\1\16\1\17\1\20\7\21\2\22"+
    "\2\12\1\23\1\24\1\25\1\12\1\0\3\26\1\27"+
    "\1\30\1\27\5\31\1\32\13\31\1\33\2\31\1\12"+
    "\1\34\1\12\1\5\1\31\1\0\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\31\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\31\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\12"+
    "\1\65\2\12\6\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;
    int j = offset;
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\3\1\1"+
    "\5\3\2\6\2\3\20\7\1\3\1\6\1\0\1\5"+
    "\1\6\1\10\1\0\2\6\1\11\1\12\1\2\1\13"+
    "\1\0\1\6\1\14\1\0\1\6\2\0\1\6\2\15"+
    "\1\6\6\7\1\16\4\7\1\16\13\7\3\0\1\6"+
    "\1\0\1\6\1\0\1\6\1\0\1\12\1\6\2\0"+
    "\1\17\2\0\1\20\1\6\1\11\1\15\1\17\1\15"+
    "\30\7\1\21\1\6\1\0\1\6\1\0\1\2\1\0"+
    "\1\6\1\0\1\6\1\0\3\6\1\15\16\7\1\0"+
    "\2\6\1\2\1\12\2\6\7\7\1\6\1\13\2\7";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;
    int j = offset;
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\66\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4"+
    "\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4"+
    "\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654"+
    "\0\u068a\0\u06c0\0\66\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce"+
    "\0\u0804\0\u083a\0\u021c\0\u0870\0\u08a6\0\66\0\u08dc\0\u0912"+
    "\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2"+
    "\0\u0af8\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72"+
    "\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0360\0\u0d80\0\u0db6\0\u0dec"+
    "\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c"+
    "\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c"+
    "\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\66\0\u1290\0\u12c6"+
    "\0\u12fc\0\u1332\0\u1368\0\u139e\0\u0a8c\0\u13d4\0\u140a\0\u1440"+
    "\0\u1476\0\u14ac\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0"+
    "\0\u1626\0\u165c\0\u1692\0\u16c8\0\u16fe\0\u1734\0\u176a\0\u17a0"+
    "\0\u17d6\0\u180c\0\u1842\0\u1878\0\u18ae\0\u18e4\0\66\0\u191a"+
    "\0\u1950\0\u1986\0\u19bc\0\u19f2\0\u021c\0\u1a28\0\u1a5e\0\u1a94"+
    "\0\u1aca\0\u1b00\0\u1b36\0\u1b6c\0\u1ba2\0\u1bd8\0\u1c0e\0\u1c44"+
    "\0\u1c7a\0\u1cb0\0\u1ce6\0\u1d1c\0\u1d52\0\u1d88\0\u1dbe\0\u1df4"+
    "\0\u1e2a\0\u1e60\0\u1e96\0\u1ecc\0\u1f02\0\u1f38\0\66\0\u19f2"+
    "\0\u1f6e\0\u1fa4\0\u1fda\0\u2010\0\u2046\0\u207c\0\u20b2\0\u20e8"+
    "\0\u211e\0\u2154\0\u1a5e\0\u218a\0\u21c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;
    int j = offset;
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\4\1\12\1\13\1\14\1\15\1\16"+
    "\2\17\1\20\1\4\1\21\6\22\1\2\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\22\1\32\1\22"+
    "\1\33\4\22\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\3\22\1\42\67\0\2\3\1\0\1\3\105\0\1\11"+
    "\41\0\2\5\1\0\3\5\1\43\25\5\1\44\31\5"+
    "\1\45\2\0\1\45\1\0\14\45\2\46\43\45\10\0"+
    "\1\11\13\0\1\11\41\0\2\47\1\0\6\47\1\0"+
    "\22\47\1\50\31\47\14\0\1\11\7\0\1\11\56\0"+
    "\1\11\2\0\1\51\2\52\1\0\2\11\60\0\3\53"+
    "\56\0\1\54\3\0\1\55\4\0\1\11\56\0\1\56"+
    "\1\57\1\0\2\60\1\61\5\0\1\62\1\0\1\63"+
    "\1\64\5\0\1\62\5\0\1\63\12\0\1\64\20\0"+
    "\1\56\1\65\1\0\3\66\3\0\2\67\1\70\1\67"+
    "\1\71\1\67\1\0\4\67\1\70\5\67\1\71\15\67"+
    "\24\0\1\4\1\11\65\0\1\11\1\4\60\0\3\22"+
    "\3\0\6\22\1\0\30\22\21\0\3\22\3\0\6\22"+
    "\1\0\22\22\1\72\5\22\21\0\3\22\3\0\6\22"+
    "\1\0\17\22\1\73\10\22\21\0\3\22\3\0\6\22"+
    "\1\0\1\74\6\22\1\75\5\22\1\76\12\22\21\0"+
    "\3\22\3\0\6\22\1\0\4\22\1\77\10\22\1\100"+
    "\12\22\21\0\3\22\3\0\6\22\1\0\12\22\1\74"+
    "\1\22\1\101\10\22\1\102\2\22\21\0\3\22\3\0"+
    "\6\22\1\0\12\22\1\103\2\22\1\104\12\22\21\0"+
    "\3\22\3\0\6\22\1\0\15\22\1\72\12\22\21\0"+
    "\3\22\3\0\6\22\1\0\5\22\1\105\6\22\1\106"+
    "\13\22\21\0\3\22\3\0\6\22\1\0\15\22\1\107"+
    "\12\22\21\0\3\22\3\0\6\22\1\0\4\22\1\110"+
    "\23\22\21\0\3\22\3\0\6\22\1\0\7\22\1\111"+
    "\1\112\10\22\1\113\2\22\1\114\3\22\21\0\3\22"+
    "\3\0\6\22\1\0\26\22\1\115\1\22\21\0\3\22"+
    "\3\0\6\22\1\0\14\22\1\116\13\22\21\0\3\22"+
    "\3\0\6\22\1\0\15\22\1\117\12\22\21\0\3\22"+
    "\3\0\6\22\1\0\7\22\1\120\20\22\25\0\1\11"+
    "\40\0\1\11\2\5\3\0\61\5\1\45\2\0\1\45"+
    "\1\0\62\45\2\0\1\45\1\0\13\45\3\46\43\45"+
    "\2\121\1\0\6\121\1\43\22\121\1\122\33\121\3\0"+
    "\1\121\1\47\2\121\1\47\6\121\1\47\13\121\1\47"+
    "\14\121\1\47\2\121\1\47\1\121\1\47\7\121\16\0"+
    "\1\123\1\0\2\124\1\125\7\0\1\126\1\127\13\0"+
    "\1\126\12\0\1\127\21\0\1\123\1\0\3\130\7\0"+
    "\1\126\14\0\1\126\16\0\2\54\1\131\1\54\1\131"+
    "\6\54\1\132\52\54\2\55\3\0\61\55\20\0\3\133"+
    "\60\0\1\56\1\57\1\0\2\60\1\61\5\0\1\134"+
    "\1\0\1\63\6\0\1\134\5\0\1\63\34\0\1\135"+
    "\1\0\3\61\5\0\1\134\10\0\1\134\24\0\14\136"+
    "\2\0\2\136\3\0\43\136\15\0\1\56\1\137\1\0"+
    "\3\140\43\0\20\141\3\142\3\141\3\142\4\141\6\142"+
    "\23\141\20\143\3\133\43\143\15\0\1\56\1\65\1\0"+
    "\3\66\3\0\2\67\1\144\1\67\1\71\1\67\1\0"+
    "\4\67\1\144\5\67\1\71\15\67\21\0\3\67\3\0"+
    "\6\67\1\0\30\67\1\0\14\136\2\0\2\136\3\67"+
    "\3\136\6\145\1\136\30\145\1\136\15\0\1\56\1\137"+
    "\1\0\3\146\3\0\6\67\1\0\30\67\21\0\3\22"+
    "\3\0\6\22\1\0\21\22\1\147\6\22\21\0\3\22"+
    "\3\0\6\22\1\0\4\22\1\150\23\22\21\0\3\22"+
    "\3\0\6\22\1\0\20\22\1\151\7\22\21\0\3\22"+
    "\3\0\6\22\1\0\1\104\27\22\21\0\3\22\3\0"+
    "\6\22\1\0\14\22\1\152\13\22\21\0\3\22\3\0"+
    "\6\22\1\0\5\22\1\153\22\22\21\0\3\22\3\0"+
    "\6\22\1\0\22\22\1\154\5\22\21\0\3\22\3\0"+
    "\6\22\1\0\22\22\1\155\5\22\21\0\3\22\3\0"+
    "\6\22\1\0\21\22\1\156\6\22\21\0\3\22\3\0"+
    "\6\22\1\0\15\22\1\157\12\22\21\0\3\22\3\0"+
    "\6\22\1\0\17\22\1\105\10\22\21\0\3\22\3\0"+
    "\6\22\1\0\21\22\1\105\6\22\21\0\3\22\3\0"+
    "\6\22\1\0\14\22\1\160\13\22\21\0\3\22\3\0"+
    "\6\22\1\0\6\22\1\161\12\22\1\162\6\22\21\0"+
    "\3\22\3\0\6\22\1\0\15\22\1\163\12\22\21\0"+
    "\3\22\3\0\6\22\1\0\6\22\1\164\20\22\1\165"+
    "\21\0\3\22\3\0\6\22\1\0\1\166\16\22\1\167"+
    "\10\22\21\0\3\22\3\0\6\22\1\0\10\22\1\170"+
    "\17\22\21\0\3\22\3\0\6\22\1\0\16\22\1\171"+
    "\11\22\21\0\3\22\3\0\6\22\1\0\10\22\1\172"+
    "\7\22\1\173\7\22\21\0\3\22\3\0\6\22\1\0"+
    "\10\22\1\174\1\22\1\175\15\22\21\0\3\22\3\0"+
    "\6\22\1\0\10\22\1\176\17\22\1\0\2\121\1\0"+
    "\6\121\1\177\22\121\1\122\33\121\3\0\61\121\20\0"+
    "\3\200\61\0\1\123\1\0\2\124\1\125\5\0\1\201"+
    "\1\0\1\126\6\0\1\201\5\0\1\126\36\0\3\125"+
    "\5\0\1\201\10\0\1\201\42\0\1\123\1\0\3\125"+
    "\63\0\3\202\3\0\3\202\4\0\6\202\41\0\1\123"+
    "\1\0\3\130\5\0\1\201\1\0\1\126\6\0\1\201"+
    "\5\0\1\126\16\0\13\131\1\203\52\131\2\54\1\131"+
    "\1\54\1\131\6\54\1\132\3\54\1\204\46\54\15\0"+
    "\1\56\1\205\1\0\3\133\4\0\1\206\1\134\7\0"+
    "\1\206\1\134\1\206\37\0\2\207\2\0\3\210\63\0"+
    "\3\211\63\0\3\212\63\0\3\140\5\0\1\134\10\0"+
    "\1\134\24\0\20\141\3\0\3\141\3\0\4\141\6\0"+
    "\23\141\15\0\1\56\1\137\1\0\3\213\3\0\3\142"+
    "\1\0\1\63\2\0\6\142\4\0\1\63\16\0\20\143"+
    "\3\0\43\143\14\136\2\207\2\136\3\214\3\136\6\145"+
    "\1\136\30\145\1\136\20\0\3\146\3\0\2\67\1\215"+
    "\3\67\1\0\4\67\1\215\23\67\21\0\3\22\3\0"+
    "\6\22\1\0\15\22\1\105\12\22\21\0\3\22\3\0"+
    "\6\22\1\0\1\216\27\22\21\0\3\22\3\0\6\22"+
    "\1\0\4\22\1\105\23\22\21\0\3\22\3\0\6\22"+
    "\1\0\20\22\1\106\1\217\6\22\21\0\3\22\3\0"+
    "\6\22\1\0\1\220\27\22\21\0\3\22\3\0\6\22"+
    "\1\0\1\22\1\176\26\22\21\0\3\22\3\0\6\22"+
    "\1\0\13\22\1\105\14\22\21\0\3\22\3\0\6\22"+
    "\1\0\4\22\1\221\23\22\21\0\3\22\3\0\6\22"+
    "\1\0\1\106\27\22\21\0\3\22\3\0\6\22\1\0"+
    "\6\22\1\105\21\22\21\0\3\22\3\0\6\22\1\0"+
    "\10\22\1\222\17\22\21\0\3\22\3\0\6\22\1\0"+
    "\22\22\1\221\5\22\21\0\3\22\3\0\6\22\1\0"+
    "\17\22\1\106\10\22\21\0\3\22\3\0\6\22\1\0"+
    "\14\22\1\223\13\22\21\0\3\22\3\0\6\22\1\0"+
    "\4\22\1\224\23\22\21\0\3\22\3\0\6\22\1\0"+
    "\21\22\1\225\6\22\21\0\3\22\3\0\6\22\1\0"+
    "\22\22\1\226\5\22\21\0\3\22\3\0\6\22\1\0"+
    "\21\22\1\227\6\22\21\0\3\22\3\0\6\22\1\0"+
    "\4\22\1\230\23\22\21\0\3\22\3\0\6\22\1\0"+
    "\15\22\1\231\12\22\21\0\3\22\3\0\6\22\1\0"+
    "\10\22\1\232\17\22\21\0\3\22\3\0\6\22\1\0"+
    "\3\22\1\105\24\22\21\0\3\22\3\0\6\22\1\0"+
    "\1\233\27\22\21\0\3\22\3\0\6\22\1\0\12\22"+
    "\1\151\15\22\21\0\3\200\4\0\1\43\1\201\7\0"+
    "\1\43\1\201\1\43\37\0\2\234\2\0\3\235\61\0"+
    "\1\123\1\0\3\236\3\0\3\202\1\0\1\126\2\0"+
    "\6\202\4\0\1\126\16\0\13\131\1\203\3\131\1\237"+
    "\46\131\2\240\1\0\1\240\1\0\61\240\15\0\1\56"+
    "\70\0\3\210\60\0\1\56\2\0\3\210\4\0\1\206"+
    "\10\0\1\206\1\0\1\206\41\0\1\205\1\0\3\211"+
    "\60\0\1\56\2\0\3\212\4\0\1\206\1\134\7\0"+
    "\1\206\1\134\1\206\40\0\1\56\1\137\1\0\3\213"+
    "\3\0\2\142\1\241\1\0\1\63\2\0\4\142\1\241"+
    "\1\142\4\0\1\63\33\0\1\56\2\0\3\214\3\0"+
    "\1\67\1\242\4\67\1\0\3\67\1\242\1\67\1\242"+
    "\22\67\15\0\2\207\2\0\3\214\3\0\6\67\1\0"+
    "\30\67\21\0\3\22\3\0\6\22\1\0\11\22\1\105"+
    "\16\22\21\0\3\22\3\0\6\22\1\0\10\22\1\243"+
    "\17\22\21\0\3\22\3\0\6\22\1\0\22\22\1\244"+
    "\5\22\21\0\3\22\3\0\6\22\1\0\17\22\1\231"+
    "\10\22\21\0\3\22\3\0\6\22\1\0\20\22\1\245"+
    "\7\22\21\0\3\22\3\0\6\22\1\0\4\22\1\174"+
    "\23\22\21\0\3\22\3\0\6\22\1\0\15\22\1\246"+
    "\12\22\21\0\3\22\3\0\6\22\1\0\10\22\1\247"+
    "\17\22\21\0\3\22\3\0\6\22\1\0\2\22\1\106"+
    "\25\22\21\0\3\22\3\0\6\22\1\0\2\22\1\250"+
    "\25\22\21\0\3\22\3\0\6\22\1\0\3\22\1\251"+
    "\24\22\21\0\3\22\3\0\6\22\1\0\14\22\1\105"+
    "\13\22\21\0\3\22\3\0\6\22\1\0\6\22\1\164"+
    "\21\22\21\0\3\22\3\0\6\22\1\0\21\22\1\120"+
    "\6\22\21\0\3\235\63\0\3\235\4\0\1\43\10\0"+
    "\1\43\1\0\1\43\41\0\1\123\1\0\3\236\3\0"+
    "\2\202\1\252\1\0\1\126\2\0\4\202\1\252\1\202"+
    "\4\0\1\126\32\0\1\207\1\253\1\137\1\0\3\213"+
    "\3\0\3\142\1\0\1\63\2\0\6\142\4\0\1\63"+
    "\33\0\1\56\2\0\3\67\3\0\6\67\1\0\30\67"+
    "\21\0\3\22\3\0\6\22\1\0\14\22\1\254\13\22"+
    "\21\0\3\22\3\0\6\22\1\0\12\22\1\106\15\22"+
    "\21\0\3\22\3\0\6\22\1\0\21\22\1\255\6\22"+
    "\21\0\3\22\3\0\6\22\1\0\5\22\1\105\22\22"+
    "\21\0\3\22\3\0\6\22\1\0\2\22\1\105\25\22"+
    "\21\0\3\22\3\0\6\22\1\0\7\22\1\105\20\22"+
    "\21\0\3\22\3\0\6\22\1\0\4\22\1\246\23\22"+
    "\15\0\2\234\1\123\1\0\3\236\3\0\3\202\1\0"+
    "\1\126\2\0\6\202\4\0\1\126\36\0\3\22\3\0"+
    "\6\22\1\0\22\22\1\151\5\22\21\0\3\22\3\0"+
    "\6\22\1\0\4\22\1\104\23\22\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8694];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;
    int j = offset;
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\31\1\1\11\1\0\3\1"+
    "\1\0\5\1\1\11\1\0\2\1\1\0\1\1\2\0"+
    "\33\1\3\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\2\1\2\0\1\11\2\0\36\1\1\11\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\22\1\1\0\2\1\1\11\16\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;
    int j = offset;
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private java.io.Reader zzReader;

  private int zzState;

  private int zzLexicalState = YYINITIAL;

  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  private int zzMarkedPos;

  private int zzCurrentPos;

  private int zzStartRead;

  private int zzEndRead;

  private boolean zzAtEOF;

  private int zzFinalHighSurrogate = 0;

  private int yyline;

  @SuppressWarnings("unused")
  private int yycolumn;

  @SuppressWarnings("unused")
  private long yychar;

  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  @SuppressWarnings("unused")
  private boolean zzEOFDone;

    TokenList tokenList = TokenList.getInstance();
    ErrorList errorList = ErrorList.getInstance();

  public SimpleLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  private boolean zzRefill() throws java.io.IOException {

    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {
          int c = zzReader.read();
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      return false;
    }

    return true;
  }

  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;
    zzEndRead = zzStartRead;

    if (zzReader != null) {
      zzReader.close();
    }
  }

  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

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

  public final boolean yyatEOF() {
    return zzAtEOF;
  }

  public final int yystate() {
    return zzLexicalState;
  }

  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }

  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }

  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }

  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }

  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }

  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }

  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
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
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
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

      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { errorList.insertError(ERROR, "Desconocido -> " + yytext(),  yyline);
            }
            case 18: break;
          case 2:
            { /* ignore */
            }
            case 19: break;
          case 3:
            { tokenList.insertToken(OPERADOR, yytext(), yyline);
            }
            case 20: break;
          case 4:
            { errorList.insertError(ERROR, "String no cerrado -> " + yytext(), yyline);
            }
            case 21: break;
          case 5:
            { errorList.insertError(ERROR, "Caracter invalido -> " + yytext(), yyline);
            }
            case 22: break;
          case 6:
            { tokenList.insertToken(STRING_LITERAL, yytext(), yyline);
            }
            case 23: break;
          case 7:
            { tokenList.insertToken(IDENTIFICADOR, yytext(),  yyline);
            }
            case 24: break;
          case 8:
            { errorList.insertError(ERROR, "Caracter no cerrado -> " + yytext(), yyline);
            }
            case 25: break;
          case 9:
            { errorList.insertError(ERROR, "Flotante mal formado -> " + yytext(), yyline);
            }
            case 26: break;
          case 10:
            { errorList.insertError(ERROR, "Comentario no cerrado -> " + yytext(), yyline);
            }
            case 27: break;
          case 11:
            { errorList.insertError(ERROR, "Símbolo inválido después de número -> " + yytext(), yyline);
            }
            case 28: break;
          case 12:
            { errorList.insertError(ERROR, "Octal mal formado -> " + yytext(), yyline);
            }
            case 29: break;
          case 13:
            { errorList.insertError(ERROR,"Identificador no puede empezar con un número -> " + yytext(), yyline);
            }
            case 30: break;
          case 14:
            { tokenList.insertToken(PALABRA_RESERVADA, yytext(), yyline);
            }
            case 31: break;
          case 15:
            { errorList.insertError(ERROR, "Exponente mal formado -> " + yytext(), yyline);
            }
            case 32: break;
          case 16:
            { errorList.insertError(ERROR, "Hexadecimal mal formado -> " + yytext(), yyline);
            }
            case 33: break;
          case 17:
            { errorList.insertError(ERROR, "Caracter mal formado -> " + yytext(), yyline);
            }
            case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }
}
