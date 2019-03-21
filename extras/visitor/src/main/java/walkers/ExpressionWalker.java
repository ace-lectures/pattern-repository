package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public interface ExpressionWalker<T> {


    void visitLiteral(Literal literal);
    default void enterAddition(Addition addition) {}
    void visitAddition(Addition addition);
    default void exitAddition(Addition addition) {}
    default void enterSubtraction(Subtraction subtraction) {}
    void visitSubtraction(Subtraction subtraction);
    default void exitSubtraction(Subtraction subtraction){}
    T getResult();

}
