package expressions;

public abstract class BinaryOperation {

	private Expression left;
	private Expression right;

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	public BinaryOperation(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

}
