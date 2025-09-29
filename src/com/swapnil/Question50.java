package com.swapnil;

public class Question50 {
    public static void main(String[] args) {
        int num=1121;
        ans(num);
    }

    public static void ans(int num){
        if(num<0){
            System.out.println("Invalid number");
            return;
        }
        int x=num;

        int newNum=0;
        while(x>0){
            newNum =newNum*10 + x%10;
            x=x/10;
        }

        if(newNum==num){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
