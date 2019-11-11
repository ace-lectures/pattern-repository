package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class PrettyPrinter implements ExpressionWalker<String> {

	private StringBuilder buffer = new StringBuilder();

	@Override
	public void visit(Literal literal) {
		buffer.append(literal.getValue());
	}

	@Override
	public void enter(Addition addition) {
		buffer.append("(");
	}

	@Override
	public void visit(Addition addition) {
		buffer.append(" + ");
	}

	@Override
	public void exit(Addition addition) {
		buffer.append(")");
	}

	@Override
	public void enter(Subtraction subtraction) {
		buffer.append("(");
	}

	@Override
	public void visit(Subtraction subtraction) {
		buffer.append(" - ");
	}

	@Override
	public void exit(Subtraction subtraction) {
		buffer.append(")");
	}

	@Override
	public String getResult() {
		return buffer.toString();
	}
}
