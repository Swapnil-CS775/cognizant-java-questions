package com.swapnil;

public class Question21 {
    public static void main(String[] args) {
        String s="XXYYXXY";
        ans(s);
    }

    public static void ans(String s){
        int diff1=0;
        int diff2=0;

        for(int i=0;i<s.length();i++){
            char expected1=(i%2==0) ? 'X' : 'Y';
            char expected2=(i%2==0) ? 'Y' : 'X';

            if(expected1!=s.charAt(i)) diff1++;
            if(expected2!=s.charAt(i)) diff2++;
        }

        int minSwaps=Math.min(diff1,diff2);
        System.out.println(minSwaps);
    }
}

