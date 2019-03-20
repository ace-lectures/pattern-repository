import walkers.*;
import expressions.*;

public class Main {

  public static void main(String[] args) {
    // e = ((1-5) + 2) + (4 - (4+5)) = -7
    Expression e =
            new Addition(
                    new Addition(
                            new Literal(2),
                            new Subtraction(
                                    new Literal(1),
                                    new Literal(5))),
                    new Subtraction(
                            new Literal(4),
                            new Addition(
                                    new Literal(4),
                                    new Literal(5))));


    PrettyPrinter printer = new PrettyPrinter();
    e.accept(printer);
    System.out.println("Expression: " + printer.getResult());

    OperandCounter opc = new OperandCounter();
    e.accept(opc);
    System.out.println("  #Operands =  " + opc.getResult());

    OperatorCounter ops = new OperatorCounter();
    e.accept(ops);
    System.out.println("  #Operators =  " + ops.getResult());

    Evaluator eval = new Evaluator();
    e.accept(eval);
    System.out.println("Value =  " + eval.getResult());

  }

}
