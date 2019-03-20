package expressions;

import walkers.ExpressionWalker;

public class Addition extends BinaryOperation implements Expression {

    public Addition(Expression left, Expression right) { super(left, right); }

    @Override public void accept(ExpressionWalker e) { e.visitAddition(this); }

}
