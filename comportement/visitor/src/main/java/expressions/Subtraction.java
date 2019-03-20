package expressions;

import walkers.ExpressionWalker;

public class Subtraction extends BinaryOperation implements Expression {

    public Subtraction(Expression left, Expression right) { super(left, right); }

    @Override public void accept(ExpressionWalker e) { e.visitSubtraction(this); }

}
