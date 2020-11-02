import java.util.*;
import java.io.*;

public class BFS {
		
	public static void disconnectedBFS (int startingVertex, AdjacencyMatrix graph) {

		boolean [] visited = new boolean [graph.vertices];

		for (int i = 0; i < graph.vertices; ++i) {
			visited[i] = false;
		}

		bfs (startingVertex, visited, graph);

		for (int i = 0; i < graph.vertices; ++i) {
			if (visited[i] == false) {
				bfs (i, visited, graph);
			}
		}
	}

	public static void bfs (int startingVertex, boolean [] visited, AdjacencyMatrix graph) {
			
		Queue<Integer> pendingNodes = new LinkedList <Integer> ();

		pendingNodes.add (startingVertex);
		visited[startingVertex] = true;	

		System.out.println ("\n\n");
		while (pendingNodes.isEmpty() == false) {
				
			int current = pendingNodes.remove ();

			System.out.print (current + " ");

			for (int i = 0; i < graph.vertices, ++i) {
				if (visited[i] == false && graph.adjMatrix[current][i] == true) {
					visited[i] = true;
					pendingNodes.add(i);
				}
			}
		}
		System.out.println ("\n\n");
	}

	public static void main (String [] args) {
			
		AdjacencyMatrix graph = new AdjacencyMatrix (4, 4);

		bfs 
	}
}




















