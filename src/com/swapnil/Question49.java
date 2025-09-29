package com.swapnil;

public class Question49 {
    public static void main(String[] args) {
        int n1=2;
        int n2=15;
        ans(n1,n2);
    }

    public static void ans(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
    }

    public static boolean isPrime(int num){
        int m=2;
        while(m<=Math.sqrt(num)){
            if(num%m==0) return false;
            m++;
        }

        return true;
    }
}
