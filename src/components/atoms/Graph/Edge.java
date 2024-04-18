package components.atoms.Graph;

public class Edge {

    private final Vertex start, end; // will store start and end vertex of the edge
    private final Integer weight; // if there is a weight for edge it will store (can be null not a primitive type)

    public Edge(Vertex startV, Vertex endV, Integer inputWeight) {
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
}
