package com.swapnil;

public class Question61 {
    public static void main(String[] args) {
        String num="13589234356546756";
        ans(num);
    }

    public static void ans(String num){
        int sum=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0) sum+=digit;
            else sum-=digit;
        }

        System.out.println(((sum%11)+11)%11);

    }
}
