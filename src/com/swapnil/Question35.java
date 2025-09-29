package com.swapnil;

public class Question35 {
    public static void main(String[] args) {
        int[] arr={11,1,2,8,10,11,15,7};
        ans(arr);
    }

    public static void ans(int[] arr){
        int mult=0;
        int n1=-1;
        int n2=-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==18 && arr[i]!=arr[j] && mult<arr[i]*arr[j]){
                    n1=Integer.max(arr[i],arr[j]);
                    n2=Integer.min(arr[i],arr[j]);
                    mult=arr[i]*arr[j];
                }
            }
        }

        System.out.println(n1+":"+n2);
    }
}
