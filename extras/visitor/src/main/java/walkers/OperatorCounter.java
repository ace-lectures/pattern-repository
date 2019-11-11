package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class OperatorCounter implements ExpressionWalker<Integer> {

	private int counter = 0;

	@Override
	public void visit(Literal literal) {
	}

	@Override
	public void visit(Addition addition) {
		counter++;
	}

	@Override
	public void visit(Subtraction subtraction) {
		counter++;
	}

	@Override
	public Integer getResult() {
		return counter;
	}
}
