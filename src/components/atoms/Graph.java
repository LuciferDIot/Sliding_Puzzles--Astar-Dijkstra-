package components.atoms;

import java.util.ArrayList;

public class Graph {

    private Vertex start;
    private Vertex end;
    private final boolean isWeighted;
    private final boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.isDirected = inputIsDirected;
        this.isWeighted = inputIsWeighted;
    }

    public Vertex addVertex(int x, int y, String label) {
        return new Vertex(x, y, label);
    }

    public void setStart(Vertex vertex) {
        this.start=vertex;
    }

    public void setEnd(Vertex vertex) {
        this.end=vertex;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight=null;
        }

        vertex1.addEdge(vertex2, weight);

        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        vertex1.removeEdge(vertex2);

        if (!this.isDirected) vertex2.removeEdge(vertex1);
    }
}
