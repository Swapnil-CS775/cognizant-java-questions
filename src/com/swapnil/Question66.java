package com.swapnil;

import java.util.PriorityQueue;

public class Question66 {
    public static void main(String[] args) {
        int[][] arr={{1,5,9},
                {10,11,13},
                {12,13,15}
        };
        int k=8;

        ans(arr,k);
    }

    public static void ans(int[][] arr,int k){
        PriorityQueue<int[]>minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<arr.length;i++){
            minHeap.offer(new int[]{arr[i][0],i,0});
        }

        int number=0;
        for(int i=0;i<k;i++){
            int[] current=minHeap.poll();
            number=current[0];
            int row=current[1];
            int col=current[2];

            if(col+1<arr.length){
                minHeap.offer(new int[]{arr[row][col + 1], row, col + 1});
            }
        }

        System.out.println(number);
    }
}
