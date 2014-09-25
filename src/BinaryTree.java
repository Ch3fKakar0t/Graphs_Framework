public class BinaryTree extends Graph {

	private BinaryTreeVertex root;
	private BinaryTreeVertex vertexY;
	private BinaryTreeVertex vertexX;

	public BinaryTree() {
		super();
	}

	public BinaryTreeVertex getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeVertex root) {
		this.root = root;
	}

	public BinaryTreeVertex iterativeTreeSearch(BinaryTreeVertex x, int k) {
		while (x != null && k != x.getVertexVal()) {
			if (k < x.getVertexVal())
				x = x.getLeftChild();
			else
				x = x.getRightChild();
		}
		return x;
	}

	public BinaryTreeVertex recursiveTreeSearch(BinaryTreeVertex x, int k) {
		if (x == null || k == x.getVertexVal())
			return x;
		if (k < x.getVertexVal())
			return recursiveTreeSearch(x.getLeftChild(), k);
		else
			return recursiveTreeSearch(x.getRightChild(), k);
	}

	public void treeInsert(BinaryTreeVertex nodeZ) {
		vertexY = null;
		vertexX = this.root;
		while (vertexX != null) {
			vertexY = vertexX;
			if (nodeZ.getVertexVal() < vertexX.getVertexVal())
				vertexX = vertexX.getLeftChild();
			else
				vertexX = vertexX.getRightChild();
			nodeZ = nodeZ.getParent();
			nodeZ = vertexY;
		}
		if (vertexY == null)
			this.root = nodeZ;
		else if (nodeZ.getVertexVal() < vertexY.getVertexVal()) {
			vertexY = vertexY.getLeftChild();
			nodeZ = vertexY;
		} else {
			vertexY = vertexY.getRightChild();
			vertexY = nodeZ;
		}

	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + ", vertexY=" + vertexY
				+ ", vertexX=" + vertexX + "]";
	}

	public void treeTransplant(BinaryTreeVertex u, BinaryTreeVertex v) {
		if (u.getParent() == null)
			this.root = v;
		else if (u == u.getParent().getLeftChild()) {
			u = u.getParent().getLeftChild();
			u = v;
		} else {
			u = u.getParent().getRightChild();
			u = v;
		}
		if (v != null) {
			v = v.getParent();
			u = u.getParent();
			v = u;
		}

	}

	public BinaryTreeVertex treeMinimum(BinaryTreeVertex x) {
		while (x.getLeftChild() != null)
			x = x.getLeftChild();
		return x;
	}

	public void treeDelete(BinaryTreeVertex z) {
		if (z.getLeftChild() == null)
			treeTransplant(z, z.getRightChild());
		else if (z.getRightChild() == null)
			treeTransplant(z, z.getLeftChild());
		else {
			vertexY = treeMinimum(z.getRightChild());
			if (vertexY.getParent() != z) {
				treeTransplant(vertexY, vertexY.getRightChild());
//				vertexY = vertexY.getRightChild();
//				z = z.getRightChild();
//				vertexY = z;
				vertexY.setLeftChild(z.getLeftChild());
				vertexY = vertexY.getRightChild().getParent();
			}
			treeTransplant(z, vertexY);
//			vertexY = vertexY.getLeftChild();
//			z = z.getLeftChild();
//			vertexY = z;
			vertexY.setLeftChild(z.getLeftChild());
			vertexY = vertexY.getLeftChild().getParent();
		}
	}
	
	public void inorderTreeWalk(BinaryTreeVertex x){
		if (x != null){
			inorderTreeWalk(x.getLeftChild());
			System.out.println(" " + x);
			inorderTreeWalk(x.getRightChild());
		}
	}
	
	// tried to get it to print out the tree	
	public void printTree(BinaryTreeVertex x){
		if(x != null){
			printTree(x.getLeftChild());
			printTree(x.getRightChild());
			
			if(x.getLeftChild() == null && x.getRightChild() == null){
				System.out.println(x.getVertexVal());
			}
		}
	}
	}
		
	

	


