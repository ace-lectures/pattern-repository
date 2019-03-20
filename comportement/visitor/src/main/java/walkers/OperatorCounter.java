package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class OperatorCounter implements ExpressionWalker<Integer> {

    private int counter = 0;

    @Override
    public void visitLiteral(Literal literal) { }

    @Override
    public void visitAddition(Addition addition) {
        counter++;
        addition.getLeft().accept(this);
        addition.getRight().accept(this);
    }

    @Override
    public void visitSubtraction(Subtraction subtraction) {
        counter++;
        subtraction.getLeft().accept(this);
        subtraction.getRight().accept(this);
    }

    @Override
    public Integer getResult() { return counter; }
}
