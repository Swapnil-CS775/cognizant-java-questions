package com.swapnil;

public class Question67 {
    public static void main(String[] args) {
        int[] arr={1, 8, 6, 2, 5, 4, 8, 3, 7};
        ans(arr);
        ans2(arr);
    }

    public static void ans(int[] arr){
        int maxArea=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                int currentArea=height*width;
                if(currentArea>maxArea){
                    maxArea=currentArea;
                }
            }
        }

        System.out.println(maxArea);
    }

    public static void ans2(int[] arr){
        int left=0;
        int right=arr.length-1;

        int maxArea=0;
        while(left<right){

            int w=right-left;
            int h=Math.min(arr[left],arr[right]);
            maxArea=Math.max(maxArea,w*h);

            if(arr[left]<arr[right]){
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println(maxArea);
    }
}
