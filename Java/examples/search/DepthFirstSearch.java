package examples.search;

import datastructures.Graph;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DepthFirstSearch 
{
    private Graph<Integer> graph = new Graph<>();
    private Set<Integer> visitedNodes = new HashSet<>();
    private static Scanner read = new Scanner(System.in);

    public DepthFirstSearch()
    {

        int edges = read.nextInt();

        for(int i = 0; i < edges; i++)
            graph.addEdge(read.nextInt(), read.nextInt(), true);
    }

    public void searchDepthFirst(int node)
    {
        visitedNodes.add(node);
        System.out.printf("%d ",node);
        for(int neighbour : graph.getEdges(node))
        {
            if(! visitedNodes.contains(neighbour))
                searchDepthFirst(neighbour);
        }
    }

    public static void main(String args[])
    {
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.searchDepthFirst(read.nextInt());
    }
}
