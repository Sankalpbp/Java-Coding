import java.util.*;
import java.io.*;

public class DFS {

	public static void disconnectedDFS (int startingVertex, AdjacencyMatrix graph) {
			
		boolean [] visited = new boolean [graph.vertices];
		
		for (int i = 0; i < graph.vertices; ++i) {
			visited[i] = false;
		}

		dfs (startingVertex, visited, graph);

		for (int i = 0; i < vertices; ++i) {
			dfs (i, visited, graph);
		}
	}

	public static void dfs (int vertex, boolean [] visited, AdjacencyMatrix graph) {
		
		visited[vertex] = true;

		System.out.print (vertex + " ");

		for (int i = 0; i < graph.vertices; ++i) {
			if (graph.adjMatrix[vertex][i] == true && visited[i] == false) {
				dfs (i, visited, graph);
			}
		}
	}

	public static void main (String [] args) throws IOException {
			
		AdjacencyMatrix graph = new AdjacencyMatrix (4, 4);

		System.out.println ();
		DFS.disconnectedDFS (0, graph);
		System.out.println ();
	}
}
