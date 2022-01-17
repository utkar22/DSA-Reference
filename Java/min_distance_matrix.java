
public class min_distance_matrix {
	static void addEdge(int[][] adj, int u, int v, int e){
		adj[u][v]=e;
		adj[v][u]=e;
	}
	
	static int getMin(int[] DJI, boolean[] DJI_set, int V){
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		
		for (int i = 0; i<V; i++){
			if ((!DJI_set[i])&&DJI[i]<min){
				min = DJI[i];
				min_index = i;
			}
		}
		return min_index;
	}
	
	static int findPath(){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
