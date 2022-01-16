package com.myapp.org.arraynstring;

public class UniqNDuplicate {

    public static int uniq(int[] arr, int size){
        int ans=0;
        for(int i=0;i<size;i++){
            ans=ans^arr[i];
        }
        return ans;
    }

    public static int duplicate(int[] arr, int size){
        int ans=0;
        for(int i=0;i<size;i++){
            ans=ans^arr[i];
        }

        for(int j=0;j<size;j++){
            ans=ans^j;
        }
        return ans;
    }

    public static void main(String[] str){
        int[] arr={1,2,3,2,1};
        int[] arr1={1,2,3,2,4};
        System.out.println(uniq(arr,5));
        System.out.println(duplicate(arr1,5));
    }
    
}
