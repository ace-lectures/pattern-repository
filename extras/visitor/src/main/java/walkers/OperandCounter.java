package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class OperandCounter implements ExpressionWalker<Integer> {

	private int counter = 0;

	@Override
	public void visit(Literal literal) {
		counter++;
	}

	@Override
	public void visit(Addition addition) {
	}

	@Override
	public void visit(Subtraction subtraction) {
	}

	@Override
	public Integer getResult() {
		return counter;
	}
}
