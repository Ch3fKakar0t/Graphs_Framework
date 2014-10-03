
public class AVLTree extends SelfBalancingTree {

	private AVLVertex root;
	
	public AVLTree() {
		super();
		
	}


	@Override
	public void treeInsert(BinaryTreeVertex nodeZ) {
		super.treeInsert(nodeZ);
	}
	
	
	public AVLVertex insert(int x, AVLVertex root ){
		if (root == null)
			root = new AVLVertex(x);
		else if (x < root.getVertexVal()){
			root = insert(x, (AVLVertex) root.getLeftChild());
			
			
		}
	}

}
