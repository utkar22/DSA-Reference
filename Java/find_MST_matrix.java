import java.util.*;
import java.io.*;

public class find_MST_matrix {
	static void addEdge(int[][] adj, int u, int v, int e){
		adj[u][v]=e;
		adj[v][u]=e;
	}
	
	static int getMin(int[] MST, boolean[] MST_set, int V){
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		
		for (int i = 0; i<V; i++){
			if ((!MST_set[i])&&MST[i]<min){
				min = MST[i];
				min_index = i;
			}
		}
		return min_index;
	}
	
	static int findMST(int[][] adj, int V, int a, int b){
		int[] MST = new int[V];
		boolean[] MST_set = new boolean[V];
		
		for (int i = 0; i<V; i++){
			MST[i] = Integer.MAX_VALUE;
			MST_set[i] = false;
		}
		
		MST[0] = 0;
		
		for (int j = 0; j<V-1; j++){
			int min_index;
			min_index = getMin(MST, MST_set, V);
			MST_set[min_index] = true;
			
			for (int k = 0; k<V; k++){
				if (adj[min_index][k]!=0&&!MST_set[k]&&adj[min_index][k]<MST[k]&&k!=b){
					MST[k] = adj[min_index][k];
				}
			}
		}
		
		int sum = 0;
		for (int i2=0; i2<V; i2++){
			sum=sum+MST[i2];
		}
		return sum;
		
	}
}
