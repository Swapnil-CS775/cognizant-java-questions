package com.swapnil;

import java.util.PriorityQueue;

public class Question36 {
    public static void main(String[] args) {
        int[] arr={11, -1, -4, 12, -6};
        int n=3;
        ans(arr,n);
    }

    public static void ans(int[] arr,int n){
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            if(pq.size()<n) pq.add(arr[i]);
            else if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
