public class RedBlackTree extends SelfBalancingTree {

	private RedBlackTreeVertex vertexY;
	private RedBlackTreeVertex vertexX;
	private RedBlackTreeVertex root;

	public RedBlackTree() {
		super();

	}

	public void setRoot(RedBlackTreeVertex root) {
		this.root = root;
	}

	public void rbInsert(RedBlackTreeVertex nodeZ) {
		vertexY = null;
		vertexX = this.root;
		while (vertexX != null) {
			vertexY = vertexX;
			if (nodeZ.getVertexVal() < vertexX.getVertexVal())
				vertexX = (RedBlackTreeVertex) vertexX.getLeftChild();
			else
				vertexX = (RedBlackTreeVertex) vertexX.getRightChild();
			nodeZ.setParent(vertexY.getLeftChild());
		}
		if (vertexY == null)
			this.root = nodeZ;
		else if (nodeZ.getVertexVal() < vertexY.getVertexVal())
			vertexY.setLeftChild(nodeZ.getLeftChild());
		else
			vertexY.setRightChild(nodeZ.getRightChild());
		nodeZ.setLeftChild(null);
		nodeZ.setRightChild(null);
		nodeZ.isRed();
		rbInsertFixUp(nodeZ);
	}

	public void rbInsertFixUp(RedBlackTreeVertex nodeZ) {

		while (((RedBlackTreeVertex) nodeZ.getParent()).isRed()) {
			if (nodeZ.getParent() == nodeZ.getParent().getParent()
					.getLeftChild()) {
				vertexY = (RedBlackTreeVertex) nodeZ.getParent().getParent()
						.getRightChild();
				if (vertexY.isRed()) {
					((RedBlackTreeVertex) nodeZ.getParent()).isBlack();
					vertexY.isBlack();
					((RedBlackTreeVertex) nodeZ.getParent().getParent())
							.isRed();
					nodeZ.setParent(nodeZ.getParent().getParent());
				} else if (nodeZ == nodeZ.getParent().getRightChild()) {
					nodeZ.setParent(nodeZ.getParent());

					leftRotate(nodeZ);
				}
				((RedBlackTreeVertex) nodeZ.getParent()).isBlack();
				((RedBlackTreeVertex) nodeZ.getParent().getParent()).isRed();
				rightRotate(nodeZ.getParent().getParent());
			} else {
				vertexY = (RedBlackTreeVertex) nodeZ.getParent().getParent()
						.getLeftChild();
				if (vertexY.isRed()) {
					((RedBlackTreeVertex) nodeZ.getParent()).isBlack();
					vertexY.isBlack();
					((RedBlackTreeVertex) nodeZ.getParent().getParent())
							.isRed();
					nodeZ.setParent(nodeZ.getParent().getParent());
				} else if (nodeZ == nodeZ.getParent().getLeftChild()) {
					nodeZ.setParent(nodeZ.getParent());
					rightRotate(nodeZ);
				}
				((RedBlackTreeVertex) nodeZ.getParent()).isBlack();
				((RedBlackTreeVertex) nodeZ.getParent().getParent()).isRed();
				leftRotate(nodeZ.getParent().getParent());
			}

		}
		this.root.isBlack();
	}
}
