
public class AVLVertex extends BinaryTreeVertex {

	private int leftHeavy = -1;
	private int rightHeavy = 1;
	private int treeBalance = 0;

	public AVLVertex(int vertexVal) {
		super(vertexVal);

	}

	public int height(AVLVertex x) {
		if (x == null)
			return -1;
		else
			return x.height(x);
	}

	/**
	 * @return the leftHeavy
	 */
	public int getLeftHeavy() {
		return leftHeavy;
	}

	/**
	 * @param leftHeavy
	 *            the leftHeavy to set
	 */
	public void setLeftHeavy(int leftHeavy) {
		this.leftHeavy = leftHeavy;
	}

	/**
	 * @return the rightHeavy
	 */
	public int getRightHeavy() {
		return rightHeavy;
	}

	/**
	 * @param rightHeavy
	 *            the rightHeavy to set
	 */
	public void setRightHeavy(int rightHeavy) {
		this.rightHeavy = rightHeavy;
	}

	/**
	 * @return the treeBalance
	 */
	public int getTreeBalance() {
		return treeBalance;
	}

	/**
	 * @param treeBalance
	 *            the treeBalance to set
	 */
	public void setTreeBalance(int treeBalance) {
		this.treeBalance = treeBalance;
	}

}