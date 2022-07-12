#include <stdio.h>

/*Recursive function to run the binary search*/
int binary_search(unsigned int arr[], int l, int r, unsigned int data){
    if (r>=l){
        int mid = l +(r-l)/2; /*Choosing the middle element*/

        if (arr[mid]==data){
            /*If the current middle element is the element we need*/
            return mid;
        }
        if (arr[mid]>data){
            /*If our element is on the left hand side of the middle element*/
            return binary_search(arr, l, mid-1, data);
        }
        /*If our element is on the right hand side of the middle element*/
        return binary_search(arr,mid+1,r,data);
    }
    /*If r<l, then the element is not in the array*/
    return -1;
}
