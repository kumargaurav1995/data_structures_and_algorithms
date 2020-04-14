package dsa_algo.data_structures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(1, 4);

        System.out.print("BFS Visits: ");
        //       graph.bfs();
        System.out.println();
        System.out.print("DFS Visits: ");
        graph.dfs();

    }
}

class Graph {

    private final int MAX_VERTS = 20;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts;
    private Queue<Integer> queue; // for BFS only
    private Stack<Integer> stack; // for DFS only

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        queue = new LinkedList<Integer>();
        stack = new Stack<>();
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int vertex) {
        System.out.print(vertexList[vertex].label);
    }

    public int getUnvisitedVertex(int vertex) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[vertex][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }

    public void bfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.add(0);
        int v2;

        while (!queue.isEmpty()) {
            int v1 = queue.remove();
            while ((v2 = getUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                queue.add(v2);
            }
        }
    }

    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int vertex = getUnvisitedVertex(stack.peek());
            if (vertex == -1) {
                stack.pop();
            } else {
                vertexList[vertex].wasVisited = true;
                displayVertex(vertex);
                stack.push(vertex);
            }
        }
    }
}

class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char label) {
        this.label = label;
        this.wasVisited = false;
    }
}