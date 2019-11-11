package walkers;

import java.util.function.IntConsumer;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class Evaluator implements ExpressionWalker<Integer> {

	private IntConsumer consumer;
	private int memory;

	@Override
	public void visit(Literal literal) {
		consumer.accept(literal.getValue());
	}

	@Override
	public void enter(Addition a) {
		this.consumer = i -> memory = i;
	}

	@Override
	public void visit(Addition a) {
		this.consumer = i -> memory += i;
	}

	@Override
	public void enter(Subtraction s) {
		this.consumer = i -> memory = i;
	}

	@Override
	public void visit(Subtraction s) {
		this.consumer = i -> memory -= i;
	}

	@Override
	public Integer getResult() {
		return memory;
	}
}
