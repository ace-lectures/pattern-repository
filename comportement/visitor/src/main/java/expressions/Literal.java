package expressions;

import walkers.ExpressionWalker;

public class Literal implements Expression  {

    private int value;

    public Literal(int value) { this.value = value; }

    public int getValue() { return value; }

    @Override public void accept(ExpressionWalker e) { e.visitLiteral(this); }

}
