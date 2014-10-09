import java.util.Scanner;

public class RedBlackTree extends SelfBalancingTree {

	private RedBlackTreeVertex vertexY;
	private RedBlackTreeVertex vertexX;
	private RedBlackTreeVertex root;
	private RedBlackTreeVertex head;

	public RedBlackTree() {
		super();
		head = null;

	}

	public void setRoot(RedBlackTreeVertex root) {
		this.root = root;
	}

	public void rotateLeft(RedBlackTreeVertex nodeX) {
		vertexY = (RedBlackTreeVertex) nodeX.getRightChild();
		nodeX.setRightChild(vertexX.getLeftChild());
		if (vertexY.getLeftChild() != this.head) {
			vertexY = (RedBlackTreeVertex) vertexY.getLeftChild().getParent();
			vertexY = nodeX;
		}
		vertexY.setParent(nodeX.getParent());
		if (nodeX.getParent() == this.head) {
			this.root = vertexY;
		} else if (nodeX == nodeX.getParent().getLeftChild()) {
			nodeX = (RedBlackTreeVertex) nodeX.getParent().getLeftChild();
			nodeX = vertexY;
		} else {
			nodeX = (RedBlackTreeVertex) nodeX.getParent().getRightChild();
			nodeX = vertexY;
		}
		vertexY.setLeftChild(nodeX);
		nodeX.setParent(vertexY);

	}

	public void rotateRight(RedBlackTreeVertex nodeY) {
		vertexX = (RedBlackTreeVertex) nodeY.getRightChild();
		nodeY.setRightChild(vertexX.getLeftChild());
		if (vertexX.getLeftChild() != this.head) {
			vertexX = (RedBlackTreeVertex) vertexX.getLeftChild().getParent();
			vertexX = nodeY;
		}
		vertexX.setParent(nodeY.getParent());
		if (nodeY.getParent() == this.head) {
			this.root = vertexX;
		} else if (nodeY == nodeY.getParent().getLeftChild()) {
			nodeY = (RedBlackTreeVertex) nodeY.getParent().getLeftChild();
			nodeY = vertexX;
		} else {
			nodeY = (RedBlackTreeVertex) nodeY.getParent().getRightChild();
			nodeY = vertexX;
		}
		vertexX.setLeftChild(nodeY);
		nodeY.setParent(vertexX);
	}

	public void rbInsert(RedBlackTreeVertex nodeZ) {
		vertexY = this.head;
		vertexX = this.root;
		while (vertexX != this.head) {
			vertexY = vertexX;
			if (nodeZ.getVertexVal() < vertexX.getVertexVal())
				vertexX = (RedBlackTreeVertex) vertexX.getLeftChild();
			else
				vertexX = (RedBlackTreeVertex) vertexX.getRightChild();
			nodeZ.setParent(vertexY.getLeftChild());
		}
		if (vertexY == this.head)
			this.root = nodeZ;
		else if (nodeZ.getVertexVal() < vertexY.getVertexVal())
			vertexY.setLeftChild(nodeZ.getLeftChild());
		else
			vertexY.setRightChild(nodeZ.getRightChild());
		nodeZ.setLeftChild(this.head);
		nodeZ.setRightChild(this.head);
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
					rotateLeft(nodeZ);

				}
				((RedBlackTreeVertex) nodeZ.getParent()).isBlack();
				((RedBlackTreeVertex) nodeZ.getParent().getParent()).isRed();
				rotateRight((RedBlackTreeVertex) nodeZ.getParent().getParent());
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
					rotateRight(nodeZ);
				}
				((RedBlackTreeVertex) nodeZ.getParent()).isBlack();
				((RedBlackTreeVertex) nodeZ.getParent().getParent()).isRed();
				rotateLeft((RedBlackTreeVertex) nodeZ.getParent().getParent());
			}

		}
		this.root.isBlack();
	}

	@Override
	public String toString() {
		return "Red Black Tree [root=" + root + ", vertexY=" + vertexY
				+ ", vertexX=" + vertexX + "]";
	}

//	public static void printRBTree(RedBlackTreeVertex n) {
//		if (n != head) {
//			printTree(n.getLeftChild());
//			System.out.println(n.getVertexVal());
//			printTree(n.getRightChild());
//		}
//	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		RedBlackTree rbt = new RedBlackTree();

		System.out.println("Red Black Tree Test");

		RedBlackTreeVertex testNode = null;
		
//		for(int i = 1; i <=5; i++)
//		rbt.rbInsert(testNode, i );

	}
}
