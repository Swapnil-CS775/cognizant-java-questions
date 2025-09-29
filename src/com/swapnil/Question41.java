package com.swapnil;

import java.util.Arrays;

public class Question41 {
    public static void main(String[] args) {
        int[] arr={81, 61, 51, 41, 11};
        ans(arr);
    }

    public static void ans(int[] arr){
        char[] grade=new char[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=10 && arr[i]<=40) grade[i]='F';
            else if(arr[i]>=41 && arr[i]<=50) grade[i]='C';
            else if(arr[i]>=51 && arr[i]<=60) grade[i]='B';
            else if(arr[i]>=61 && arr[i]<=80) grade[i]='A';
            else if(arr[i]>=81 && arr[i]<=100) grade[i]='S';
        }

        System.out.println(Arrays.toString(grade));
    }
}
