package examples.search;
import datastructures.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class BreadthFirstSearch
{
    private Graph<Integer> graph = new Graph<>();

    public BreadthFirstSearch()
    {
        Scanner read = new Scanner(System.in);
        int edges = read.nextInt();

        for(int i = 0; i < edges; i++)
            graph.addEdge(read.nextInt(), read.nextInt(), true);
    }

    public void searchBreadthFirst(int node)
    {
        Queue<Integer> nodesToVisit = new LinkedList<>();
        Set<Integer> visitedNodes = new HashSet<>();
        nodesToVisit.add(node);
        visitedNodes.add(node);

        System.out.printf("%d ",node);

        while(! nodesToVisit.isEmpty())
        {
            node = nodesToVisit.remove();
            for(int neighbour : graph.getEdges(node))
            {
                if(! visitedNodes.contains(neighbour))
                {
                    nodesToVisit.add(neighbour);
                    visitedNodes.add(neighbour);

                    System.out.printf("%d ",neighbour);

                }
            }
        }
    }

    public static void main(String args[])
    {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.searchBreadthFirst(new Scanner(System.in).nextInt());
    }
}

