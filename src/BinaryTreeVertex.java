public class BinaryTreeVertex extends Vertex {

	private BinaryTreeVertex rightChild;
	private BinaryTreeVertex leftChild;
	private BinaryTreeVertex parent;

	public BinaryTreeVertex(int vertexVal) {
		super(vertexVal);
	}

	public BinaryTreeVertex getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeVertex rightChild) {
		this.rightChild = rightChild;
	}

	public BinaryTreeVertex getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeVertex leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeVertex getParent() {
		return parent;
	}

	public void setParent(BinaryTreeVertex parent) {
		this.parent = parent;
	}

}
