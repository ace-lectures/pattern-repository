package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public interface ExpressionWalker<T> {

    void visitLiteral(Literal literal);
    void visitAddition(Addition addition);
    void visitSubtraction(Subtraction subtraction);

    T getResult();

}
