package com.swapnil;

public class Question43 {
    public static void main(String[] args) {
        double liters=20;
        double distanceCovered=150;

        ans(liters,distanceCovered);
    }

    public static void ans(double l,double d){
        //first find in Liters/100KM
        double price=(l/d)*100;
        System.out.printf("Liters/100KM %.2f",price);
        System.out.println();

        double miles=d*0.6214;
        double gallons=l*0.2642;
        double milesPerGallon=miles/gallons;
        System.out.printf("Miles per gallon %.2f",milesPerGallon);
    }
}
