package com.swapnil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question12 {
    public static void main(String[] args) {
        int[] arr={10,15,12,9,14};
        ans(arr);
    }

    public static void ans(int[] arr){
        int[] range=new int[arr.length];
        if(arr.length>=2){
            if(arr[1]>arr[0] && arr[arr.length-1]>arr[0]){
                range[0]=2;
            } else if (arr[1]>arr[0] || arr[arr.length-1]>arr[0]) {
                range[0]=1;
            }else range[0]=0;

            if(arr[arr.length-2]>arr[arr.length-1] && arr[0]>arr[arr.length-1]){
                range[arr.length-1]=2;
            } else if (arr[arr.length-2]>arr[arr.length-1] || arr[0]>arr[arr.length-1]) {
                range[arr.length-1]=1;
            }else range[arr.length-1]=0;
        }

        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]>arr[i] && arr[i+1]>arr[i]){
                range[i]=2;
            } else if (arr[i-1]>arr[i] || arr[i+1]>arr[i]) {
                range[i]=1;
            }else range[i]=0;
        }

        System.out.println(Arrays.toString(range));
    }
}
