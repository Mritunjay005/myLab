package com.myapp.org.sorting;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        // TODO Auto-generated method stub
        int size=arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j] < arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }

    public void sort(int[] arr, int start, int end) {
        // TODO Auto-generated method stub
        //int size=arr.length;

        for(int i=start;i<=end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j] < arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }
    
}
