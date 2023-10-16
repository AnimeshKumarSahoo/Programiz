package Graph;
import java.util.*;
public class BFS {
	
	private LinkedList<Integer> adj[];
	
	public BFS(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int bfs(int source, int destination) {
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination)
             break;
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		while(parent[cur] != -1) { 
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		
		return distance;
	}
	
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vertices and edges of the graph");
        int v=sc.nextInt();
        int e=sc.nextInt();
        BFS ob=new BFS(v);
        System.out.println("Enter the"+" "+e+"edges");
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
        ob.addEdge(source, destination);
        }
        System.out.println("Enter the source and the destination ");
            int source=sc.nextInt();
            int destination=sc.nextInt();
            ob.bfs(source, destination);
            int res=ob.bfs(source, destination);
            System.out.println("Minimum distance covered is:"+res);

    }
}
