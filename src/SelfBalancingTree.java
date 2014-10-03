public abstract class SelfBalancingTree extends BinaryTree {

	private BinaryTreeVertex localRoot;
	private BinaryTreeVertex leftChild;
	private BinaryTreeVertex rightChild;

	// public Vertex getLocalRoot() {
	// return localRoot;
	// }
	//
	// public void setLocalRoot(Vertex localRoot) {
	// this.localRoot = localRoot;
	// }
	//
	// public Vertex getLeftChild() {
	// return leftChild;
	// }
	//
	// public void setLeftChild(Vertex leftChild) {
	// this.leftChild = leftChild;
	// }
	//
	// public Vertex getRightChild() {
	// return rightChild;
	// }
	//
	// public void setRightChild(Vertex rightChild) {
	// this.rightChild = rightChild;
	// }

	public BinaryTreeVertex rightRotate(BinaryTreeVertex n) {
		BinaryTreeVertex rightChild = n.getLeftChild();
		n.setLeftChild(leftChild.getRightChild());
		leftChild.setRightChild(n);
		return n;

	}

	public BinaryTreeVertex leftRotate(BinaryTreeVertex n) {
		BinaryTreeVertex leftChild = n.getRightChild();
		n.setRightChild(rightChild.getLeftChild());
		rightChild.setLeftChild(n);
		return n;

	}
}
