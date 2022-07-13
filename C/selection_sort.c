void swap(int *var1, int *var2){
    /*Function to swap two elements*/
    int temp = *var1;
    *var1=*var2;
    *var2=temp;
}

void selection_sort(int array[], int len){
    /*Function to perform selection sort*/
    int a, b, min_id;
    for (a=0;a<len-1;a++){
        min_id=a;
        for (b=a+1;b<len;b++){
            if (array[b]<array[min_id]){
                min_id=b;
            }
        }
        swap(&array[min_id],&array[a]);
    }
}
