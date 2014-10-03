public class AVLTree extends SelfBalancingTree {

	private AVLVertex root;
	private BinaryTreeVertex roRoot;

	public AVLTree() {
		super();

	}

	@Override
	public void treeInsert(BinaryTreeVertex nodeZ) {
		super.treeInsert(nodeZ);
	}

	public int height(AVLVertex x) {
		return x == null ? -1 : x.height(x);
	}

	public AVLVertex insert(int x, AVLVertex root) {
		AVLVertex newRoot = root;
		if (root == null)
			root = new AVLVertex(x);
		else if (x < root.getVertexVal()) {
			root.setLeftChild(insert(x, (AVLVertex) root.getLeftChild()));
			if (height((AVLVertex) root.getLeftChild())
					- height((AVLVertex) root.getRightChild()) == 2)
				if (x < root.getVertexVal())
					root = (AVLVertex) leftRotate(root);
		} else {
			root.height(root);
		}
		return root;
	}

	public void rebalanceLeft(AVLVertex root) {
		if (root.getVertexVal() < 0) {

		}

	}
}