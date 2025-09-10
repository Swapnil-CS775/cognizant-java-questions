package com.swapnil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=10;
        ans(arr,n);
    }

    public static void ans(int[] arr,int n){
        int[] seq=new int[n];
        for(int i=0;i<Math.min(n,6);i++){
            seq[i]=arr[i];
        }

        for(int i=6;i<n;i++){
            seq[i]=seq[i-1]+seq[i-2];
        }
        System.out.println(Arrays.toString(seq));
    }
}
