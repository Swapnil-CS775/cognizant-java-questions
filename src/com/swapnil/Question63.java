package com.swapnil;

public class Question63 {
    public static void main(String[] args) {
        int[][] arr= {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        ans(arr);
    }

    public static void ans(int[][] arr){
        int maxColumnSum=0;
        int maxRowSum=Integer.MIN_VALUE;

        //first calculate max row sum
        for(int i=0;i<arr.length;i++){
            int rowSum=0;
            for(int j=0;j<arr[i].length;j++){
                rowSum+=arr[i][j];
            }

            if(rowSum>maxRowSum){
                maxRowSum=rowSum;
            }
        }

        System.out.println(maxRowSum);

        //then calculate max column sum
        for(int i=0;i<arr[0].length;i++){
            int colSum=0;
            for(int j=0;j<arr.length;j++){
                colSum+=arr[j][i];
            }

            if(colSum>maxColumnSum){
                maxColumnSum=colSum;
            }
        }

        System.out.println(maxColumnSum);

        System.out.println(maxRowSum+maxColumnSum);
    }
}
