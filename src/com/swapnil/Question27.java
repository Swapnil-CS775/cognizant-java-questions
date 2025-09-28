package com.swapnil;

public class Question27 {
    public static void main(String[] args) {
        String s="abcd";
        ans(s);
    }

    public static void ans(String s){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int p=(s.charAt(i)-'a')+1;
            if(p==1 || p==4 || p==9 || p==16 ||p==25){
                int k=(int) Math.sqrt(p);
                boolean left = i>0 && (s.charAt(i-1)-'a'+1)==k;
                boolean right = i<s.length()-1 && (s.charAt(i+1)-'a'+1)==k;
                if(left || right){
                    result.append(s.charAt(i));
                }else {
                    result.append((char) ('a'+k-1));
                }
            }else {
                result.append(s.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
