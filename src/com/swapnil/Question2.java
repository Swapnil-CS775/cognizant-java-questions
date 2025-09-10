package com.swapnil;

public class Question2 {
    public static void main(String[] args) {
        int[] arr={10,10,3,7,6};
        ans(arr);
    }

    public static void ans(int[] arr){
        if(arr.length==1){
            System.out.println("sub array is not possible for length 1");
        }

        int prefSum=arr[0];
        int suffSum=0;
        int count =0;
        for(int i=1;i<arr.length;i++){
            suffSum+=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            int diff=Math.abs(prefSum-suffSum);
            if(diff%2==0){
                count++;
            }
            prefSum+=arr[i];
            suffSum-=arr[i];
        }

        System.out.println(count);
    }
}
