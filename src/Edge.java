public class Edge {

	private int edgeVal;
	private Vertex vertexA;
	private Vertex vertexB;

	public Edge(Vertex vertexA, Vertex vertexB) {
		super();
		this.vertexA = vertexA;
		this.vertexB = vertexB;
	}

	public int getEdgeVal() {
		return edgeVal;
	}

	public void setEdgeVal(int edgeVal) {
		this.edgeVal = edgeVal;
	}

	public Vertex getVertexA() {
		return vertexA;
	}

	public void setVertexA(Vertex vertexA) {
		this.vertexA = vertexA;
	}

	public Vertex getVertexB() {
		return vertexB;
	}

	public void setVertexB(Vertex vertexB) {
		this.vertexB = vertexB;
	}

}
