public class HeapVertex extends BinaryTreeVertex {

	private int indexedLocation;

	public HeapVertex(int vertexVal) {
		super(vertexVal);

	}

	public int getIndexedLocation() {
		return indexedLocation;
	}

	public void setIndexedLocation(int indexedLocation) {
		this.indexedLocation = indexedLocation;
	}

	public int Left(int leftChild) {
		return 2 * leftChild + 1;
	}

	public int Right(int rightChild) {
		return 2 * rightChild + 2;
	}

	public int Parent(int parent) {
		return (parent / 2);
	}

	@Override
	public String toString() {
		return String.format("The vertex value is %s at index %s",
				getVertexVal(), indexedLocation);
	}
}
