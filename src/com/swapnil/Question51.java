package com.swapnil;

public class Question51 {
    public static void main(String[] args) {
        int sal=8000;
        int rating=3;
        ans(sal,rating);
    }

    public static void ans(int sal,int rating){
        double incr=0;

        if(rating>=1 && rating <=3) incr=0.1*sal;
        else if(rating == 4) incr=0.25*sal;
        else if(rating==5) incr=0.3*sal;
        double newSal=sal+incr;
        System.out.printf("%.2f",newSal);
    }
}
