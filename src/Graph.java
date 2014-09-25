import java.util.ArrayList;

public class Graph {

	ArrayList<Vertex> theVertex;
	ArrayList<Edge> theEdge;

	public Graph() {
		theVertex = new ArrayList<Vertex>();
		theEdge = new ArrayList<Edge>();
	}

	public ArrayList<Vertex> getTheVertex() {
		return theVertex;
	}

	public void setTheVertex(ArrayList<Vertex> theVertex) {
		this.theVertex = theVertex;
	}

	public ArrayList<Edge> getTheEdge() {
		return theEdge;
	}

	public void setTheEdge(ArrayList<Edge> theEdge) {
		this.theEdge = theEdge;
	}

	public void addVertex(Vertex addVertex) {
		this.theVertex.add(addVertex);
	}

	public void addEdge(Edge addEdge) {
		this.theEdge.add(addEdge);
	}

	public void removeVertex(int index) {
		this.theVertex.remove(index);
	}

	public void removeEdge(int index) {
		this.theEdge.remove(index);
	}

}
