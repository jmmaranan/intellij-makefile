/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package name.kropp.intellij.makefile;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static name.kropp.intellij.makefile.psi.MakefileTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>MakefileLexer.flex</tt>
 */
public class _MakefileLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PREREQUISITES = 2;
  public static final int INCLUDES = 4;
  public static final int COMMANDS = 6;
  public static final int VARIABLE = 8;
  public static final int DEFINE = 10;
  public static final int DEFINEBODY = 12;
  public static final int CONDITIONALS = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\1\2\0\1\1\22\0\1\2\1\11\1\0\1\4\7\0\1\11\1\0\1\21\14\0\1\5\1\6"+
    "\1\0\1\10\1\0\1\11\41\0\1\33\1\0\1\14\1\17\1\20\1\23\2\0\1\12\2\0\1\15\1\0"+
    "\1\13\1\25\1\31\1\24\1\27\1\22\1\32\1\16\1\26\1\0\1\30\3\0\1\7\203\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\10\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\7\1\1\10\1\7\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\7\1\17\1\7\2\20\1\21\1\0\12\1"+
    "\1\0\1\20\12\1\1\20\3\1\1\22\3\1\1\23"+
    "\3\1\1\20\2\1\1\24\2\1\1\25\3\1\1\26"+
    "\1\1\1\27\1\1\1\30\1\31\2\1\1\32\2\1"+
    "\1\33\1\34\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[96];
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
    "\0\0\0\34\0\70\0\124\0\160\0\214\0\250\0\304"+
    "\0\340\0\374\0\u0118\0\u0134\0\u0150\0\u016c\0\u0188\0\u01a4"+
    "\0\u01c0\0\u01dc\0\u01f8\0\u0214\0\u0230\0\u024c\0\u0268\0\u0284"+
    "\0\u0188\0\340\0\340\0\u02a0\0\u02bc\0\u02d8\0\u02f4\0\u0310"+
    "\0\u0188\0\u032c\0\u0348\0\u0364\0\u0380\0\u01a4\0\u039c\0\u03b8"+
    "\0\u03d4\0\u03f0\0\u040c\0\u0428\0\u0444\0\u0460\0\u047c\0\u0498"+
    "\0\u032c\0\u04b4\0\u04d0\0\u04ec\0\u0508\0\u0524\0\u0540\0\u055c"+
    "\0\u0578\0\u0594\0\u05b0\0\u05cc\0\u05e8\0\u0604\0\u0620\0\u063c"+
    "\0\340\0\u0658\0\u0674\0\u0690\0\340\0\u06ac\0\u06c8\0\u06e4"+
    "\0\u0700\0\u071c\0\u0738\0\340\0\u0754\0\u0770\0\340\0\u078c"+
    "\0\u07a8\0\u07c4\0\u0348\0\u07e0\0\340\0\u07fc\0\340\0\340"+
    "\0\u0818\0\u0834\0\340\0\u0850\0\u086c\0\340\0\340\0\340";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[96];
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
    "\1\11\1\12\1\13\1\14\1\15\1\16\2\11\1\17"+
    "\1\20\1\21\3\11\1\22\1\23\1\24\2\25\2\11"+
    "\1\26\3\11\1\27\3\11\1\30\2\13\1\11\1\31"+
    "\1\32\1\33\2\31\23\11\1\30\2\13\1\11\1\31"+
    "\2\11\2\31\22\11\1\34\1\31\32\34\1\35\1\36"+
    "\32\35\1\11\1\37\2\13\1\11\1\40\2\11\1\41"+
    "\1\42\22\11\1\43\1\12\16\43\1\44\13\43\1\45"+
    "\1\36\2\13\1\45\1\31\2\45\2\31\22\45\1\11"+
    "\3\0\1\11\1\0\2\11\2\0\22\11\1\0\1\12"+
    "\34\0\2\13\32\0\1\13\1\14\30\0\1\15\1\0"+
    "\32\15\5\0\1\46\2\0\1\17\67\0\1\17\23\0"+
    "\1\11\3\0\1\11\1\0\2\11\2\0\1\11\1\47"+
    "\7\11\1\50\11\11\3\0\1\11\1\0\2\11\2\0"+
    "\1\11\1\51\21\11\3\0\1\11\1\0\2\11\2\0"+
    "\6\11\1\52\14\11\3\0\1\11\1\0\2\11\2\0"+
    "\1\11\1\53\1\11\1\54\12\11\1\55\4\11\3\0"+
    "\1\11\1\0\2\11\2\0\1\56\22\11\3\0\1\11"+
    "\1\0\2\11\2\0\14\11\1\57\6\11\3\0\1\11"+
    "\1\0\2\11\2\0\15\11\1\60\4\11\1\0\1\30"+
    "\32\0\1\34\1\0\32\34\1\35\1\0\32\35\1\0"+
    "\1\36\33\0\1\37\37\0\1\61\2\0\1\41\33\0"+
    "\1\41\23\0\1\43\1\0\33\43\1\0\11\43\1\62"+
    "\20\43\1\45\3\0\1\45\1\0\2\45\2\0\22\45"+
    "\1\11\3\0\1\11\1\0\2\11\2\0\2\11\1\63"+
    "\20\11\3\0\1\11\1\0\2\11\2\0\1\11\1\64"+
    "\4\11\1\65\14\11\3\0\1\11\1\0\2\11\2\0"+
    "\5\11\1\66\15\11\3\0\1\11\1\0\2\11\2\0"+
    "\11\11\1\67\11\11\3\0\1\11\1\0\2\11\2\0"+
    "\5\11\1\70\15\11\3\0\1\11\1\0\2\11\2\0"+
    "\10\11\1\71\12\11\3\0\1\11\1\0\2\11\2\0"+
    "\17\11\1\72\3\11\3\0\1\11\1\0\2\11\2\0"+
    "\1\11\1\47\21\11\3\0\1\11\1\0\2\11\2\0"+
    "\6\11\1\73\14\11\3\0\1\11\1\0\2\11\2\0"+
    "\1\74\21\11\1\43\1\0\15\43\1\75\14\43\1\11"+
    "\3\0\1\11\1\0\2\11\2\0\3\11\1\76\17\11"+
    "\3\0\1\11\1\0\2\11\2\0\5\11\1\77\1\100"+
    "\14\11\3\0\1\11\1\0\2\11\2\0\12\11\1\101"+
    "\10\11\3\0\1\11\1\0\2\11\2\0\6\11\1\102"+
    "\14\11\3\0\1\11\1\0\2\11\2\0\1\103\22\11"+
    "\3\0\1\11\1\0\2\11\2\0\1\104\22\11\3\0"+
    "\1\11\1\0\2\11\2\0\6\11\1\105\14\11\3\0"+
    "\1\11\1\0\2\11\2\0\13\11\1\106\7\11\3\0"+
    "\1\11\1\0\2\11\2\0\15\11\1\107\5\11\3\0"+
    "\1\11\1\0\2\11\2\0\14\11\1\110\5\11\1\43"+
    "\1\0\16\43\1\111\13\43\1\11\3\0\1\11\1\0"+
    "\2\11\2\0\4\11\1\112\16\11\3\0\1\11\1\0"+
    "\2\11\2\0\6\11\1\113\14\11\3\0\1\11\1\0"+
    "\2\11\2\0\12\11\1\114\10\11\3\0\1\11\1\0"+
    "\2\11\2\0\11\11\1\115\11\11\3\0\1\11\1\0"+
    "\2\11\2\0\1\11\1\116\21\11\3\0\1\11\1\0"+
    "\2\11\2\0\11\11\1\117\11\11\3\0\1\11\1\0"+
    "\2\11\2\0\15\11\1\120\5\11\3\0\1\11\1\0"+
    "\2\11\2\0\15\11\1\121\5\11\3\0\1\11\1\0"+
    "\2\11\2\0\21\11\1\122\1\43\1\0\21\43\1\123"+
    "\10\43\1\11\3\0\1\11\1\0\2\11\2\0\5\11"+
    "\1\124\15\11\3\0\1\11\1\0\2\11\2\0\11\11"+
    "\1\125\11\11\3\0\1\11\1\0\2\11\2\0\1\126"+
    "\22\11\3\0\1\11\1\0\2\11\2\0\6\11\1\127"+
    "\14\11\3\0\1\11\1\0\2\11\2\0\20\11\1\130"+
    "\2\11\3\0\1\11\1\0\2\11\2\0\1\131\22\11"+
    "\3\0\1\11\1\0\2\11\2\0\20\11\1\132\2\11"+
    "\3\0\1\11\1\0\2\11\2\0\6\11\1\133\14\11"+
    "\3\0\1\11\1\0\2\11\2\0\1\11\1\134\21\11"+
    "\3\0\1\11\1\0\2\11\2\0\5\11\1\135\15\11"+
    "\3\0\1\11\1\0\2\11\2\0\6\11\1\136\14\11"+
    "\3\0\1\11\1\0\2\11\2\0\6\11\1\137\14\11"+
    "\3\0\1\11\1\0\2\11\2\0\6\11\1\140\13\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2184];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\10\0\6\1\1\11\11\1\1\11\7\1\1\11\4\1"+
    "\1\0\12\1\1\0\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[96];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _MakefileLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MakefileLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        switch (zzLexicalState) {
            case PREREQUISITES: {
              yypushback(yylength()); yybegin(YYINITIAL); return EOL;
            }
            case 97: break;
            case INCLUDES: {
              yypushback(yylength()); yybegin(YYINITIAL); return EOL;
            }
            case 98: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return IDENTIFIER;
            }
          case 30: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 31: break;
          case 3: 
            { yybegin(COMMANDS); return WHITE_SPACE;
            }
          case 32: break;
          case 4: 
            { return COMMENT;
            }
          case 33: break;
          case 5: 
            { yybegin(PREREQUISITES); return COLON;
            }
          case 34: break;
          case 6: 
            { yybegin(VARIABLE); return ASSIGN;
            }
          case 35: break;
          case 7: 
            { return BAD_CHARACTER;
            }
          case 36: break;
          case 8: 
            { yybegin(YYINITIAL); return EOL;
            }
          case 37: break;
          case 9: 
            { yybegin(COMMANDS); return SEMICOLON;
            }
          case 38: break;
          case 10: 
            { return PIPE;
            }
          case 39: break;
          case 11: 
            { yybegin(YYINITIAL); return COMMAND;
            }
          case 40: break;
          case 12: 
            { return VARIABLE_VALUE;
            }
          case 41: break;
          case 13: 
            { yybegin(YYINITIAL); return WHITE_SPACE;
            }
          case 42: break;
          case 14: 
            { yybegin(DEFINEBODY); return WHITE_SPACE;
            }
          case 43: break;
          case 15: 
            { return ASSIGN;
            }
          case 44: break;
          case 16: 
            { return VARIABLE_VALUE_LINE;
            }
          case 45: break;
          case 17: 
            { yybegin(YYINITIAL); return CONDITION;
            }
          case 46: break;
          case 18: 
            { yybegin(CONDITIONALS); return KEYWORD_IFEQ;
            }
          case 47: break;
          case 19: 
            { return KEYWORD_ELSE;
            }
          case 48: break;
          case 20: 
            { yybegin(CONDITIONALS); return KEYWORD_IFNEQ;
            }
          case 49: break;
          case 21: 
            { return KEYWORD_ENDIF;
            }
          case 50: break;
          case 22: 
            { yybegin(YYINITIAL); return KEYWORD_ENDEF;
            }
          case 51: break;
          case 23: 
            { yybegin(CONDITIONALS); return KEYWORD_IFNDEF;
            }
          case 52: break;
          case 24: 
            { yybegin(DEFINE); return KEYWORD_DEFINE;
            }
          case 53: break;
          case 25: 
            { return KEYWORD_EXPORT;
            }
          case 54: break;
          case 26: 
            { yybegin(INCLUDES); return KEYWORD_INCLUDE;
            }
          case 55: break;
          case 27: 
            { return KEYWORD_PRIVATE;
            }
          case 56: break;
          case 28: 
            { yybegin(INCLUDES); return KEYWORD_UNDEFINE;
            }
          case 57: break;
          case 29: 
            { return KEYWORD_OVERRIDE;
            }
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
