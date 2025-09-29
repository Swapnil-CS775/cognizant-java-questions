package com.swapnil;

import java.util.Arrays;

public class Question46 {
    public static void main(String[] args) {
        int[] count={90,45,70};
        ans(count);
    }

    public static void ans(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
