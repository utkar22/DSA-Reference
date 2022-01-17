import  java.util.*;

public class graph_adj_list {
	static void addEdge(ArrayList<ArrayList<Integer> > adj,
            int u, int v)
		{
		adj.get(u).add(v);
		adj.get(v).add(u);
		}
	
	static int[] distances(ArrayList<ArrayList<Integer> > adj, int start, int n){
		//Applies Breadth First Search to find the distances from a given start point
		int[] visited = new int[n];
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		while (!queue.isEmpty()){
			int curr = queue.remove();
			
			for (int i = 0; i<(adj.get(curr).size()); i++){
				int x = adj.get(curr).get(i);
				if (visited[x]==0&&x!=start){
					visited[x]=visited[curr]+10;
					queue.add(x);
				}
			}
		}
		
		for (int i = 0; i<n; i++){
			if (i!=start&&visited[i]==0){
				visited[i]=-1;
			}
		}
		
		return visited;
	}
	
	static boolean findIfConnected(ArrayList<ArrayList<Integer>> adj, int u, int v, int V){
		boolean[] visited = new boolean[V];
		
		boolean found = false;
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(u);
		
		while (!stack.isEmpty()){
			int curr = stack.peek();
			visited[curr]=true;
			
			ArrayList<Integer> curr_list = adj.get(curr);
			
			boolean to_pop = true;
			
			for (int i = 0; i<curr_list.size(); i++){
				
				int next = curr_list.get(i);
				if (next == v){
					found = true;
					break;
				}
				if (!visited[next]){
					stack.push(next);
					to_pop=false;
					break;
				}
			}
			
			if (found){
				break;
			}
			
			if (to_pop){
				stack.pop();
			}
		}
		
		return (found);
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(n);
		
		for (int j = 1; j<=n; j++){
			adj.add(new ArrayList<Integer>());
		}
	}
		
}
