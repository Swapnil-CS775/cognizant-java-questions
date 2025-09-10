package com.swapnil;

import java.util.HashMap;

public class Question14 {
    public static void main(String[] args) {
        int[][] arr={
                {-1,1,3},
                {2,3,4},
                {3,4,5}
        };

        ans(arr);
    }

    public static void ans(int[][] arr){
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int[] row:arr){
            for(int i:row){
                freq.put(i,freq.getOrDefault(i,0)+1);
            }
        }

        int minUniqueNum=Integer.MAX_VALUE;
        for(int key:freq.keySet()){
            if(freq.get(key)==1 && key>0){
                if(key<minUniqueNum){
                    minUniqueNum=key;
                }
            }
        }
        if(minUniqueNum==Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(minUniqueNum);
        }
    }
}
