package com.swapnil;

public class Question44 {
    public static void main(String[] args) {
        int pizza=10;
        int puff=12;
        int coldD=5;
        ans(pizza,puff,coldD);
    }

    public static void ans(int pizza,int puff,int coldD){
        int perPizza=100;
        int perPuff=20;
        int perColdC=10;

        System.out.println(pizza*perPizza + puff*perPuff + coldD*perColdC);
    }
}
