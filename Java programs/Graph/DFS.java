package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    private LinkedList<Integer> adj[];
	
	public DFS(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			if(cur == destination)
             return true;
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		return false;
	}
	
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vertices and edges of the graph");
        int v=sc.nextInt();
        int e=sc.nextInt();
        DFS ob=new DFS(v);
        System.out.println("Enter the"+" "+e+"edges");
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
        ob.addEdge(source, destination);
        }
        System.out.println("Enter the source and the destination ");
            int source=sc.nextInt();
            int destination=sc.nextInt();
            ob.dfsStack(source, destination);
    }
}

