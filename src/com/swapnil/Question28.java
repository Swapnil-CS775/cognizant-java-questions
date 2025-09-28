package com.swapnil;

public class Question28 {
    public static void main(String[] args) {
        String s="5aart6i7io8o5o56";
        ans(s);
    }

    public static void ans(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                boolean left=i>0 && (s.charAt(i-1)>='1' && s.charAt(i-1)<='9');
                boolean right=i<s.length()-1 && (s.charAt(i+1)>='1' && s.charAt(i+1)<='9');
                if(left && right){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
