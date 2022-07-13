void swap(int *var1, int *var2){
    /*Function to swap two elements*/
    int temp = *var1;
    *var1=*var2;
    *var2=temp;
}

void bubble_sort(int array[], int len){
    /*Function to perform bubble sort*/
    int a, b;
    for (a=0;a<len-1;a++){
        for (b=0; b<len-a-1; b++){
            if (array[b]>array[b+1]){
                swap(&array[b],&array[b+1]);
            }
        }
    }
}
