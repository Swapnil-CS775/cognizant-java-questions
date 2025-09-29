package com.swapnil;

public class Question39 {
    public static void main(String[] args) {
        String order="46734";
        int c=2;

        ans(order,c);
    }

    public static void ans(String order,int c){
        StringBuilder sb=new StringBuilder();

        for(char ch:order.toCharArray()){
            int val=(ch-'0')+c;
            if(val<10)sb.append(val);
            else {
                sb.append('A'+val-10);
            }
        }
        System.out.println(sb.toString());
    }
}
