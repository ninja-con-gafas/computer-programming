package datastructures;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph<T>
{
    private HashMap<T, LinkedList<T>> graph = new HashMap<>();

    public void addEdge(T start, T end, boolean bidirectional)
    {
        if(! graph.containsKey(start))
            addNode(start);
        if(! graph.containsKey(end))
            addNode(end);
        graph.get(start).add(end);
        if(bidirectional)
            graph.get(end).add(start);
    }

    public void addNode(T node)
    {
        graph.put(node, new LinkedList<>());
    }

    public LinkedList<T> getEdges(T node) { return graph.get(node); }

    public int getEdgeCount(boolean bidirectional)
    {
        int count = 0;
        for(T value : graph.keySet())
            count += graph.get(value).size();
        if(bidirectional)
            return count/2;
        return  count;
    }

    public Set<T> getNodes() { return graph.keySet(); }

    public int getNodeCount() { return graph.keySet().size(); }

    public boolean hasEdge(T start, T end) { return graph.get(start).contains(end); }

    public boolean hasNode(T node) { return  graph.containsKey(node); }

    public boolean isTree() { return getEdgeCount(true) == getNodeCount() - 1; }

    @Override
    public String toString() { return graph.toString(); }
}
