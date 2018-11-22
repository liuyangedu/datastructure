package cn.edu.bupt.sdmda.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GraphAlgorithm {

	//	double[][] graph = new double[][]{
	//	{0, 34, 46, -1,-1,19},
	//	{34,0,-1,-1,12,-1},
	//	{46,-1,0,17,-1,25},
	//	{-1,-1,17,0,-1,25},
	//	{-1,12,-1,38,0,26},
	//	{19,-1,25,25,26,0}
	//	};

	public static void dfs(double[][] graph, int start) {
		// init an array of int to indicate which vertex is visited
		int[] visited = new int[graph.length];

		// start dfs recursively
		_dfs(graph, start, visited);
	}

	// dfs recursively
	private static void _dfs(double[][] graph, int start, int[] visited) {
		// print current vertex
		System.out.print(start + " ");
		// find next available vertex and dfs on it
	}

	public static void bfs(double[][] graph, int start) {
		// init an array of int to indicate which vertex is visited
		int[] visited = new int[graph.length];

		// build a queue and push start to it
    // change LinkedList to your own implementation
    LinkedList<Integer> queue = null;

		// loop while queue is empty
		while (queue.size() > 0) {
  		// pop and print a vertex,
			int cur = queue.poll();
			System.out.print(cur + " ");
      // then push its available next vertex to the queue
		}
	}

	public static double[][] prim(double[][] graph) {
		// init a double[][] for return
		// init U and V
		double[][] ret = null;
		List<Integer> U = null;
		List<Integer> V = null;


		// loop while V is not empty

			// loop on each vertex in U
			// find closest path from U to V(u-->v)
			// move v to U

		return ret;
	}

	public static double[][] kruskal(double[][] graph) {
		// construct a list of edge from graph, and sort it
		List<Edge> edges = null;

		// init a array represent the root of each vertex
		int[] root = null;


		// init a double[][] for return
		double[][] ret = null;


		// loop on edges

      // check if the roots of two vertex of this edge the same
  		// if is same, continue
  		// if not, modify the double[][] for return
  		//         and update root

		return ret;
	}

	// get root of a vertex
	private static int _getRoot(int[] root, int query) {
		return 0;
	}

	// a simple class to represent edge
	// it is comparable to itself
	static class Edge implements Comparable<Edge> {
		int v1, v2;
		double weight;

		public Edge(int v1, int v2, double w) {
			this.v1 = v1 < v2 ? v1 : v2;
			this.v2 = v1 < v2 ? v2 : v1;
			weight = w;
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static double dijkstra(double[][] graph, int start, int end) {
		// init U and V
		List<Integer> U = null;
		List<Integer> V = null;

		// init an array indicating the shortest distance from start to each vertex
		double[] distance = null;


		// loop if end is not in U

			// find shortest path from U to V (u--v)
			// update distance, U ,V

		return distance[end];
	}

}
