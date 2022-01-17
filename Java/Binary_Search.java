public class Binary_Search {
	int BinarySearch(int arr[], int l, int r, int x){
		if (r>0){
			int mid = l + (r-l)/2;
			
			if (arr[mid]==x){
				return (mid);
			}
			else if (arr[mid]>x){
				return BinarySearch(arr, l, mid-1, x);
			}
			else{
				return BinarySearch(arr, mid+1, r, x);
			}
		}
		return (-1);
		
	}
}
