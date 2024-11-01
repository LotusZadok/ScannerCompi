
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.compi.scanner;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/**
 * CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
 */
@SuppressWarnings({ "rawtypes" })
public class Sintax extends java_cup.runtime.lr_parser {

  public final Class getSymbolContainer() {
    return sym.class;
  }

  /** Default constructor. */
  @Deprecated
  public Sintax() {
    super();
  }

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintax(java_cup.runtime.Scanner s) {
    super(s);
  }

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
    super(s, sf);
  }

  /** Production table. */
  protected static final short _production_table[][] = unpackFromStrings(new String[] {
      "\000\010\000\002\002\004\000\002\002\003\000\002\002" +
          "\003\000\002\002\003\000\002\003\003\000\002\004\006" +
          "\000\002\006\005\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {
    return _production_table;
  }

  /** Parse-action table. */
  protected static final short[][] _action_table = unpackFromStrings(new String[] {
      "\000\017\000\006\007\010\034\005\001\002\000\004\002" +
          "\ufffd\001\002\000\004\047\020\001\002\000\004\002\000" +
          "\001\002\000\004\002\uffff\001\002\000\004\034\014\001" +
          "\002\000\004\002\ufffe\001\002\000\004\002\013\001\002" +
          "\000\004\002\001\001\002\000\004\033\015\001\002\000" +
          "\004\046\ufffa\001\002\000\004\046\017\001\002\000\004" +
          "\002\ufffc\001\002\000\004\046\021\001\002\000\004\002" +
          "\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {
    return _action_table;
  }

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = unpackFromStrings(new String[] {
      "\000\017\000\014\002\011\003\005\004\006\005\010\006" +
          "\003\001\001\000\002\001\001\000\002\001\001\000\002" +
          "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
          "\001\000\002\001\001\000\002\001\001\000\004\007\015" +
          "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
          "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {
    return _reduce_table;
  }

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions() {
    action_obj = new CUP$Sintax$actions(this);
  }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
      int act_num,
      java_cup.runtime.lr_parser parser,
      java.util.Stack stack,
      int top)
      throws java.lang.Exception {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {
    return 0;
  }

  /** Indicates start production. */
  public int start_production() {
    return 0;
  }

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {
    return 0;
  }

  /** <code>error</code> Symbol index. */
  public int error_sym() {
    return 1;
  }

  private Symbol s;

  public void syntax_error(Symbol s) {
    System.err.println("Error de sintaxis en línea " + s.left + ", columna " + s.right + ": " + s.value);
  }

  public Symbol getS() {
    return this.s;
  }

  /** Cup generated class to encapsulate user supplied action code. */
  @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
  class CUP$Sintax$actions {
    private final Sintax parser;

    /** Constructor */
    CUP$Sintax$actions(Sintax parser) {
      this.parser = parser;
    }

    /** Method 0 with the actual generated action code for actions 0 to 300. */
    public final java_cup.runtime.Symbol CUP$Sintax$do_action_part00000000(
        int CUP$Sintax$act_num,
        java_cup.runtime.lr_parser CUP$Sintax$parser,
        java.util.Stack CUP$Sintax$stack,
        int CUP$Sintax$top)
        throws java.lang.Exception {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num) {
        /* . . . . . . . . . . . . . . . . . . . . */
        case 0: // $START ::= INICIO EOF
        {
          Object RESULT = null;
          int start_valleft = ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top - 1)).left;
          int start_valright = ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top - 1)).right;
          Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top - 1)).value;
          RESULT = start_val;
          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START", 0,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top - 1)),
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), RESULT);
        }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 1: // INICIO ::= GLOBAL
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO", 0,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()),
              RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 2: // INICIO ::= CONSTANTE
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO", 0,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()),
              RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 3: // INICIO ::= FUNCIONES
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO", 0,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()),
              RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 4: // GLOBAL ::= DECLARACION
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("GLOBAL", 1,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()),
              RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 5: // CONSTANTE ::= Const Tipo_dato ASIGNACION P_coma
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONSTANTE", 2,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top - 3)),
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 6: // DECLARACION ::= Tipo_dato Identificador P_coma
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION", 4,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top - 2)),
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . . . . . . . . . . . . . . . */
        case 7: // ASIGNACION ::= Comillas
        {
          Object RESULT = null;

          CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION", 5,
              ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()),
              RESULT);
        }
          return CUP$Sintax$result;

        /* . . . . . . */
        default:
          throw new Exception(
              "Invalid action number " + CUP$Sintax$act_num + "found in internal parse table");

      }
    } /* end of method */

    /** Method splitting the generated action code into several parts. */
    public final java_cup.runtime.Symbol CUP$Sintax$do_action(
        int CUP$Sintax$act_num,
        java_cup.runtime.lr_parser CUP$Sintax$parser,
        java.util.Stack CUP$Sintax$stack,
        int CUP$Sintax$top)
        throws java.lang.Exception {
      return CUP$Sintax$do_action_part00000000(
          CUP$Sintax$act_num,
          CUP$Sintax$parser,
          CUP$Sintax$stack,
          CUP$Sintax$top);
    }
  }

}
