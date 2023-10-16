package Graph;
import java.util.ArrayList;
import java.util.Scanner;
public class Detectcycle {
    public static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj){
boolean vis[]=new boolean[v];
for(int i=0;i<v;i++){
    if(!vis[i]){
        if(dfs(i,adj,vis,-1))
        return true;
    }
}
return false;
    }
    public static  boolean dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean vis[],int parent){
        vis[v]=true;
        for(Integer neighbor:adj.get(v)){
            if(!vis[neighbor]){
                if(dfs(neighbor,adj,vis,v))
                return true;
            }
            else if(parent!=neighbor){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the vertices and edges of the graph");
        int n, e;
        n = scan.nextInt();
        e = scan.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
      //  for (int i = 0; i < n; i++)
        //    graph.add(new ArrayList<Integer>());
        System.out.println("Enter the:"+" "+e+" "+"edges3");
        for (int i = 0; i < e; i++) {
            int u, v;
            u = scan.nextInt();
            v = scan.nextInt();
            if (u == v) {
                System.out.println("YES");
                return;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        System.out.println(isCycle(v,graph) == true ? "YES" : "NO");
    }
}
}
