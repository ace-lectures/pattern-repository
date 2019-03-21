package walkers;

import expressions.Addition;
import expressions.Literal;
import expressions.Subtraction;

public class PrettyPrinter implements ExpressionWalker<String> {

	private StringBuilder buffer = new StringBuilder();

    @Override
    public void visitLiteral(Literal literal) {
        buffer.append(literal.getValue());
    }

    @Override
	public void enterAddition(Addition addition) {
    	buffer.append("(");
	}

    @Override
    public void visitAddition(Addition addition) {
        buffer.append( " + ");
    }

	@Override
	public void exitAddition(Addition addition) {
		buffer.append(")");
	}

	@Override
	public void enterSubtraction(Subtraction subtraction) {
		buffer.append("(");
	}

    @Override
    public void visitSubtraction(Subtraction subtraction) {
        buffer.append( " - ");
    }

	@Override
	public void exitSubtraction(Subtraction subtraction) {
		buffer.append(")");
	}

    @Override
    public String getResult() { return buffer.toString(); }
}
