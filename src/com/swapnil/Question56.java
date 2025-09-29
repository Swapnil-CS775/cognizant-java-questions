package com.swapnil;

public class Question56 {
    public static void main(String[] args) {
        int num=54;
        ans(num);
    }

    public static void ans(int num){
        if(num==0) {
            System.out.println("no factors");
            return;
        }
        num=Math.abs(num);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }

    }
}
