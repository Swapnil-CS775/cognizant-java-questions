package com.swapnil;

import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {

        int[] arr={2,2,4,1,1};
        int x=4;
        ans(arr,x);
    }

    public static void ans(int[] arr,int x){
        //standred mode calculater
        int m1=0;
        for(int i=0;i<arr.length;i++){
            int currentNum=arr[i];
            if(arr[i]<=x){
                m1++;
            }else {
                while (currentNum >= x) {
                    currentNum = currentNum / x;
                    m1++;
                }
            }
        }

        Arrays.sort(arr);
        int m2=arr[arr.length-1];
        System.out.println(Math.min(m1, m2));
    }
}
