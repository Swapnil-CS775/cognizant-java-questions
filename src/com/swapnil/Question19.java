package com.swapnil;

public class Question19 {
    public static void main(String[] args) {
        String s="aabbbccdeeea";
        ans(s);
    }

    public static void ans(String s){
        int i=0,n=s.length();
        StringBuilder ans=new StringBuilder();

        while(i<n){
            int j=i;
            while(j<n && s.charAt(j)==s.charAt(i)) j++;

            if(j-i>=2){
                if(ans.length()==0 || ans.charAt(ans.length()-1)!='#') ans.append("#");
            }else {
                ans.append(s.charAt(i));
            }
            i=j;
        }

        System.out.println(ans.toString());
    }
}
