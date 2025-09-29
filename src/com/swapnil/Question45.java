package com.swapnil;

public class Question45 {
    public static void main(String[] args) {
        String seq="65666768";
        ans(seq);
    }

    public static void ans(String sq){
        for(int i=0;i<sq.length()-1;i=i+2){
            int digit=Integer.parseInt(sq.substring(i,i+2));
            System.out.print((char)digit);
        }
    }
}
