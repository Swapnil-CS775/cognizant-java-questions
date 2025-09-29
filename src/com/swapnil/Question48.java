package com.swapnil;

public class Question48 {
    public static void main(String[] args) {
        int month=9;
        ans(month);
    }

    public static void ans(int month){
        String season="";

        if(month>=3 && month<=5) season="Spring";
        else if(month>=6 && month<=8) season="Summer";
        else if(month>=9 && month<=11) season="Autumn";
        else if (month==12 || month==1 || month==2)  season="Winter";
        else {
            System.out.println("invalid month");
        }

        System.out.println(season);
    }
}
