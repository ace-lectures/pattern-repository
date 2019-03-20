package expressions;

import walkers.ExpressionWalker;

public interface Expression {

    void accept(ExpressionWalker e);

}
