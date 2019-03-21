package walkers;

import java.util.function.IntConsumer;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class Evaluator implements ExpressionWalker<Integer> {

	private IntConsumer consumer;
	private int memory;

	@Override
	public void visitLiteral(Literal literal) {
		consumer.accept(literal.getValue());
	}

	@Override
	public void enterAddition(Addition a) {
		this.consumer = i -> memory = i;
	}

	@Override
	public void visitAddition(Addition a) {
		this.consumer = i -> memory += i;
	}

	@Override
	public void enterSubtraction(Subtraction s) {
		this.consumer = i -> memory = i;
	}

	@Override
	public void visitSubtraction(Subtraction s) {
		this.consumer = i -> memory -= i;
	}

	@Override
	public Integer getResult() {
		return memory;
	}
}
