package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class OperandCounter implements ExpressionWalker<Integer> {

    private int counter = 0;

    @Override
    public void visitLiteral(Literal literal) { counter++; }

    @Override
    public void visitAddition(Addition addition) {
    }

    @Override
    public void visitSubtraction(Subtraction subtraction) {
    }

    @Override
    public Integer getResult() { return counter; }
}
