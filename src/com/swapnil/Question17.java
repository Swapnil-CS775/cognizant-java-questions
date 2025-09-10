package com.swapnil;

public class Question17 {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,5,4};
        int d=2;
        ans(arr,d);
    }

    public static void ans(int[] arr,int d){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            boolean leftOk=(i-d)<0 || arr[i]>arr[i-d];
            boolean rightOk=(i+d)>arr.length-1 || arr[i]>arr[i+d];
            if(leftOk && rightOk) sum+=arr[i];
        }

        System.out.println(sum);
    }
}
