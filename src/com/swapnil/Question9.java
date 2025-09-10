package com.swapnil;

public class Question9 {
    public static void main(String[] args) {
        String s="226";
        ans(s);
    }

    public static void ans(String s){
        int count=0;

        for(int i=0;i<s.length();i++){
            int num1=s.charAt(i)-'0';
            if(num1>=1 && num1<=26)count++;

            if(i+1!=s.length()){
                int num2=Integer.parseInt(s.substring(i,i+2));
                if(num2<=26)count++;
            }
        }
        System.out.println(count);
    }
}
