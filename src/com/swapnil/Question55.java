package com.swapnil;

import java.util.Arrays;

public class Question55 {
    public static void main(String[] args) {
        int[][] marksOfEachSem={
                {50,60,70},
                {90,98,76,67},
                {89,76}
        };

        ans(marksOfEachSem);
    }

    public static void ans(int[][] marks){
        for(int i=0;i<marks.length;i++){
            Arrays.sort(marks[i]);
            System.out.println(marks[i][marks[i].length - 1]);
        }
    }
}

