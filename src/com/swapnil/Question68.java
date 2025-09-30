package com.swapnil;

import java.util.Arrays;

public class Question68 {
    public static void main(String[] args) {
        int[] arr={1,1,4,2,3};
        int n=5;
        ans(arr,n);
    }

    public static void ans(int[] arr,int n) {
        int steps=0;
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }

        int target=totalSum-n;
        if(target<0){
            System.out.println(-1);
        }

        int maxLen=-1;
        int currentSum=0;
        int left=0;

        for(int right=0;right<arr.length;right++){
            currentSum+=arr[right];

            if(currentSum>target && left<right){
                currentSum-=arr[left++];
            }

            if(currentSum==target){
                maxLen=Math.max(maxLen,right-left+1);
            }
        }

        steps=maxLen==-1 ? -1 : arr.length-maxLen;

        System.out.println(steps);
    }
}
