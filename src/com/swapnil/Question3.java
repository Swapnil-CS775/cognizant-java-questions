package com.swapnil;

public class Question3 {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,2,4,2};
        ans(arr);
    }

    public static void ans(int[] arr){
        int i=0;
        int count=0;
        while(i+2!=arr.length){
            if(arr[i]+arr[i+2]==arr[i+1])count ++;
            i++;
        }

        System.out.println(count);
    }
}
