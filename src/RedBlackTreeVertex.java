public class RedBlackTreeVertex extends BinaryTreeVertex {
	
	public RedBlackTreeVertex(int vertexVal) {
		super(vertexVal);

	}

	private boolean red = true;
	private boolean black = false;

	public boolean isRed() {
		return red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}

	public boolean isBlack() {
		return black;
	}

	public void setBlack(boolean black) {
		this.black = black;
	}

}