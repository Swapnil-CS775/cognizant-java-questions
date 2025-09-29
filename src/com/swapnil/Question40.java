package com.swapnil;

public class Question40 {
    public static void main(String[] args) {
        String s="Amcatuff@ #% 123";
        ans(s);
    }

    public static void ans(String s){
        int[] arr=new int[4];

        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) arr[0]++;
            else if(Character.isDigit(s.charAt(i))) arr[1]++;
            else if(s.charAt(i)==' ') arr[2]++;
            else arr[3]++;
        }

        System.out.println("Alphabetic : "+arr[0]);
        System.out.println("Digit : "+arr[1]);
        System.out.println("Space : "+arr[2]);
        System.out.println("Special : "+arr[3]);
    }
}
