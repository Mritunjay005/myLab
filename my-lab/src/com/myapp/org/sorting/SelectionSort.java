package com.myapp.org.sorting;

public class SelectionSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        // TODO Auto-generated method stub
        int size=arr.length;
        for (int i=0 ; i < size ;i++) {
            
            int minIndx=findMin(arr,i,size);
            swap(arr,i,minIndx);
        } 
    }

    private void swap(int[] arr, int i, int minIndx) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[minIndx];
        arr[minIndx]=temp;
    }

    private int findMin(int[] arr, int i, int size) {
        int min= 9999;
        int indx=0;

        for(int j=i;j<size;j++){
            if(min > arr[j]){
                min=arr[j];
                indx=j;
            }
        }
        return indx;
    }
    
}
