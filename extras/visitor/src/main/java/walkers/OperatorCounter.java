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
    }

    @Override
    public void visitSubtraction(Subtraction subtraction) {
        counter++;
    }

    @Override
    public Integer getResult() { return counter; }
}
