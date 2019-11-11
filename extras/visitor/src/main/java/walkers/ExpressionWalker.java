package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public interface ExpressionWalker<T> {

	void visit(Literal literal);

	default void enter(Addition addition) {
	}

	void visit(Addition addition);

	default void exit(Addition addition) {
	}

	default void enter(Subtraction subtraction) {
	}

	void visit(Subtraction subtraction);

	default void exit(Subtraction subtraction) {
	}

	T getResult();

}
