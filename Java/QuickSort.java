public class QuickSort {
	static void swap(int[] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;		
	}
	
	static int partition(int[] arr, int l, int r){
		int pivot = arr[r];
		int i = l-1;
		
		for (int j=l; j<=r-1; j++){
			if (arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		return (i+1);
	}
	
	static void quickSort(int[] arr, int l, int r){
		if (l<r){
			int m=partition(arr,l,r);
			
			quickSort(arr,l,m-1);
			quickSort(arr,m+1,r);
		}
	}
}
