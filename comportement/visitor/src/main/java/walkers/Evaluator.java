package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class Evaluator implements ExpressionWalker<Integer> {

    private int memory = 0;
    private void reset() { this.memory = 0; }

    @Override
    public void visitLiteral(Literal literal) {
        this.memory = literal.getValue();
    }

    @Override
    public void visitAddition(Addition addition) {
        addition.getLeft().accept(this);
        int left = this.memory;
        reset();
        addition.getRight().accept(this);
        int right = this.memory;
        reset();
        this.memory = left + right;

    }

    @Override
    public void visitSubtraction(Subtraction subtraction) {
        subtraction.getLeft().accept(this);
        int left = this.memory;
        reset();
        subtraction.getRight().accept(this);
        int right = this.memory;
        reset();
        this.memory = left - right;
    }

    @Override
    public Integer getResult() { return memory; }
}
