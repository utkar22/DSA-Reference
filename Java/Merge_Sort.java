public class Merge_Sort {
	
	void merge(int arr[], int l, int m, int r){
		//To find sizes for the two sub-arrays
		int n_l=m-l+1;
		int n_r=r-m;
		
		//Creating temporary arrays
		int Left_Array[] = new int[n_l];
		int Right_Array[] = new int[n_r];
		
		for (int a=0; a<n_l; a++){
			Left_Array[a]=arr[l+a];
		}
		for (int b=0; b<n_r; b++){
			Right_Array[b]=arr[m+1+b];
		}
		
		
		//To merge the two sub-arrays
		int i=0;
		int j=0;
		int k=0;
		
		while (i<n_l&&j<n_r){
			if (Left_Array[i]<Right_Array[j]){
				arr[k]=Left_Array[i];
				i++;
			}
			else{
				arr[k]=Right_Array[j];
				j++;
			}
			k++;
		}
		
		while (i<n_l){
			arr[k]=Left_Array[i];
			i++;
			k++;
		}
		while (j<n_r){
			arr[k]=Right_Array[j];
			j++;
			k++;
		}
		
	}
	
	
	void sort(int arr[], int l, int r){
		if (l<r){
			int mid = l + (r-l)/2;
			
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			
			merge(arr,l,mid,r);
		}
	}

}
