package com.swapnil;

import java.util.Stack;

public class Question25 {
    public static void main(String[] args) {
        int n = 6;
        int[] a = {3, 1, 4, 2, 5, 1};
        ans(n,a);
    }

    public static void ans(int n,int[] arr){
        Stack<Integer>myStack=new Stack<>();
        int totalSkippedPulses=0;

        for(int i=0;i<arr.length;i++){
            while(!myStack.isEmpty() && myStack.peek()<=arr[i]){
                myStack.pop();
                totalSkippedPulses++;
            }
            myStack.push(arr[i]);
        }

        System.out.println(totalSkippedPulses);
    }
}
