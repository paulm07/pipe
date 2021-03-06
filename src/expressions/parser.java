
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Sep 20 11:13:57 GMT+01:00 2007
//----------------------------------------------------

package expressions;

import expressions.java_cup.runtime.*;
import java.io.StringReader;
import java.math.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Sep 20 11:13:57 GMT+01:00 2007
  */
public class parser extends expressions.java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(expressions.java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(expressions.java_cup.runtime.Scanner s, expressions.java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\004\003\000\002\004\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\004\000\002\004\005\000\002\004\003\000\002" +
    "\003\005\000\002\003\005\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\004\000\002\003\005\000" +
    "\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\020\005\004\011\015\023\014\024\010\025" +
    "\012\026\007\027\011\001\002\000\012\005\004\011\041" +
    "\026\007\027\011\001\002\000\032\002\001\004\027\005" +
    "\025\006\034\007\032\010\035\013\037\014\033\015\031" +
    "\016\026\017\030\020\036\001\002\000\010\002\uffff\021" +
    "\021\022\022\001\002\000\040\002\ufffe\004\ufffe\005\ufffe" +
    "\006\ufffe\007\ufffe\010\ufffe\012\ufffe\013\ufffe\014\ufffe\015" +
    "\ufffe\016\ufffe\017\ufffe\020\ufffe\021\ufffe\022\ufffe\001\002" +
    "\000\012\002\uffeb\012\uffeb\021\uffeb\022\uffeb\001\002\000" +
    "\040\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6" +
    "\012\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6\017\ufff6\020" +
    "\ufff6\021\ufff6\022\ufff6\001\002\000\012\002\uffea\012\uffea" +
    "\021\uffea\022\uffea\001\002\000\004\002\060\001\002\000" +
    "\020\005\004\011\015\023\014\024\010\025\012\026\007" +
    "\027\011\001\002\000\020\005\004\011\015\023\014\024" +
    "\010\025\012\026\007\027\011\001\002\000\032\004\027" +
    "\005\025\006\034\007\032\010\035\012\043\013\037\014" +
    "\033\015\031\016\026\017\030\020\036\001\002\000\010" +
    "\012\020\021\021\022\022\001\002\000\012\002\uffec\012" +
    "\uffec\021\uffec\022\uffec\001\002\000\020\005\004\011\015" +
    "\023\014\024\010\025\012\026\007\027\011\001\002\000" +
    "\020\005\004\011\015\023\014\024\010\025\012\026\007" +
    "\027\011\001\002\000\030\004\027\005\025\006\034\007" +
    "\032\010\035\013\037\014\033\015\031\016\026\017\030" +
    "\020\036\001\002\000\012\002\uffee\012\uffee\021\uffee\022" +
    "\uffee\001\002\000\012\005\004\011\041\026\007\027\011" +
    "\001\002\000\012\005\004\011\041\026\007\027\011\001" +
    "\002\000\012\005\004\011\041\026\007\027\011\001\002" +
    "\000\012\005\004\011\041\026\007\027\011\001\002\000" +
    "\012\005\004\011\041\026\007\027\011\001\002\000\012" +
    "\005\004\011\041\026\007\027\011\001\002\000\012\005" +
    "\004\011\041\026\007\027\011\001\002\000\012\005\004" +
    "\011\041\026\007\027\011\001\002\000\012\005\004\011" +
    "\041\026\007\027\011\001\002\000\012\005\004\011\041" +
    "\026\007\027\011\001\002\000\012\005\004\011\041\026" +
    "\007\027\011\001\002\000\024\002\ufff5\004\027\005\025" +
    "\006\034\007\032\010\035\012\ufff5\021\ufff5\022\ufff5\001" +
    "\002\000\012\005\004\011\041\026\007\027\011\001\002" +
    "\000\016\004\027\005\025\006\034\007\032\010\035\012" +
    "\043\001\002\000\040\002\ufff7\004\ufff7\005\ufff7\006\ufff7" +
    "\007\ufff7\010\ufff7\012\ufff7\013\ufff7\014\ufff7\015\ufff7\016" +
    "\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\001\002\000\024" +
    "\002\ufff0\004\027\005\025\006\034\007\032\010\035\012" +
    "\ufff0\021\ufff0\022\ufff0\001\002\000\040\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\010\ufff9\012\ufff9\013\ufff9\014" +
    "\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9" +
    "\001\002\000\040\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007" +
    "\ufffb\010\035\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb" +
    "\017\ufffb\020\ufffb\021\ufffb\022\ufffb\001\002\000\024\002" +
    "\ufff4\004\027\005\025\006\034\007\032\010\035\012\ufff4" +
    "\021\ufff4\022\ufff4\001\002\000\040\002\ufffa\004\ufffa\005" +
    "\ufffa\006\ufffa\007\ufffa\010\035\012\ufffa\013\ufffa\014\ufffa" +
    "\015\ufffa\016\ufffa\017\ufffa\020\ufffa\021\ufffa\022\ufffa\001" +
    "\002\000\024\002\ufff3\004\027\005\025\006\034\007\032" +
    "\010\035\012\ufff3\021\ufff3\022\ufff3\001\002\000\024\002" +
    "\ufff1\004\027\005\025\006\034\007\032\010\035\012\ufff1" +
    "\021\ufff1\022\ufff1\001\002\000\040\002\ufffd\004\ufffd\005" +
    "\ufffd\006\034\007\032\010\035\012\ufffd\013\ufffd\014\ufffd" +
    "\015\ufffd\016\ufffd\017\ufffd\020\ufffd\021\ufffd\022\ufffd\001" +
    "\002\000\024\002\ufff2\004\027\005\025\006\034\007\032" +
    "\010\035\012\ufff2\021\ufff2\022\ufff2\001\002\000\040\002" +
    "\ufffc\004\ufffc\005\ufffc\006\034\007\032\010\035\012\ufffc" +
    "\013\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\020\ufffc\021" +
    "\ufffc\022\ufffc\001\002\000\012\002\uffef\012\uffef\021\uffef" +
    "\022\022\001\002\000\012\002\uffed\012\uffed\021\021\022" +
    "\022\001\002\000\004\002\000\001\002\000\040\002\ufff8" +
    "\004\ufff8\005\ufff8\006\034\007\032\010\035\012\ufff8\013" +
    "\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8" +
    "\022\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\010\002\012\003\005\004\004\001\001\000" +
    "\004\004\060\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\056\004\022" +
    "\001\001\000\006\003\016\004\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\055" +
    "\004\022\001\001\000\006\003\023\004\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\054\001\001" +
    "\000\004\004\053\001\001\000\004\004\052\001\001\000" +
    "\004\004\051\001\001\000\004\004\050\001\001\000\004" +
    "\004\047\001\001\000\004\004\046\001\001\000\004\004" +
    "\045\001\001\000\004\004\044\001\001\000\004\004\043" +
    "\001\001\000\004\004\037\001\001\000\002\001\001\000" +
    "\004\004\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public expressions.java_cup.runtime.Symbol do_action(
    int                        act_num,
    expressions.java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public parser(String expression, SymbolFactory sf){
            super(new Scanner(new StringReader(expression),sf),sf);
        }
        protected ExpressionInterpreter exp = new ExpressionInterpreter();
        public void setExpressionInterpreter(ExpressionInterpreter exp){
            this.exp = exp;
        }
        public Object result = null;
        public MathContext mc = new MathContext(10);

        public Double DoubleResult() throws Exception, InvalidTypeException{
            this.parse();
            if (! (result instanceof Double)) throw new InvalidTypeException();
            return ((Double) result);
        }

        public Boolean BooleanResult() throws Exception, InvalidTypeException{
            this.parse();
            if (! (result instanceof Boolean)) throw new InvalidTypeException();
            return (Boolean) result;
        }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final expressions.java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    expressions.java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      expressions.java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // bool_expr ::= FALSE 
            {
              Object RESULT =null;
		 RESULT=false; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // bool_expr ::= TRUE 
            {
              Object RESULT =null;
		 RESULT=true; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // bool_expr ::= LPAREN bool_expr RPAREN 
            {
              Object RESULT =null;
		int eleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // bool_expr ::= NOT bool_expr 
            {
              Object RESULT =null;
		int eleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=!((Boolean) e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // bool_expr ::= bool_expr OR bool_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Boolean) l) || ((Boolean)r)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // bool_expr ::= bool_expr AND bool_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Boolean) l) && ((Boolean)r)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // bool_expr ::= math_expr NE math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Double )l).doubleValue()!= ((Double) r).doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // bool_expr ::= math_expr EQ math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Double )l).doubleValue()== ((Double) r).doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // bool_expr ::= math_expr GE math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Double )l).doubleValue()>= ((Double) r).doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // bool_expr ::= math_expr LE math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Double )l).doubleValue()<= ((Double) r).doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // bool_expr ::= math_expr GT math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Double )l).doubleValue()> ((Double) r).doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // bool_expr ::= math_expr LT math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=new Boolean(((Double )l).doubleValue()< ((Double) r).doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bool_expr",1, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // math_expr ::= VAR 
            {
              Object RESULT =null;
		int vleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=parser.exp.getValue(v); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // math_expr ::= LPAREN math_expr RPAREN 
            {
              Object RESULT =null;
		int eleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // math_expr ::= MINUS math_expr 
            {
              Object RESULT =null;
		int eleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert(-((Double)e) ); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // math_expr ::= math_expr POWER math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert(Math.pow( ((Double) l) , ((Double) r))); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // math_expr ::= math_expr DIV math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert(((Double) l) / ((Double) r)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // math_expr ::= math_expr TIMES math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert(((Double) l) * ((Double) r)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // math_expr ::= math_expr MINUS math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert(((Double) l) - ((Double) r)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // math_expr ::= math_expr PLUS math_expr 
            {
              Object RESULT =null;
		int lleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int rleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert( ((Double) l) + ((Double) r) ); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // math_expr ::= NUMBER 
            {
              Object RESULT =null;
		int nleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=Converter.convert((Double)n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_expr",2, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= bool_expr 
            {
              Object RESULT =null;
		int eleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 this.parser.result=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr ::= math_expr 
            {
              Object RESULT =null;
		int eleft = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((expressions.java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 this.parser.result=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((expressions.java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

