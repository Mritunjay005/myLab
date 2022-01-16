package com.myapp.org.sorting;

public class InsertionSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        // TODO Auto-generated method stub
        int size=arr.length;

        for(int i =0;i < size -1; i++){
            if(arr[i] > arr[i+1]){
                swap(arr,i,i+1);
                if(i > 0 && arr[i-1]> arr[i]){
                    reconcilePrevious(arr,i);
                }
            }
            
        }
    }

    private void reconcilePrevious(int[] arr, int i) {

        for(int j=i;j>1;j--){
            if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
