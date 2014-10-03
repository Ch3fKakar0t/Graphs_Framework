import java.util.ArrayList;

//import javax.swing.JFrame;
//
//import edu.uci.ics.jung.algorithms.layout.Layout;
//import edu.uci.ics.jung.algorithms.layout.TreeLayout;
//import edu.uci.ics.jung.graph.DelegateForest;
//import edu.uci.ics.jung.graph.Forest;
//import edu.uci.ics.jung.visualization.BasicVisualizationServer;

public class Visualizer {

	private Graph jungGraph;
	private Edge jungEdge;
	private Vertex jungVertex;

	public Visualizer(Graph jungGraph) {
		super();
		this.jungGraph = jungGraph;
	}
	
//	public void JFrame(){
//		DelegateForest<Vertex, Edge> delGraph = new DelegateForest<Vertex, Edge>();
//
//        JFrame frame = new JFrame("Graph Visualization");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Layout<Vertex, Edge> layout;
//        layout = new TreeLayout<Vertex, Edge>((Forest<Vertex, Edge>) delGraph);
//        BasicVisualizationServer visual = new BasicVisualizationServer(layout);
//        frame.getContentPane().add(visual);
//        frame.add(visual);
//
//        frame.pack();
//        frame.setVisible(true);
//	}

	public ArrayList<Vertex> getTheVertex() {
		return jungGraph.getTheVertex();
	}

	public void setTheVertex(ArrayList<Vertex> theVertex) {
		jungGraph.setTheVertex(theVertex);
	}

	public ArrayList<Edge> getTheEdge() {
		return jungGraph.getTheEdge();
	}

	public void setTheEdge(ArrayList<Edge> theEdge) {
		jungGraph.setTheEdge(theEdge);
	}

	public void addVertex(Vertex addVertex) {
		jungGraph.addVertex(addVertex);
	}

	public void addEdge(Edge addEdge) {
		jungGraph.addEdge(addEdge);
	}

	public void removeVertex(int index) {
		jungGraph.removeVertex(index);
	}

	public void removeEdge(int index) {
		jungGraph.removeEdge(index);
	}

	public boolean equals(Object arg0) {
		return jungEdge.equals(arg0);
	}

	public int getEdgeVal() {
		return jungEdge.getEdgeVal();
	}

	public Vertex getVertexA() {
		return jungEdge.getVertexA();
	}

	public Vertex getVertexB() {
		return jungEdge.getVertexB();
	}

	public int hashCode() {
		return jungEdge.hashCode();
	}

	public void setEdgeVal(int edgeVal) {
		jungEdge.setEdgeVal(edgeVal);
	}

	public void setVertexA(Vertex vertexA) {
		jungEdge.setVertexA(vertexA);
	}

	public void setVertexB(Vertex vertexB) {
		jungEdge.setVertexB(vertexB);
	}

	public String toString() {
		return jungEdge.toString();
	}

	public int getVertexVal() {
		return jungVertex.getVertexVal();
	}

	public void setVertexVal(int vertexVal) {
		jungVertex.setVertexVal(vertexVal);
	}
	
	

}
