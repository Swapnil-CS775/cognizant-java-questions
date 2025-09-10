package com.swapnil;

public class Question10 {
    public static void main(String[] args) {
        int L=1;
        int R=4;
        int[] arr={9,3,5};

        ans(L,R,arr);
    }

    public static void ans(int L,int R,int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int dopamin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=L && arr[i]<=R)dopamin++;
            else dopamin--;
            max=Math.max(max,dopamin);
            min=Math.min(min,dopamin);
        }

        System.out.println(max+" "+min);
    }
}
